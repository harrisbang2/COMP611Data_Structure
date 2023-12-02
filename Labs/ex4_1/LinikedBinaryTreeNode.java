/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4_1;

import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 *
 * @author harri
 */
public class LinikedBinaryTreeNode<E> implements MutableTreeNode{
Node root;
private List<MutableTreeNode> children;

    public void insert(int index) {
         root = addRecursive(root,index);
        
    }
private Node addRecursive(Node current, int value) {
    if (current == null) {
        Node a = new Node(value);
        return a;
    }

    if (value < current.elememt) {
        current.left = addRecursive(current.left, value);
        current.left.parent = current;
    } else if (value > current.elememt) {
        current.right = addRecursive(current.right, value);
        current.right.parent = current;
    } else {
        // value already exists
        return current;
    }

    return current;
}
    @Override
    public void remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(MutableTreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUserObject(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeFromParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setParent(MutableTreeNode newParent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreeNode getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndex(TreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getAllowsChildren() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLeaf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enumeration<? extends TreeNode> children() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(MutableTreeNode child, int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

public class Node implements TreeNode{
int elememt;
Node parent;
Node left;
Node right;

        public Node(int value) {
          this.elememt = value;
        }

        @Override
        public TreeNode getChildAt(int childIndex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getChildCount() {
        int count = 0;
        if(left != null){
        count ++;
        }
        if(right != null){
        count ++;
        }
        return count;
        }

        @Override
        public TreeNode getParent() {
        return parent;    
        }

        @Override
        public int getIndex(TreeNode node) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean getAllowsChildren() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isLeaf() {
             return (left == null&& right == null);
        }

        @Override
        public Enumeration<? extends TreeNode> children() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }
public String tostring(){
String output = "[";
         if (left!=null)
            output += "" + left;
         output += "" + elememt;
         if (right!=null)
            output += "" + right;
         output += "]";
         return output;
}
}
}

