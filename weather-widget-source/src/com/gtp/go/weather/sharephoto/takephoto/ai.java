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

public class ai extends ap
{

    public ai(Context context)
    {
        super(context, 1);
        a(LayoutInflater.from(a).inflate(0x7f030101, null));
        i = (TextView)a(0x7f090501);
        l = (TextView)a(0x7f090502);
        m = (TextView)a(0x7f090503);
        o = (ImageView)a(0x7f090262);
        p = new aq(a, a(0x7f0904fb), new int[] {
            0x7f020470, 0x7f020471, 0x7f020472, 0x7f020473, 0x7f020474, 0x7f020475, 0x7f020476, 0x7f020477, 0x7f020478, 0x7f020479, 
            0x7f02047a, 0x7f020449, 0x7f02044a
        });
    }

    public void b()
    {
        a((float)(b - i()) / (float)b);
        b((float)((c - j()) / 2) / (float)c);
    }

    protected void c()
    {
        super.c();
        if (b > c)
        {
            f = f * 0.61F;
            return;
        } else
        {
            f = f * 0.52F;
            return;
        }
    }
}
