package com.school.sharephoto.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.school.sharephoto.R;

import java.util.ArrayList;
import java.util.List;

import cc.shinichi.library.ImagePreview;
import cn.lemon.multi.MultiView;


public class MainActivity extends AppCompatActivity {


    private MultiView multiView;
    private List<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        multiView = (MultiView) findViewById(R.id.multi_view);

        data.add("https://wx4.sinaimg.cn/mw690/6f016cdfgy1g0la5ki526j20i250xhdu.jpg");
        data.add("http://img03.sogoucdn.com/app/a/100520093/ff997748674109a3-a39fb229dd0dbda7-694fe393ad45dc0aa9ea5a22823a4a89.jpg");
        data.add("http://img02.sogoucdn.com/app/a/100520093/398e25e72e0c6d43-69bdc558c3bd67b0-cfe3bbc83b1b97766b1f563b5a2ca7f7.jpg");
        data.add("http://img03.sogoucdn.com/app/a/100520093/11388287d0e56ad7-53b51a5be5b5a2db-9e20f21c3413f36b211a6543ad164d1f.jpg");
        data.add("http://img03.sogoucdn.com/app/a/100520093/11388287d0e56ad7-53b51a5be5b5a2db-0d4a965d46d4436ed1c7053eccb6fe70.jpg");
        data.add("http://img03.sogoucdn.com/app/a/100520093/33707f33b97c03ef-e989d519207501fc-417f0b65c0bd38f89fa860dc6e331204.jpg");
        data.add("http://img03.sogoucdn.com/app/a/100520093/ea54b1c5225b5b8f-1f7d693ce5c84217-c3bf467271f05ac7fb1b65bcd04075df.jpg");
        data.add("http://img01.sogoucdn.com/app/a/100520093/ea54b1c5225b5b8f-1f7d693ce5c84217-29186a9893391156126abf6b88edb947.jpg");

        data.add("http://img04.sogoucdn.com/app/a/100520024/da58c325457e35bc35ef5b88ff6e8f93");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551350691824&di=888eada749b09bb0a1db18c3cb36a077&imgtype=0&src=http%3A%2F%2Fs9.rr.itc.cn%2Fr%2FwapChange%2F20173_7_18%2Fa1h59g3470867073619.gif");
        data.add("http://img04.sogoucdn.com/app/a/100520024/d8cd08e9ad5e594e6072b79b16a79cb9");
        data.add("http://img03.sogoucdn.com/app/a/100520024123123/123123123");

        multiView.setImages(data);

        Log.e("123","123");

        multiView.setOnOneClickListener(new MultiView.CustomCallBack(){
            @Override
            public void longClick(String position, List<String> mData) {

            }

            @Override
            public void onOneClick(String position, List<String> mData) {
                Toast.makeText(MainActivity.this, position, Toast.LENGTH_SHORT).show();

                ImagePreview
                        .getInstance()
                        // 上下文，必须是activity，不需要担心内存泄漏，本框架已经处理好；
                        .setContext(MainActivity.this)

                        // 设置从第几张开始看（索引从0开始）
                        .setIndex(Integer.parseInt(position))
                        //=================================================================================================
                        // 有三种设置数据集合的方式，根据自己的需求进行三选一：
                        // 1：第一步生成的imageInfo List
//                    .setImageInfoList(imageInfoList)

                        // 2：直接传url List
                        .setImageList(mData)

                        // 3：只有一张图片的情况，可以直接传入这张图片的url
//                        .setImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1551269226899&di=6daa6a64b6dd236245e0bf642ac30cf6&imgtype=0&src=http%3A%2F%2Fwww.jituwang.com%2Fuploads%2Fallimg%2F110715%2F9124-110G5100Z020.jpg")
                        //=================================================================================================
                        // 是否启用点击图片关闭。默认启用
                        .setEnableClickClose(false)
                        // 是否启用上拉/下拉关闭。默认不启用
                        .setEnableDragClose(true)
                        .setShowCloseButton(true)
                        // 开启预览
                        .start();


            }
        });
    }



}
