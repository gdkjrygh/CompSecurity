// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.util.BitmapUtil;

public class PoweredByWishDarkView extends FrameLayout
{

    private LinearLayout contentView;

    public PoweredByWishDarkView(Context context)
    {
        this(context, null);
    }

    public PoweredByWishDarkView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PoweredByWishDarkView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300d3, this);
        contentView = (LinearLayout)view.findViewById(0x7f0d0430);
        if (WishApplication.getAppInstance().isWishApp())
        {
            contentView.setVisibility(8);
            return;
        } else
        {
            BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0432), getPoweredByLogoResource());
            ((TextView)view.findViewById(0x7f0d0431)).setTextColor(getPoweredByTextColor());
            return;
        }
    }

    protected int getPoweredByLogoResource()
    {
        return 0x7f02015d;
    }

    protected int getPoweredByTextColor()
    {
        return getResources().getColor(0x7f0c00d0);
    }

    public void setInnerPadding(int i)
    {
        i = (int)TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
        contentView.setPadding(i, contentView.getPaddingTop(), i, i);
    }
}
