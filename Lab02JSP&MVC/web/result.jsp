<%--
  Created by IntelliJ IDEA.
  User: mykola.dekhtiarenko
  Date: 30.01.17
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Coffee Recommandation JSP View</h1>
<p>

    <%
  List styles = (List) request.getAttribute("styles");
  Iterator it = styles.iterator();
  while(it.hasNext()) {
    out.print("<br>try: " + it.next());
  }
%>

</body>
</html>