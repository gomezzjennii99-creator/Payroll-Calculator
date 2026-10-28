package com.pluralsight;
public class Employee {

    //add employees attributes
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double  payRate;

    //create constructor
    public Employee(int employeeId, String name, double hoursWorked, double parRate) {

        //Use the "this" keyword       Explanation:
        /*  this.name - the name stored in the employee object
               name   - the name passed into the constructor
                 =    - assigns the value on the right to the variable on the left */
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    //getter: retrieves a value
    //setter: changes a value

    //Create a getter for name - inside employee class, below my constructor

    /* Understand getter
    public: other classes can use this method
    String: The method returns text
    getName: The method's name
    return name;: Sends back the employee's name
     */

    public String getName() {
        return name;

    }

    //Next, Create first setter

    /* understand setter
    public: other classes can use this method
    void: the method doesn't return a value
    setName(): receives the new name
    this.name = name; saves the new name to the employee object
     */

    public void setName(String name){
        this.name = name;

    }

    // getter for hoursWorked
    public double getHoursWorked() {
        return hoursWorked;
    }
    // setter for hoursWorked
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    // getter for PayRate
    public double getPayRate() {
        return payRate;
    }
    //setter for payRate
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    //Exercise requires a getter for employee ID but not a setter
    // getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    //Create getGrossPay() - Calculate employee's gross pay
    //this method calculate pay
    //return sends the calculated result back
    public double getGrossPay(){
        return hoursWorked * payRate;
    }



}
