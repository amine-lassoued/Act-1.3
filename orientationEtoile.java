class OrientationEtoile
{

   static void tri_bulle(String[] tab)
   {  
        int taille = tab.length;  
        String tmp = "";  
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
                {  
                        if(tab[j-1].compareTo(tab[j]) > 0)
                        {
                                //echanges des elements
                                tmp = tab[j-1];  
                                tab[j-1] = tab[j];  
                                tab[j] = tmp;  
                        }
 
                }
        }
   }
   static void displayTab(String[] tab)
   {    
        for(int i=0; i < tab.length; i++)
        {
                System.out.print(tab[i] + " ");  
        }
        System.out.println();
   }
  
   public static void main(String[] args)
   {
        String arr[] ={"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
        String prenoms[] = {"Alban", "Jim", "Bob", "Albatroz", "Jinto", "Bow", "Hijo", "Manu", "Seb", "Teilo", "Charles", "Xavier"};
 
        System.out.println("---Avant le tri a bulle---"); 
    
        displayTab(prenoms);
 
        // tri des elements de tableau avec le tri a bulle
        tri_bulle(prenoms);
 
        System.out.println("---Apres le tri a bulle---");  
    
        displayTab(prenoms); 
   }
}

	

