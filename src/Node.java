/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author nitroluke
 */
public class Node {
    int data;
    String otherData;     
    Node left;
    Node right;
            
    public Node(int data, String otherData){
        this.data = data;
        this.otherData = otherData;
//        left = null;
//        right = null;
    }
    
    public int GetData(){
        return data;
    }
    
    public String GetOtherData(){
        return otherData;
    }
    
    public void setData(int newData){
        data = newData;
    }
    
    public void setOtherData(String newOtherData){
        otherData = newOtherData;
    }
    
    @Override
    public String toString(){
        return otherData;
    }
}
