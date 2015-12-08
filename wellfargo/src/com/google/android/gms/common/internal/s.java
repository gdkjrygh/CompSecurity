// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.u;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

public class s
    implements u
{

    final m a;

    public s(m m1)
    {
        a = m1;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        if (connectionresult.b())
        {
            a.a(null, m.d(a));
        } else
        if (m.e(a) != null)
        {
            m.e(a).a(connectionresult);
            return;
        }
    }

    public void b(ConnectionResult connectionresult)
    {
        throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
    }
}
