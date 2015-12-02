// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.whatsapp:
//            App, ak3

class nw extends Drawable
{

    private int a;

    private nw()
    {
        a = 0x10100a9;
    }

    nw(ak3 ak3)
    {
        this();
    }

    public void draw(Canvas canvas)
    {
        if (a != 0x10100a9)
        {
            canvas.drawColor(0x660099cc);
        }
    }

    public int getOpacity()
    {
        return 0;
    }

    public boolean isStateful()
    {
        return true;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public boolean setState(int ai[])
    {
        boolean flag = false;
        int j = App.am;
        int k = a;
        a = 0x10100a9;
        int l = ai.length;
        int i = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            int i1 = ai[i];
            if (i1 == 0x10100a7)
            {
                a = 0x10100a7;
                if (j == 0)
                {
                    break;
                }
            }
            if (i1 == 0x101009c)
            {
                a = 0x101009c;
            }
            i++;
        } while (j == 0);
        if (k != a)
        {
            invalidateSelf();
            flag = true;
        }
        return flag;
    }
}
