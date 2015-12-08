// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzes, zzen, zzei

public final class zzeg extends zzeh.zza
{

    private Map zzyU;

    public zzeg()
    {
    }

    private zzei zzad(String s)
        throws RemoteException
    {
        try
        {
            Object obj = Class.forName(s, false, com/google/android/gms/internal/zzeg.getClassLoader());
            if (com/google/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                obj = (MediationAdapter)((Class) (obj)).newInstance();
                return new zzes(((MediationAdapter) (obj)), (NetworkExtras)zzyU.get(((MediationAdapter) (obj)).getAdditionalParametersType()));
            }
            if (com/google/android/gms/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                return new zzen((com.google.android.gms.ads.mediation.MediationAdapter)((Class) (obj)).newInstance());
            } else
            {
                zzb.zzaE((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            zzb.zzaE((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public zzei zzab(String s)
        throws RemoteException
    {
        return zzad(s);
    }

    public boolean zzac(String s)
        throws RemoteException
    {
        boolean flag;
        try
        {
            flag = com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(s, false, com/google/android/gms/internal/zzeg.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            zzb.zzaE((new StringBuilder()).append("Could not load custom event implementation class: ").append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }

    public void zze(Map map)
    {
        zzyU = map;
    }
}
