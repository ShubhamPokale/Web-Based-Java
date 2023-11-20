//Create another class SchoolStudent inherits  Student class. Add a new member classname(eg 12th ,10th  etc.)  to it. Create default and parameterized constructors. Also override show() method.

public class SchoolStudent extends Student {

    private int classname;
    // default constructor
    public SchoolStudent()
        {
            super();
            super.setType('S');
            this.classname=0;
        }

    // parameterized constructor
    public SchoolStudent(int classname)
        {
            super();
            super.setType('S');
            this.classname= classname;
        }

    public SchoolStudent(int rollno,double percentage,int classname)
        {
            super(rollno,percentage);
            super.setType('S');
            this.classname = classname;
        }

    // getter
    public int getClassname()
        {
            return classname;
        }


    //setter
    public void setClassname(int classname)
        {
            this.classname = classname;
        }
    // overridden methods
    @Override
    public String toString() {
        return getRollno() + " " + getClassname()  +" " + getPercentage() + " " + getType() + " " ;
    }
    @Override
    public void show()
        {
            System.out.println(getRollno() + " " + getClass() + " " + getPercentage());

        }
}
