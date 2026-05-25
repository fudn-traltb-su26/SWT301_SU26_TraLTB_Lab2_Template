import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test tự động cho AccountService — Lab 2 SWT301.
 *
 * <p><b>KHÔNG được sửa file này.</b>
 * Implement AccountService.java để tất cả test dưới đây pass.
 *
 * <p>Kỹ thuật kiểm thử:
 * EP (Equivalence Partitioning), BVA (Boundary Value Analysis), Exception Testing.
 */
@DisplayName("AccountService — Lab 2")
class AccountServiceTest {

    private AccountService service;

    @BeforeEach
    void setUp() {
        service = new AccountService(); // fresh instance trước mỗi test
    }

    // ============================================================
    // NHÓM 1 — isValidEmail()
    // ============================================================
    @Nested
    @DisplayName("1. isValidEmail()")
    class IsValidEmailTest {

        @Test
        @DisplayName("[EP-01] Email chuẩn → true")
        void ep01_standardEmail_true() {
            assertTrue(service.isValidEmail("student@fpt.edu.vn"));
        }

        @Test
        @DisplayName("[EP-02] Email có dấu chấm trong local part → true")
        void ep02_emailWithDot_true() {
            assertTrue(service.isValidEmail("nguyen.van.a@gmail.com"));
        }

        @Test
        @DisplayName("[EP-03] Email có dấu cộng → true")
        void ep03_emailWithPlus_true() {
            assertTrue(service.isValidEmail("user+tag@example.org"));
        }

        @ParameterizedTest(name = "[EP-04] Email thiếu @ — \"{0}\" → false")
        @ValueSource(strings = {"invalidemail.com", "nodomain", "missingatgmail"})
        void ep04_emailNoAtSign_false(String email) {
            assertFalse(service.isValidEmail(email));
        }

        @ParameterizedTest(name = "[EP-05] Email thiếu domain — \"{0}\" → false")
        @ValueSource(strings = {"user@", "user@.", "user@@gmail.com"})
        void ep05_emailNoDomain_false(String email) {
            assertFalse(service.isValidEmail(email));
        }

        @ParameterizedTest(name = "[EP-06] Email thiếu TLD — \"{0}\" → false")
        @ValueSource(strings = {"user@gmail", "user@domain."})
        void ep06_emailNoTLD_false(String email) {
            assertFalse(service.isValidEmail(email));
        }

        @ParameterizedTest(name = "[EX-01] null/rỗng → false")
        @NullAndEmptySource
        void ex01_nullOrEmpty_false(String email) {
            assertFalse(service.isValidEmail(email));
        }

        @Test
        @DisplayName("[EX-02] Chỉ khoảng trắng → false")
        void ex02_blankString_false() {
            assertFalse(service.isValidEmail("   "));
        }
    }

    // ============================================================
    // NHÓM 2 — isValidUsername()
    // ============================================================
    @Nested
    @DisplayName("2. isValidUsername()")
    class IsValidUsernameTest {

        @Test
        @DisplayName("[EP-07] Username chữ và số → true")
        void ep07_alphanumeric_true() {
            assertTrue(service.isValidUsername("student01"));
        }

        @Test
        @DisplayName("[EP-08] Username có gạch dưới → true")
        void ep08_withUnderscore_true() {
            assertTrue(service.isValidUsername("nguyen_van_a"));
        }

        @Test
        @DisplayName("[BVA-01] Đúng 3 ký tự (biên dưới) → true")
        void bva01_minLength3_true() {
            assertTrue(service.isValidUsername("abc"));
        }

        @Test
        @DisplayName("[BVA-02] Đúng 20 ký tự (biên trên) → true")
        void bva02_maxLength20_true() {
            assertTrue(service.isValidUsername("abcdefghij1234567890"));
        }

        @Test
        @DisplayName("[BVA-03] 2 ký tự (dưới biên) → false")
        void bva03_twoChars_false() {
            assertFalse(service.isValidUsername("ab"));
        }

        @Test
        @DisplayName("[BVA-04] 21 ký tự (trên biên) → false")
        void bva04_twentyOneChars_false() {
            assertFalse(service.isValidUsername("abcdefghij12345678901"));
        }

        @ParameterizedTest(name = "[EP-09] Ký tự đặc biệt \"{0}\" → false")
        @ValueSource(strings = {"user name", "user@name", "user-name", "user.name"})
        void ep09_specialChars_false(String username) {
            assertFalse(service.isValidUsername(username));
        }

        @ParameterizedTest(name = "[EX-03] null/rỗng → false")
        @NullAndEmptySource
        void ex03_nullOrEmpty_false(String username) {
            assertFalse(service.isValidUsername(username));
        }
    }

    // ============================================================
    // NHÓM 3 — isValidPassword()
    // ============================================================
    @Nested
    @DisplayName("3. isValidPassword()")
    class IsValidPasswordTest {

        @Test
        @DisplayName("[BVA-05] Đúng 6 ký tự (biên dưới) → true")
        void bva05_exactlyMinLength_true() {
            assertTrue(service.isValidPassword("abc123"));
        }

        @Test
        @DisplayName("[EP-10] Password dài → true")
        void ep10_longPassword_true() {
            assertTrue(service.isValidPassword("MySecurePassword@2026"));
        }

        @Test
        @DisplayName("[BVA-06] 5 ký tự (dưới biên) → false")
        void bva06_fiveChars_false() {
            assertFalse(service.isValidPassword("12345"));
        }

        @Test
        @DisplayName("[BVA-07] 1 ký tự → false")
        void bva07_oneChar_false() {
            assertFalse(service.isValidPassword("a"));
        }

        @ParameterizedTest(name = "[EX-04] null/rỗng → false")
        @NullAndEmptySource
        void ex04_nullOrEmpty_false(String password) {
            assertFalse(service.isValidPassword(password));
        }

        @Test
        @DisplayName("[EX-05] Chỉ khoảng trắng → false")
        void ex05_blankString_false() {
            assertFalse(service.isValidPassword("      "));
        }
    }

    // ============================================================
    // NHÓM 4 — registerAccount() Happy Path
    // ============================================================
    @Nested
    @DisplayName("4. registerAccount() — Hợp lệ")
    class RegisterHappyPathTest {

        @Test
        @DisplayName("[HP-01] Thông tin hợp lệ → true")
        void hp01_validInfo_true() {
            assertTrue(service.registerAccount("studentA", "pass123", "a@fpt.edu.vn"));
        }

        @Test
        @DisplayName("[HP-02] Đăng ký thành công → số tài khoản tăng 1")
        void hp02_success_accountCountIncreases() {
            service.registerAccount("studentA", "pass123", "a@fpt.edu.vn");
            assertEquals(1, service.getAccountCount());
        }

        @Test
        @DisplayName("[HP-03] Đăng ký 3 tài khoản khác nhau → count = 3")
        void hp03_multipleDistinct_allSucceed() {
            service.registerAccount("userA", "pass123", "a@gmail.com");
            service.registerAccount("userB", "pass456", "b@gmail.com");
            service.registerAccount("userC", "pass789", "c@gmail.com");
            assertEquals(3, service.getAccountCount());
        }

        @ParameterizedTest(name = "[HP-04] {0} / {1} / {2} → true")
        @CsvSource({
            "alice,   password1, alice@gmail.com",
            "bob_99,  securePass, bob@fpt.edu.vn",
            "Charlie, Ab1234,    charlie@yahoo.com"
        })
        void hp04_variousValidInputs_true(String username, String password, String email) {
            assertTrue(service.registerAccount(username.trim(), password.trim(), email.trim()));
        }
    }

    // ============================================================
    // NHÓM 5 — registerAccount() Trùng lặp
    // ============================================================
    @Nested
    @DisplayName("5. registerAccount() — Trùng lặp")
    class RegisterDuplicateTest {

        @Test
        @DisplayName("[DUP-01] Username đã tồn tại → false")
        void dup01_duplicateUsername_false() {
            service.registerAccount("studentA", "pass123", "a@gmail.com");
            assertFalse(service.registerAccount("studentA", "newpass", "b@gmail.com"));
        }

        @Test
        @DisplayName("[DUP-02] Username trùng (khác hoa thường) → false")
        void dup02_duplicateUsername_caseInsensitive_false() {
            service.registerAccount("studentA", "pass123", "a@gmail.com");
            assertFalse(service.registerAccount("STUDENTA", "newpass", "b@gmail.com"));
        }

        @Test
        @DisplayName("[DUP-03] Email đã tồn tại → false")
        void dup03_duplicateEmail_false() {
            service.registerAccount("userA", "pass123", "same@gmail.com");
            assertFalse(service.registerAccount("userB", "pass456", "same@gmail.com"));
        }

        @Test
        @DisplayName("[DUP-04] Email trùng (khác hoa thường) → false")
        void dup04_duplicateEmail_caseInsensitive_false() {
            service.registerAccount("userA", "pass123", "Same@Gmail.com");
            assertFalse(service.registerAccount("userB", "pass456", "same@gmail.com"));
        }

        @Test
        @DisplayName("[DUP-05] Trùng username → count không đổi")
        void dup05_duplicateUsername_countUnchanged() {
            service.registerAccount("userA", "pass123", "a@gmail.com");
            service.registerAccount("userA", "pass456", "b@gmail.com");
            assertEquals(1, service.getAccountCount());
        }
    }

    // ============================================================
    // NHÓM 6 — registerAccount() Input không hợp lệ
    // ============================================================
    @Nested
    @DisplayName("6. registerAccount() — Input không hợp lệ")
    class RegisterInvalidInputTest {

        @Test
        @DisplayName("[INV-01] Username null → false")
        void inv01_nullUsername_false() {
            assertFalse(service.registerAccount(null, "pass123", "a@gmail.com"));
        }

        @Test
        @DisplayName("[INV-02] Password null → false")
        void inv02_nullPassword_false() {
            assertFalse(service.registerAccount("userA", null, "a@gmail.com"));
        }

        @Test
        @DisplayName("[INV-03] Email null → false")
        void inv03_nullEmail_false() {
            assertFalse(service.registerAccount("userA", "pass123", null));
        }

        @Test
        @DisplayName("[INV-04] Tất cả null → false")
        void inv04_allNull_false() {
            assertFalse(service.registerAccount(null, null, null));
        }

        @Test
        @DisplayName("[INV-05] Username rỗng → false")
        void inv05_emptyUsername_false() {
            assertFalse(service.registerAccount("", "pass123", "a@gmail.com"));
        }

        @Test
        @DisplayName("[INV-06] Password quá ngắn (< 6 ký tự) → false")
        void inv06_shortPassword_false() {
            assertFalse(service.registerAccount("userA", "123", "a@gmail.com"));
        }

        @Test
        @DisplayName("[INV-07] Email sai định dạng → false")
        void inv07_invalidEmail_false() {
            assertFalse(service.registerAccount("userA", "pass123", "not-an-email"));
        }

        @Test
        @DisplayName("[INV-08] Username có ký tự đặc biệt → false")
        void inv08_usernameSpecialChars_false() {
            assertFalse(service.registerAccount("user@name!", "pass123", "a@gmail.com"));
        }

        @ParameterizedTest(name = "[INV-09] Email sai \"{0}\" → false")
        @ValueSource(strings = {
            "notanemail",
            "@nodomain.com",
            "missing@",
            "double@@gmail.com"
        })
        void inv09_variousInvalidEmails_false(String email) {
            assertFalse(service.registerAccount("userA", "pass123", email));
        }
    }
}
