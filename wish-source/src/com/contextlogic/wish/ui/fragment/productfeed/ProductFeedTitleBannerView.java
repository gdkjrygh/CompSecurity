// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.productfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.util.BitmapUtil;

public class ProductFeedTitleBannerView extends FrameLayout
{

    private TextView text;

    public ProductFeedTitleBannerView(Context context)
    {
        this(context, null);
    }

    public ProductFeedTitleBannerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProductFeedTitleBannerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03008b, this);
        setBackgroundColor(getResources().getColor(0x7f0c00a9));
        text = (TextView)view.findViewById(0x7f0d02a2);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d02a1), 0x7f0200ef);
    }

    public void setMessage(String s)
    {
        text.setText(s);
    }
}
