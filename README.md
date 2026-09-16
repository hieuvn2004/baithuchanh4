# Bài thực hành JUnit

## 1. Giới thiệu

Bài thực hành gồm 8 chương trình Java và các bộ kiểm thử đơn vị sử dụng JUnit 4.

Mục tiêu:
- Xây dựng các chương trình Java cơ bản.
- Viết Unit Test bằng JUnit.
- Kiểm tra các trường hợp đầu vào khác nhau.
- Chạy và ghi nhận kết quả kiểm thử.

## 2. Danh sách chương trình

| Bài | Nội dung |
|---|---|
| Bai1 | Tính chu vi hình chữ nhật |
| Bai2 | Tính diện tích hình chữ nhật |
| Bai3 | Giải phương trình bậc hai |
| Bai4 | Tính số ngày trong tháng |
| Bai5 | Kiểm tra số nguyên tố |
| Bai6 | Tính tổng từ 1 đến n |
| Bai7 | Tìm số lớn nhất trong 3 số |
| Bai8 | Kiểm tra năm nhuận |

## 3. Công cụ sử dụng

- Java
- JUnit 4.13.2
- Visual Studio Code
- PowerShell

## 4. Danh sách file

### Mã nguồn

- Bai1.java
- Bai2.java
- Bai3.java
- Bai4.java
- Bai5.java
- Bai6.java
- Bai7.java
- Bai8.java

### Mã kiểm thử

- Bai1Test.java
- Bai2Test.java
- Bai3Test.java
- Bai4Test.java
- Bai5Test.java
- Bai6Test.java
- Bai7Test.java
- Bai8Test.java

## 5. Kết quả kiểm thử

Tổng số test case: 53

Kết quả:

OK (53 tests)

Tất cả các test case đều thực hiện thành công.

## 6. Cách chạy JUnit

Biên dịch:

javac -cp "C:\Program Files\JetBrains\IntelliJ IDEA 2024.1\lib\junit4.jar;." *.java

Chạy toàn bộ test:

java -cp "C:\Program Files\JetBrains\IntelliJ IDEA 2024.1\lib\junit4.jar;." org.junit.runner.JUnitCore Bai1Test Bai2Test Bai3Test Bai4Test Bai5Test Bai6Test Bai7Test Bai8Test