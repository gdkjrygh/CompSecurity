// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            ai, al, ax

class ak extends b
{

    private final WeakReference a;

    ak(ai ai1)
    {
        a = new WeakReference(ai1);
    }

    public void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        authaccountresult = (ai)a.get();
        if (authaccountresult == null)
        {
            return;
        } else
        {
            ai.d(authaccountresult).a(new al(this, authaccountresult, authaccountresult, connectionresult));
            return;
        }
    }
}
