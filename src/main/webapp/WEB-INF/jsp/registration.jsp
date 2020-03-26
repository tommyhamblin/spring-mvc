<!--
  ~ Copyright 2020 Tommy Hamblin
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ you may obtain a copy of the License at
  ~
  ~       http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  -->
<%@ page contentType="text/html;charset=UTF8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <link rel="stylesheet" href="css/registration.css" />
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>