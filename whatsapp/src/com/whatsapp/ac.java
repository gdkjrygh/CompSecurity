// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import java.util.Collections;

// Referenced classes of package com.whatsapp:
//            a1e, td, ya, b5

class ac
    implements Runnable
{

    final td a;

    ac(td td1)
    {
        a = td1;
        super();
    }

    public void run()
    {
        a.e = a1e.g.a(td.g(a));
        td.f(a);
        td.e(a).notifyDataSetChanged();
        Location location = a.c();
        if (location != null)
        {
            double d = location.getLatitude();
            double d1 = location.getLongitude();
            Collections.sort(a.e, new b5(this, d, d1));
        }
        a.e();
    }
}
