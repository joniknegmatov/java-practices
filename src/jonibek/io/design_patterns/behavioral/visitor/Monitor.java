package jonibek.io.design_patterns.behavioral.visitor;

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
            computerPartVisitor.visit(this);
    }
}