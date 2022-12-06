public class WoodBuckler implements Buckler{
        @Override
        public int defense(){
            return -10;
        }
        @Override
        public String toString() {
            return String.format("WoodBuckler: %d", this.defense());
        }
    
}
