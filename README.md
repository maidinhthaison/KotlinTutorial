# KotlinTutorial

## DSA

### Tìm kiếm tuần tự 
- Vét cạn từ đầu mảng đến cuối mảng
- Độ phức tạp O(1) : tốt nhất, O(n): trung bình/xấu nhất
### Tìm kiếm tuần tự với lính canh
- Cải tiến thuật toán tìm kiếm tuần tự bằng cách đặt 1 lính canh (sentinel) ở cuối mảng.
- Lính canh là phần tử có giá trị bằng với phần tử cần tìm. Điều này giúp loại bỏ việc kiểm tra 
điểu kiện i < n trong vòng lặp để giảm số lượng phép so sánh
- Tốt nhất O(1): Tìm thấy ở đầu, xấu nhất O(n): Tìm thấy ở cuối hoặc không tìm thấy, trung bình O(n)
- Cải thiện 50% số phép so sánh so với không đặt lính canh
### Tìm kiếm nhị phân
- Tốt nhất O(1): tìm thấy ngay giữa
- Xấu nhất O(log n): phải chia đôi log2(n) lần
- Trung bình: O(log n)
- Không gian: O(1) cho lặp, O(log n) cho đệ quy