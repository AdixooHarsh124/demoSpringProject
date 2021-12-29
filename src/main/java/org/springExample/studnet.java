package org.springExample;

public class studnet {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public studnet()
    {
       super();
    }
    public studnet(int studentId,String studentName,String studentAddress)
    {
        super();
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentAddress=studentAddress;
    }
    public int getStudentId()
    {
        return studentId;
    }
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public void setStudentAddress(String studentAddress)
    {
        this.studentAddress=studentAddress;
    }
    public String getStudentAddress()
    {
        return studentAddress;
    }
    public String toString()
    {
        return "Student [studentId= "+studentId+ ", studentName= "+studentName+", studentAddress="+studentAddress+" ]";
    }
}
