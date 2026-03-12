# KotlinTutorial

## DSA
#### https://docs.google.com/document/d/1ZEMh7t0_gFUJCQlgTqkYHbRG3XrsuiPybbWKHSbsDko/edit?fbclid=IwY2xjawP8LfpleHRuA2FlbQIxMABicmlkETFLMmlYakJqeDVaTnV2Zk9Fc3J0YwZhcHBfaWQQMjIyMDM5MTc4ODIwMDg5MgABHmG5E5zCD8Xsm1Fzx0Il6sEuMR-EB-JhEpwUbM7vTpUEqY5rxd2KUMB9_hIj_aem_NIOOOg_dGGiAtiZ7ip5kEA&tab=t.0#heading=h.iitw6rjoo3tz
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

### Bubble Sort
- Nguyên lý (brute force): Tìm phần tử lớn nhất lên đầu
- Ưu điểm: đơn giản, dễ cài đặt, ổn định, phát hiện dc mảng đã dc sắp xếp, sắp xếp tại chỗ (in-place)
- Khuyết điểm: hiệu suất kém, nhiều phép so sánh, biến đổi

### Selection Sort
- Nguyên lý (brute force): Tìm phần tử nhỏ nhất trong mảng chưa xắp sếp đưa về đầu. Lặp lại với phần mảng còn lại.
- Tốt nhất: O(n2), trung bình: O(n2), xấu nhất: O(n2)
- Bộ nhớ: O(1), không ổn định
- Ưu điểm: đơn giản, sắp xếp tại chỗ (in-place)
- Khuyết điểm: không ổn định, luôn O(n2) kể cả khi mảng đã sắp xếp

### Insertion Sort
- Nguyên lý (brute force): Chia mảng thành 2 phần: đã sắp xếp và chưa sắp xếp. Lần lượt lấy từng phần tử
từ phần chưa sắp xếp chèn vào đúng vị trí trong phần tử đã sắp xếp
- Tốt nhất: O(n) mảng được sắp xếp, trung bình: O(n2)
- Xấu nhất: O(n2) mảng sắp xếp ngược
- Bộ nhớ: O(1)
- Tính ổn định: Có (stable)
### Quick Sort
📈 Phân tích độ phức tạp:
Thời gian:
- Tốt nhất: O(n log n) - pivot luôn chia đôi mảng
- Trung bình: O(n log n) - pivot chia mảng không quá lệch
- Xấu nhất: O(n²) - pivot luôn là min hoặc max

Trường hợp xấu nhất xảy ra khi:
- Mảng đã sắp xếp + pivot = phần tử cuối
- Mảng sắp xếp ngược + pivot = phần tử cuối
- Tất cả phần tử đều bằng nhau
- Bộ nhớ: O(log n) - cho stack đệ quy (trung bình)
- Tính ổn định: ❌ Unstable

✅ Ưu điểm:
- ⚡ Rất nhanh trong thực tế: Hằng số ẩn nhỏ
- 🏠 In-place: Sắp xếp tại chỗ, tiết kiệm bộ nhớ
- 📱 Cache-friendly: Truy cập bộ nhớ hiệu quả
- 🎯 Flexible: Nhiều cách tối ưu pivot
- ❌ Nhược điểm:
- 📉 Worst case O(n²): Có thể chậm với dữ liệu đặc biệt
- ⚖️ Không ổn định: Thay đổi thứ tự phần tử bằng nhau
- 🎲 Hiệu suất phụ thuộc pivot: Chọn pivot kém → hiệu suất kém
