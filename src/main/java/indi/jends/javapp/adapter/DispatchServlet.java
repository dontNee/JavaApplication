package indi.jends.javapp.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * description: CommonUtils
 * <p>
 * author: libeifeng
 * date: 2021-11-21 11:33
 */
public class DispatchServlet {

    private static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(Controller handler) {
        HandlerAdapter adapter = getHandler(handler);
        if (null != adapter) {
            adapter.handle(handler);
        }
    }

    private HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : DispatchServlet.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }
}
