// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            j

class a
    implements q, r, g
{

    private n a;
    private LocationRequest b;
    private boolean c;
    private j d;

    a(Context context, j j1)
    {
        c = false;
        if (context == null || j1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = (new o(context)).a(i.a).a(this).a(this).b();
            b = LocationRequest.a();
            b.a(100);
            b.a(0L);
            b.b(0L);
            d = j1;
            return;
        }
    }

    public void a(int k)
    {
        c = false;
    }

    public void a(Location location)
    {
        d.a(location);
    }

    public void a(Bundle bundle)
    {
        c = true;
        i.b.a(a, b, this);
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    public boolean a()
    {
        return c;
    }

    void b()
    {
        c = false;
        if (a.d())
        {
            i.b.a(a, this);
        }
        a.c();
    }

    void c()
    {
        c = true;
        a.b();
    }
}
