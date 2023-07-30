package com.jirengu;


public class Dog {
    // 0x代表16位进制数    0111
    private static final int FRIENDLY = 0x1;  // 1  0x1  -- 01
    private static final int BIG = 0x2; // 2   0x2 -- --10
    private static final int BLACK = 0x4; //4   0x4  -- 100
    private int properties = 0;

    // 请补全以下代码
    // 使用位运算 关键  怎样精准取进制位的值    << + & 来进行进制位值精准匹配
    /**
     * 使用位运算设置狗狗友好的属性
     *
     * @param friendly true为友好，false为不友好
     */
    public void setFriendly(boolean friendly) {
        int mid = 1;
        if((properties & mid) != 0){
            if (friendly == false){
            properties -= 1 ;
            }
        }else {
            if (friendly == true){
                properties += 1 ;
            }
        }

    }

    /**
     * 这只狗友好吗？   ，得到狗是否友好的结果
     *
     * @return 友好则返回true，否则返回false
     */
    public boolean isFriendly() {
        int mid = 1 ;
        if((properties & mid) == FRIENDLY){
        return true ;}else {return  false;}
    }

    /**
     * 使用位运算设置狗狗大的属性
     *
     * @param big true为大，false为不大
     */
    public void setBig(boolean big) {
        int mid = 1<<1;
        if((properties & mid) != 0){
            if (big == false){
                properties -= 2;
            }
        }else {
            if (big == true){
                properties += 2 ;
            }
        }
    }

    /**
     * 这只狗大吗？请在此处使用位运算读取properties，得到狗是否大的结果
     *
     * @return 大则返回true，否则返回false
     */
    public boolean isBig() {
        int mid = 1<<1;
        if((properties & mid) == BIG){
            return true;
        }else {
            return false;
        }
    }
    /**
     * 使用位运算设置狗狗黑的属性
     *
     * @param black true为黑，false为不黑
     */
    public void setBlack(boolean black) {
        int mid = 1<<2;
        if((properties & mid) != 0){
            if (black == false){
                properties -= 4;
            }
        }else {
            if (black == true){
                properties += 4 ;
            }
        }
    }

    /**
     * 这只狗黑吗？请在此处使用位运算读取properties，得到狗是否黑的结果
     *
     * @return 黑则返回true，否则返回false
     */
    public boolean isBlack() {
        int mid = 1<<2;
        if((properties&mid) == BLACK){
            return  true;
        }else {
            return false;
        }

    }


}
