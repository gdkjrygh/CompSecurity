// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.signin.internal:
//            o, CheckServerAuthResult, i

class p
    implements Runnable
{

    final List a;
    final String b;
    final i c;
    final o d;

    p(o o1, List list, String s1, i j)
    {
        d = o1;
        a = list;
        b = s1;
        c = j;
        super();
    }

    public void run()
    {
        try
        {
            Object obj = o.a(d);
            java.util.Set set = Collections.unmodifiableSet(new HashSet(a));
            obj = ((s) (obj)).a(b, set);
            obj = new CheckServerAuthResult(((t) (obj)).a(), ((t) (obj)).b());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
