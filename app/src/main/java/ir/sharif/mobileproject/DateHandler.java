import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateHandler {
    static class Person {
        String name, detail;
        float cost, dif;

        public Person(String name, float cost) {
            this.name = name;
            this.cost = cost;
            this.detail = "";
            this.dif = 0;
        }

        public String getName() {
            return name;
        }

        public String getDetail() {
            return detail;
        }

        public float getCost() {
            return cost;
        }

        public float getDif() {
            return dif;
        }

        public void addDetail(String detail) {
            this.detail += detail+"\n";
        }

        public void setDif(float dif) {
            this.dif = dif;
        }
    }

    static List<Person> calculatePrices(List<Person> persons) {
        float avg = 0;
        float sum = 0;
        for (Person p :
                persons) {
            sum += p.getCost();
        }
        avg= sum/persons.size();
        for (Person p :
                persons) {
            p.setDif(p.getCost() - avg);
        }
        Collections.sort(persons, Comparator.comparing(s -> s.getDif()));
        while(persons.get(0).getDif()< -0.1) {
            float sum2 = persons.get(0).getDif() + persons.get(persons.size() - 1).getDif();
            if (sum2 > 0) {
                persons.get(0).addDetail(String.format("%s be %s bedahad %f", persons.get(0).getName(),
                        persons.get(persons.size() - 1).getName(), -(persons.get(0).getDif())));
                persons.get(persons.size() - 1).addDetail(String.format("%s az %s begirad %f",
                        persons.get(persons.size() - 1).getName(), persons.get(0).getName(), -(persons.get(0).getDif())));
                persons.get(persons.size() - 1).setDif(sum2);
                persons.get(0).setDif(0);
            } else if (sum2 < 0) {
                persons.get(0).addDetail(String.format("%s be %s bedahad %f", persons.get(0).getName(),
                        persons.get(persons.size() - 1).getName(), (persons.get(persons.size() - 1).getDif())));
                persons.get(persons.size() - 1).addDetail(String.format("%s az %s begirad %f",
                        persons.get(persons.size() - 1).getName(), persons.get(0).getName(), persons.get(persons.size() - 1).getDif()));
                persons.get(persons.size() - 1).setDif(0);
                persons.get(0).setDif(sum2);
            } else {
                persons.get(0).addDetail(String.format("%s be %s bedahad %f", persons.get(0).getName(),
                        persons.get(persons.size() - 1).getName(), (persons.get(persons.size() - 1).getDif())));
                persons.get(persons.size() - 1).addDetail(String.format("%s az %s begirad %f",
                        persons.get(persons.size() - 1).getName(), persons.get(0).getName(), persons.get(persons.size() - 1).getDif()));
                persons.get(persons.size() - 1).setDif(0);
                persons.get(0).setDif(0);
            }
            Collections.sort(persons, Comparator.comparing(s -> s.getDif()));
        }
        return persons;
    }
}
