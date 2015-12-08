// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.ap;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            ai, an, ax

class am extends ap
{

    private final WeakReference a;

    am(ai ai1)
    {
        a = new WeakReference(ai1);
    }

    public void a(ResolveAccountResponse resolveaccountresponse)
    {
        ai ai1 = (ai)a.get();
        if (ai1 == null)
        {
            return;
        } else
        {
            ai.d(ai1).a(new an(this, ai1, ai1, resolveaccountresponse));
            return;
        }
    }
}
