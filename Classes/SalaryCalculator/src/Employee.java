public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return salary * ((double) 3 / 100);
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int workingYear = (2021 - this.hireYear);
        if (workingYear < 10) {
            return this.salary * 0.05;
        } else if (workingYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }


    public String toString() {
        double tax = this.tax();
        double bonus = this.bonus();
        double raise = this.raiseSalary();
        double totalSalary = this.salary - tax + bonus + raise;

        return "Adı \t: " + this.name +
                 "\nMaaşı \t: " + this.salary +
                 "\nÇalışma Saati \t: " + this.workHours +
                 "\nBaşlangıç Yılı \t: " + this.hireYear +
                 "\nVergi \t: " + tax +
                 "\nBonus \t: " + bonus +
                 "\nMaaş Artışı \t: " + raise +
                 "\nVergi ve Bonuslar ile birlikte maaş \t: " + (this.salary - tax + bonus) +
                 "\nToplam Maaş \t: " + totalSalary;
    }

}

