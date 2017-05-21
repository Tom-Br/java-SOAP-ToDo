<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleToDo_Service_ImplProxyid" scope="session" class="controller.ToDo_Service_ImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleToDo_Service_ImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleToDo_Service_ImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleToDo_Service_ImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        controller.ToDo_Service_Impl getToDo_Service_Impl10mtemp = sampleToDo_Service_ImplProxyid.getToDo_Service_Impl();
if(getToDo_Service_Impl10mtemp == null){
%>
<%=getToDo_Service_Impl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String id_1id=  request.getParameter("id26");
        int id_1idTemp  = Integer.parseInt(id_1id);
        application.Item getItem15mtemp = sampleToDo_Service_ImplProxyid.getItem(id_1idTemp);
if(getItem15mtemp == null){
%>
<%=getItem15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getItem15mtemp != null){
java.lang.String typename18 = getItem15mtemp.getName();
        String tempResultname18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename18));
        %>
        <%= tempResultname18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">deadline:</TD>
<TD>
<%
if(getItem15mtemp != null){
java.util.Calendar typedeadline20 = getItem15mtemp.getDeadline();
        java.text.DateFormat dateFormatdeadline20 = java.text.DateFormat.getDateInstance();
        java.util.Date datedeadline20 = typedeadline20.getTime();
        String tempResultdeadline20 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatdeadline20.format(datedeadline20));
        %>
        <%= tempResultdeadline20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">finished:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.isFinished()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String name_3id=  request.getParameter("name33");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String deadline_4id=  request.getParameter("deadline35");
            java.util.Calendar deadline_4idTemp = null;
        if(!deadline_4id.equals("")){
        java.text.DateFormat dateFormatdeadline35 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdeadline35  = dateFormatdeadline35.parse(deadline_4id);
         deadline_4idTemp = new java.util.GregorianCalendar();
        deadline_4idTemp.setTime(dateTempdeadline35);
        }
        String id_5id=  request.getParameter("id37");
        int id_5idTemp  = Integer.parseInt(id_5id);
        String finished_6id=  request.getParameter("finished39");
        boolean finished_6idTemp  = Boolean.valueOf(finished_6id).booleanValue();
        %>
        <jsp:useBean id="application1Item_2id" scope="session" class="application.Item" />
        <%
        application1Item_2id.setName(name_3idTemp);
        application1Item_2id.setDeadline(deadline_4idTemp);
        application1Item_2id.setId(id_5idTemp);
        application1Item_2id.setFinished(finished_6idTemp);
        boolean addItem28mtemp = sampleToDo_Service_ImplProxyid.addItem(application1Item_2id);
        String tempResultreturnp29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addItem28mtemp));
        %>
        <%= tempResultreturnp29 %>
        <%
break;
case 41:
        gotMethod = true;
        String id_7id=  request.getParameter("id44");
        int id_7idTemp  = Integer.parseInt(id_7id);
        boolean deleteItem41mtemp = sampleToDo_Service_ImplProxyid.deleteItem(id_7idTemp);
        String tempResultreturnp42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteItem41mtemp));
        %>
        <%= tempResultreturnp42 %>
        <%
break;
case 46:
        gotMethod = true;
        application.Item[] getAllItems46mtemp = sampleToDo_Service_ImplProxyid.getAllItems();
if(getAllItems46mtemp == null){
%>
<%=getAllItems46mtemp %>
<%
}else{
        String tempreturnp47 = null;
        if(getAllItems46mtemp != null){
        java.util.List<application.Item> listreturnp47= java.util.Arrays.asList(getAllItems46mtemp);
        //tempreturnp47 = listreturnp47.toString();
        
        for(application.Item p : listreturnp47){
        	int id = p.getId();
        	String name=p.getName();
        	boolean finished = p.isFinished();
        	
        	%>
        	<%=id%>::<%=name %>::<%=finished %>
        	<%
        }
        
        
        
        }
        %>
        <%=tempreturnp47%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>