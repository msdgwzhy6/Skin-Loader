package wenld.github.skinloader.config;

import android.content.Context;

/**
 * Author: wenld on 2017/4/6 10:37.
 * blog: http://www.jianshu.com/u/99f514ea81b3
 * github: https://github.com/LidongWen
 *
 */
public class SkinPreUtils {

    private static SkinPreUtils mInstance;
    private Context mContext;

    private SkinPreUtils(Context context){
        this.mContext = context.getApplicationContext();
    }

    public static SkinPreUtils getInstance(Context context){
        if(mInstance == null){
            synchronized (SkinPreUtils.class){
                if(mInstance == null){

                }  mInstance = new SkinPreUtils(context);
            }
        }
        return mInstance;
    }


    /**
     * 保存当前皮肤路径
     * @param skinPath
     */
    public void saveSkinPath(String skinPath){
        mContext.getSharedPreferences(SkinConfig.SKIN_INFO_NAME,Context.MODE_PRIVATE)
                .edit().putString(SkinConfig.SKIN_PATH_NAME,skinPath).commit();
    }

    /**
     * 获取皮肤的路径
     * @return  当前皮肤路径
     */
    public String getSkinPath(){
        return mContext.getSharedPreferences(SkinConfig.SKIN_INFO_NAME,Context.MODE_PRIVATE)
                .getString(SkinConfig.SKIN_PATH_NAME,"");
    }

    /**
     * 清空皮肤路径
     */
    public void clearSkinInfo() {
        saveSkinPath("");
    }
}
