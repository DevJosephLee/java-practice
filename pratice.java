// Sample Exercise
// Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.

// Go ahead and code the above scenario.
class Bank{
  int getRateOfInterest(){
    return 0;
  }
}

class SBI extends Bank{
  int getRateOfInterest(){
    return 8;
  }
}

class ICICI extends Bank{
  int getRateOfInterest(){
    return 7;
  }
}

class AXIS extends Bank {
  int getRateOfInterest(){
    return 9;
  }
}

class Test{
  public static void main( String args[]) {
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();

    System.out.println("SBI interst rate is: "+s.getRateOfInterest()+"%");
    System.out.println("ICICI interst rate is: " + i.getRateOfInterest() + "%");
    System.out.println("AXIS interst rate is: " + a.getRateOfInterest() + "%");
  }
}
