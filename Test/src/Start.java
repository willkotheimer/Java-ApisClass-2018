
public class Start {

	String word = "Hello World";
		
	  
	    word=word.toLowerCase();
	    String[] charArr = word.split("");
	    int size=charArr.length;
	    String[] charHold = new String[size];
	    char symbol;
	     for(int x=0; x<=charArr.length-1; x++) {
	      charHold[x]=")";
	    }
	    int bool=0;
	    for(int x=0; x<=charArr.length-1; x++) {
	      symbol = word.charAt(x);
	      for(int y=0; y<=word.length()-1; y++) {
	        char check = word.charAt(y); //char to check x against
	        if((y!=x)&&(check==symbol)) {
	           charHold[y]="(";
	         //  charHold[x]="(";
	        } 
	       
	      }
	    }
	    word="";
	    for(int x=0; x<=charHold.length-1; x++) {
	      word+=charHold[x];
	    }
	    System.out.println(word);
	  
	  
	}


