# CHANGELOG — Lab 2: AccountService

Ghi lại các thay đổi theo từng lần commit / sprint trong quá trình làm bài.

Format: `[YYYY-MM-DD] — [Loại thay đổi] — Mô tả`

---

## Hướng dẫn điền

| Loại | Dùng khi |
|------|---------|
| `feat` | Implement xong một phương thức mới |
| `fix` | Sửa lỗi sau khi test fail |
| `test` | Chạy test, kiểm tra coverage |
| `docs` | Cập nhật README, AI_AUDIT_LOG, PROMPTS |
| `refactor` | Cải thiện code mà không thay đổi logic |
| `chore` | Setup môi trường, cấu hình Maven |

---

## [Unreleased]

### Chưa hoàn thành
- [ ] Implement `isValidEmail()`
- [ ] Implement `isValidUsername()`
- [ ] Implement `isValidPassword()`
- [ ] Implement `isUsernameTaken()`
- [ ] Implement `isEmailTaken()`
- [ ] Implement `registerAccount()`
- [ ] Đạt coverage ≥ 70%
- [ ] Checkstyle không có lỗi mới

---

## [v0.1.0] — Khởi tạo

- `chore`: Nhận repo từ GitHub Classroom
- `chore`: Clone về máy, chạy `mvn compile` — BUILD SUCCESS

---

<!-- Thêm các thay đổi bên dưới khi bạn tiến hành implement -->
<!-- Ví dụ:
## [v0.2.0] — 2026-05-24
- `feat`: Implement isValidEmail() — test EP-01, EP-02, EP-03 pass
- `feat`: Implement isValidUsername() — test BVA-01 đến BVA-04 pass
- `fix`: Sửa isValidPassword() — thêm isBlank() check, test EX-05 pass
- `feat`: Implement isUsernameTaken() với equalsIgnoreCase()
- `feat`: Implement isEmailTaken() với equalsIgnoreCase()
- `feat`: Implement registerAccount() — tất cả 35 test pass
- `test`: Coverage đạt 91% — vượt ngưỡng 70%
-->
