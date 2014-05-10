package handle.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties({"siblings"})
public class Donkey {
	
	public String name;
	public String temper;
	public Double weight;
	public Integer height;
	public List<Donkey> siblings = new ArrayList<Donkey>();

}
