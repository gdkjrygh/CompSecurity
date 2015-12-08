// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import com.android.a.aa;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            k, KPNetworkImageView, n, j

class m
    implements k
{

    final boolean a;
    final KPNetworkImageView b;

    m(KPNetworkImageView kpnetworkimageview, boolean flag)
    {
        b = kpnetworkimageview;
        a = flag;
        super();
    }

    public void a(aa aa)
    {
        if (KPNetworkImageView.a(b) != 0)
        {
            b.setImageResource(KPNetworkImageView.a(b));
        }
    }

    public void a(j j1, boolean flag)
    {
        if (flag && a)
        {
            b.post(new n(this, j1));
            return;
        } else
        {
            j1 = j1.b();
            KPNetworkImageView.a(b, j1);
            return;
        }
    }
}
