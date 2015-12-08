// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.a.a;
import com.google.ads.mediation.b;
import com.google.ads.mediation.c;
import com.google.ads.mediation.d;
import com.google.ads.mediation.f;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            aw, do, bb, aa, 
//            bc, ac, ax

public final class ba extends aw
{

    private final b a;
    private final f b;

    public ba(b b1, f f)
    {
        a = b1;
        b = f;
    }

    private MediationServerParameters a(String s, int i, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            JSONObject jsonobject = new JSONObject(s);
            s = new HashMap(jsonobject.length());
            String s2;
            for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); s.put(s2, jsonobject.getString(s2)))
            {
                s2 = (String)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.internal.do.a("Could not get MediationServerParameters.", s);
            throw new RemoteException();
        }
_L4:
        Class class1 = a.b();
        MediationServerParameters mediationserverparameters;
        mediationserverparameters = null;
        if (class1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        mediationserverparameters = (MediationServerParameters)class1.newInstance();
        mediationserverparameters.a(s);
        if (!(mediationserverparameters instanceof a))
        {
            break; /* Loop/switch isn't completed */
        }
        s = (a)mediationserverparameters;
        s.b = s1;
        s.c = i;
        return mediationserverparameters;
_L2:
        s = new HashMap(0);
        if (true) goto _L4; else goto _L3
_L3:
        return mediationserverparameters;
    }

    public final k a()
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.internal.do.d((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        k k;
        try
        {
            k = n.a(((c)a).c());
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.do.a("Could not get banner view from adapter.", throwable);
            throw new RemoteException();
        }
        return k;
    }

    public final void a(k k, aa aa1, String s, ax ax)
    {
        a(k, aa1, s, null, ax);
    }

    public final void a(k k, aa aa1, String s, String s1, ax ax)
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.internal.do.d((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.do.a("Requesting interstitial ad from adapter.");
        try
        {
            b b1 = a;
            new bb(ax);
            n.a(k);
            a(s, aa1.tagForChildDirectedTreatment, s1);
            com.google.android.gms.internal.bc.a(aa1);
            k = b;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (k k)
        {
            com.google.android.gms.internal.do.a("Could not request interstitial ad from adapter.", k);
        }
        throw new RemoteException();
    }

    public final void a(k k, ac ac1, aa aa1, String s, ax ax)
    {
        a(k, ac1, aa1, s, null, ax);
    }

    public final void a(k k, ac ac1, aa aa1, String s, String s1, ax ax)
    {
        if (!(a instanceof c))
        {
            com.google.android.gms.internal.do.d((new StringBuilder("MediationAdapter is not a MediationBannerAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.do.a("Requesting banner ad from adapter.");
        try
        {
            b b1 = a;
            new bb(ax);
            n.a(k);
            a(s, aa1.tagForChildDirectedTreatment, s1);
            new com.google.ads.a(com.google.android.gms.ads.d.a(ac1.width, ac1.height, ac1.eJ));
            com.google.android.gms.internal.bc.a(aa1);
            k = b;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (k k)
        {
            com.google.android.gms.internal.do.a("Could not request banner ad from adapter.", k);
        }
        throw new RemoteException();
    }

    public final void b()
    {
        if (!(a instanceof d))
        {
            com.google.android.gms.internal.do.d((new StringBuilder("MediationAdapter is not a MediationInterstitialAdapter: ")).append(a.getClass().getCanonicalName()).toString());
            throw new RemoteException();
        }
        com.google.android.gms.internal.do.a("Showing interstitial from adapter.");
        try
        {
            b b1 = a;
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.do.a("Could not show interstitial from adapter.", throwable);
        }
        throw new RemoteException();
    }

    public final void c()
    {
        try
        {
            b b1 = a;
            return;
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.internal.do.a("Could not destroy adapter.", throwable);
        }
        throw new RemoteException();
    }
}
