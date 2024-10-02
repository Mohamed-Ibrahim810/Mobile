
void main(){

/*---for loop---
int year;
for(year = 1900 ;year <=2024; year = year+2){
  print(year);

  /*if (year%2 == 0){
    print(year);
    }*/

}*/

/*---while loop---
int year = 1900;
while (year<=2024){
  print (year);
  year++;
}*/

/*---do while loop---
int year = 1900;
do{
  print(year);
  year++;
}while(year<=2024);
*/

//---switch case---
/*int savings = 4000;

switch (savings){
  case 500 :{
    print("I will buy a shoes.");
  }
  break;

  case 1000 :{
    print("I will buy a shoes and T-shirt.");
  }
  break;

  case 2000 :{
    print("I will buy a phone.");
  }
  break;

  default :{
    if(savings >= 3500){
      print("I will buy all.");
    }else{
      print('I am not going to buy anything');
    }
    
  }
  break;
}*/



//---numbers---

/*var x = 1/0;
print (x.isFinite);
etc....
var x = -1;
print (x.);--- .abs() قيمة مطلقة--- .celi()تقريب للرقم الأكبر ---.round() تقرب للرقم الأقرب
---.floor()تتجاهل الأرقام العشرية --- */


//---strings---
/*String fname = 'mo';
String lname = 'ibra';
int x  = 5;

print('$fname $lname ${x+10}');

for further info watch the string vedio.*/


//---list---
List names = ['mohamed','manger','of','soda','department',['1','2','3']];
names[5] = 'currently';
names.add('he is the best');
names.add('.');

/*for(int x = 0; x<names.length; x++){         //First method
  print(names[x]);
}*/

/*names.forEach((name){                         //Second method
  print(name);
});*/

//for further info watch the list vedio.


//---map---
Map info  = {'name': 'mohamed', 'age':'20','job':'engineer'};

//print(info['name']);
//print(info.values);
//print(info.keys);
/*info.forEach((key, value) {
  print(key);
  print(value);
},);*/
      





  }