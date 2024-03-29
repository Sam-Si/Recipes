/**
 * Object-based box class that requires casting every time you want to get some specific stuff from it, e.g.:
 * <p>
 * Box cakeBox = new Box();
 * cakeBox.put(new Cake());
 * // Without casting only object can be retrieved out of the box
 * Cake cake = (Cake) cakeBox.get();
 * <p>
 * Casting is not desirable and can fall at runtime, could you create more... generic solution?
 */
class Box<BoxType> {

    private BoxType boxType;

    public void put(BoxType boxType) {
        this.boxType = boxType;
    }

    public BoxType get() {
        return this.boxType;
    }
}