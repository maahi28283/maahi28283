public class prime{



public static void main(String args[]){


int n=11,i;



boolean temp=false;



for(i=2;i<=n/2;++i)



{



  if(n%i==0){



       temp=true;
        break;

  }

}

  if(!temp)



  System.out.println(n + " is a prime");



  else



  System.out.println(n + " is not a prime");



}


}



