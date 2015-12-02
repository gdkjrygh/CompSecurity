// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.whatsapp:
//            App, mc

class v4 extends Drawable
{

    private int a;

    private v4()
    {
        a = 0x10100a9;
    }

    v4(mc mc)
    {
        this();
    }

    public void draw(Canvas canvas)
    {
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
