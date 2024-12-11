package com.tawfeek.behavioral.memento;


import java.util.Deque;
import java.util.LinkedList;

class TextArea{
    private String text;

    public void setText(String text){
        this.text = text;
    }

    public Memento takeSnapShot(){
        return new Memento(this.text);
    }

    public String getText(){
        return this.text;
    }
    public void restore(Memento memento){
        this.text = memento.getText();
    }

}


class Memento{
    private String text;
    Memento(String text){
        this.text = text;
    }
    Memento(){
        this.text = "";
    }

    public String getText(){
        return this.text;
    }
}

class Editor{
    private Deque<Memento> stateHistory;
    private TextArea textArea;

    public Editor(){
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public String getText(){
        return this.textArea.getText();
    }

    public void write(String text){
        textArea.setText(text);
        stateHistory.add(textArea.takeSnapShot());
    }

    public void restore(){
        textArea.restore(stateHistory.pop());
    }

}
public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        editor.write("Hello World");
        editor.write("Hello World my dear friend");
        System.out.println(editor.getText());
        editor.restore();
        System.out.println(editor.getText());
    }
}
