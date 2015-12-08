// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.w;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;

// Referenced classes of package com.google.android.gms.location.internal:
//            v, e, f

public class d
    implements com.google.android.gms.location.d
{

    public d()
    {
    }

    public Location a(n n1)
    {
        n1 = i.a(n1);
        try
        {
            n1 = n1.p();
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            return null;
        }
        return n1;
    }

    public w a(n n1, LocationRequest locationrequest, g g)
    {
        return n1.a(new e(this, n1, locationrequest, g));
    }

    public w a(n n1, g g)
    {
        return n1.a(new f(this, n1, g));
    }
}
