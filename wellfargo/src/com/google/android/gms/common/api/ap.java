// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.au;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            u, ai, ax, a

class ap
    implements u
{

    private final WeakReference a;
    private final a b;
    private final int c;

    public ap(ai ai1, a a1, int i)
    {
        a = new WeakReference(ai1);
        b = a1;
        c = i;
    }

    public void a(ConnectionResult connectionresult)
    {
        ai ai1;
        boolean flag = false;
        ai1 = (ai)a.get();
        if (ai1 == null)
        {
            return;
        }
        if (Looper.myLooper() == ai.d(ai1).a())
        {
            flag = true;
        }
        au.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        ai.c(ai1).lock();
        boolean flag1 = ai.a(ai1, 0);
        if (!flag1)
        {
            ai.c(ai1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            ai.a(ai1, connectionresult, b, c);
        }
        if (ai.k(ai1))
        {
            ai.l(ai1);
        }
        ai.c(ai1).unlock();
        return;
        connectionresult;
        ai.c(ai1).unlock();
        throw connectionresult;
    }

    public void b(ConnectionResult connectionresult)
    {
        ai ai1;
        boolean flag = true;
        ai1 = (ai)a.get();
        if (ai1 == null)
        {
            return;
        }
        if (Looper.myLooper() != ai.d(ai1).a())
        {
            flag = false;
        }
        au.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        ai.c(ai1).lock();
        flag = ai.a(ai1, 1);
        if (!flag)
        {
            ai.c(ai1).unlock();
            return;
        }
        if (!connectionresult.b())
        {
            ai.a(ai1, connectionresult, b, c);
        }
        if (ai.k(ai1))
        {
            ai.m(ai1);
        }
        ai.c(ai1).unlock();
        return;
        connectionresult;
        ai.c(ai1).unlock();
        throw connectionresult;
    }
}
