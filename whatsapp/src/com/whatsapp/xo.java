// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp:
//            App, MessageDetailsActivity

class xo extends Drawable
{

    final Drawable a;
    final ViewGroup b;
    final MessageDetailsActivity c;

    xo(MessageDetailsActivity messagedetailsactivity, Drawable drawable, ViewGroup viewgroup)
    {
        c = messagedetailsactivity;
        a = drawable;
        b = viewgroup;
        super();
    }

    public void draw(Canvas canvas)
    {
        int j;
        int k;
label0:
        {
            int l = a.getIntrinsicHeight();
            int i1 = a.getIntrinsicWidth();
            k = b.getWidth();
            j = b.getHeight();
            int i = j;
            if (k * l > j * i1)
            {
                i = (l * k) / i1;
                j = i;
                if (App.am == 0)
                {
                    break label0;
                }
            }
            k = (i1 * i) / l;
            j = i;
        }
        a.setBounds(0, 0, k, j);
        a.draw(canvas);
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
