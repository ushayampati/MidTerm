
public class WorkItem {
	String intid;
	long workerID;
	String message;
	
	public WorkItem(String itemID, long workerID, String message) {
		this.intid = itemID;
		this.workerID = workerID;
		this.message = message;
	}
	
	public String getItemID() { return intid; }
	
	public void setItemID(String itemID) { this.intid = itemID; }
	
	public long getWorkerID() { return workerID; }
	
	public String getMessage() { return message; }
}