package www.bit.java;

public interface Sequence {
    //向线性表中添加元素
    void add(Object data);
    //线性表中删除元素
    boolean remove (int index);
    //在线性表中查找指定索引的元素
    Object get (int index);
    //判断线性表中是否有指定元素
    boolean contains(Object data);
    //修改线性表中指定索引的内容
    Object set(int index,Object newData);
    //返回当前元素表个数
    int size();
    //清空线性表内容
    void cleaan();
    //将线性表转为数组
    Object []toArray();
}
