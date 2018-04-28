Scanner input = new Scanner(System.in);
	char ch = input.nextLine().charAt(0);
	
	if(ch>='a' && ch <='z' ||ch>='A' && ch <='Z' ){
	
	switch(ch){
	
	case 'a':
	System.out.println("The character is a vowel");
	break;
	
	case 'A':
	System.out.println("The character is a vowel");
	break;	
	
	case 'e':
	System.out.println("The character is a vowel");
	break;	
	
	case 'E':
	System.out.println("The character is a vowel");
	break;
	
	case 'i':
	System.out.println("The character is a vowel");
	break;
	
	case 'I':
	System.out.println("The character is a vowel");
	break;
	
	case 'O':
	System.out.println("The character is a vowel");
	break;
	
	case 'o':
	System.out.println("The character is a vowel");
	break;
	
	case 'U':
	System.out.println("The character is a vowel");
	break;
	
	case 'u':
	System.out.println("The character is a vowel");
	break;
	
	default:
	System.out.println("The entered character is a consonant");
	}
		
	}else{
	System.out.println("The entered character is not a valid character");	
	}
