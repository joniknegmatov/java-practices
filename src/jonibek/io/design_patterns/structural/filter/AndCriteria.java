package jonibek.io.design_patterns.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria anotherCriteria;

    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return anotherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
