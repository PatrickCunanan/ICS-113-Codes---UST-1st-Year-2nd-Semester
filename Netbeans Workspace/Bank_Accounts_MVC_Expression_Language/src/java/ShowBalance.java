import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowBalance extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       BankCustomer customer = BankCustomer.getCustomer(request.getParameter("id"));
       String address="";
       if(customer==null){
           HttpSession session = request.getSession();
           session.setAttribute("message","Unrecognized customer ID.");
           address="UnknownCustomer.jsp";
       }
       else if (customer.getBalance()<0){
            address="NegativeBalance.jsp";
            request.setAttribute("badCustomer",customer);
       }
       else if (customer.getBalance() < 10000) {
      address = "NormalBalance.jsp";
      request.setAttribute("regularCustomer", customer);
    } else {
      address = "HighBalance.jsp";
      request.setAttribute("eliteCustomer", customer);
    }
       RequestDispatcher dispatcher=request.getRequestDispatcher(address);
       dispatcher.forward(request,response);
    }
}
