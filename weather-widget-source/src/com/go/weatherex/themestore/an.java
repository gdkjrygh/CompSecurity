// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;
import com.go.weatherex.framework.a.a;

public class an extends b
{

    public View a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    public ImageView g;
    public ImageView h;

    public an(Context context, View view)
    {
        super(context, view);
        a = b(0x7f090226);
        b = (TextView)b(0x7f090202);
        c = (ImageView)b(0x7f090546);
        d = (ImageView)b(0x7f090548);
        g = (ImageView)b(0x7f090549);
        h = (ImageView)b(0x7f090547);
        if (e.getContext() instanceof a)
        {
            ((a)e.getContext()).a(b, 4, true);
        }
    }
}
