// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.view.LayoutInflater;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            an, a, ao

public class am extends an
{

    public am(Context context)
    {
        super(context, 5);
        a(LayoutInflater.from(a).inflate(0x7f030105, null));
    }

    public ao a()
    {
        return new a(this);
    }

    public void b()
    {
        int i = b - i() - c(20);
        float f = i;
        if (i + i() > b)
        {
            f = b - i() / 2;
        }
        a(f / (float)b);
        i = d(20);
        f = i;
        if (i + j() > c)
        {
            f = c - j() / 2;
        }
        b(f / (float)c);
    }

    protected void c()
    {
        super.c();
        f = f * 0.5F;
    }
}
