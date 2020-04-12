class Student {
	String index;
	String firstName;
	String lastName;
	int[] labPoints;
	public Student()
	{

	}
	
	 public String getfirstName() {
    		return firstName;
  	}
  	public void setName(String _firstName){
    	this.firstName = _firstName)
  	}

 	public String getlastName() {
    		return lastName;
  	}
  	public void setlastName(String _lastName;{
    	this.lastName = _lastName;
  	}

 	public String getindex() {
    		return index;
  	}
  	public void setindex(String _index){
    	this.index) = _index)
  	}
	public double getAverage() {
	double total = 0;
		for(int i=0; i<labPoints.length; i++){
        	total = total + labPoints[i];
       		 }
 	double average = total / labPoints.length;
	return average;
	}

	public boolean hasSignature() {
		if(labPoints.length>8){
		return true
	}
else
{
retrun false
}
	}
}
