// 機能を追加するときの核
abstract class Component {
    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show() {
        for(int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
 
// Componentの実装
class ConcreteComponent extends Component {
    private String string;
    
    public ConcreteComponent(String string) {
        this.string = string;
    }
    
    //@Override
    public int getColumns() {
        return string.getBytes().length;
    }
    
    //@Override
    public int getRows() {
        return 1;
    }
    
    //@Override
    public String getRowText(int row) {
        if(row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
 
// 装飾者
abstract class Decorator extends Component {
    protected Component component;
    
    protected Decorator(Component component) {
        this.component = component;
    }
}
 
// 具体的な装飾者
class ConcreteSideDecorator extends Decorator {
    private char borderChar;
    
    public ConcreteSideDecorator(Component component, char ch) {
        super(component);
        this.borderChar = ch;
    }
    
    //@Override
    public int getColumns() {
        return 1 + component.getColumns() + 1;
    }
    
    //@Override
    public int getRows() {
        return component.getRows();
    }
    
    //@Override
    public String getRowText(int row) {
        return borderChar + component.getRowText(row) + borderChar;
    }
}
 
// 具体的な装飾者
class ConcreteFullDecorator extends Decorator {
    public ConcreteFullDecorator(Component component) {
        super(component);
    }
    
    //@Override
    public int getColumns() {
        return 1 + component.getColumns() + 1;
    }
    
    //@Override
    public int getRows() {
        return 1 + component.getRows() + 1;
    }
    
    //@Override
    public String getRowText(int row) {
        if(row == 0 || row == component.getRows() + 1) {
            return "+" + makeLine('-', component.getColumns()) + "+";
        } else {
            return "|" + component.getRowText(row - 1) + "|";
        }
    }
    
    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
 
public class User {
 
    public static void main(String[] args) {
        // 核の作成と装飾の追加
        Component comp1 = new ConcreteComponent("Hello Java!");
        Component comp2 = new ConcreteSideDecorator(comp1, '#');
        Component comp3 = new ConcreteFullDecorator(comp2);
        
        // 処理の呼び出し
        comp1.show();
        comp2.show();
        comp3.show();
    }
 
}
