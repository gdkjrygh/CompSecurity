// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.t;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            d

class e extends t
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void a()
    {
        j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a.a).append("]loadFaceBookAdInfo:time out").toString());
        a.b.a(null);
    }
}
