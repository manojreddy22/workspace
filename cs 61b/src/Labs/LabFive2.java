package Labs;

public class LabFive2 extends LabFive1{
	
	int a=5;
	
public static void main(String[] args) {
	LabFive2[] subArr=new LabFive2[5];
	LabFive1[] supArr= new LabFive1[5];
	subArr[0].a=6;
	supArr[0].b=5;
	supArr=subArr;
   
	//part-1
	
	//subArr=supArr; type mismatch
	//subArr=(LabFive2)supArr;
	System.out.println(supArr[0].b);//null pointer exception at runtime
	System.out.println(subArr[0].a);//null pointer exception
	
	LabFive1[] array=new LabFive2[5];
	//subArr=array;
	supArr=array;
	
	
}
}
