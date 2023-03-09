package com.abhisheksoni099.designpatterns.prototype;

class Client {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.setName("General Science");
        notebook.setNumberOfPages(100);
        Notebook copiedNotebook = notebook.copy();
        System.out.println("Original Notebook: " + notebook);
        System.out.println("Copied Notebook: " + copiedNotebook);
        System.out.println("Equality Check: " + (notebook == copiedNotebook));
    }
}
