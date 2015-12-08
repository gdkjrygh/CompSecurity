// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.maps.a.bn;
import com.google.android.gms.maps.a.z;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            g, h

final class i extends b
{

    protected o a;
    private final Fragment b;
    private Activity c;

    i(Fragment fragment)
    {
        b = fragment;
    }

    static void a(i j, Activity activity)
    {
        j.c = activity;
        j.g();
    }

    private void g()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        com.google.android.gms.maps.g.a(c);
        com.google.android.gms.maps.a.j j = bn.a(c).b(n.a(c));
        a.a(new h(b, j));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    protected final void a(o o1)
    {
        a = o1;
        g();
    }
}
