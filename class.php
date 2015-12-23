<?php
class Student {
	var $name;
	var $age;
	var $school;
	function Student($in_name,$in_age,$in_school){
		$this->name=$in_name;
		$this->age=$in_age;
		$this->school=$in_school;
	}
	function getName(){
		return $this->name;
	}
	function getAge(){
		return $this->age;
	}
	function getSchool(){
		return $this->school;
	}
}
	$name=$_POST['name'];
	$studentName=$_POST['ame'];
	$age=$_POST['age'];
	$school=$_POST['school'];
    $Array=array(new Student($studentName , $age , $school));
    $sort[]=$Array[0]->getName;
	switch ($name){
		case 'Add':
			$Array[0]->output();
			$pt=fopen("list.txt","a+");
			fwrite($pt, $Array[0]->getName());
			fwrite($pt, " ");
			fwrite($pt, $Array[0]->getAge());
			fwrite($pt, " ");
			fwrite($pt, $Array[0]->getSchool());
			fwrite($pt, "@");
			fclose($pt);
		    echo("<br><a href='./student.html'>BACK page</a>");
			break;
		case 'Delete':
			$i=0;
			$pt=fopen("list.txt","a+");
			$buffer=fgets($pt,4096);
			$devive=explode("@",$buffer);
			while($devive[$i]!=null){
				$i++;
				$state=explode(" ",$devive[$i-1]);
				array_push($Array , new Student($state[0], $state[1] , $state[2]));
				if($Array[0]->getName()==$Array[$i]->getName())
					$j=$i;
			}
			fclose($pt);
			unset($Array[$j]);
			$pr=fopen("list.txt","w+");
			for ($k=1;$k<$i+1;$k++){
				if($k!=$j){
				fwrite($pr, $Array[$k]->getName());
				fwrite($pr, " ");
				fwrite($pr, $Array[$k]->getAge());
				fwrite($pr, " ");
				fwrite($pr, $Array[$k]->getSchool());
				fwrite($pr, "@");
			}
				}		
			fclose($pr);
			echo("<br><a href='./student.html'>BACK page</a>");
			break;
		case 'All Looking':
			$pt=fopen("list.txt","r+");
		 	while(!feof($pt)){
		 		$buffer=fgetc($pt);
		 		if($buffer=='@')
		 			echo '<br>';
		 		else{
		 		echo "$buffer";
		 		}
			}
			fclose($pt);
			echo("<br><a href='./student.html'>BACK page</a>");
			break;
		case 'Sorting':
			$i=0;
			$pt=fopen("list.txt","a+");
			$buffer=fgets($pt,4096);
			$devive=explode("@",$buffer);
			while($devive[$i]!=null){
				$i++;
				$state=explode(" ",$devive[$i-1]);
				array_push($Array , new Student($state[0], $state[1] , $state[2]));
				array_push($sort, $state[0]);
			}
			fclose($pt);
			sort($sort);
			$e=1;
			$pr=fopen("list.txt","w+");
			while($sort[$e]!=null){
				for ($f=1;$f<$i+1;$f++){
				if($sort[$e]==$Array[$f]->getName()){
					fwrite($pr, $Array[$f]->getName());
					fwrite($pr, " ");
					fwrite($pr, $Array[$f]->getAge());
					fwrite($pr, " ");
					fwrite($pr, $Array[$f]->getSchool());
					fwrite($pr, "@");
				}
				}
				$e++;
			}
			fclose($pr);
			echo("<br><a href='./student.html'>BACK page</a>");
			break;
		case 'End':
			$pr=fopen("list.txt","w+");
			fclose($pr);
			echo "Clear";
			echo("<br><a href='./student.html'>BACK page</a>");
			break;
	}
?>
