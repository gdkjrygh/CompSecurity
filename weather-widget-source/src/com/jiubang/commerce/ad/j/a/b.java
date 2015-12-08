// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.jiubang.commerce.ad.e.p;
import com.jiubang.commerce.c.a;

// Referenced classes of package com.jiubang.commerce.ad.j.a:
//            c, a

class b
    implements p
{

    final ImageView a;
    final com.jiubang.commerce.ad.j.a.a b;

    b(com.jiubang.commerce.ad.j.a.a a1, ImageView imageview)
    {
        b = a1;
        a = imageview;
        super();
    }

    public void a(String s)
    {
    }

    public void a(String s, Bitmap bitmap)
    {
        String s1;
        if (a != null)
        {
            s1 = (String)a.getTag();
        } else
        {
            s1 = null;
        }
        if (bitmap != null && s1 != null && s1.equals(s))
        {
            com.jiubang.commerce.c.a.a(new c(this, bitmap));
        }
    }
}
