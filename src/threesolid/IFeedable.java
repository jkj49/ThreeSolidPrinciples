package threesolid;
/**
 * S - Has the single responsibilty of requiring IFeedable clients to implement a work method.
 * O - By using an interface something can work, but it can also be extended to do more things.
 * I - Robots don't eat, but they need something else like maintaince.
 *
 * Ky_Le
 */

interface IFeedable{
	public void eat();
}
