import java.util.*;
import java.lang.Math.*;
class iCALC_Number_Converter_System{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String homepage="";
		String decimalpage="";
		String octalpage="";
		String binarypage="";
		String hexapage="";
		String rpage="";
		do{System.out.println("               	     			 __   ______              __                                      ");
		System.out.println("               	     			|  \\ /      \\            |  \\                                  ");
		System.out.println("               	     			 \\$$|  $$$$$$\\   ______  | $$  _______                         ");
		System.out.println("               	     			|  \\| $$   \\$$  |      \\ | $$ /       \\                      ");
		System.out.println("               	     			| $$| $$         \\$$$$$$\\| $$|  $$$$$$$                        ");
		System.out.println("               	     			| $$| $$   __   /      $$| $$| $$                                ");
		System.out.println("               	     			| $$| $$__/  \\ |  $$$$$$$| $$| $$_____                          ");
		System.out.println("               	     			| $$ \\$$    $$  \\$$    $$| $$ \\$$     \\                      ");
		System.out.println("               	     			 \\$$  \\$$$$$$    \\$$$$$$$ \\$$  \\$$$$$$$                     ");	
		System.out.println();
		System.out.println();
		
		System.out.println(" _   _                       _                        _____                                       _                             ");
		System.out.println("| \\ | |                     | |                      / ____|                                     | |                           ");
		System.out.println("|  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __  __   __  ___   _ __  | |_    ___   _ __            ");
		System.out.println("| . ` | | | | | | '_ ' _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\ \\ \\ / / / _ \\ | '__| | __|  / _ \\ | '__|   ");
		System.out.println("| |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | | \\ v / |  __/ | |    | |_  |  __/ | |             ");
		System.out.println("|_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|  \\_/   \\___| |_|     \\__|  \\___| |_|      ");
		System.out.println();
		System.out.println("====================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("      [01] Decimal Converter\n");
		System.out.println("      [02] Binary Converter\n");
		System.out.println("      [03] Octal Converter\n");
		System.out.println("      [04] Hexadecimal Converter\n");
		System.out.println("      [05] Roman Number Converter\n\n");
		
		System.out.print("Enter Option -> ");
		int option=input.nextInt(); 
		
		switch(option){
			case 1:
				do{System.out.println();
				System.out.println("+-----------------------------------------+");
				System.out.println("|            Decimal Converter            |");
				System.out.println("+-----------------------------------------+");
				System.out.println();
				System.out.println();
							
				System.out.print("Enter an Decimal number: ");
				int decNum=input.nextInt();
				
				
				if(decNum<0){
					System.out.println("        Invalid input...");
					System.out.println();
					System.out.print("Do you want to input number again(Y/N) -> ");
					decimalpage=input.nextLine();
					decimalpage=input.nextLine();
				}else{
					String y="";
					String bi="";	
									
					for(int num=decNum;num!=0;){
						int x=num%2;
						y+=x;
						num=num/2;	
					}
					for(int i=y.length()-1;i>=0;i--){
						bi+=y.charAt(i);
					}	
					
					String a="";
					String oct="";
					for(int num1=decNum;num1!=0;){
							int x=num1%8;
							a+=x;
							num1=num1/8;	
					}
					for(int i=a.length()-1;i>=0;i--){
						oct+=a.charAt(i);
					}
					
					String b="";
					String hex="";
					for(int num2=decNum;num2!=0;){
							int x=num2%16;
							if(x>=10){
								switch(x){
									case 10:
										b+="A";
										break;
									case 11:
										b+="B";
										break;
									case 12:
										b+="C";
										break;
									case 13:
										b+="D";
										break;
									case 14:
										b+="E";
										break;
									case 15:
										b+="F";
										break;															
								}	
							}else{
								b+=x;
							}	
							num2=num2/16;	
					}
					for(int i=b.length()-1;i>=0;i--){
						hex+=b.charAt(i);
					}
					System.out.println();
					System.out.println("    Binary number: "+bi);
					System.out.println("    Octal number: "+oct);
					System.out.println("    Hexadecimal number: "+hex);
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.print("Do you want to go to homepage(Y/N) -> ");
					homepage=input.nextLine();
					homepage=input.nextLine();					
				}
				}while(decimalpage.equalsIgnoreCase("Y"));
				break;
			case 2:
				do{System.out.println();
				System.out.println("+-----------------------------------------+");
				System.out.println("|             Binary Converter            |");
				System.out.println("+-----------------------------------------+");
				System.out.println();
				System.out.println();
							
				System.out.print("Enter an Binary number: ");
				int biNum=input.nextInt();
				
				
				int num=biNum;
				int temp=0;
				String s=""+biNum;
				int l=s.length();
				for(int i=0;i<l;i++){
				 	temp=biNum%10;
				 	biNum=biNum/10;
					if(temp!=0 && temp!=1){
						System.out.println("        Invalid input...");
						System.out.println();
						System.out.print("Do you want to input number again(Y/N) -> ");
						binarypage=input.nextLine();
						binarypage=input.nextLine();
						break;
					}
				}
				if(temp!=0 && temp!=1){continue;}
				int decimal=0;
				for(int i=0;i<l;i++){
					double x=(num%10)*Math.pow(2,i);
					decimal+=x;
					num=num/10;
				}
	
				
				String a="";
				String oct="";
				for(int num1=decimal;num1!=0;){
						int x=num1%8;
						a+=x;
						num1=num1/8;	
				}
				for(int i=a.length()-1;i>=0;i--){
					oct+=a.charAt(i);
				}

				
				String b="";
				String hex="";
				for(int num2=decimal;num2!=0;){
						int x=num2%16;
						if(x>=10){
							switch(x){
								case 10:
									b+="A";
									break;
								case 11:
									b+="B";
									break;
								case 12:
									b+="C";
									break;
								case 13:
									b+="D";
									break;
								case 14:
									b+="E";
									break;
								case 15:
									b+="F";
									break;															
							}	
						}else{
							b+=x;
						}	
						num2=num2/16;	
				}
				for(int i=b.length()-1;i>=0;i--){
					hex+=b.charAt(i);	
				}
					System.out.println();
					System.out.println("    Decimal number: "+decimal);
					System.out.println("    Octal number: "+oct);
					System.out.println("    Hexadecimal number: "+hex);
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.print("Do you want to go to homepage(Y/N) -> ");
					homepage=input.nextLine();
					homepage=input.nextLine();
			}while(binarypage.equalsIgnoreCase("Y"));
			break;	
			case 3:
				do{System.out.println();
				System.out.println("+-----------------------------------------+");
				System.out.println("|             Octal Converter             |");
				System.out.println("+-----------------------------------------+");
				System.out.println();
				System.out.println();
							
				System.out.print("Enter an Octal number: ");
				int octNum=input.nextInt();
				
				
				
				String q=""+octNum;
				int x=octNum;
				int temp=0;
				int len=q.length();
				int xl=0;
				for(int i=0;i<len;i++){
				 	temp=x%10;
				 	x=x/10;
					if(0> temp || temp >=8){
						xl=1;																			
					}		
				}
				if(xl==1){
					System.out.println("        Invalid input...");
					System.out.print("Do you want to input number again (Y/N)-> ");
					octalpage=input.next();
				}
				
			if(xl!=1){				
				int decimal=0;
				int num=octNum;
				for(int i=0;i<len;i++){
					double y=(num%10)*Math.pow(8,i);
					decimal+=y;
					num=num/10;
				}
				
				
				String y="";
				String bi="";
				int decOct=decimal;
				while(decOct!=0){
					int r=decOct%2;
					y+=r;
					decOct=decOct/2;	
				}
				for(int i=y.length()-1;i>=0;i--){
					bi+=y.charAt(i);
				}
				
				
				String b="";
				String hex="";
				int num2=decimal;
				while(num2!=0){
						int k=num2%16;
						if(k>=10){
							switch(k){
								case 10:
									b+="A";
									break;
								case 11:
									b+="B";
									break;
								case 12:
									b+="C";
									break;
								case 13:
									b+="D";
									break;
								case 14:
									b+="E";
									break;
								case 15:
									b+="F";
									break;															
							}	
						}else{
							b+=k;
						}	
						num2=num2/16;	
				}
				for(int i=b.length()-1;i>=0;i--){
					hex+=b.charAt(i);
				}
			
			System.out.println();
			System.out.println("    Decimal number: "+decimal);
			System.out.println("    Binary number: "+bi);
			System.out.println("    Hexadecimal number: "+hex);
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.print("Do you want to go to homepage(Y/N) -> ");
			homepage=input.nextLine();
			homepage=input.nextLine();
		}		
			}while(octalpage.equalsIgnoreCase("Y"));
			break;
			case 4:
				do{System.out.println();
				System.out.println("+-----------------------------------------+");
				System.out.println("|          HexaDecimal Converter          |");
				System.out.println("+-----------------------------------------+");
				System.out.println();
				System.out.println();
					
				String x="";		
				System.out.print("Enter an HexaDecimal number: ");
				String hexNum=input.next();
				String jk="";
				int hd=0;
				for(int i=hexNum.length()-1;i>=0;i--){
					x+=hexNum.charAt(i);
					if(!x.equalsIgnoreCase("A") && !x.equalsIgnoreCase("B")  && !x.equalsIgnoreCase("C") && !x.equalsIgnoreCase("D") && !x.equalsIgnoreCase("E") && !x.equalsIgnoreCase("F")&& !x.equalsIgnoreCase("0")&& !x.equalsIgnoreCase("1")&& !x.equalsIgnoreCase("2")&& !x.equalsIgnoreCase("3")&& !x.equalsIgnoreCase("4")&& !x.equalsIgnoreCase("5")&& !x.equalsIgnoreCase("6")&& !x.equalsIgnoreCase("7")&& !x.equalsIgnoreCase("8")&& !x.equalsIgnoreCase("9")){
						hd=1;
					}
					x="";			
				}
				if(hd==1){
					System.out.println("        Invalid input...\n");
					System.out.print("Do you want to input number again (Y/N)-> ");
					hexapage=input.next();
				}
	if(hd!=1){
				String w="";
				int a=0;
				int tot =0;
				for(int i=hexNum.length()-1;i>=0;i--,a++){
					w+=hexNum.charAt(i);
					if (w.equalsIgnoreCase("0") || w.equalsIgnoreCase("1")|| w.equalsIgnoreCase("2")|| w.equalsIgnoreCase("3")|| w.equalsIgnoreCase("4")|| w.equalsIgnoreCase("5")|| w.equalsIgnoreCase("6")|| w.equalsIgnoreCase("7")|| w.equalsIgnoreCase("8")|| w.equalsIgnoreCase("9")){
							tot+=Integer.valueOf(w)*Math.pow(16,a);
					}else if(w.equalsIgnoreCase("A") || w.equalsIgnoreCase("B")  || w.equalsIgnoreCase("C") || w.equalsIgnoreCase("D") || w.equalsIgnoreCase("E") || w.equalsIgnoreCase("F")){
						 if(w.equalsIgnoreCase("A")){
							 tot+=Integer.valueOf(10)*Math.pow(16,a);
						}else if(w.equalsIgnoreCase("B")){
							tot+=Integer.valueOf(11)*Math.pow(16,a);
						}else if(w.equalsIgnoreCase("C")){
							tot+=Integer.valueOf(12)*Math.pow(16,a);
						}else if(w.equalsIgnoreCase("D")){
							tot+=Integer.valueOf(13)*Math.pow(16,a);
						}else if(w.equalsIgnoreCase("E")){
							tot+=Integer.valueOf(14)*Math.pow(16,a);
						}else if(w.equalsIgnoreCase("F")){
							tot+=Integer.valueOf(15)*Math.pow(16,a);
						}	
					}
					w="";	
				}
				
					
				String y="";
				String bi="";					
				for(int num=tot;num!=0;){
					int g=num%2;
					y+=g;
					num=num/2;	
				}
				for(int i=y.length()-1;i>=0;i--){
					bi+=y.charAt(i);
				}
			
				
				
				String t="";
				String oct="";
				for(int num1=tot;num1!=0;){
						int g=num1%8;
						t+=g;
						num1=num1/8;	
				}
				for(int i=t.length()-1;i>=0;i--){
					oct+=t.charAt(i);
				}
			
					System.out.println();
					System.out.println("    Decimal number: "+tot);
					System.out.println("    Binary number: "+bi);
					System.out.println("    Octal number: "+oct);
					System.out.println();
					System.out.println();
					System.out.println();
					
					System.out.print("Do you want to go to homepage(Y/N) -> ");
					homepage=input.nextLine();
					homepage=input.nextLine();
		}
				}while(hexapage.equalsIgnoreCase("Y"));
					break;			
			case 5:
				System.out.println();
				System.out.println("+-----------------------------------------+");
				System.out.println("|          Roman Number Converter          |");
				System.out.println("+-----------------------------------------+");
				System.out.println();
				System.out.println();
				System.out.println("         [01] Decimal Number to Roman Number Converter");
				System.out.println("         [02] Roman Number to Decimal Number Converter");
				System.out.println();
				System.out.println();
				System.out.print("Enter an option: ");
				int optionb=input.nextInt();
				switch(optionb){
						case 1:
							do{System.out.println();
							System.out.println("+------------------------------------------------------------+");
							System.out.println("|          Decimal Number to Roman Number Converter          |");
							System.out.println("+------------------------------------------------------------+");
							System.out.println();
							System.out.println();
							System.out.print("Enter an Decimal Number : ");
							int num=input.nextInt();
							int cv=0;
							if(num==0||num<0){
								System.out.println("        Invalid input...");
								System.out.println();
								cv=1;
							}
							if(cv==1){
								System.out.print("Do you want to input number again (Y/N)-> ");
								rpage=input.next();
							}
					if(cv!=1){
							String answer="";
							
							int rem1=num%10;
							num=num/10;
							
							int rem2=num%10;
							num=num/10;
							
							int rem3=num%10;
							num=num/10;
							
							int rem4=num%10;
							num=num/10;
							
							switch(rem4){
								case 1:
									answer+="M";
									break;
								case 2:
									answer+="MM";
									break;
								case 3:
									answer+="MMM";
									break;
								case 4:
									answer+="MMMM";
									break;
								case 5:
									answer+="VM";
									break;
								case 6:
									answer+="VMM";
									break;
								case 7:
									answer+="VMMM";
									break;
								case 8:
									answer+="VMMMM";
									break;
								case 9:
									answer+="IXMMM";								
									break;
							}
							switch(rem3){
								case 1:
									answer+="C";
									break;
								case 2:
									answer+="CC";
									break;
								case 3:
									answer+="CCC";
									break;
								case 4:
									answer+="CD";
									break;
								case 5:
									answer+="D";
									break;
								case 6:
									answer+="DC";
									break;
								case 7:
									answer+="DCC";
									break;
								case 8:
									answer+="DCCC";
									break;
								case 9:
									answer+="CM";								
									break;
							}
							switch(rem2){
								case 1:
									answer+="X";
									break;
								case 2:
									answer+="XX";
									break;
								case 3:
									answer+="XXX";
									break;
								case 4:
									answer+="XL";
									break;
								case 5:
									answer+="L";
									break;
								case 6:
									answer+="LX";
									break;
								case 7:
									answer+="LXX";
									break;
								case 8:
									answer+="LXXX";
									break;
								case 9:
									answer+="XC";								
									break;
									
							}
							switch(rem1){
								case 1:
									answer+="I";
									break;
								case 2:
									answer+="II";
									break;
								case 3:
									answer+="III";
									break;
								case 4:
									answer+="IV";
									break;
								case 5:
									answer+="V";
									break;
								case 6:
									answer+="VI";
									break;
								case 7:
									answer+="VII";
									break;
								case 8:
									answer+="VIII";
									break;
								case 9:
									answer+="IX";								
									break;
							}
							System.out.println();					
							System.out.println("        Roman numaral: "+answer);
							System.out.println();
							
							System.out.print("Do you want to go to homepage(Y/N) -> ");
							homepage=input.nextLine();
							homepage=input.nextLine();
					}
							}while(rpage.equalsIgnoreCase("Y"));
							break;
						case 2:
								System.out.println();
							    System.out.println("+-------------------------------------------------------------+");
								System.out.println("|         Roman Number to Decimal Number Converter            |");
								System.out.println("+-------------------------------------------------------------+");
								System.out.println();System.out.println();
								System.out.print("Enter a Roman numeral : ");
								String romanInput = input.next();
								System.out.println();
						int decimalNum = 0;
						int pValue = 0;
		
			   
						for (int i = romanInput.length() - 1; i >= 0; i--) {
							char c = romanInput.charAt(i);
							int value=0;
							switch (c) {
								case 'I':
									value = 1;
									break;
								case 'V':
									value = 5;
									break;
								case 'X':
									value = 10;
									break;
								case 'L':
									value = 50;
									break;
								case 'C':
									value = 100;
									break;
								case 'D':
									value = 500;
									break;
								case 'M':
									value = 1000;
									break;
							}
		
							if (value < pValue) {
								decimalNum -= value;
							} else {
								decimalNum += value;
							}
		
							pValue = value;
						}
		
						System.out.println("          Decimal Number : " + decimalNum); 
						System.out.println();
						System.out.print("Do you want to go to homepage(Y/N) -> ");
						homepage=input.nextLine();
						homepage=input.nextLine();                           
						break;
							default:
								System.out.println("Invalid choice. Please enter 1 or 2.");	
								
									
							
					}
			
			default:
				System.out.println("Option is wrong!");
			    break;
		}

	}while(homepage.equalsIgnoreCase("Y")||decimalpage.equalsIgnoreCase("N")||binarypage.equalsIgnoreCase("N")||octalpage.equalsIgnoreCase("N")||hexapage.equalsIgnoreCase("N")||rpage.equalsIgnoreCase("N"));
	}
}
										
