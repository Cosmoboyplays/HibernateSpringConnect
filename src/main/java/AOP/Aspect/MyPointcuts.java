package AOP.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* AOP.LibraryBig.get*(..))") // .. для любого количества параметров
    public void allGetMethodFromLibraryBig() { // модификатор public чтобы в другом классе использовать
    }

    @Pointcut("execution(* AOP.LibraryBig.add*(..))") // этот создается чтобы потом импользовать много раз
    public void allAddMethodFromLibraryBig() {
    }


}
