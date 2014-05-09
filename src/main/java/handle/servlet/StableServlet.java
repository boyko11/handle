package handle.servlet;

import handle.model.Donkey;
import handle.model.Person;
import handle.model.Stable;

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
		
		Stable stable = buildStable();
		
		ObjectMapper mapper = new ObjectMapper();
		String stableJson = mapper.writeValueAsString(stable);
		
		response.setContentType("application/json; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(stableJson);
	}

    private Stable buildStable() {
        Stable stable = new Stable();
		stable.name = "The Donkey Stable";
		stable.location = "Donkey City, MO";
		
		Donkey donkey1 = new Donkey();
		donkey1.name = "Boyko";
		donkey1.height = 173;
		donkey1.weight = 180.0;
		donkey1.temper = "Moody";
		
		Donkey donkey2 = new Donkey();
		donkey2.name = "Vlad";
		donkey2.height = 163;
		donkey2.weight = 190.0;
		donkey2.temper = "SuperNice";
		
		stable.donkeys.add(donkey1);
		stable.donkeys.add(donkey2);
		
		Person owner = new Person();
		owner.firstName = "Lionel";
		owner.lastName = "Messi";
		
		stable.owner = owner;
		stable.websiteLink = "<a href=\"http://www.guide2midipyrenees.com/uploads/businesses/large/260412143235--three%20donkeys%20in%20stable.jpg\">Super Donkeys</a>";
        return stable;
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doGet(request, response);
	}

}
