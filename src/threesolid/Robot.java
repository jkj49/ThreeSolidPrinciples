package threesolid;

/**
 * S - A Robot does work. It does not query the database, for example.
 * O - This class can be extended by allowing the implementation of other relevant interfaces.
 * I - A robot does not need to eat, so it only implements IWorkeable.
 *
 * Damen
 *
 * Ky_Le added implemanation "IMaintainable" class interface and its methods.
 */

class Robot implements IWorkable, IMaintainable {
    public void work() {
        // does work
    }

    public void processMaintainWeekly(){
      // performing robot maintaining weekly
    }

    public void processMaintainMonthly(){
      // performing robot maintaining Monthly
    }

    public void processMaintainYearly(){
      // performing robot maintaining yearly
    }
}
