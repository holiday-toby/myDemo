package com.example.mydemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mydemo.adapter.MyListActivity;
import com.example.mydemo.animation.AnimationActivity;
import com.example.mydemo.fileprovider_client.FileProviderTestActivity;
import com.example.mydemo.greendaotdemo.DbTestActivity;
import com.example.mydemo.material.CoordActivity;
import com.example.mydemo.popu.LiuyanActivity;
import com.example.mydemo.remoteview.ReceiveNotificationActivity;
import com.example.mydemo.timer.TimerDemoActivity;
import com.example.mydemo.viewflipper.ViewFlipperActivity;
import com.example.mydemo.volley.VolleyActivity;
import com.example.mydemo.webview.WebViewDemo;
import com.example.mydemo.webview.WebViewDemo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ldh on 2016/4/25 0025.
 */
public class MyListFragment extends ListFragment {

    private Context mContext;
    private final String[] ss = new String[]{
            "MyListActivity",
            "TimerDemoActivity",
            "VolleyActivity",
            "AnimationActivity",
            "WebViewDemo",
            "WebViewDemo2",
            "ViewFlipperActivity",
            "CoordActivity",
            "留言板",
            "Notification",
            "FileProviderTest",
            "DatabaseTest"
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<String> mDatas = new ArrayList<String>();
        mDatas.addAll(Arrays.asList(ss));

        mContext = getActivity();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1,
                android.R.id.text1, mDatas);
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ListView listView = getListView();
        String itemAtPosition = (String) listView.getItemAtPosition(position);
        switch (position) {
            case 0:
                gotoActivity(MyListActivity.class);
                break;
            case 1:
                gotoActivity(TimerDemoActivity.class);
                break;
            case 2:
                gotoActivity(VolleyActivity.class);
                break;
            case 3:
                gotoActivity(AnimationActivity.class);
                break;
            case 4:
                gotoActivity(WebViewDemo.class);
                break;
            case 5:
                /* Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.bing.com"));
                startActivity(intent1);
                return;*/
                gotoActivity(WebViewDemo2.class);
                break;
            case 6:
                gotoActivity(ViewFlipperActivity.class);
                break;
            case 7:
                gotoActivity(CoordActivity.class);
                break;
            case 8:
                gotoActivity(LiuyanActivity.class);
                break;
            case 9:
                gotoActivity(ReceiveNotificationActivity.class);
                break;
            case 10:
                gotoActivity(FileProviderTestActivity.class);
                break;
            case 11:
                gotoActivity(DbTestActivity.class);
            default:
                break;
        }
    }


    public void gotoActivity(Class<? extends Activity> clazz) {
        Intent intent = new Intent(mContext, clazz);
        mContext.startActivity(intent);
    }

    private void startActivity(String name) {
        //使用反射根据name打开对应的Activity

    }
}
