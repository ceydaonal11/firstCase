package firstcase;

/**
 *
 * @author ceyda
 */
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    public Employee(String name, int salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
    }
    
    //tax() --> Maaşa uygulanan vergiyi hesaplayacaktır.
    // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    public double tax(){
        if(salary <1000){
            return salary;
        }else{
            double tax = salary * 0.03;
            return tax;
        }
    }
    
    /*
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
    fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus
    ücretleri hesaplayacaktır.
    */
    public int bonus(){
        if (workHours > 40){
            int bonus = (workHours - 40)*30;
            return bonus;
        }
        return 0;
        }
    
     /*
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını
    hesaplayacaktır. Şu an ki yılı 2021 olarak alın.
    - Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    - Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    */
    public double raiseSalary(){
      
        if (hireYear<=0 || hireYear>2021){
            System.out.println("Geçersiz bir çalışma yılı girdiniz");

        }else {
            int farkYil = 2021 - hireYear;
            double zam;

            if (farkYil>0 &&farkYil < 10){
                zam =  salary * 0.05;
                return zam;
            }else if (farkYil>9 && farkYil<20){
                zam = salary * 0.1;
                return zam;
            }else if (farkYil>19){
                zam = salary * 0.15;
                return  zam;
            }else if (farkYil == 0 ){
                return 0;
            }
        }

        return 0;
    }
        public String toString(){ 

        double totalSalary = salary -tax() + bonus() + raiseSalary();
        double total = salary +bonus() - tax();
        System.out.println("Employee Name:  : " + name);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Work Hours : " + workHours);
        System.out.println("Employee Hire Year : " + hireYear);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Salary Increase : " + raiseSalary());
        System.out.println("Salary along with Taxes and Bonuses : " + total);
        System.out.println("Total Salary : " + totalSalary);

        return null;
    }
    
    }    
   


    	

