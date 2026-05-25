# REFLECTION.md — Lab 2: AccountService

**Họ tên:** _____________________ | **MSSV:** __________ | **Ngày nộp:** __________

> Điền đầy đủ 6 mục bên dưới. Câu trả lời cần cụ thể — tránh viết chung chung.
> Mỗi mục tối thiểu 3–5 câu hoặc có ví dụ cụ thể từ bài lab của bạn.

---

## 1. Tôi học được gì từ bài lab này?

<!-- Liệt kê cụ thể: kỹ thuật, API Java, khái niệm testing bạn hiểu rõ hơn.
     Ví dụ: "Tôi học được cách dùng Pattern.matcher() để validate input,
     hiểu sự khác biệt giữa isBlank() và isEmpty() trong Java,
     và áp dụng BVA để kiểm tra biên 3 và 20 ký tự của username." -->

_Điền câu trả lời của bạn tại đây_

---

## 2. AI đã hỗ trợ tôi như thế nào?

<!-- Nêu cụ thể công cụ AI nào, hỗ trợ phần nào, ước tính tiết kiệm bao nhiêu thời gian.
     Nếu không dùng AI, ghi rõ lý do.
     Ví dụ: "Tôi dùng ChatGPT để giải thích cú pháp Stream API (anyMatch),
     tiết kiệm ~20 phút so với đọc tài liệu. Copilot gợi ý pattern regex
     nhưng tôi phải chỉnh lại phần TLD." -->

_Điền câu trả lời của bạn tại đây_

---

## 3. AI sai hoặc thiếu ở đâu?

<!-- Bắt buộc có ít nhất 1–2 điểm cụ thể, kể cả khi AI hỗ trợ tốt.
     Nếu không dùng AI, mô tả điểm khó bạn tự giải quyết.
     Ví dụ: "ChatGPT đề xuất dùng equals() để so sánh username,
     nhưng test DUP-02 fail vì cần equalsIgnoreCase().
     AI không nhận ra yêu cầu case-insensitive trong Javadoc." -->

_Điền câu trả lời của bạn tại đây_

---

## 4. Tôi đã kiểm chứng kết quả như thế nào?

<!-- Mô tả quy trình kiểm thử: chạy lệnh gì, xem báo cáo nào, CI kết quả ra sao.
     Ví dụ: "Tôi chạy mvn test sau mỗi lần implement một phương thức,
     đọc tên test fail để biết chính xác điểm sai.
     Sau khi 35/35 test pass, chạy mvn test jacoco:report — coverage đạt 88%.
     CI trên GitHub Actions xanh hết 4 job." -->

_Điền câu trả lời của bạn tại đây_

---

## 5. Khó khăn gặp phải và cách giải quyết

<!-- Mô tả ít nhất 1 khó khăn kỹ thuật thực sự và cách bạn tìm ra giải pháp.
     Ví dụ: "Test EX-05 (blank password) bị fail dù code nhìn có vẻ đúng.
     Tôi dùng isEmpty() nhưng '   ' (6 khoảng trắng) có length = 6 nên pass qua.
     Sau khi đọc lại JavaDoc, tôi đổi sang isBlank() — test pass ngay." -->

_Điền câu trả lời của bạn tại đây_

---

## 6. Tôi sẽ cải thiện gì nếu làm lại?

<!-- Ít nhất 2–3 điểm cụ thể về kỹ thuật, quy trình, hoặc cách dùng AI.
     Tránh viết chung chung như "làm nhanh hơn" hay "hiểu đề kỹ hơn".
     Ví dụ:
     - "Đọc kỹ Javadoc trước khi code thay vì đoán business rule"
     - "Implement từng phương thức nhỏ → test ngay, không để dồn cuối"
     - "Prompt AI cụ thể hơn: kèm theo ràng buộc case-insensitive từ đầu" -->

_Điền câu trả lời của bạn tại đây_

---

## Tóm tắt kết quả

| Hạng mục | Kết quả |
|----------|---------|
| Số test pass | __ / 35 |
| Line coverage | ___ % |
| Checkstyle violations | ___ |
| CI Status | ✅ Pass / ❌ Fail |
| Có dùng AI | Có / Không |
