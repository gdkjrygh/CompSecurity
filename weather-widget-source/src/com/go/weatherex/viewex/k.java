// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class k extends LinearLayout
{

    public ImageView a;
    public ImageView b;
    public TextView c;

    public k(Context context)
    {
        super(context);
        LayoutInflater.from(context).inflate(0x7f0300ba, this);
        a = (ImageView)findViewById(0x7f09040e);
        b = (ImageView)findViewById(0x7f0900bd);
        c = (TextView)findViewById(0x7f09022e);
    }
}
