package easyble2.util;

import androidx.annotation.NonNull;

/**
 * date: 2019/8/2 23:56
 * author: zengfansheng
 */
public interface Logger {
    /**
     * 一般的
     */
    int TYPE_GENERAL = 0;
    /**
     * 搜索状态
     */
    int TYPE_SCAN_STATE = 1;
    /**
     * 连接状态
     */
    int TYPE_CONNECTION_STATE = 2;
    /**
     * 读特征
     */
    int TYPE_CHARACTERISTIC_READ = 3;
    /**
     * 特征值变化
     */
    int TYPE_CHARACTERISTIC_CHANGED = 4;
    /**
     * 信号强度
     */
    int TYPE_READ_REMOTE_RSSI = 5;
    /**
     * 最大传输单元变化
     */
    int TYPE_MTU_CHANGED = 6;
    /**
     * 请求失败
     */
    int TYPE_REQUEST_FIALED = 7;
    int TYPE_DESCRIPTOR_READ = 8;
    int TYPE_NOTIFICATION_CHANGED = 9;
    int TYPE_INDICATION_CHANGED = 10;
    int TYPE_CHARACTERISTIC_WRITE = 11;
    int TYPE_PHY_READ = 12;
    int TYPE_PHY_UPDATE = 13;

    /**
     * 打印日志
     *
     * @param priority 日志级别。{@link android.util.Log#DEBUG}等
     * @param type     日志类型。{@link #TYPE_CONNECTION_STATE}等
     * @param msg      日志内容
     */
    void log(int priority, int type, @NonNull String msg);

    /**
     * 打印日志
     *
     * @param priority 日志级别。{@link android.util.Log#DEBUG}等
     * @param type     日志类型。{@link #TYPE_CONNECTION_STATE}等
     * @param msg      日志内容
     * @param th       异常
     */
    void log(int priority, int type, @NonNull String msg, @NonNull Throwable th);

    /**
     * 日志输出控制
     */
    void setEnabled(boolean isEnabled);
}