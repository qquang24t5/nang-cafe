
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<jsp:include page="../included/top.jsp" />

<div class="container-fluid bg">
  <div class="row justify-content-center">
    <div class="col-md-3 col-sm-6 col-xs-12 row-container">
      <form>
        <div class="text-center">
          <img src="./images/logo1.jpg" width="75" height="75" />
        </div>

        <h2 class="text-center">Đăng nhập</h2>
        <div class="form-group">
          <label for="username">Tên đăng nhập</label>
          <input class="form-control" id="username" placeholder="Tên đăng nhập">
        </div>
        <div class="form-group">
          <label for="password" class="label">Mật khẩu</label>
          <input
            class="form-control"
            id="password"
            placeholder="Mật khẩu"
          />
        </div>
        <div class="form-check">
          <input
            type="checkbox"
            class="form-check-input"
            id="remember-me"
          />
          <label class="form-check-label" for="remember-me"
            >Ghi nhớ đăng nhập</label
          >
        </div>
        <button name="btn-login" class="btn btn-success btn-block">
          Đăng nhập
        </button>
      </form>
    </div>
  </div>
</div>

<jsp:include page="../included/bottom.jsp" />

