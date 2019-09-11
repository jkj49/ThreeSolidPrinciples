package threesolid;

/**
 * S - A human worker can work and eat.
 * O - Can be extended with more interfaces.
 * I - A HumanWorker can eat and work by implementing the IFeedable and IWorkable interface.
 * Austin Gray
 */
class HumanWorker implements IFeedable, IWorkable {
    public void eat() {
        // eat something
    }

    public void work() {
        // do work
    }
}
