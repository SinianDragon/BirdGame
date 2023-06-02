import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
public class GameUtil {
    /*
             插图 必备 方法
             其中 BufferedImage 为 Image 的 子类 方法
             插入的 照片 需要 引用 这个方法
         */
    public static BufferedImage loadBufferedImage(String imgPath){
        try{
            return ImageIO.read(new FileInputStream(imgPath)) ;
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    // 随机出 两个数 之间的数字， 区间 包括左边  不包括右边
    public static int getRandomNumber(int min,int max) {
        return (int)(Math.random()*(max-min)+min);
    }
    /*
            判断是否大于这个 概率。
            左边为 分子，右边为 分母
     */
    public static boolean isInAnyProbability(int numrator , int denominator) throws Exception {
        // 处理的特殊情况
        if (numrator <=0 || denominator <=0){
            throw new Exception("传入了非法的参数!");
        }
        // 一定 发生的 事件
        if (numrator >= denominator){
            return true;
        }
        return getRandomNumber(1,denominator+1) <= numrator;
    }
}
