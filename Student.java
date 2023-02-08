public class Student {
    
    private String studentName;
    private int studentID;
    private char studentRegister;

    public Student(String sName, int sID, char sRegister){

        studentName = sName;

        studentID = sID;

        studentRegister = sRegister;

    }

    public void setStudentName(String sName){
        studentName = sName;
    }

    public void setStudentID(int sID){
        studentID = sID;
    }

    public void setStudentRegister(char sRegister){
        studentRegister = sRegister;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentID(){
        return studentID;
    }

    public char getStudentRegister(){
        return studentRegister;
    }


}
