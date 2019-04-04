package romannumberconverter;

public class Romannumberconverter {

  public int convert(String romanNumber) {
    if (romanNumber == null) {
      throw new IllegalArgumentException("nb cannot be null");
    }
    int i = 0;
    int e = romanNumber.length();
    for (int k=0; k<e; k++){
      char testedNumber = romanNumber.charAt(k);
      switch(testedNumber)
      {
        case 'I' :
          i += 1;
          break;
        case 'V' :
          i += 5;
          break;
        case 'X' :
          i += 10;
          break;
      }
    }
    return i;
  }
}
