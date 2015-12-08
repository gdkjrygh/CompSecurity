// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            ac, z, aa

final class ab
{

    final z a;
    private final ac b = new ac(this);
    private final Set c = new HashSet();
    private int d;
    private boolean e;
    private IBinder f;
    private final aa g;
    private ComponentName h;

    public ab(z z1, aa aa1)
    {
        a = z1;
        super();
        g = aa1;
        d = 2;
    }

    static int a(ab ab1, int i)
    {
        ab1.d = i;
        return i;
    }

    static ComponentName a(ab ab1, ComponentName componentname)
    {
        ab1.h = componentname;
        return componentname;
    }

    static IBinder a(ab ab1, IBinder ibinder)
    {
        ab1.f = ibinder;
        return ibinder;
    }

    static aa a(ab ab1)
    {
        return ab1.g;
    }

    static Set b(ab ab1)
    {
        return ab1.c;
    }

    public void a(ServiceConnection serviceconnection, String s)
    {
        z.c(a).a(com.google.android.gms.common.internal.z.b(a), serviceconnection, s, g.a());
        c.add(serviceconnection);
    }

    public void a(String s)
    {
        e = z.c(a).a(com.google.android.gms.common.internal.z.b(a), s, g.a(), b, 129);
        if (e)
        {
            d = 3;
            return;
        }
        try
        {
            z.c(a).a(com.google.android.gms.common.internal.z.b(a), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public boolean a()
    {
        return e;
    }

    public boolean a(ServiceConnection serviceconnection)
    {
        return c.contains(serviceconnection);
    }

    public int b()
    {
        return d;
    }

    public void b(ServiceConnection serviceconnection, String s)
    {
        z.c(a).b(com.google.android.gms.common.internal.z.b(a), serviceconnection);
        c.remove(serviceconnection);
    }

    public void b(String s)
    {
        z.c(a).a(com.google.android.gms.common.internal.z.b(a), b);
        e = false;
        d = 2;
    }

    public boolean c()
    {
        return c.isEmpty();
    }

    public IBinder d()
    {
        return f;
    }

    public ComponentName e()
    {
        return h;
    }
}
