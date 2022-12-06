public class MetalBuckler implements Buckler{
    @Override
    public int defense(){
        return -20;
    }
    @Override
    public String toString() {
        return String.format("MetalBuckler: %d", this.defense());
    }
}
