package threesolid;

class Manager {
	IWorker worker;

	public Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
