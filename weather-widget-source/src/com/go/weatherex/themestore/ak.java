// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import com.android.a.aa;
import com.jiubang.playsdk.a.k;
import com.jiubang.playsdk.a.v;

// Referenced classes of package com.go.weatherex.themestore:
//            ad

class ak
    implements k
{

    private volatile k a;

    private ak()
    {
    }

    ak(ad ad)
    {
        this();
    }

    public void a(aa aa)
    {
        if (a != null)
        {
            a.a(aa);
        }
    }

    void a(k k1)
    {
        a = k1;
    }

    public void a(v v1)
    {
        if (a != null)
        {
            a.a(v1);
        }
    }

    public volatile void a(Object obj)
    {
        a((v)obj);
    }
}
