package com.yjs.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yjs.recyclerview.activity.BaseAdapterActivity;
import com.yjs.recyclerview.activity.ItemDirectionActivity;
import com.yjs.recyclerview.activity.ItemTouchHelperActivity;
import com.yjs.recyclerview.activity.LayoutManagerActivity;
import com.yjs.recyclerview.baseadapter.BaseRecyclerAdapter;
import com.yjs.recyclerview.tantan.TanActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this,ItemTouchHelperActivity.class));
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, ItemDirectionActivity.class));
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, LayoutManagerActivity.class));
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstActivity.this, BaseAdapterActivity.class));
            }
        });
    }
}
