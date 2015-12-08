// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            bh, ax, bg, h, 
//            Status, ah, af, a

public class ag
    implements bh
{

    private final ax a;

    public ag(ax ax1)
    {
        a = ax1;
    }

    private void a(bg bg1)
    {
        a.a(bg1);
        h h1 = a.a(bg1.d());
        if (!h1.b() && a.e.containsKey(bg1.d()))
        {
            bg1.c(new Status(17));
            return;
        } else
        {
            bg1.a(h1);
            return;
        }
    }

    public af a(af af)
    {
        try
        {
            a(((bg) (af)));
        }
        catch (DeadObjectException deadobjectexception)
        {
            a.a(new ah(this, this));
            return af;
        }
        return af;
    }

    public void a()
    {
        while (!a.b.isEmpty()) 
        {
            try
            {
                a((bg)a.b.remove());
            }
            catch (DeadObjectException deadobjectexception)
            {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadobjectexception);
            }
        }
    }

    public void a(int i)
    {
        if (i == 1)
        {
            a.k();
        }
        for (Iterator iterator = a.j.iterator(); iterator.hasNext(); ((bg)iterator.next()).a(new Status(8, "The connection to Google Play services was lost"))) { }
        a.a(null);
        a.a.a(i);
        a.a.a();
        if (i == 2)
        {
            a.b();
        }
    }

    public void a(Bundle bundle)
    {
    }

    public void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public void b()
    {
        a.e.clear();
        a.f();
        a.a(null);
        a.a.a();
    }

    public void c()
    {
    }

    public String d()
    {
        return "CONNECTED";
    }
}
