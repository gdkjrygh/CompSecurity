// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.b;
import com.google.ads.mediation.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            au, do, ba, av

public final class as extends au
{

    private Map a;

    public as()
    {
    }

    private av b(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s, false, com/google/android/gms/internal/as.getClassLoader());
            if (!com/google/ads/mediation/b.isAssignableFrom(((Class) (obj))))
            {
                com.google.android.gms.internal.do.d((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(".").toString());
                throw new RemoteException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(((Throwable) (obj)).getMessage()).toString());
            throw new RemoteException();
        }
        obj = (b)((Class) (obj)).newInstance();
        obj = new ba(((b) (obj)), (f)a.get(((b) (obj)).a()));
        return ((av) (obj));
    }

    public final av a(String s)
    {
        return b(s);
    }
}
