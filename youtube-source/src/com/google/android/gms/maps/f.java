// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.dynamic.o;
import com.google.android.gms.maps.a.bn;
import com.google.android.gms.maps.a.z;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            e, GoogleMapOptions

final class f extends b
{

    protected o a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;

    f(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        b = viewgroup;
        c = context;
        d = googlemapoptions;
    }

    protected final void a(o o1)
    {
        a = o1;
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        o1 = bn.a(c).a(n.a(c), d);
        a.a(new e(b, o1));
        return;
        o1;
        throw new RuntimeRemoteException(o1);
        o1;
    }
}
