public class mahi{
public static void main(String args[]){
int low=1, high=10,i;
while(low<high){
boolean temp=false;
for(i=2;i<=low/2;++i){
if(low % i==0){
temp= true;
break;
}
}
if(!temp)
System.out.println("" + low);
++low;
}
}
}
