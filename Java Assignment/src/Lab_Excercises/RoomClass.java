package Lab_Excercises;

public class RoomClass {
	int isroomno, roomarea;
	String roomtype, ACmachine;
	
//
//	public RoomClass(int isroomno, int roomarea, String roomtype, String aCmachine) {
//		super();
//		this.isroomno = isroomno;
//		this.roomarea = roomarea;
//		this.roomtype = roomtype;
//		ACmachine = aCmachine;
//	}
	void setData(int isroomno, int roomarea, String roomtype, String aCmachine) {
		this.ACmachine = aCmachine;
		this.isroomno = isroomno;
		this.roomarea = roomarea;
		this.roomtype = roomtype;
	}
	void displayData() {
		System.out.println("Ac Machine is " + ACmachine +
				", Room no: " + isroomno + " , Of Room Type: " + roomtype+ " , Room Area: "+roomarea);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomClass roomClass = new RoomClass();
		roomClass.setData(1, 500, "Flat" , "Machine");
		roomClass.displayData();

	}

}
