// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import com.android.a.aa;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            k, KPNetworkImageView, j

class l
    implements k
{

    final KPNetworkImageView a;

    l(KPNetworkImageView kpnetworkimageview)
    {
        a = kpnetworkimageview;
        super();
    }

    public void a(aa aa)
    {
        if (KPNetworkImageView.a(a) != 0)
        {
            a.setImageResource(KPNetworkImageView.a(a));
        }
    }

    public void a(j j1, boolean flag)
    {
        j1 = j1.b();
        KPNetworkImageView.a(a, j1);
    }
}
