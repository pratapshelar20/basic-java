package Array;

public class DemoArray1 {

	public static void main(String[] args) {
//		int abc[]= {930,210,340,740};
//		System.out.println(abc[0]);//930
//		System.out.println(abc[1]);//210
//		System.out.println(abc[2]);//340
//		System.out.println(abc[3]);//740
//		System.out.println(abc[0]+abc[1]);
//		System.out.println(abc[0]-abc[1]);
//		System.out.println(abc[0]*abc[1]);
//		System.out.println(abc[0]/abc[1]);
//		System.out.println(abc[0]>abc[1]);
//		System.out.println(abc[0]<abc[1]);
//		System.out.println(abc[0]==abc[1]);
//		System.out.println(abc[0]!=abc[1]);

//		char abc[]= {'p','q','r'};
//		int xyz[]= {10,20,30,40};
//		String a[]= {"Selenium","UFT","JAVA","LoadRunner"};
//		boolean b[]= {true,false,true,false};
//		System.out.println(abc[0]);//p
//		System.out.println(abc[1]);//q
//		System.out.println(abc[2]);//r
//		System.out.println(xyz[1]);//20
//		System.out.println(a[3]);//LoadRunner
//		System.out.println(b[2]);//true
		
		// using Enhanced for loop

//		int array1[]={1,2,3,4,5};
//		int array2[]=array1;
//		System.out.println(array2.length);
//		for(int abc:array2) {
//		System.out.println(abc);
//	}

		//using Normal for loop
//		int array1[]={11,22,33,44,55};
//		int array2[]=array1;
//		System.out.println(array2.length);
//		for(int i=0;i<array2.length;i++) {
//		System.out.println(array2[i]);
//		}
//}}

		
//		//MultiDimensionalArray example1
//		int abc[][] = new int[3][2];
//		abc[0][0] =320;
//		abc[0][1] =120;
//		abc[1][0] =330;
//		abc[1][1] =540;
//		abc[2][0] =150;
//		abc[2][1] =160;
//		System.out.println(abc[0][0]);//320
//		System.out.println(abc[0][1]);//120
//		System.out.println(abc[1][0]);//330
//		System.out.println(abc[1][1]);//540
//		System.out.println(abc[2][0]);//150
//		System.out.println(abc[2][1]);//160
//		}
//		}
		
		//MultiDimensionalArray example2
//		int abc[][] = {{120,520},{130,140},{750,360}};
//		System.out.println(abc[0][0]);//10
//		System.out.println(abc[0][1]);//20
//		System.out.println(abc[1][0]);//30
//		System.out.println(abc[1][1]);//40
//		System.out.println(abc[2][0]);//50
//		System.out.println(abc[2][1]);//60
//	}}
		
		
		//Print Array, Print Single dimensional Array
//		int array1[]={1,2,3,4,5,6,7,8,9,10};
//		int array2[]=array1;
//		System.out.println(array2.length);
//		for(int i=0;i<array2.length;i++) {
//		System.out.println(array2[i]);
//		}
//		}}
		
		//Print Multi-dimensional Array
		//First way:
//		int array1[][]={{1,7,9,5},{3,8,6,4}};
//		System.out.println(array1[0][0]);//1
//		System.out.println(array1[0][1]);//7
//		System.out.println(array1[0][2]);//9
//		System.out.println(array1[0][3]);//5
//		System.out.println(array1[1][0]);//3
//		System.out.println(array1[1][1]);//8
//		System.out.println(array1[1][2]);//6
//		System.out.println(array1[1][3]);//4
//		}
//		}
//		
//		//Second way__---unsolved
//		int array1[][]={{1,7,8,5},{5,8,9,4}};
//		for(int i=0;i<=3;i++) {
//		for(int j=0;j<=3;j++) {
//		System.out.println(array1[i][j]);
//		}
//		}
//	}}
		
//		//Copy One Dimensional Array
//		int array1[]={1,2,3,4,5};
//		int array2[]=array1;
//		System.out.println(array2.length);
//		for(int i=0;i<array2.length;i++) {
//			System.out.println(array2[i]);
//			}
//			}}

//Copy Two Dimensional Array

int array1[][]={{1,7,8,5},{5,8,9,4}};
int array2[][]=array1;
for(int i=0;i<=3;i++) {
for(int j=0;j<=3;j++) {
System.out.println(array2[i][j]);
}
}}
	}

