package threesolid;

class Manager {
	HumanWorker worker;

	public Manager() {

	}
	public void setWorker(HumanWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
