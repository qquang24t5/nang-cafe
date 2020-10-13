# Yêu cầu đồ án

## Tổng quan
Nắng Cafe - Không gian yên bình giữa phố đông  
Bạn muốn trốn khỏi sự bộn bề của thành phố? Bạn muốn một nơi yên tĩnh để làm việc nghỉ ngơi? Với nhiều góc tranh đẹp, hương vị cafe Colombia đậ đà và đa dạng các loại bánh đặc biệt. Nắng Cafe đáp ứng được mọi nhu cầu của khách hàng. Hãy đến và tự mình trải nghiệm.

## Sơ đồ cơ cấu
#**Sơ đồ cơ cấu tổ chức phân quyền Nắng coffee and cake**
1. Các chức vụ bao gồm:
    * Chủ quán
    * Kế toán
    * Quản lý
    * Trưởng ca 1 (ca sáng)
    * Trưởng ca 2 (ca chiều)
    * Nhân viên kho (Phục vụ đảm nhận)
    * Nhân viên thu ngân
    * Nhân viên pha chế
    * Nhân viên giao hàng
    * Nhân viên Bảo vệ
2. Sơ đồ cơ cấu phân quyền (Hierarchical organizational structure)
    * Hyperlink sơ đồ tổ chức phân quyền
    [HOS](https://drive.google.com/file/d/1UeBcywg3FoBpg5hhYMZ19xMkDrD6wwni/view?usp=sharing)
    * Hình ảnh sơ đồ tổ chức phân quyền
    <img src = "https://trello-attachments.s3.amazonaws.com/5f6daf5badeadf3ac31ffc96/5f81b73e16cd3a6140a9421d/241c4de06671fbfa7a943954e3f607f3/HierOrg.png" width = "500" alt = "HOS">
- [^1] : Nắng cà phê là mô hình quán coffee vừa
## Nghiệp vụ - yêu cầu
### Nhân viên bán hàng
   
   ## Yêu cầu của nhân viên bán hàng
   * `Chấm công:` 
   Nhân viên thực hiện thao tác trên máy POS để máy lưu lại thời gian bắt đầu và kết thúc ca làm
   * `Lập hóa đơn:`
   Lập ra danh sách các món mà khách hàng đã chọn, thực hiện sửa xóa khi khách hàng yêu cầu
   * `Xuất hóa đơn:`
   Cho phép nhân viên in hóa đơn khi khách hàng thanh toán xong
   * `Hiển thị lương:` 
   Cho phép nhân viên xem lương và giờ làm của mình

   ## Nghiệp vụ của nhân viên bán hàng
   * `Trong cửa hàng luôn có một khoản tiền cố định (vd 500.000), khi nhân viên bắt đầu ca làm thì thực hiện đếm số tiền đó và xác nhận đủ hoặc thiếu để báo lại cho cấp trên`
   * ` Nhân viên khởi động máy POS,máy sẽ lưu lại thời gian bắt đầu và kết thúc ca làm khi nhân viên nhập mã của mình và bấm nút START khi vào ca và END khi kết thúc ca`
   * ` Khi khách hàng order thì nhân viên bấm trên máy POS những món khách vừa gọi, xác nhận lại xem khách có muốn thêm hoặ hủy món nào không (để thực hiện công việc thêm, xóa sản phẩm)`
   * `Khi đã xác nhận món và nhận tiền thanh toán thì nhân viên tiến hành in hóa đơn đưa cho khách hàng để khách hàng có thể kiểm tra có sai xót gì không. Khi in hóa đơn ra thì không thể đổi món trong hóa đơn hoặc hoàn tiền lại cho khách hàng. Nếu muốn gọi thêm thì nhân viên lập một hóa đơn khác đưa cho khách hàng`
   * `Khi kết thúc ca, nhân viên ca trước giao ca với nhân viên tiếp theo, cả hai lập báo cáo doanh thu ca đó,thực hiện đếm tiền xem có trùng khớp với doanh thu hay không, nếu thiếu tiền thì nhân viên ca trước phải bồi thường lại số tiền thiếu cho cửa hàng`
### Quản lý nhân sự
   *`Nhân viên khi vào làm việc sẽ phải đăng nhập vào hệ thống bằng tài khoản và mật khẩu được cấp thì mới bắt đầu sử dụng được các chức năng trong quyền hạn của mình như là lập hóa đơn,tạo thông tin khách hàng mới và cuối ca làm của mình thì phải đăng xuất ra khỏi hệ thống`
   
   *`Sau thời gian kết ca , các tài khoản còn đang đăng nhập trên hệ thống sẽ tự động được đăng xuất.Hệ thống sẽ ghi nhận lại thời gian nhân viên đăng nhập và đăng xuất để tính toán thời gian nhân viên đó đi làm một ngày để có thể ghi nhận lại và tính tiền lương cuối tháng`
   
  *`Ngoài ra hệ thống còn ghi lại số lượng sản phẩm nhân viên bán được trong 1 ca làm để đánh giá hiểu quả làm việc của nhân viên đó.Số lượng sản phẩm trong một đơn hàng càng nhiều và càng nhiều đơn hàng thì nhân viên đó sẽ được thưởng vào cuối tháng với số tiền thưởng bằng 2% doanh thu cả tháng`
     ![FlowChart](https://github.com/luongvilam123/hello-word/blob/master/PersonnelManagementWorkFlow.svg)
### Quản lý sản phẩm
