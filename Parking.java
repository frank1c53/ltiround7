//design paid parking lot
//register a vehicle - Car
//in time
//out time
 
//charge it when it exits the parking lot for hours it was in

class Vechile{
	
	int car_no;
	String vehicle_name;
	String vehicle_no;
	DateTime in_time;
	DateTime out_time;
	
	
	public Vechile(int car_no,String vehicle_name,String vehicle_no,DateTime in_time){
	this.car_no = car_no;
	}
	
	charges(){
		return charges;
	}
	
	
}


class Parking{
 
    int capacity=50;
	int current_no_of_vechiles;
	//I used the wrong data structure
	//List<Vechile> vehicleList = new ArrayList();
	//data structure used should be hashmap(_
	HashMap<Integer,Vechile> vehicleHashmap = new HashMap<>();
	
	public void add_vechile(Vechile v){
		//vechileList.add(v);
		vehicleHashmap.put(v.car_no,v);
		
	}
	
	public void exit_vechile(int car_no){
		Vechile v = vechileList.contains(car_no);
		//write the logic to count hrs of car in the parking lot and convert it into charges;
		charges = DateTimenow - v.in_time
}		
	
}

}