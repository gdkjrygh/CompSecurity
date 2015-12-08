// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            ad, af

final class z
    implements ad
{

    final af a;
    final boolean b;
    final b c;

    z(af af1, boolean flag, b b1)
    {
        a = af1;
        b = flag;
        c = b1;
        super();
    }

    public void a()
    {
        if (a != null)
        {
            a.a(b, c);
        }
        if (j.a)
        {
            int i;
            if (c != null)
            {
                i = c.a();
            } else
            {
                i = -1;
            }
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]handleAdData(onHandleAdvertInfoFinish, isCacheData:").append(b).append(", adModuleInfoBean:").append(c).append(", loadAdvertDataListener:").append(a).append(")").toString());
        }
    }

    public void b()
    {
        if (a != null)
        {
            a.a(c);
        }
        if (j.a)
        {
            int i;
            if (c != null)
            {
                i = c.a();
            } else
            {
                i = -1;
            }
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i).append("]handleAdData(onAdvertImageDownloadFinish, isCacheData:").append(b).append(", adModuleInfoBean:").append(c).append(", loadAdvertDataListener:").append(a).append(")").toString());
        }
    }
}
