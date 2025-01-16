// Write a program to create a class Student with the following members:
class Student{
    public String name;
    public String rollNumber;
    public int [] marks;
    Student(String name, String rollNumber, int marks[]){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    // method to calculate the grade of student
    public String Grade(int marks[]){
        int sum=0;
        for(int ii : marks) sum+=ii;
        double totalMarks=(double)(sum/5);
        if(totalMarks>=90){
            return "A";
        }else if(totalMarks<90 && totalMarks>=81){
            return "B";
        }else if(totalMarks<80 && totalMarks>=71){
            return "C";
        }else if(totalMarks<70 && totalMarks>=61){
            return "D";
        }else{
            return "E";
        }
    }
    //  method to display the details of student
    public void display(){
        System.out.println("Name of Student: "+name);
        System.out.println("Roll Number of Student: "+rollNumber);
        for(int i=0; i<5; i++){
            System.out.println("marks of subject "+(i+1)+" is: "+marks[i]);
        }
        System.out.println("Grade of Student: "+Grade(marks));

    }
    public static void main(String[] args) {
      int newMarks[]={99,98,97,98,96};
      Student s = new Student("Pankaj","0111AL211116",newMarks);
      s.display();
    }
}