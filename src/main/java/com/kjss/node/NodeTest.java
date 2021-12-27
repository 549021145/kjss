package com.kjss.node;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

	//创建二叉树
    public static void create(int[] datas, List<Node> list){
        // 将数组里面的东西变成节点的形式
        for(int i=0;i<datas.length;i++) {
            Node node=new Node(datas[i]);
            list.add(node);
        }

        // 节点关联成树
        for(int index=0;index<list.size()/2-1;index++){
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            list.get(index).setLeft(list.get(index*2+1));
            //与上同理
            list.get(index).setRight(list.get(index*2+2));
        }

        // 最后一个父节点，因为最后一个父节点可能没有右孩子，所以单独拿出来处理 避免单孩子情况
        int lastParentIndex=list.size()/2-1;
        list.get(lastParentIndex).setLeft(list.get(lastParentIndex*2+1));
        if (list.size()%2==1) {
            // 如果有奇数个节点，最后一个父节点才有右子节点
            list.get(lastParentIndex).setRight(list.get(lastParentIndex*2+2));
        }
    }
    
    /**
     * 先序遍历
     *
     * 这三种不同的遍历结构都是一样的，只是先后顺序不一样而已
     *
     * @param node
     * 遍历的节点
     */
    public static void preOrderTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.getValue() + " ");
        preOrderTraverse(node.getLeft());
        preOrderTraverse(node.getRight());
    }
    
    public static void main(String[] args) {
    	int[] array = {1, 2, 3, 4, 5, 6, 7};
        List<Node> list = new ArrayList<>();
        NodeTest.create(array,list);

        // nodeList中第0个索引处的值即为根节点
        Node root = list.get(0);
        System.out.println("先序遍历：");
        preOrderTraverse(root);
        System.out.println();
	}
}
