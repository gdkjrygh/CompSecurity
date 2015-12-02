// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            afn

class c extends View
{

    private int a;
    private Drawable b;
    final afn c;

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b == null && a != 0)
        {
            b = afn.a(getContext(), a);
        }
        if (b != null)
        {
            int i = b.getIntrinsicWidth();
            int j = b.getIntrinsicHeight();
            int k = (getWidth() - i) / 2;
            int l = (getHeight() - j) / 2;
            b.setBounds(k, l, i + k, j + l);
            b.draw(canvas);
        }
    }

    public void setEmojiCode(int i)
    {
        if (a != i)
        {
            a = i;
            setTag(Integer.valueOf(i));
            b = null;
        }
    }

    public (afn afn1, Context context)
    {
        c = afn1;
        super(context);
    }
}
