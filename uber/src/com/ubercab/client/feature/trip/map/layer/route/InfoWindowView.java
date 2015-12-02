// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map.layer.route;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;

public class InfoWindowView extends FrameLayout
{

    TextView mTextViewInfoWindow;

    public InfoWindowView(Context context)
    {
        this(context, null);
    }

    public InfoWindowView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public InfoWindowView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        LayoutInflater.from(context).inflate(0x7f0301cb, this);
        ButterKnife.inject(this);
    }

    public final void a(String s)
    {
        mTextViewInfoWindow.setText(s);
    }
}
