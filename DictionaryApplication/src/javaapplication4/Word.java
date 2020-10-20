/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author VietDuc
 */
public class Word {

    static Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String word_target;
    private String word_explain;
    
    public Word(){
        
    }
    
    public Word(String word_target, String word_explain){
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    
    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    @Override
    public String toString() {
        return word_target; //To change body of generated methods, choose Tools | Templates.
    }
}
