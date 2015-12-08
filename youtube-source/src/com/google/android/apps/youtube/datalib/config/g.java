// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.config;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.config:
//            a, e, InnerTubeApiSelection, ApiaryHostSelection, 
//            h

public final class g
    implements a
{

    private final SharedPreferences b;
    private final SparseArray c;
    private final e d;

    public g(e e1, SharedPreferences sharedpreferences, SparseArray sparsearray)
    {
        d = (e)com.google.android.apps.youtube.common.fromguava.c.a(e1);
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (SparseArray)com.google.android.apps.youtube.common.fromguava.c.a(sparsearray);
    }

    public final boolean a()
    {
        return d.a();
    }

    public final boolean b()
    {
        return d.b();
    }

    public final String c()
    {
        return InnerTubeApiSelection.getInnerTubeApiSelection(b).getEncodedPath();
    }

    public final String d()
    {
        return "deviceregistration/v1/devices";
    }

    public final String e()
    {
        return "plus/v1whitelisted";
    }

    public final Uri f()
    {
        return ApiaryHostSelection.getApiaryHostSelection(b).getApiaryBaseUri();
    }

    public final byte[] g()
    {
        ApiaryHostSelection apiaryhostselection = ApiaryHostSelection.getApiaryHostSelection(b);
        switch (h.a[apiaryhostselection.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unhandled case: ")).append(apiaryhostselection).toString());

        case 1: // '\001'
            return (byte[])c.get(0);

        case 2: // '\002'
            return (byte[])c.get(1);
        }
    }
}
