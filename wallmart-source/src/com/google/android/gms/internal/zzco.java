// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcn, zzck, zzcj

public class zzco extends NativeAppInstallAd
{

    private final zzcn zzwx;
    private final List zzwy;
    private final zzck zzwz;

    public zzco(zzcn zzcn1)
    {
        zzwy = new ArrayList();
        zzwx = zzcn1;
        zzcn1 = zzwx.getImages().iterator();
_L2:
        zzcj zzcj;
        do
        {
            if (!zzcn1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzcj = zzd(zzcn1.next());
        } while (zzcj == null);
        zzwy.add(new zzck(zzcj));
        if (true) goto _L2; else goto _L1
_L1:
        zzcn1;
        zzb.zzb("Failed to get image.", zzcn1);
        zzcn1 = zzwx.zzds();
        if (zzcn1 == null) goto _L4; else goto _L3
_L3:
        zzcn1 = new zzck(zzcn1);
_L6:
        zzwz = zzcn1;
        return;
        zzcn1;
        zzb.zzb("Failed to get icon.", zzcn1);
_L4:
        zzcn1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence getBody()
    {
        String s;
        try
        {
            s = zzwx.getBody();
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
            s = zzwx.getCallToAction();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get call to action.", remoteexception);
            return null;
        }
        return s;
    }

    public Bundle getExtras()
    {
        Bundle bundle;
        try
        {
            bundle = zzwx.getExtras();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get extras", remoteexception);
            return null;
        }
        return bundle;
    }

    public CharSequence getHeadline()
    {
        String s;
        try
        {
            s = zzwx.getHeadline();
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
        return zzwz;
    }

    public List getImages()
    {
        return zzwy;
    }

    public CharSequence getPrice()
    {
        String s;
        try
        {
            s = zzwx.getPrice();
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
            d = zzwx.getStarRating();
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
            s = zzwx.getStore();
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
        return zzdt();
    }

    zzcj zzd(Object obj)
    {
        if (obj instanceof IBinder)
        {
            return zzcj.zza.zzt((IBinder)obj);
        } else
        {
            return null;
        }
    }

    protected zzd zzdt()
    {
        zzd zzd1;
        try
        {
            zzd1 = zzwx.zzdt();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return zzd1;
    }
}
