# Nắng Cafe: Tài liệu đặc tả yêu cầu phần mềm - Software Requirement Specification (SRS)

## Giới thiệu dự án - Introduction

### Mục đích - Purpose

Phần mềm này sẽ giúp Nắng Cafe - một cửa hàng cà phê và bánh ngọt cỡ vừa - quản lý quy trình hoạt động và dữ liệu của cửa hàng, cũng như giúp cửa hàng phát triển website giúp tiếp cận, tương tác với khách hàng.

### Những bên sử dụng tài liệu - Intended Audience

- Giảng viên môn học - TS. Nguyễn Thành Huy
- Tất cả sinh viên trong nhóm phát triển phần mềm của Nắng Cafe
  - Nguyễn Triều Minh Khang
  - Noor-A Kim Lam
  - Lương Vĩ Lâm
  - Đỗ Thị Linh
  - Trần Ngọc Tuyết Linh
  - Nguyễn Bá Phi Nhật
  - Nguyễn Phạm Minh Quân
  - Phạm Minh Quang
  - Nguyễn Công Tài

### Phạm vi dự án - Scope

Để Nắng Cafe có thể phát triển nhanh chóng, phần mềm này sẽ giúp ghi chép, lưu trữ và truyền thông tin, dữ liệu, tăng khả năng giao tiếp giữa các ban/thành viên trong cửa hàng. Ngoài ra phần mềm này cũng sẽ bao gồm website của cửa hàng, giúp khách hàng có thể tiếp cận được cửa hàng dễ dàng hơn. Từ những điều trên, phần mềm sẽ giúp cửa hàng hoạt động có tổ chức, có hệ thống hơn.

### Khái niệm và từ viết tắt - Definitions and acronyms

(trống)

## Tổng quan - Overview

### Các nhóm người dùng - User classes

- **Nhân viên tại quán (thu ngân, pha chế, bảo vệ, quản lý kho):** chủ yếu sẽ dùng máy tính tại cửa hàng, máy chấm công
- **Nhân viên phân tích và kế hoạch (quản lý, nhân sự, kế toán)**: chủ yếu sẽ dùng laptop, làm việc tại cửa hàng hoặc tại nhà
- **Khách hàng:** sử dụng chủ yếu là thiết bị cầm tay (điện thoại, máy tính bảng), một phần nhỏ máy tính (desktop và laptop)

### Các công nghệ sử dụng

- Backend:
    - Ngôn ngữ: Java
    - Môi trường: [Java SE, version 15.0.1 của Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)
- Cơ sở dữ liệu:
    - Hệ cơ sở dữ liệu: [MySQL Community Server 8.0.22](https://dev.mysql.com/downloads/mysql/)


#### Công nghệ hỗ trợ (Cần cập nhật)

## Yêu cầu và chức năng - Requirements and features

## Yêu cầu chức năng

1. Quản lý nhân viên
    1. Quản lý tài khoản nhân viên: lưu trữ, chỉnh sửa thông tin cá nhân và quyền của nhân viên, bao gồm cả thời gian mà 1 nhân viên bất kỳ sỡ hữu 1 quyền (Trả lời câu hỏi "Vào thời điểm x, nhân viên y có quyền z hay không?")
    1. Quản lý ca làm: 
    1. Quản lý lương
1. Bán hàng
    1. Quản lý đơn hàng
    1. Quản lý chương trình, khuyến mãi
1. Kho
    1. Quản lý nhập
    1. Quản lý xuất
    1. Quản lý tồn kho
    1. Quản lý nhà cung cấp
1. Quản lý sản phẩm
    1. Quản lý thông tin sản phẩm
    1. Quản lý công thức
    1. Quản lý giá
1. Quản lý khách hàng
    1. Quản lý thông tin khách hàng
    1. Đánh giá khách hàng
1. Thống kế
    1. Thống kê doanh thu
    1. Thống kê kho
    1. Thống kế sản phẩm
    1. Thống kê năng suất nhân viên