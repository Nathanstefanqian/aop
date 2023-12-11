<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="form1" method="post" action="${pageContext.request.contextPath }/add">
  <p>苹果信息录入</p>
  <p>重量：
    <label>
    <input name="aweight" type="text" id="aweight">
    </label>
</p>
  <p>产地：
    <label>
    <input name="aplace" type="text" id="aplace">
    </label>
  </p>
  <p>价格：
    <label>
    <input name="aprice" type="text" id="aprice">
    </label>
  </p>
  <p>
    <label>
    <input type="submit" name="Submit" value="提交">
    </label>
    <label>
    <input type="reset" name="Submit2" value="重置">
    </label>
  </p>
  <label></label>
</form>
</body>
</html>