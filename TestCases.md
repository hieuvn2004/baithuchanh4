# Danh sách Test Case

## Bai1 - Tính chu vi hình chữ nhật

| TC | Input (dài, rộng) | Expected Output | Kết quả |
|---|---|---|---|
| TC01 | 5, 3 | 16.0 | PASS |
| TC02 | 5, 5 | 20.0 | PASS |
| TC03 | 0, 5 | 10.0 | PASS |
| TC04 | 2.5, 1.5 | 8.0 | PASS |
| TC05 | 1000, 500 | 3000.0 | PASS |

## Bai2 - Tính diện tích hình chữ nhật

| TC | Input (dài, rộng) | Expected Output | Kết quả |
|---|---|---|---|
| TC01 | 5, 3 | 15.0 | PASS |
| TC02 | 5, 5 | 25.0 | PASS |
| TC03 | 0, 5 | 0.0 | PASS |
| TC04 | 2.5, 1.5 | 3.75 | PASS |
| TC05 | 1000, 500 | 500000.0 | PASS |

## Bai3 - Giải phương trình bậc hai

| TC | Input (a,b,c) | Trường hợp kiểm thử | Kết quả |
|---|---|---|---|
| TC01 | 0, 0, 0 | Vô số nghiệm | PASS |
| TC02 | 0, 0, 5 | Vô nghiệm | PASS |
| TC03 | 0, 2, -4 | Phương trình bậc nhất, x = 2 | PASS |
| TC04 | 1, -3, 2 | Hai nghiệm phân biệt | PASS |
| TC05 | 1, 2, 1 | Nghiệm kép | PASS |
| TC06 | 1, 2, 5 | Vô nghiệm (Delta < 0) | PASS |

## Bai4 - Tính số ngày trong tháng

| TC | Input (tháng, năm) | Expected Output | Kết quả |
|---|---|---|---|
| TC01 | 0, 2024 | -1 | PASS |
| TC02 | 13, 2024 | -1 | PASS |
| TC03 | 2, 2024 | 29 ngày | PASS |
| TC04 | 2, 2023 | 28 ngày | PASS |
| TC05 | 2, 2000 | 29 ngày | PASS |
| TC06 | 2, 1900 | 28 ngày | PASS |
| TC07 | 4, 2024 | 30 ngày | PASS |
| TC08 | 1, 2024 | 31 ngày | PASS |

## Bai5 - Kiểm tra số nguyên tố

| TC | Input (n) | Expected Output | Kết quả |
|---|---:|---|---|
| TC01 | 0 | Không phải số nguyên tố | PASS |
| TC02 | 1 | Không phải số nguyên tố | PASS |
| TC03 | 2 | Là số nguyên tố | PASS |
| TC04 | 3 | Là số nguyên tố | PASS |
| TC05 | 4 | Không phải số nguyên tố | PASS |
| TC06 | 9 | Không phải số nguyên tố | PASS |
| TC07 | 17 | Là số nguyên tố | PASS |
| TC08 | 49 | Không phải số nguyên tố | PASS |
| TC09 | 97 | Là số nguyên tố | PASS |

## Bai6 - Tính tổng từ 1 đến n

| TC | Input (n) | Expected Output | Kết quả |
|---|---:|---:|---|
| TC01 | -1 | 0 | PASS |
| TC02 | 0 | 0 | PASS |
| TC03 | 1 | 1 | PASS |
| TC04 | 2 | 3 | PASS |
| TC05 | 5 | 15 | PASS |
| TC06 | 10 | 55 | PASS |
| TC07 | 100 | 5050 | PASS |

## Bai7 - Tìm số lớn nhất

| TC | Input (a,b,c) | Expected Output | Kết quả |
|---|---|---:|---|
| TC01 | 10, 5, 3 | 10.0 | PASS |
| TC02 | 5, 10, 3 | 10.0 | PASS |
| TC03 | 5, 3, 10 | 10.0 | PASS |
| TC04 | 5, 5, 5 | 5.0 | PASS |
| TC05 | -10, -5, -3 | -3.0 | PASS |
| TC06 | 2.5, 7.8, 4.2 | 7.8 | PASS |
| TC07 | 10, 10, 5 | 10.0 | PASS |

## Bai8 - Kiểm tra năm nhuận

| TC | Input (năm) | Expected Output | Kết quả |
|---|---:|---|---|
| TC01 | 2000 | Năm nhuận | PASS |
| TC02 | 1900 | Không phải năm nhuận | PASS |
| TC03 | 2024 | Năm nhuận | PASS |
| TC04 | 2023 | Không phải năm nhuận | PASS |
| TC05 | 2400 | Năm nhuận | PASS |
| TC06 | 2022 | Không phải năm nhuận | PASS |

## Tổng kết

- Tổng số test case: **53**
- Số test PASS: **53**
- Số test FAIL: **0**
- Tỷ lệ PASS: **100%**

Kết quả chạy JUnit:

`OK (53 tests)`