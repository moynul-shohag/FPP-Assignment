package assignment_3_problem_2;
import java.time.LocalDate;
import java.time.Period;


public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    private int restingHeartRate=70;
    double lowerBoundary = 0.5;
    double upperBoundary = 0.85;
    public HeartRates(String firstName,String lastName,LocalDate dateOfBirth)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        this.dateOfBirth=dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public int calculateAge() {
        LocalDate now = LocalDate.now();
        return Period.between(this.dateOfBirth, now).getYears();
    }
    public int calculateMaximumHeartRate() {
        return 220-calculateAge();
    }


    public void calculateTargetHeartRateRange() {
        int maxHeartRate = calculateMaximumHeartRate();
        int averageHeartRate = maxHeartRate - this.restingHeartRate;
        double lowerBoundaryTargetHeartRate = Math.round((averageHeartRate * lowerBoundary) + this.restingHeartRate);
        double upperBoundaryTargetHeartRate = Math.round((averageHeartRate * upperBoundary) + this.restingHeartRate);
        System.out.printf("The Target Heart Rate Range is between: %f and %f bpm\n", lowerBoundaryTargetHeartRate, upperBoundaryTargetHeartRate);
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nDate of Birth: " + dateOfBirth +"\nMaximum Heart Rate: "+calculateMaximumHeartRate());
    }

}
