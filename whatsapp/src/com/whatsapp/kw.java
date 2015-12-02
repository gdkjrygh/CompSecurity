// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            BroadcastDetails

class kw extends Drawable
{

    final BroadcastDetails a;
    final View b;
    final Drawable c;

    kw(BroadcastDetails broadcastdetails, Drawable drawable, View view)
    {
        a = broadcastdetails;
        c = drawable;
        b = view;
        super();
    }

    public void draw(Canvas canvas)
    {
        int j = c.getIntrinsicHeight();
        int k = c.getIntrinsicWidth();
        int i = b.getWidth();
        b.getWidth();
        j = (j * i) / k;
        c.setBounds(0, 0, i, j);
        c.draw(canvas);
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
