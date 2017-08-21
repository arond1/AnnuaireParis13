# AnnuaireParis13

Ajout :
Ajouter aux ressources :
<string-array name="data">
<item>1,Khafif,Khafif@test.fr</item>
<item>2,Hébert,Khafif@test.fr</item>
<item>3,Peker,Khafif@test.fr</item>
<item>4,Kristikis,Khafif@test.fr</item>
<item>5,Butelle,Khafif@test.fr</item>
<item>6,Dubacq,Khafif@test.fr</item>
<item>7,Deselligny,Khafif@test.fr</item>
<item>8,Torti,Khafif@test.fr</item>
<item>9,Gayral,Khafif@test.fr</item>
<item>10,Henrio,Khafif@test.fr</item>
<item>11,Roy,Khafif@test.fr</item>
<item>12,Chuck Norris,Khafif@test.fr</item>
 </string-array>

 ajouter au main Activity :
 public static ArrayList<Enseignant> contacts = new ArrayList<>();
 
				Thread T1 = new Load();
                T1.start();
                T1.join();

Nouvelle classe : 

 public class Load extends Thread {

    public void run() {
				String[] splitArray = null;
				Resources resources=getResources();
				String[] donnee = resources.getStringArray(R.array.data);
				
			for(int i=0;i<donnee.length;i++)
            {
				splitArray= donnee[i].split(",");
                contacts.add(new Enseignant(splitArray[0], splitArray[1], splitArray[2]));
				splitArray = null;
            }
            return contacts;
    }


}
