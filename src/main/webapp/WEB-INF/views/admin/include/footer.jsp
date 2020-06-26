<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Control Sidebar -->
<aside class="control-sidebar control-sidebar-dark">
	<!-- Control sidebar content goes here -->
	<div class="p-3">
		<h5>Title</h5>
		<p>Sidebar content</p>
		<button type="button" class="btn btn-success btn-lg btn-block">로그아웃</button>
	</div>
</aside>
<!-- /.control-sidebar -->
<!-- Main Footer -->
<footer class="main-footer">
	<!-- To the right -->
	<div class="float-right d-none d-sm-inline">For The Horde</div>
	<!-- Default to the left -->
	<strong>Copyright &copy; 2014-2020 <a
		href="https://adminlte.io">AdminLTE.io</a>.
	</strong> All rights reserved.
</footer>
<div id="sidebar-overlay"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->

<!-- jQuery -->
<script src="/resources/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="/resources/dist/js/adminlte.min.js"></script>

<script>
	$(document).ready(function() {
		var current = location.pathname;
		$('.nav-treeview li a').each(function() { //클래스를 가져올때 '.클래스명'으로 '.'을 붙인다 
			var $this = $(this);
			if (current == "/admin" || current == "/admin/") {

			} else {
				//if ($this.attr('href').includes(current) == true) {
				if ($this.attr('href').indexOf(current) != -1) {
					$this.addClass('active');
				} else {
					$this.removeClass('active');
				}
			}
		})
	});
</script>
</body>
</html>