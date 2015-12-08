// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.u;

// Referenced classes of package com.google.android.gms.common.internal:
//            n, m

public final class v extends n
{

    final m e;

    public v(m m1, int i, Bundle bundle)
    {
        e = m1;
        super(m1, i, bundle);
    }

    protected void a(ConnectionResult connectionresult)
    {
        m.a(e).b(connectionresult);
        e.a(connectionresult);
    }

    protected boolean a()
    {
        m.a(e).b(ConnectionResult.a);
        return true;
    }
}
