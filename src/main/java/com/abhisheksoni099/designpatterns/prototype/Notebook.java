package com.abhisheksoni099.designpatterns.prototype;

class Notebook implements Copyable<Notebook> {
    private String name;
    private int numberOfPages;

    public Notebook() {
    }

    public Notebook(Notebook notebook) {
        this.name = notebook.name;
        this.numberOfPages = notebook.numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Notebook{name='" + name + ", numberOfPages=" + numberOfPages  + "}";
    }

    @Override
    public Notebook copy() {
        return new Notebook(this);
    }
}
