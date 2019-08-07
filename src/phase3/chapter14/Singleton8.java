package phase3.chapter14;

/**
 * @classname: Singleton8
 * @description: 改进枚举（内部枚举实例）
 * @author: Desire
 * @date: 2019-08-07 14:51
 */
public class Singleton8 {

    private byte[] data = new byte[1024];

    private Singleton8() {
    }

    private enum EnumHolder{
        INSTANCE;
        private  Singleton8 instance;

        EnumHolder(){
            this.instance = new Singleton8();
        }
        private Singleton8 getSingleton(){
            return instance;
        }
    }

    public static Singleton8 getInstance(){
        return EnumHolder.INSTANCE.getSingleton();
    }

}
