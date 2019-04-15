import java.util.ArrayList;
import java.util.List;

public class WorkManager {
	private List<Worker> workerslist = new ArrayList<Worker>();
	
	public WorkManager() {}
	
	public void registerWorker(Worker worker) { workerslist.add(worker); }
	
	public void removeWorker(Worker worker) { workerslist.remove(worker); }
	
	public void notify(WorkItem wi) {
		for (Worker worker : workerslist) {
			if (worker.getWorkerID() <= 4) {
				String result = worker.notify(wi);
				if (result != null) {
					System.out.println(result);
				}
			}
		}
	}
}