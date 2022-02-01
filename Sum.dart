import 'dart:io';
main()
{
	 print("sum of two number");
	print("Enter fast number");
	int ?n1=int.parse(stdin.readLineSync()!);

	print("Enter Sceond number");
	int ?n2=int.parse(stdin.readLineSync()!);
	
	int sum =n1+n2;
	print("sum is$sum");
}