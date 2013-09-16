/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Oubaid
 */
public class Login extends HttpServlet {

    
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname=null,passw=null;
        try {
            uname=request.getParameter("uname");
            passw=request.getParameter("passw");
        } catch(Exception e) {            
            e.printStackTrace();//out.close();
        }
        
            if(uname==null||uname.equals(""))
            {
                out.println("User name cant be empty");
                RequestDispatcher rd=request.getRequestDispatcher("/index.html");
                rd.include(request, response);
                out.close();
                return;
            }
        
        
        
            else
    {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html>\n" +
"<head>\n" +
"<title>index</title>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">\n" +
"<link href=\"mycss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"</head>\n" +
"<body>\n" +
"<!-- Save for Web Slices (index.psd) -->\n" +
"<table class=\"container\" id=\"Table_01\" width=\"1025\" height=\"769\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
"	<tr>\n" +
"		<td colspan=\"13\">\n" +
"			<img src=\"images/index_01.gif\" width=\"1024\" height=\"20\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"20\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td rowspan=\"11\">\n" +
"			<img src=\"images/index_02.gif\" width=\"67\" height=\"748\" alt=\"\"></td>\n" +
"		<td width=\"900\" height=\"90\" colspan=\"11\" background=\"images/index_03.gif\"><h1 class=\"header\">MyEmail System</h1></td>\n" +
"		<td rowspan=\"11\">\n" +
"			<img src=\"images/index_04.gif\" width=\"67\" height=\"748\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"85\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"11\">\n" +
"			<img src=\"images/index_05.gif\" width=\"890\" height=\"8\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"8\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td rowspan=\"7\">\n" +
"			<img src=\"images/index_06.gif\" width=\"5\" height=\"591\" alt=\"\"></td>\n" +
"		<td id=\"nav\" width=\"109\" height=\"37\" colspan=\"2\" background=\"images/index_07.gif\">Home</td>\n" +
"		<td id=\"nav\" width=\"109\" height=\"37\" background=\"images/index_08.gif\">Inbox</td>\n" +
"		<td id=\"nav\" width=\"109\" height=\"37\" background=\"images/index_09.gif\">Outbox</td>\n" +
"		<td id=\"nav\" width=\"109\" height=\"37\" background=\"images/index_10.gif\">Draft</td>\n" +
"		<td id=\"nav\" width=\"109\" height=\"37\" background=\"images/index_11.gif\">Logout</td>\n" +
"		<td width=\"340\" height=\"37\" colspan=\"3\" background=\"images/index_12.gif\">Welcome, "+ uname +"&nbsp;</td>\n" +
"		<td rowspan=\"2\">\n" +
"			<img src=\"images/index_13.gif\" width=\"5\" height=\"42\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"37\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"9\">\n" +
"			<img src=\"images/index_14.gif\" width=\"880\" height=\"5\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"5\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td rowspan=\"5\">\n" +
"			<img src=\"images/index_15.gif\" width=\"14\" height=\"549\" alt=\"\"></td>\n" +
"		<td id=\"headcontainer\" width=\"634\" height=\"379\" colspan=\"6\" rowspan=\"4\" valign=\"top\" background=\"images/index_16.jpg\">&nbsp;&nbsp;&nbsp;Welcome to MyEmail System</td>\n" +
"		<td rowspan=\"5\">\n" +
"			<img src=\"images/index_17.gif\" width=\"10\" height=\"549\" alt=\"\"></td>\n" +
"		<td id=\"leftlogin\" width=\"227\" height=\"183\" colspan=\"2\" background=\"images/index_18.gif\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"183\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"2\">\n" +
"			<img src=\"images/index_19.gif\" width=\"227\" height=\"11\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"11\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"2\">\n" +
"			<img src=\"images/index_20.gif\" width=\"227\" height=\"182\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"182\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"2\" rowspan=\"2\">\n" +
"			<img src=\"images/index_21.gif\" width=\"227\" height=\"173\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"3\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"6\">\n" +
"			<img src=\"images/index_22.gif\" width=\"634\" height=\"170\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"170\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"11\">\n" +
"			<img src=\"images/index_23.jpg\" width=\"890\" height=\"41\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"41\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td colspan=\"11\">\n" +
"			<img src=\"images/index_24.gif\" width=\"890\" height=\"23\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"1\" height=\"23\" alt=\"\"></td>\n" +
"	</tr>\n" +
"	<tr>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"67\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"5\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"14\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"95\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"107\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"105\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"110\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"109\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"108\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"10\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"222\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"5\" height=\"1\" alt=\"\"></td>\n" +
"		<td>\n" +
"			<img src=\"images/spacer.gif\" width=\"67\" height=\"1\" alt=\"\"></td>\n" +
"		<td></td>\n" +
"	</tr>\n" +
"</table>\n" +
"<!-- End Save for Web Slices -->\n" +
"</body>\n" +
"</html>");
            out.close();
    }
        
    }

   
}
