// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ap, aq

public class al extends ap
{

    public al(Context context)
    {
        super(context, 4);
        a(LayoutInflater.from(a).inflate(0x7f030104, null));
        i = (TextView)a(0x7f090501);
        j = (TextView)a(0x7f090505);
        k = (TextView)a(0x7f090506);
        o = (ImageView)a(0x7f090262);
        l = (TextView)a(0x7f090502);
        p = new aq(a, a(0x7f0904fb), new int[] {
            0x7f02045e, 0x7f02045f, 0x7f020460, 0x7f020461, 0x7f020462, 0x7f020463, 0x7f020464, 0x7f020465, 0x7f020466, 0x7f020467, 
            0x7f02045d, 0x7f020456, 0x7f020457
        });
    }

    public void b()
    {
        int i = c(50);
        float f = i;
        if (i + i() > b)
        {
            f = b - i() / 2;
        }
        a(f / (float)b);
        i = d(50);
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
        if (b > c)
        {
            f = f * 0.58F;
            return;
        } else
        {
            f = f * 0.4F;
            return;
        }
    }
}
