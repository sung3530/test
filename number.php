<?
function multiexplode ($delimiters,$string) {
    
    $ready = str_replace($delimiters, $delimiters[0], $string);
    $launch = explode($delimiters[0], $ready);
    return  $launch;
}
$value=$_POST['value'];
$num = multiexplode(array("+","-","/","*"),$value); 
$i=0;
$j=2;
$sum;
$arti=multiexplode(array("$num[0]","$num[1]"),$value); 
$value=$arti[2];

while($num[$i+1]!=null){
if($i==0){
if($arti[1]=='+'){
$sum=$num[$i]+$num[$i+1];
}
else if($arti[1]=='-'){
$sum=$num[$i]-$num[$i+1];
}
else if($arti[1]=='/'){
$sum=$num[$i]/$num[$i+1];
}
else if($arti[1]=='*'){
$sum=$num[$i]*$num[$i+1];
}
if($num[$j]!=null){
$arti=explode("$num[$j]",$value);
$value=$arti[1];
}
	$j=$j+1;
	$i=$i+1;
}
else{
if($arti[0]=='+'){
$sum=$sum+$num[$i+1];
}
else if($arti[0]=='-'){
$sum=$sum-$num[$i+1];
}
else if($arti[0]=='/'){
$sum=$sum/$num[$i+1];
}
else if($arti[0]=='*'){
$sum=$sum*$num[$i+1];
}
if($num[$j]!=null){
$arti=explode("$num[$j]",$value);
$value=$arti[1];
}
$j=$j+1;
	$i=$i+1;
}
}
echo " SUM = $sum";




?>
