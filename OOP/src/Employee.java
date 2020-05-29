package OOP.src;

public class Employee {
   private int salary;
   private int overtime;
   private int payPerHour;

   public static int employeeCount;

   public Employee(int salary, int payPerHour) {
      setSalary(salary);
      setPayPerHour(payPerHour);
      employeeCount++;
   }

   private void setSalary (int salary) {
      if (salary < 0) {
         throw new IllegalArgumentException("Salary cannot be below 0");
      }
      this.salary = salary;
   }

   public int getSalary() {
      return this.salary;
   }

   private void setOvertime(int overtime) {
      if (overtime < 0) {
         throw new IllegalArgumentException("Overtimw cannot be below 0");
      }
      this.overtime = overtime;
   }

   public int getOvertime() {
      return this.overtime;
   }

   private void setPayPerHour(int payPerHour) {
      if (payPerHour <= 0) {
         throw new IllegalArgumentException("Payment per hour cannot be 0 or below 0");
      }
      this.payPerHour = payPerHour;
   }

   public int getPayPerHour() {
      return payPerHour;
   }

   public int calculateWage(int overtime) {
      setOvertime(overtime);
      return this.salary + (this.overtime * this.payPerHour);
   }

   public int calculateWage() {
      // return this.salary;
      return calculateWage(0);
   }
}