package jonibek.io.design_patterns.structural.filter;

import jonibek.io.design_patterns.structural.filter.Criteria;
import jonibek.io.design_patterns.structural.filter.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> maleList = new ArrayList<>();

        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("male")){
                maleList.add(person);
            }
        }

        return maleList;
    }
}
