package handle.service;

import handle.model.Donkey;
import handle.model.Person;
import handle.model.Stable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class StableService {
    
    private static Map<String, Stable> stableDB;
    
    static {
        stableDB = new HashMap<String, Stable>();
        
        Stable stable = new Stable();
        stable.name = "The Donkey Stable";
        stable.location = "Donkey City, MO";
        
        Donkey donkey1 = new Donkey();
        donkey1.name = "Boyko";
        donkey1.height = 173;
        donkey1.weight = 180.0;
        donkey1.temper = "Moody";
        donkey1.siblings = buildSiblings();
        
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
        
        stableDB.put("1", stable);
    }
    
    static private List<Donkey> buildSiblings() {
        
        Donkey donkey1 = new Donkey();
        donkey1.name = "Sibling1";
        donkey1.height = 17;
        donkey1.weight = 18.0;
        donkey1.temper = "Super Cool";
        
        Donkey donkey2 = new Donkey();
        donkey2.name = "Sibling2";
        donkey2.height = 1998;
        donkey2.weight = 187654.0;
        donkey2.temper = "Super Nervous";
        
        Donkey donkey3 = new Donkey();
        donkey3.name = "Sibling3";
        donkey3.height = 7;
        donkey3.weight = 7.77;
        donkey3.temper = "Super Crazy";

        List<Donkey> siblings = new ArrayList<Donkey>();
        
        siblings.add(donkey1);
        siblings.add(donkey2);
        siblings.add(donkey3);
        
        return siblings;
        
    }
    
    public static final Stable getStable(String id) {
        
        return stableDB.get(id);
    }
    
    public static final List<Donkey> getDonkeySiblings(int donkeyIndex) {
        
        return stableDB.get("1").donkeys.get(donkeyIndex).siblings;
    }

    public static Donkey getDonkey(int donkeyIndex) {

        return stableDB.get("1").donkeys.get(donkeyIndex);
    }
    
}
