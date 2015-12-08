// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.recycler;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.walmartlabs.ui.recycler:
//            BasicViewHolder, PagingAdapter

public static class itemView extends BasicViewHolder
{

    private TextView mLoadingTextView;

    public void setLoadingText(String s)
    {
        mLoadingTextView.setText(s);
        TextView textview = mLoadingTextView;
        int i;
        if (!TextUtils.isEmpty(s))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public (View view)
    {
        super(view);
        mLoadingTextView = (TextView)itemView.findViewById(com.walmart.lib.rViewHolder.itemView);
    }
}
