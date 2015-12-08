// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.main.c;

public class ConfirmDialogView extends LinearLayout
{

    private TextView a;
    private View b;
    private View c;
    private int d;
    private String e;

    public ConfirmDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static ConfirmDialogView a(Context context)
    {
        return (ConfirmDialogView)View.inflate(context, 0x7f0300a4, null);
    }

    public int a()
    {
        return d;
    }

    public void a(int i)
    {
        d = i;
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        b.setOnClickListener(onclicklistener);
    }

    public void a(String s)
    {
        a.setText(s);
    }

    public String b()
    {
        return e;
    }

    public void b(android.view.View.OnClickListener onclicklistener)
    {
        c.setOnClickListener(onclicklistener);
    }

    public void b(String s)
    {
        e = s;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(0x7f0903d5);
        b = (TextView)findViewById(0x7f0903d6);
        b.setBackgroundResource(y.a().b().i());
        c = (TextView)findViewById(0x7f090269);
        c.setBackgroundResource(y.a().b().i());
    }
}
