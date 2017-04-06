package wenld.github.skinloader.config;
/**
 * Author: wenld on 2017/4/6 10:37.
 * blog: http://www.jianshu.com/u/99f514ea81b3
 * github: https://github.com/LidongWen
 *
 */
public class SkinConfig {
    // SP的文件名称
    public static final String SKIN_INFO_NAME = "skinInfo";

    // 保存皮肤文件的路径的名称
    public static final String SKIN_PATH_NAME = "skinPath";

    // 不需要改变任何东西
    public static final int SKIN_CHANGE_NOTHING = -1;

    // 换肤成功
    public static final int SKIN_CHANGE_SUCCESS = 1;

    // 皮肤文件不存在
    public static final int SKIN_FILE_NOEXSIST = -2;

    // 皮肤文件有错误可能不是一个apk文件
    public static final int SKIN_FILE_ERROR = -3;
}
