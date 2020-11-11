
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<jsp:include page="../included/top.jsp" />

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand"><img src="logo.png" width="50" height="50" /></a>

  <!-- Links -->
  <!--<ul class="navbar-nav">
    <li class="nav-item">
        <h1 align="center"> Danh Sách Nhân Viên </h1>
     <!-- <a class="nav-link" href="#">Link 1</a>-->
  -->
</nav>
<!-- <br><div> <h1 align="center">Danh Sách Nhân Viên</h1></div><br>-->

<br />
<div><h1 align="center">Danh Sách Nhân Viên</h1></div>

<div class="table-responsive">
  <table class="table table-hover">
    <thead class="table-warning">
      <tr>
        <th>Mã Nhân Viên</th>
        <th>Tên Nhân Viên</th>
        <th>Giới Tính</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Điện Thoại</th>
        <th>Tên Tài Khoản</th>
        <th>Mật Khẩu</th>
        <th>Ngày Tạo</th>
        <th>Kích Hoạt</th>
      </tr>
    </thead>
    <tbody>
      <tr class="table-hover">
        <td>123</td>
        <td>Nhật</td>
        <td>Nam</td>
        <td>2000-11-22</td>
        <td>22 Dạ Nam</td>
        <td>0123456789</td>
        <td>Nhat2211</td>
        <td>123456</td>
        <td>2020-11-08</td>
        <td>1</td>
      </tr>
      <tr>
        <td>456</td>
        <td>Nam</td>
        <td>Nữ</td>
        <td>2000-10-15</td>
        <td>221 Nhật Tảo</td>
        <td>0921234567</td>
        <td>Nu1510</td>
        <td>456321</td>
        <td>2020-10-10</td>
        <td>0</td>
      </tr>
    </tbody>
  </table>
</div>

<jsp:include page="../included/bottom.jsp" />
