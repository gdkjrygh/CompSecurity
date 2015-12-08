// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class DynamicbgDescriptionView extends LinearLayout
{

    private Context a;
    private int b;
    private int c;

    public DynamicbgDescriptionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
        a = context;
    }

    private String a(int i)
    {
        switch (i)
        {
        default:
            return "";

        case 1: // '\001'
            return a.getString(0x7f0804cc);

        case 2: // '\002'
            return a.getString(0x7f0804cb);
        }
    }

    public int a()
    {
        return b;
    }

    public void a(int i, int j)
    {
        b = i;
        c = j;
    }

    public int b()
    {
        return c;
    }

    public String c()
    {
        switch (b)
        {
        case 1: // '\001'
        default:
            return "";

        case 2: // '\002'
            return (new StringBuilder()).append(a.getString(0x7f0804cd)).append(" ").append(a(c)).toString();

        case 3: // '\003'
            return (new StringBuilder()).append(a.getString(0x7f0804ce)).append(" ").append(a(c)).toString();

        case 4: // '\004'
            return (new StringBuilder()).append(a.getString(0x7f0804cf)).append(" ").append(a(c)).toString();

        case 5: // '\005'
            return (new StringBuilder()).append(a.getString(0x7f0804d3)).append(" ").append(a(c)).toString();

        case 6: // '\006'
            return (new StringBuilder()).append(a.getString(0x7f0804d1)).append(" ").append(a(c)).toString();

        case 7: // '\007'
            return (new StringBuilder()).append(a.getString(0x7f0804d0)).append(" ").append(a(c)).toString();

        case 8: // '\b'
            return (new StringBuilder()).append(a.getString(0x7f0804d2)).append(" ").append(a(c)).toString();
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
    }
}
