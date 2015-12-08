// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import com.facebook.ads.ImpressionListener;

// Referenced classes of package com.facebook.ads.a:
//            ac, k

class <init>
    implements <init>
{

    final ac b;

    public boolean a()
    {
        return ac.access$1300(b);
    }

    public void b()
    {
        if (ac.access$100(b) != null)
        {
            ac.access$100(b).a("on imp sent");
        }
    }

    public void c()
    {
        if (ac.access$1400(b) != null)
        {
            ac.access$1400(b).onLoggingImpression(b);
        }
    }

    public boolean d()
    {
        return false;
    }

    private ionListener(ac ac1)
    {
        b = ac1;
        super();
    }

    b(ac ac1, b b1)
    {
        this(ac1);
    }
}
