## Homework

You should write a class named "Employee" in Java, which represents factory workers and calculates their salaries with its methods. This class will have 4 attributes and 5 methods.

**Class Attributes**

name : Employee's name and surname   
salary : Employee's salary  
workHours : Weekly working hours  
hireYear : The year the employee started working

**Class Methods**

Employee(name,salary,workHours,hireYear) : This is the constructor method and it will take 4 parameters.

tax() : It will calculate the tax applied to the salary.   
If the employee's salary is less than 1000 TL, no tax will be applied.  
If the employee's salary is more than 1000 TL, a tax of 3% of the salary will be applied.

bonus() : If the employee has worked more than 40 hours a week, it will calculate bonus fees at a rate of 30 TL for each extra hour worked.

raiseSalary() : It will calculate the salary increase based on the employee's start year.  
Take the current year as 2021. If the employee has been working for less than 10 years, a 5% raise will be applied to their salary.  
If the employee has been working for more than 9 years and less than 20 years, a 10% raise will be applied to their salary.  
If the employee has been working for more than 19 years, a 15% raise will be applied.  

toString() : It will print the information about the employee.

**Example :**

Name : Kemal  
Salary : 2000.0  
Working Hour : 45  
Start Year : 1985  
Tax : 60.0 Bonus : 150.0  
Salary Increase : 300.0  
Salary with tax and bonuses : 2090.0  
Total Salary : 2300.0 