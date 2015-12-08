// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.go.weatherex.home.b:
//            j, i

public class h extends Drawable
{

    private j a;
    private final Paint b;
    private boolean c;

    public h()
    {
        this(((j) (null)));
    }

    public h(int i)
    {
        this(((j) (null)));
        a(i);
    }

    private h(j j1)
    {
        b = new Paint();
        a = new j(j1);
    }

    h(j j1, i i)
    {
        this(j1);
    }

    public void a(int i)
    {
        if (a.a != i || a.b != i)
        {
            invalidateSelf();
            j j1 = a;
            a.b = i;
            j1.a = i;
        }
    }

    public void draw(Canvas canvas)
    {
        if (a.b >>> 24 != 0)
        {
            b.setColor(a.b);
            canvas.drawRect(getBounds(), b);
        }
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | a.c;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        a.c = getChangingConfigurations();
        return a;
    }

    public int getOpacity()
    {
        switch (a.b >>> 24)
        {
        default:
            return -3;

        case 255: 
            return -1;

        case 0: // '\0'
            return -2;
        }
    }

    public Drawable mutate()
    {
        if (!c && super.mutate() == this)
        {
            a = new j(a);
            c = true;
        }
        return this;
    }

    public void setAlpha(int i)
    {
        int k = a.a;
        int l = a.b;
        a.b = (((i >> 7) + i) * (k >>> 24) >> 8) << 24 | (a.a << 8) >>> 8;
        if (l != a.b)
        {
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
