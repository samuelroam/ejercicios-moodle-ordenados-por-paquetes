package nif;

import java.util.Scanner;

public class NIF {

	private long DNI;
	private char letra;
	
	public NIF() {};
	
	public char leer(long DNI) {
		Scanner scan = new Scanner(System.in);
		int division=0;
		System.out.println("introduce el numero de dni");
		DNI=scan.nextLong();
		division=(int)DNI%23;
		
		if(division==0) {
			letra='T';
		}else if(division==1) {
			letra='R';
		}else if(division==2) {
			letra='W';
		}else if(division==3) {
			letra='A';
		}else if(division==4) {
			letra='G';
		}else if(division==5) {
			letra='M';
		}else if(division==6) {
			letra='Y';
		}else if(division==7) {
			letra='F';
		}else if(division==8) {
			letra='P';
		}else if(division==9) {
			letra='D';
		}else if(division==10) {
			letra='X';
		}else if(division==11) {
			letra='B';
		}else if(division==12) {
			letra='N';
		}else if(division==13) {
			letra='J';
		}else if(division==14) {
			letra='Z';
		}else if(division==15) {
			letra='S';
		}else if(division==16) {
			letra='Q';
		}else if(division==17) {
			letra='V';
		}else if(division==18) {
			letra='H';
		}else if(division==19) {
			letra='L';
		}else if(division==20) {
			letra='C';
		}else if(division==21) {
			letra='K';
		}else if(division==22) {
			letra='E';
		}
		return letra;
	}
	
	public String toString() {
		return "El DNI con letra es "+DNI+"-"+letra;
	}
}
