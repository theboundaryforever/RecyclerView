package com.yjs.recyclerview.baseadapter;

import android.view.View;
import android.widget.TextView;

import com.yjs.recyclerview.EntityTwo;
import com.yjs.recyclerview.R;
import com.yjs.recyclerview.adapter.*;

/**
 * Created by yangjingsong on 17/2/13.
 */

public class ViewHolderTwo extends BaseViewHolder<EntityTwo> {
    public ViewHolderTwo(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(EntityTwo data) {
        TextView textView = (TextView) getView(R.id.tv);
        textView.setText("我是另一种布局");
    }

}
