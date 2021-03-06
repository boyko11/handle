package handle.servlet;

import handle.model.Stable;
import handle.service.StableService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

public class StableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public StableServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Stable stable = StableService.getStable("1");
		
		ObjectMapper mapper = new ObjectMapper();
		String stableJson = mapper.writeValueAsString(stable);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(stableJson);
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
