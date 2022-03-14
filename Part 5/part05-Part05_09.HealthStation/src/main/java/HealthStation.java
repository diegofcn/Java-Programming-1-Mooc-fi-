
public class HealthStation {

    private int numbers;
    
    public HealthStation() {
        this.numbers = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numbers+=1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int newWeight = person.getWeight();
        person.setWeight(newWeight + 1);
        
    }
    public int weighings() {
        return this.numbers;
    }

}
