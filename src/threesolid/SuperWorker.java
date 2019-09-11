package threesolid;


/**
 * S - A SuperWorker does work and eats.
 * O - SuperWorker can be extended.
 * I - A SuperWorker eats and works, implementing IWorkable and IFeedable.
 * Jonathan Joiner
 *
 */

class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}

