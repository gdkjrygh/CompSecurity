// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.app.b;
import android.util.AttributeSet;

public class bk extends b
{

    int b;

    public bk(int i, int j)
    {
        super(i, j);
        b = 0;
        a = 0x800013;
    }

    public bk(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
    }

    public bk(b b1)
    {
        super(b1);
        b = 0;
    }

    public bk(bk bk1)
    {
        super(bk1);
        b = 0;
        b = bk1.b;
    }

    public bk(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        b = 0;
    }

    public bk(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        b = 0;
        a(marginlayoutparams);
    }

    void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        leftMargin = marginlayoutparams.leftMargin;
        topMargin = marginlayoutparams.topMargin;
        rightMargin = marginlayoutparams.rightMargin;
        bottomMargin = marginlayoutparams.bottomMargin;
    }
}
