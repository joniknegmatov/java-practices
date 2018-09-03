package jonibek.io.design_patterns.structural.filter;

import jonibek.io.design_patterns.structural.filter.Criteria;
import jonibek.io.design_patterns.structural.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> singleList = new ArrayList<>();

        for (Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singleList.add(person);
            }
        }

        return singleList;
    }
}
