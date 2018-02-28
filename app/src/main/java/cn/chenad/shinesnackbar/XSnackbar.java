package cn.chenad.shinesnackbar;

import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


/**
 * Created by chen on 2018  为snackBar添加取消按钮
 */

public class XSnackbar {
    /**
     * 向snackbar布局中添加我们自定义的两个action布局
     *
     * @param snackbar
     * @param layoutId 新添加布局 id
     */
    public static void addViewToSnackbar(Snackbar snackbar, int layoutId) {
        //获取snackbar
        View snackbarview = snackbar.getView();
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbarview;
        View add_view = LayoutInflater.from(snackbarview.getContext()).inflate(layoutId, null);
        snackbarLayout.addView(add_view);
    }

    /**
     * 这里我举例是button  具体使用到什么控件自己改下
     * 为snackbar中控件指定监听器
     */
    public static void SetAction1(Snackbar snackbar, int id,View.OnClickListener onClickListener) {
        View view = snackbar.getView();
        if (view != null) {
            Button cancel = view.findViewById(id);
            cancel.setOnClickListener(onClickListener);
        }
    }

    /**
     * 为snackbar中控件指定监听器
     */
    public static void SetAction2(Snackbar snackbar, int id,  View.OnClickListener onClickListener) {
        View view = snackbar.getView();
        if (view != null) {
            Button cancel = view.findViewById(id);
            cancel.setOnClickListener(onClickListener);
        }
    }
}
