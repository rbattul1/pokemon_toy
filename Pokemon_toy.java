package pokemon_toy;



public class Pokemon_toy {
    public double num_poke(int pik,int squ,int cha){
        
        double discount = 0;
        int p=pik,s=squ,c=cha;
        int num_poke = pik+squ+cha;
        System.out.println(num_poke);
        char toy_arra[] = new char[num_poke];
        for(int i =0;i<toy_arra.length;i++){
            if(p != 0){
              toy_arra[i] = 'P';
              p--;
            }
            else if(s != 0){
              toy_arra[i] = 'S';
              s--;
            }
            else if(c != 0){
              toy_arra[i] = 'C';
              c--;
              
            }
        }
        for(int i =0;i<toy_arra.length;i++){
            System.out.println(toy_arra[i]);
        }
        double cost =0;
        for(int i =0;i<toy_arra.length;i++){
            switch (toy_arra[i]) {
                case 'P':
                    cost = cost+6;
                    break;
                case 'S':
                    cost = cost+5;
                    break;
                case 'C':
                    cost = cost+5;
                    break;
                default:
                    break;
            }
        }
         System.out.println(cost);
         boolean isSame = true;
         double dis_mid =0;
           for(int i =0;i<toy_arra.length-1;i++){
            for(int j = i+1;j<toy_arra.length;j++){
                if(toy_arra[i] != toy_arra[j]){ 
                    dis_mid = cost * 10/100;
                    discount = cost-dis_mid;   
                }
            }
        }
           for(int i =0;i<toy_arra.length-2;i++){
            for(int j = i+1;j<toy_arra.length-1;j++){
                for(int q = j+1;q<toy_arra.length;q++){
                    if(toy_arra[i] != toy_arra[j]&&toy_arra[j] != toy_arra[q]){ 
                    dis_mid = cost * 20/100;
                    discount = cost-dis_mid;
                } 
            }
           }
           }
        for(int i = 1; i < toy_arra.length; i++) {
            if (toy_arra[i] != toy_arra[0]) {
            isSame = false;
            }
        }
        if(isSame){
            discount = cost;
        }
        char arra[] = new char[num_poke];
        for (int i = 0; i < num_poke-1; i++) 
        {
            for (int j = i + 1; j < num_poke; j++) 
            {
                if (toy_arra[i] == toy_arra[j]) 
                    arra[i] = toy_arra[i];
                    toy_arra[i] = toy_arra[i+1];
            }
        }
        
          
         
        return discount;
    
    }
    
    public static void main(String[] args) {
        
    }
    
}
