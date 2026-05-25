# Lab 2 — AccountService | SWT301 Software Testing

> **Họ tên:** _____________________ | **MSSV:** __________ | **Lớp:** __________

![CI Status](https://github.com/<org>/<repo>/actions/workflows/ci.yml/badge.svg)

---

## Mô tả bài lab

Bài Lab 2 yêu cầu sinh viên **implement** class `AccountService` xử lý chức năng đăng ký tài khoản, sau đó chạy bộ test có sẵn để kiểm tra tính đúng đắn của code.

---

## Yêu cầu implement

Mở file `src/AccountService.java` và implement **6 phương thức** có ghi `// TODO`:

| Phương thức | Mô tả | Business Rule |
|-------------|-------|--------------|
| `registerAccount(username, password, email)` | Đăng ký tài khoản mới | Validate đủ 3 trường + không trùng |
| `isValidEmail(email)` | Kiểm tra định dạng email | Có @, có domain, TLD ≥ 2 ký tự |
| `isValidUsername(username)` | Kiểm tra tên đăng nhập | 3–20 ký tự, chỉ [A-Za-z0-9_] |
| `isValidPassword(password)` | Kiểm tra mật khẩu | Tối thiểu 6 ký tự |
| `isUsernameTaken(username)` | Kiểm tra trùng username | Case-insensitive |
| `isEmailTaken(email)` | Kiểm tra trùng email | Case-insensitive |

> **Không được sửa file `tests/AccountServiceTest.java`** — đây là bộ test chấm điểm tự động.

---

## Cấu trúc thư mục

```
TraLTB_SWT301_Lab2/
├── src/
│   └── AccountService.java       ← SINH VIÊN IMPLEMENT TẠI ĐÂY
├── tests/
│   └── AccountServiceTest.java   ← Test có sẵn — KHÔNG sửa
│
├── README.md                     ← File này — điền thông tin cá nhân
├── AI_AUDIT_LOG.md               ← Ghi lại nếu có dùng AI
│
├── pom.xml                       ← Maven config (không cần sửa)
├── checkstyle.xml                ← Coding style rules
└── .github/workflows/ci.yml     ← CI tự động chấm điểm
```

---

## Chạy test trên máy

```bash
# Biên dịch
mvn compile

# Chạy tất cả test
mvn test

# Test + xem coverage
mvn test jacoco:report
# Mở: target/site/jacoco/index.html
```

---

## Tiêu chí chấm điểm

| Tiêu chí | Điểm |
|----------|------|
| CI pass — tất cả test xanh | /60 |
| Line coverage ≥ 70% (JaCoCo) | /20 |
| Checkstyle không có lỗi mới | /10 |
| AI_AUDIT_LOG.md có nội dung (nếu dùng AI) | /10 |

> Xem chi tiết trong `Guide_SV.md`.
