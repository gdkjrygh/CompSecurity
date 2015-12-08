// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.jiubang.playsdk.c.c;

public class a extends com.jiubang.playsdk.c.a
{

    public a(Context context)
    {
        super(context);
    }

    public void a(View view)
    {
        if (b.a())
        {
            return;
        } else
        {
            Rect rect = new Rect();
            ((Activity)c).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            int i = rect.top;
            int j = c.getResources().getDimensionPixelSize(0x7f0c0064);
            int k = c.getResources().getDimensionPixelSize(0x7f0c0063);
            a(view, 0, c.getResources().getDimensionPixelSize(0x7f0c0065) + (i + k), j, -2);
            return;
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (view == a && i == 82 && keyevent.getAction() == 1 && b())
        {
            a();
            return true;
        } else
        {
            return false;
        }
    }
}
