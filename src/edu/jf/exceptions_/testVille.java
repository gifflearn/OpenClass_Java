package edu.jf.exceptions_;

import edu.jf.joo.GVille2;
import edu.jf.joo.NomVilleException;

public class testVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GVille2 nvil1=null;
		try {
			nvil1 = new GVille2("Rennes",-12000,"France");
			//System.out.println(nvil1.toString());
		} catch (NombreHabitantException e) {
			// TODO: handle exception
		} catch(NomVilleException e2){
			}
		// on aurait aussi pu écrire : catch (NombreHabitantException| NomVilleException e ) cela permet de gerer les 2 exceptions dans un catch
		finally {
			if (nvil1 == null ) nvil1 = new GVille2();
		}
		System.out.println(nvil1.toString());
			
	}

}
