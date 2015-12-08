// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.s;

// Referenced classes of package com.google.android.gms.signin.internal:
//            o, i

class q
    implements Runnable
{

    final String a;
    final String b;
    final i c;
    final o d;

    q(o o1, String s1, String s2, i j)
    {
        d = o1;
        a = s1;
        b = s2;
        c = j;
        super();
    }

    public void run()
    {
        try
        {
            boolean flag = o.a(d).a(a, b);
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
