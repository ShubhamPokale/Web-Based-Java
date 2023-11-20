
//⦁	 Create a class Student with two members  : rollno and percentage.
//
//        Create default and parameterized constructors. Create method show() to display information.
//        Create another class CollegeStudent inherits  Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method.
//
//        Create another class SchoolStudent inherits  Student class. Add a new member classname(eg 12th ,10th  etc.)  to it. Create default and parameterized constructors. Also override show() method.
//
//        Create a class(say XYZ) with main method that carries out the operation of the project :
//        -- has array to store objects of any class(Student or CollegeStudent, SchoolStudent)
//        --create two CollegeStudent  and three SchoolStudent record objects and store them inside the array
//-- display all record from the array
//-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
//        --count how many students are having A grade,  if for A grade percentage >75




public class WebBasedJavaAssignment01 {


    public static void searchStudent(int rollno, Student[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].getRollno() == rollno)
            {
                System.out.println("Student found ");
                System.out.println(arr[i].getClass());
                return;
            }
        }
    }

    public static int AGraders(Student[] arr)
        {   int count = 0 ;
            for(int i = 0; i< arr.length; i++ )
                {
                    if(arr[i].getPercentage()>75)
                        {
                               count++;
                        }
                }
            return count;
        }

    public static void display(Student[] arr)
        {
            for(int i = 0; i < arr.length;i++)
                {
                    System.out.println(arr[i] + " ");
                }
        }
    public static void main(String[] args) {


       // --create two CollegeStudent  and three SchoolStudent record objects and store them inside the array
//-- display all record from the array

        CollegeStudent s1 = new CollegeStudent(101,87,8);
        CollegeStudent s2 = new CollegeStudent(102,78,8);

        SchoolStudent s3 = new SchoolStudent(104,86,9);
        SchoolStudent s4 = new SchoolStudent(103,76,10);
        SchoolStudent s5 = new SchoolStudent(105,80,9);


        Student[] arr = new Student[5];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;

         //search the array;
        searchStudent(102,arr);
        // A graders count
        System.out.println("The following number of students have an  A grade : ");
        System.out.println(AGraders(arr));
        System.out.println(" ");
        // display array elements
        display(arr);





    }


}
