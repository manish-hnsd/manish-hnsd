String s=".09."+Integer.toString(year);
if (year==1918){
    return "26"+s;
}
if ((year<=1917&&year%4==0)||(year>=1919&&(year%400==0 || (year%4==0&&year%100!==0))) ){
    return "12"+s;
}else{
    return "13"+s;
}