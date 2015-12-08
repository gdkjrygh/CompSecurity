// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzco, zzcl, zzck

public class zzcp extends NativeAppInstallAd
{

    private final zzco zzvK;
    private final List zzvL;
    private final zzcl zzvM;

    public zzcp(zzco zzco1)
    {
        zzvL = new ArrayList();
        zzvK = zzco1;
        zzco1 = zzvK.getImages().iterator();
_L2:
        zzck zzck;
        do
        {
            if (!zzco1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzck = zzd(zzco1.next());
        } while (zzck == null);
        zzvL.add(new zzcl(zzck));
        if (true) goto _L2; else goto _L1
_L1:
        zzco1;
        zzb.zzb("Failed to get image.", zzco1);
        zzco1 = zzvK.zzdy();
        if (zzco1 == null) goto _L4; else goto _L3
_L3:
        zzco1 = new zzcl(zzco1);
_L6:
        zzvM = zzco1;
        return;
        zzco1;
        zzb.zzb("Failed to get icon.", zzco1);
_L4:
        zzco1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence getBody()
    {
        String s;
        try
        {
            s = zzvK.getBody();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get body.", remoteexception);
            return null;
        }
        return s;
    }

    public CharSequence getCallToAction()
    {
        String s;
        try
        {
            s = zzvK.zzdz();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public CharSequence getHeadline()
    {
        String s;
        try
        {
            s = zzvK.zzdx();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public com.google.android.gms.ads.formats.NativeAd.Image getIcon()
    {
        return zzvM;
    }

    public List getImages()
    {
        return zzvL;
    }

    public CharSequence getPrice()
    {
        String s;
        try
        {
            s = zzvK.zzdC();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get price.", remoteexception);
            return null;
        }
        return s;
    }

    public Double getStarRating()
    {
        double d;
        try
        {
            d = zzvK.zzdA();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get star rating.", remoteexception);
            return null;
        }
        if (d == -1D)
        {
            return null;
        } else
        {
            return Double.valueOf(d);
        }
    }

    public CharSequence getStore()
    {
        String s;
        try
        {
            s = zzvK.zzdB();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get store", remoteexception);
            return null;
        }
        return s;
    }

    protected Object zzaH()
    {
        return zzdD();
    }

    zzck zzd(Object obj)
    {
        if (obj instanceof IBinder)
        {
            return zzck.zza.zzt((IBinder)obj);
        } else
        {
            return null;
        }
    }

    protected zzd zzdD()
    {
        zzd zzd1;
        try
        {
            zzd1 = zzvK.zzdD();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return zzd1;
    }
}
