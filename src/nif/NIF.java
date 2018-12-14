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
		}else {
			System.out.println("algo raro ha pasado "+division);
		}
		return letra;
	}
	
	
	/*
	 * public char leer(long DNI) {
		Scanner scan = new Scanner(System.in);
		int division=0;
		System.out.println("introduce el numero de dni");
		DNI=scan.nextLong();
		division=(int)DNI%23;
		
		switch (division){
		
		case 0:
			letra='T';
			break;
		case 1:
			letra='R';
			break;
		case 2:
			letra='W';
			break;
		case 3:
			letra='A';
			break;
		case 4:
			letra='G';
			break;
		case 5:
			letra='M';
			break;
		case 6:
			letra='Y';
			break;
		case 7:
			letra='F';
			break;
		case 8:
			letra='P';
			break;
		case 9:
			letra='D';
			break;
		case 10:
			letra='X';
			break;
		case 11:
			letra='B';
			break;
		case 12:
			letra='N';
			break;
		case 13:
			letra='J';
			break;
		case 14:
			letra='Z';
			break;
		case 15:
			letra='S';
			break;
		case 16:
			letra='Q';
			break;
		case 17:
			letra='V';
			break;
		case 18:
			letra='H';
			break;
		case 19:
			letra='L';
			break;
		case 20:
			letra='C';
			break;
		case 21:
			letra='K';
			break;
		case 22:
			letra='E';
			break;
		default:
			System.out.println("algo raro ha pasado "+division);
		}
		
		return letra;
	}
	 */
	
	public String toString() {
		return "El DNI con letra es "+DNI+"-"+letra;
	}
}
