package abstraction;

abstract class Bank{
  abstract String getRateOfInterest();
}

class SBI extends Bank{
  String getRateOfInterest(){
    return "SBI interest rate is 7%";
  }
}

class PNB extends Bank{
  String getRateOfInterest(){
    return "PNB interest rate is 5%";
  }
}

class TestBank{
  public static void main(String arg[]){
    Bank s = new SBI();
    Bank p = new PNB();

    System.out.println(s.getRateOfInterest());
    System.out.println(p.getRateOfInterest());
  }
}
