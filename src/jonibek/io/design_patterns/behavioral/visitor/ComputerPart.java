package jonibek.io.design_patterns.behavioral.visitor;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);

}
