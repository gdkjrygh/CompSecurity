// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            n, m

public final class u extends n
{

    final m e;

    public u(m m1)
    {
        e = m1;
        super(m1, 0, null);
    }

    protected void a(ConnectionResult connectionresult)
    {
        m.a(e).a(connectionresult);
        e.a(connectionresult);
    }

    protected boolean a()
    {
        m.a(e).a(ConnectionResult.a);
        return true;
    }
}
