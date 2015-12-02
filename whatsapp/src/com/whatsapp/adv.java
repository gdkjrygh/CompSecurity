// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.LocationListener;

// Referenced classes of package com.whatsapp:
//            n9

final class adv
    implements Runnable
{

    final LocationListener a;
    final n9 b;

    adv(n9 n9_1, LocationListener locationlistener)
    {
        b = n9_1;
        a = locationlistener;
        super();
    }

    public void run()
    {
        b.a(a);
    }
}
