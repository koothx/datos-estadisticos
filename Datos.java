package Datos_estadisticos;

import java.util.Scanner;

public class Datos {

	private static char si;
	private static char no;

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		 Scanner A = new Scanner(System.in);
		 Scanner R = new Scanner(System.in);
		 Scanner M = new Scanner(System.in);
		 Scanner Y = new Scanner(System.in);
		 
		 char Opcion;
		 
		 ciclo1: do {
				System.out.println(" ");
				System.out.println("¿Tiene proyecto de curso ?");
				Opcion = Y.next().charAt(0);
			
				switch (Opcion) {
				
					case si:
						
						int estudiantes;
						String[] c = new String[8];
						
						
						System.out.println("Ingrese el nombre del curso");                           
						c[0] = A .nextLine();                                                 
						
						System.out.println("Ingrese el Período lectivo");                           
						c[1] = A .nextLine();                                                  
						
						System.out.println("Ingrese la Carrera");                                    
						c[2] = A .nextLine();                                                    
						
						System.out.println("Ingrese la Modalidad ");                                          
						c[3] = A .nextLine();                                                     
						
						System.out.println("Ingrese  Código del curso ");
						c[4] = A .nextLine();
						
						System.out.println("Ingrese el Grupo");
						c[5] = A .nextLine();	
						
					    System.out.println("Ingrese el Código de asignatura");
						c[6] = A .nextLine();
							
				        System.out.println("Ingrese el Código de programa de asignatura ");
					    c[7] = A .nextLine();
					    
					    do {
					    	
					    	System.out.println("Ingrese la cantidad de estudiantes" );
					    	estudiantes = M .nextInt();
					    	
					    }while(estudiantes<0);
						
						String[] r = new String[estudiantes];
						
						System.out.println("Ingrese los dos nombres y los dos apellidos del estudiante");
					
						for(int i = 0;i < c.length ;  i++ ) {
							
								System.out.printf(" ",i,c[i]);
								c[i]= R .nextLine();
						}
						
						String[] t = new String[estudiantes];
						
				       
						for(int i = 0;i < c.length ;  i++ ) {
							
							System.out.println("Ingrese el Número de carnet del estudiante " + c[i] );
							A.nextLine();
							t[i]= M .nextLine();
							
						}
						
						int[] parcial = new int[estudiantes]; 
						
						for(int i = 0; i < parcial.length ;  i++ ) {
							
							int par = 0;
							
								do {
									
									System.out.println(" Ingrese la nota que tiene el estudiante " + c[i] + "  en el primer parcial"  );
								     par= M .nextInt();
								     
								}while((par<=-1) || ( par >= 36));

					    	parcial[i]=par;
					    	
						}
						
						int[] proyec = new int[estudiantes]; 
						
						for(int i = 0; i < proyec.length ;  i++ ) {
							
							int proy = 0;
							
								do {
									
									System.out.println(" Ingrese la nota que tiene el estudiante " + c[i] + "  en el proyecto de curso "  );
									proy = M .nextInt();
								
								}while((proy <= -1) || (proy >= 36));

					    	proyec[i]=proy;
					    	
						}
						
						int[] Sist = new int[estudiantes]; 
						
						for(int i = 0; i < Sist.length ;  i++ ) {
							
							int siso = 0;
						
								do {
									System.out.println(" Ingrese cuanto tiene el estudiante " + c[i] + "  en su Sistematicos "  );
									siso = M .nextInt();
								
								}while((siso <= -1) || (siso >= 31));
				
							Sist[i]=siso;
							
						}
						
						int notaf;
							
						int[] NotaFinal = new int[estudiantes];
						
						for(int i = 0; i <  estudiantes ;  i++ ) {
							
							 NotaFinal[i] = parcial[i] + proyec[i] + Sist[i];
							 				 
							 System.out.println( NotaFinal[i]);
							 
						}
						
						for(int i = 0; i <  estudiantes ;  i++ ) {
							
							if( NotaFinal[i] <= 60  ) {
								 
								 int  convocatoria1;
								 
								 int[] con = new int[estudiantes];
								 
									 do{
										 
										 System.out.println(" Ingrese la nota del Examen de la  primera convocatoria del estudiante " + c[i] );
										 convocatoria1 = M .nextInt();
										 
									 }while((estudiantes < -1 ) || (convocatoria1 >= 71));
									 
								  con[i] = convocatoria1;
							
								  int[] uno = new int[estudiantes];
								  
								  uno[i]= con[i]+Sist[i];
								  
								  if(uno[i] <= 60) {
											  
									  int  convocatoria2;
										 
										 int[] con2 = new int[estudiantes];
										 
											 do{
												 
												 System.out.println(" Ingrese el Examen de la segunda convocatoria del estudiante " + c[i] );
												 convocatoria2 = M .nextInt();
												 
											 }while((convocatoria2 <= -1)|| (convocatoria2 >= 101));
									
										 con2[i] = convocatoria2;
										 
										 if(con2[i] >=60 ) {
											 
											String[] aprobado = {"si"};
											
										 }
										 else {
											 
											 String[] aprobado2 = {" no "};
											 
										 }
										 
								  }
								  
							 }
							
						}

						System.out.println("**************************************************");
						System.out.println("                datos generales "                  );	
						System.out.println("***************************************************");	
						
	System.out.println("Curso : " + c[0]);                				
						
	System.out.println("Periodo lectivo : "  + c[1] );	    
						
	System.out.println("Carrera : "  + c[2]);	       
	System.out.println("Modalidad : "  + c[3]);		      	
						
	System.out.println("Cod. Curso : "  + c[4]); 					
						
	System.out.println("Grupo : "  + c[5]);

	System.out.println("Cod.Asignatura : " +c[6]);
						
	System.out.println("Cod.Programa : " + c[7]);

	System.out.println("Primer Parcial : 35 ");	
										
	System.out.println("segundo parcial : 00 ");	

	System.out.println("Sistematicos :  30   ");	

		System.out.println("Proyecto de curso : 35 ");	

						
						
					
					case no:
					
					
					default:
						System.out.println("El valor que ingreso es incorrecto . Intentelo nuevamente");
						continue ciclo1;
				}
		
			}while(true);
		
			
		   }
			
			
	}


