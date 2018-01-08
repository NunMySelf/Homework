package miniproject;

import java.util.Scanner;

/**
 *
 * @author Sakdinan Khamnang  5907101013
 */
public class Dictionary 
{
    private final static int TABLE_SIZE = 1000;
    // initialise array of HashEntry (table)
    DictionaryDeMo[] table;
    /*public int count=0;
    public String [] countfind = new String [TABLE_SIZE];*/
    // constructor, create array, assign all values to null
    Dictionary() {
        
        table = new DictionaryDeMo[TABLE_SIZE];     
        
    }

    
    public String getValue(String key) {
        key.toLowerCase();
        int index = this.getKeyIndex(key);
        if(table[index]==null)
        	return  key +" IS NOT IN DICTIONARY";
        else{
        while(table[index].equals(key)==true){
        	        index++;
       }
        DictionaryDeMo chosen_entry = table[index];
        String chosen_entry_value = chosen_entry.getValue(key);
        return chosen_entry_value;
        }
    }

   
    public void insert(String key, String value) {
    	value.toLowerCase();
        key.toLowerCase();
        int index = this.getKeyIndex(key);
        while(table[index]!=null){
        index++;
        }
        DictionaryDeMo keyValuePair;
        keyValuePair = new DictionaryDeMo(key, value);
        table[index] = keyValuePair;
       
    }

    
    private Integer getKeyIndex(String key) {
    	
        int hash = 7;   //COPY FORMULAR
        
        for (int i = 0; i < key.length(); i++) {
            hash = (hash*31 + key.charAt(i))%500;
        }
        return hash;
    }
    public boolean checkKey(String key){
    	key.toLowerCase();
    	int index = this.getKeyIndex(key);
    	return table[index]==null;
    }
    public void getEdit(String key,String value){
    	value.toLowerCase();
    	if(checkKey(key)==true)
    		 System.out.println("your key '"+key+"' does not exist");
    	else{
    		int index = this.getKeyIndex(key);
    		  DictionaryDeMo keyValuePair;
    		  keyValuePair = new DictionaryDeMo(key, value);
    		  table[index] = keyValuePair;
    		  System.out.println("Edit ok");
    	}
    }
    public void dleKey(String key){
    	 int index = this.getKeyIndex(key);
    	 DictionaryDeMo keyValuePair;
    	 keyValuePair = new DictionaryDeMo(null, key +" does not exist");
    	 table[index] = keyValuePair;
    	 System.out.println("this key "+key+" have Delete");
    }
    public void SUBMENU(String key){
        Scanner sc = new Scanner(System.in);
            System.out.println("*********** SEARCHING MENU *************");
            System.out.println("1. NEXT VOCABULARY ");
            System.out.println("2. PREVIOUS VOCABULARY ");
            System.out.println("3. EDIT VOCABULARY ");
            System.out.println("4. BACK TO MAIN MENU ");
            System.out.println("****************************************");
            System.out.print(" INPUT THE CHIOCE :: ");
            int ch2 = sc.nextInt();
            switch(ch2)
            {
                case 1 :
                    key = findlisd(key,0);
                    System.out.println("Next word is '"+key+"'");
                    SUBMENU(key);                      
                    break;
                case 2 :
                    key = findlisd(key,1);
                    System.out.println("Previous word is '"+key+"'");
                    SUBMENU(key);                       
                    break;
                case 3 : 
                    System.out.print("edit word :: ");
                    String eword = sc.next() ;
                    System.out.print("edit read :: ");
                    String eread = sc.next() ;
                    System.out.print("edit transliterate :: ");
                    String etran = sc.next() ;
                    getEdit(eword,eread);
                    SUBMENU(key); 
                    break;
                case 4 :
                    MAINMENU(); 
                    break;
                default :System.out.print("Cann't choice");
                    MAINMENU(); 
            }
    }
    public void MAINMENU(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*********MENU**************");
                    System.out.println("1. ADDING WORD ");
                    System.out.println("2. SEARCHING WORD ");
                    System.out.println("3. DELETING WORD ");
                    System.out.println("4. EXIT PROGRAM ");
                    System.out.println("***************************");
                    System.out.print("SELECT ONE OF MENU :: ");
                    int ch1 = sc.nextInt();
                    switch(ch1){
                        case 1 :System.out.print("ADD WORD :: ");
                                String word = sc.next();
                                System.out.print("ADD MEANING OF WORD :: ");
                                String read = sc.next();
                                insert(word, read);
                                MAINMENU();   
                                break;
                        case 2 :System.out.print("WRITE KEYWORD :: ");
                                String search = sc.next() ;
                                System.out.println("THE MEANING OF WORD IS :: "+ getValue(search) );
                                SUBMENU(search); 
                                break;
                        case 3 :System.out.print("WHAT ARE YOU WANT TO DELTE :: ");
                                String dele = sc.next() ;
                                dleKey(dele);
                                SUBMENU(dele);
                                break;

                        case 4 :System.out.print(" THANK YOU // GOOD BYE ");    
                        break;
                        default :System.out.print("PLEASE SELECT 1-4");
    }
                    
          //COPY CODE  NEXT and PE MY FRIEND
    }
    public String findlisd(String key,int list){
        key.toLowerCase();
        int index = getKeyIndex(key);
        if(list==0){
            index++;
             while(table[index]==null){
        index++;
        }
        }
        else{ index--;
                 while(table[index]==null){
        index--;
        }
        }
            return  table[index].getKey();
    }
}
