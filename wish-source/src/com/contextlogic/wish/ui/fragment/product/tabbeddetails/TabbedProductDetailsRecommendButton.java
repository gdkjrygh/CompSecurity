// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.contextlogic.wish.util.BitmapUtil;

public class TabbedProductDetailsRecommendButton extends LinearLayout
{

    public TabbedProductDetailsRecommendButton(Context context)
    {
        this(context, null);
    }

    public TabbedProductDetailsRecommendButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        BitmapUtil.safeSetImageResource((ImageView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b3, this).findViewById(0x7f0d03d2), 0x7f0201a4);
    }
}
