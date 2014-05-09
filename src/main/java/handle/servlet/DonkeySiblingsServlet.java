package handle.servlet;

import handle.model.Donkey;
import handle.service.StableService;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

public class DonkeySiblingsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public DonkeySiblingsServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    int donkeyIndex = Integer.valueOf(request.getParameter("donkeyIndex"));
		List<Donkey> donkeySiblings = StableService.getDonkeySiblings(donkeyIndex);
		
		ObjectMapper mapper = new ObjectMapper();
		String donkeySiblingsJson = mapper.writeValueAsString(donkeySiblings);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(donkeySiblingsJson);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
