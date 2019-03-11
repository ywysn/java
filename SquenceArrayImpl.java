package www.bit.java;
import java.util.Arrays;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;


public class SquenceArrayImpl implements Sequence {
    private static final int LEN = 2;//数组默认长度
    private Object[] elementData;//数组
    private int size;//数组大小
    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;//数组长度最大值设定
    public SquenceArrayImpl() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }
    @Override
    public void add(Object data) {
        //判断是否溢出
        ensureCapacity(size+1);
        elementData[size++]=data;
    }

    @Override
    public boolean remove(int index) {
        //检查坐标是否越界
        rangCheck(index);
        //将要删除的数据存储
        Object oldData = elementData[index];
        //计算要拷贝的长度
        int moveSize = size-index-1;
        if(moveSize > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, moveSize);
        }
        //将数组最后一位置空
        elementData[--size] = null;
        return true;
    }

    @Override
    public Object get(int index) {
        rangCheck(index);
        return elementData[index];
    }

    @Override
    public boolean contains(Object data) {
        //两种情况：
        // 第一种要查找数据为空
        if(data == null){
            for (int i = 0;i < size;i++){
                if(elementData[i] == null){
                    return true;
                }
            }
        }else{
            //第二种不为空
            for(int i = 0;i < size;i++){
                //要注意 假设数组内部有null的情况
                if(data.equals(elementData[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object set(int index, Object newData) {
        rangCheck(index);
        Object OldData = elementData[index];
        elementData[index] = newData;
        return elementData[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void cleaan() {
        //遍历，清空数组
        for(int i = 0;i < size;i++){
            elementData[i] = null;
        }
        this.size = 0;
    }

    @Override
   public Object[] toArray() {
        return Arrays.copyOf(elementData,size);
    }

    public void ensureCapacity(int cap){
       if(cap-elementData.length > 0){
           grow(cap);
       }
    }
    public void grow(int cap){
        int oldCap = elementData.length;
        int newCap = oldCap<<1;
        if(newCap-cap<0){
            newCap = cap;
        }
        if(newCap-MAX_ARRAY_SIZE < 0){
            throw new ArrayIndexOutOfBoundsException("超过数组最⼤大阈值");
        }
    elementData = Arrays.copyOf(elementData,newCap);
    }
    private void rangCheck(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException("下标不存在！");
        }
    }

    public static void main(String[] args) {

    }
}
