// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import com.android.a.v;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            d

class e
    implements v
{

    final String a;
    final boolean b;
    final d c;

    e(d d1, String s, boolean flag)
    {
        c = d1;
        a = s;
        b = flag;
        super();
    }

    public void a(Bitmap bitmap)
    {
        d.a(c, a, bitmap, b);
    }

    public volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }
}
