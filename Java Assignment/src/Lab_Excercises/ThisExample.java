package Lab_Excercises;

public class ThisExample {
	int isroomno, roomarea;
	String roomtype, ACmachine;
	
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
	
	public  int isRoomno() {
		return this.isroomno;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExample thisExample = new ThisExample();
		thisExample.setData(1, 500, null, null);
		System.out.println(thisExample.isRoomno());
		
	}

}
