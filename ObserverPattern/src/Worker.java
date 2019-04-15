
public class Worker {
	private long workerID;
	
	public Worker(long workerID) {
		this.workerID = workerID;
	}
	
	public long getWorkerID() { return workerID; }
	
	public String notify(WorkItem wi) {
		if (wi.getItemID().equals(Long.toString(workerID))) {
			String message = "Worker " + 
							workerID +  
							" processed WorkItem " +
							wi.getItemID() +
							" message " +
							wi.getMessage();
			int iteID = Integer.parseInt(wi.getItemID()) + 1;
			wi.setItemID(Integer.toString((iteID)));
			
			return message;
		}
		return null;
	}
}
