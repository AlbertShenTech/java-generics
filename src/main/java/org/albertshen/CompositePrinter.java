package org.albertshen;

public class CompositePrinter<T, K> {
    T content;
    K content2;

    CompositePrinter(T content, K content2) {
        this.content = content;
        this.content2 = content2;
    }

    public void print() {
        System.out.println(content + ", " + content2);
    }
}
