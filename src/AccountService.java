import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * AccountService — Xử lý đăng ký và quản lý tài khoản người dùng.
 *
 * <p><b>Yêu cầu sinh viên:</b> Implement tất cả phương thức có TODO bên dưới.
 * Không được thay đổi tên phương thức, kiểu trả về, hoặc tham số.
 *
 * <p><b>Business rules:</b>
 * <ul>
 *   <li>Username: không null/rỗng, 3–20 ký tự, chỉ chứa [A-Za-z0-9_]</li>
 *   <li>Password: không null/rỗng, tối thiểu 6 ký tự</li>
 *   <li>Email: định dạng hợp lệ (có @, có domain, có TLD ≥ 2 ký tự)</li>
 *   <li>Không cho phép trùng username hoặc email (case-insensitive)</li>
 * </ul>
 */
public class AccountService {

    /** Lưu tài khoản dưới dạng {username, password, email}. */
    private final List<String[]> accounts = new ArrayList<>();

    /** Pattern kiểm tra email — sinh viên có thể dùng lại. */
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    /** Pattern kiểm tra username: 3–20 ký tự, chữ/số/gạch dưới. */
    private static final Pattern USERNAME_PATTERN =
            Pattern.compile("^[A-Za-z0-9_]{3,20}$");

    // ================================================================
    // PHƯƠNG THỨC CHÍNH — sinh viên implement
    // ================================================================

    /**
     * Đăng ký tài khoản mới.
     *
     * <p>Trả về {@code false} nếu bất kỳ điều kiện nào không thỏa:
     * username/password/email không hợp lệ, username hoặc email đã tồn tại.
     *
     * @param username tên đăng nhập
     * @param password mật khẩu
     * @param email    địa chỉ email
     * @return {@code true} nếu đăng ký thành công
     */
    public boolean registerAccount(String username, String password, String email) {
        // TODO: Validate username, password, email
        // TODO: Kiểm tra username và email chưa bị trùng
        // TODO: Nếu hợp lệ, thêm vào accounts và trả về true
        // TODO: Ngược lại trả về false
        return false; // placeholder — xóa dòng này khi implement
    }

    /**
     * Kiểm tra định dạng email hợp lệ.
     *
     * <p>Email hợp lệ khi: không null/rỗng, chứa {@code @}, có domain và TLD >= 2 ký tự.
     *
     * @param email chuỗi cần kiểm tra
     * @return {@code true} nếu email đúng định dạng
     */
    public boolean isValidEmail(String email) {
        // TODO: Kiểm tra null hoặc blank → false
        // TODO: Dùng EMAIL_PATTERN để kiểm tra định dạng
        return false; // placeholder
    }

    /**
     * Kiểm tra username hợp lệ.
     *
     * <p>Hợp lệ khi: không null/rỗng, 3–20 ký tự, chỉ chứa [A-Za-z0-9_].
     *
     * @param username chuỗi cần kiểm tra
     * @return {@code true} nếu hợp lệ
     */
    public boolean isValidUsername(String username) {
        // TODO: Kiểm tra null hoặc blank → false
        // TODO: Dùng USERNAME_PATTERN để kiểm tra
        return false; // placeholder
    }

    /**
     * Kiểm tra password hợp lệ.
     *
     * <p>Hợp lệ khi: không null/rỗng, tối thiểu 6 ký tự.
     *
     * @param password chuỗi cần kiểm tra
     * @return {@code true} nếu hợp lệ
     */
    public boolean isValidPassword(String password) {
        // TODO: Kiểm tra null hoặc blank → false
        // TODO: Kiểm tra độ dài >= 6
        return false; // placeholder
    }

    /**
     * Kiểm tra username đã tồn tại chưa (case-insensitive).
     *
     * @param username tên cần kiểm tra
     * @return {@code true} nếu đã có trong hệ thống
     */
    public boolean isUsernameTaken(String username) {
        // TODO: Duyệt accounts, so sánh không phân biệt hoa thường
        return false; // placeholder
    }

    /**
     * Kiểm tra email đã được đăng ký chưa (case-insensitive).
     *
     * @param email email cần kiểm tra
     * @return {@code true} nếu đã có trong hệ thống
     */
    public boolean isEmailTaken(String email) {
        // TODO: Duyệt accounts, so sánh không phân biệt hoa thường
        return false; // placeholder
    }

    // ================================================================
    // PHƯƠNG THỨC HỖ TRỢ — đã implement sẵn, không cần sửa
    // ================================================================

    /**
     * Trả về số tài khoản hiện có trong hệ thống.
     *
     * @return số lượng tài khoản
     */
    public int getAccountCount() {
        return accounts.size();
    }
}
