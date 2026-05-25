# PROMPTS.md — Lab 2: AccountService

Ghi lại các prompt đáng chú ý bạn đã dùng với AI trong quá trình làm bài.

> Nếu không dùng AI, ghi: "Không sử dụng AI trong bài lab này."

---

## Hướng dẫn điền

Mỗi lần dùng AI có kết quả hữu ích, thêm một mục theo mẫu bên dưới:

```
### [Số thứ tự] — [Tên công cụ] — [Ngày]

**Mục đích:** Hỏi về gì / Cần giải quyết vấn đề gì

**Prompt đã dùng:**
> (Dán nguyên văn prompt bạn đã nhập)

**Kết quả AI trả về:** Tóm tắt ngắn gọn AI gợi ý gì

**Bạn đã dùng như thế nào:** Áp dụng trực tiếp / Sửa lại / Chỉ tham khảo ý tưởng

**Vấn đề phát hiện (nếu có):** AI sai/thiếu ở điểm nào
```

---

## Ví dụ mẫu

### [01] — ChatGPT — 2026-05-24

**Mục đích:** Hiểu cách dùng Java regex để validate email

**Prompt đã dùng:**
> "Viết regex Java kiểm tra email hợp lệ: phải có @, có domain, TLD tối thiểu 2 ký tự"

**Kết quả AI trả về:** AI đề xuất pattern `^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$`

**Bạn đã dùng như thế nào:** Dùng trực tiếp — pattern đã có sẵn trong template, dùng để hiểu rõ hơn ý nghĩa từng phần

**Vấn đề phát hiện:** AI không giải thích `{2,}` nghĩa là "tối thiểu 2" — phải tự tra thêm

---

<!-- Thêm các prompt tiếp theo bên dưới -->
