// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ResolveAccountResponse;

// Referenced classes of package com.google.android.gms.common.api:
//            bd, ai, am, bh

class an extends bd
{

    final ai a;
    final ResolveAccountResponse b;
    final am c;

    an(am am, bh bh, ai ai1, ResolveAccountResponse resolveaccountresponse)
    {
        c = am;
        a = ai1;
        b = resolveaccountresponse;
        super(bh);
    }

    public void a()
    {
        ai.a(a, b);
    }
}
