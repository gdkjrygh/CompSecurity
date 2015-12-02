// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

public final class nn extends nl
    implements ss, st
{

    protected no a;
    private final nj b;
    private final Object c = new Object();

    public nn(Context context, AdRequestInfoParcel adrequestinfoparcel, nj nj1)
    {
        super(adrequestinfoparcel, nj1);
        b = nj1;
        a = new no(context, this, this, adrequestinfoparcel.k.d);
        h();
    }

    private void h()
    {
        a.d();
    }

    public final void a(int i)
    {
        of.a("Disconnected from remote ad request service.");
    }

    public final void a(Bundle bundle)
    {
        e();
    }

    public final void a(ConnectionResult connectionresult)
    {
        b.a(new AdResponseParcel(0));
    }

    public final void c()
    {
        synchronized (c)
        {
            if (a.f() || a.h())
            {
                a.e();
            }
            Binder.flushPendingCommands();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ns d()
    {
        obj;
        JVM INSTR monitorenter ;
        ns ns;
        synchronized (c)
        {
            ns = a.c();
        }
        return ns;
_L2:
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
