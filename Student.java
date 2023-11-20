public class Student {
    private int rollno;
    private double percentage;

    private char type;
    //default constructor

    public Student()
        {
           this.rollno = 404;
           this.percentage = 0;
           this.type = 'N';

        }

    // parametrized constructor
    public Student(int rollno,double percentage)
        {
            this.rollno = rollno;
            this.percentage = percentage;
        }
    //getter

    public char getType()
        {
            return type;
        }
    public int getRollno() {
        return rollno;
    }

    public double getPercentage() {
        return percentage;
    }

    //setter

    public void setType(char type)
        {
            this.type = type;
        }
    public void setRollno(int rollno)
        {
            this.rollno=rollno;
        }

    public void setPercentage(double percentage)
        {
            this.percentage = percentage;
        }

    @Override
    public String toString() {
        return getRollno() + " " + getPercentage() + " ";
    }

    // show method

    public void show()
        {
            System.out.println("Roll no. " + rollno + " " + percentage);
        }

}
