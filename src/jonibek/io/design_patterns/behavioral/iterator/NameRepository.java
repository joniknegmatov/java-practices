package jonibek.io.design_patterns.behavioral.iterator;

public class NameRepository implements Container {

    private String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
          return hasNext() ? names[index++] : null;
        }
    }
}
