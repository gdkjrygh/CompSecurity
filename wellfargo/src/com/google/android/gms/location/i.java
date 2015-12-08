// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.location.internal.aa;
import com.google.android.gms.location.internal.d;
import com.google.android.gms.location.internal.h;
import com.google.android.gms.location.internal.v;

// Referenced classes of package com.google.android.gms.location:
//            j, d, e, l

public class i
{

    public static final a a;
    public static final com.google.android.gms.location.d b = new d();
    public static final e c = new h();
    public static final l d = new aa();
    private static final com.google.android.gms.common.api.i e;
    private static final g f;

    static com.google.android.gms.common.api.i a()
    {
        return e;
    }

    public static v a(n n1)
    {
        boolean flag1 = true;
        boolean flag;
        if (n1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.b(flag, "GoogleApiClient parameter is required.");
        n1 = (v)n1.a(e);
        if (n1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        au.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return n1;
    }

    static 
    {
        e = new com.google.android.gms.common.api.i();
        f = new j();
        a = new a("LocationServices.API", f, e);
    }
}
