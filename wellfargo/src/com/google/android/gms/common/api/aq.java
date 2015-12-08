// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.signin.f;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            av, ai, ar, ax, 
//            h, u

class aq extends av
{

    final ai a;
    private final Map c;

    public aq(ai ai1, Map map)
    {
        a = ai1;
        super(ai1, null);
        c = map;
    }

    public void a()
    {
        int i = com.google.android.gms.common.api.ai.b(a).a(ai.a(a));
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            ai.d(a).a(new ar(this, a, connectionresult));
        } else
        {
            if (ai.e(a))
            {
                com.google.android.gms.common.api.ai.f(a).q();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                h h1 = (h)iterator.next();
                h1.a((u)c.get(h1));
            }
        }
    }
}
