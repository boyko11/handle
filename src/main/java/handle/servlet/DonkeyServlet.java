package handle.servlet;

import handle.model.Donkey;
import handle.service.StableService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

public class DonkeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public DonkeyServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    int donkeyIndex = Integer.valueOf(request.getParameter("donkeyIndex"));
		Donkey donkey = StableService.getDonkey(donkeyIndex);
		
		ObjectMapper mapper = new ObjectMapper();
		String donkeyJson = mapper.writeValueAsString(donkey);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(donkeyJson);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
