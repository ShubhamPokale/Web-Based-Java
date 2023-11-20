public class CollegeStudent extends Student {

        private int semester;

        // default constructor
    public CollegeStudent()
        {
            super();
            super.setType('C');
            this.semester = 1;
        }
        // parameterized constructor
    public CollegeStudent(int rollno,double percentage,int semester)
        {
            super(rollno,percentage);
            super.setType('S');
                this.semester = semester;
        }
        // getter

    public int getSemester()
        {
            return this.semester;
        }

        // setter
    public void setSemester(int semester)
        {
            this.semester = semester;
        }
        // overridden methods


    @Override
    public String toString() {
        return getRollno() + " " + getSemester()  +" " + getPercentage() + " " + getType() + " " ;
    }

    @Override
    public void show()
        {
            System.out.println("Roll no. " + getRollno() + " " + getSemester() + " " + getPercentage());
        }
}
