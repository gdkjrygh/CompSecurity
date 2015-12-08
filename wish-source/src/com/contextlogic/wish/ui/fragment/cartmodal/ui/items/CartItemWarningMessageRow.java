// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.util.BitmapUtil;

public class CartItemWarningMessageRow extends LinearLayout
{

    private ImageView imageView;
    private TextView messageText;

    public CartItemWarningMessageRow(Context context)
    {
        this(context, null);
    }

    public CartItemWarningMessageRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030043, this);
        messageText = (TextView)view.findViewById(0x7f0d0181);
        imageView = (ImageView)view.findViewById(0x7f0d0180);
        BitmapUtil.safeSetImageResource(imageView, 0x7f020131);
    }

    public void setMessage(String s)
    {
        messageText.setText(s);
    }
}
