// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ap, aq

public class aj extends ap
{

    public aj(Context context)
    {
        super(context, 2);
        a(LayoutInflater.from(a).inflate(0x7f030102, null));
        i = (TextView)a(0x7f090501);
        j = (TextView)a(0x7f090505);
        k = (TextView)a(0x7f090506);
        l = (TextView)a(0x7f090502);
        m = (TextView)a(0x7f090503);
        n = (TextView)a(0x7f090504);
        p = new aq(a, a(0x7f0904fb), new int[] {
            0x7f020470, 0x7f020471, 0x7f020472, 0x7f020473, 0x7f020474, 0x7f020475, 0x7f020476, 0x7f020477, 0x7f020478, 0x7f020479, 
            0x7f02047a, 0x7f02044c, 0x7f02044d
        });
    }

    public void b()
    {
        float f1 = b - i() - c(30);
        float f = f1;
        if (f1 < 0.0F)
        {
            f = b - i() / 2;
        }
        a(f / (float)b);
        int i = d(40);
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
            f = f * 0.62F;
            return;
        } else
        {
            f = f * 0.6F;
            return;
        }
    }
}
