package indi.jends.javapp.adapter;

/**
 *
 * description: HandlerAdapter
 *
 * author: libeifeng
 * date: 2021-11-21 15:11
 */
public interface HandlerAdapter {

    public boolean supports(Object handler);

    public void handle(Object handler);
}
