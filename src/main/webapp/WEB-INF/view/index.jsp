<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!-- Spring form を使ったサンプルa  -->
<html>
 <head>
 <meta charset="utf-8" />
 <title>ログイン</title>
 </head>
 <body>
 
<f:form modelAttribute="loginForm" action="login" method="post">
 <div>
 ユーザ名：<input type="text" id="loginName" name="loginName">
 <f:errors path="loginName" element="div" cssStyle="color:red" />
 </div>
 <div>
 パスワード：<input type="password" id="loginPassword" name="loginPassword">
 <f:errors path="loginPassword" element="div" cssStyle="color:red" />
 </div>

<div>
 <input type="submit" value="ログイン">
 </div>
 
 </f:form>
 
 </body>