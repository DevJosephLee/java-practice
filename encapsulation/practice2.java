package encapsulation;

// Sample Exercise Create an encapsulated
// class with 4
// fields and
// the respective
// methods to
// access and
// edit those
// fields. Then go
// ahead and
// create a test

// class to
// verify.

//     Class Name:
// Student Field Names:studentId,studentName,collegeName,
// address Test
// Class Name:TestStudent

class Student {
  private String studentId;
  private String studentName;
  private String collegeName;
  private String address;

  public String getStudentId() {
    return studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public String getCollegeName() {
    return collegeName;
  }

  public String getAddress() {
    return address;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}

class testStudent {
  public static void main(String[] args) {
    Student s = new Student();
    s.setStudentId("1");
    s.setStudentName("Joseph Lee");
    s.setCollegeName("Hogwartz");
    s.setAddress("1111 Baller Rd");

    System.out.println("studentId: "+s.getStudentId()+", studentName: "+s.getStudentName()+", collegeName: "+s.getCollegeName()+", address: "+s.getAddress());
  }
}
