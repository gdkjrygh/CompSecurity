// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcp, zzck, zzcj

public class zzcq extends NativeContentAd
{

    private final zzcp zzwA;
    private final zzck zzwB;
    private final List zzwy;

    public zzcq(zzcp zzcp1)
    {
        zzwy = new ArrayList();
        zzwA = zzcp1;
        zzcp1 = zzwA.getImages().iterator();
_L2:
        zzcj zzcj;
        do
        {
            if (!zzcp1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzcj = zzd(zzcp1.next());
        } while (zzcj == null);
        zzwy.add(new zzck(zzcj));
        if (true) goto _L2; else goto _L1
_L1:
        zzcp1;
        zzb.zzb("Failed to get image.", zzcp1);
        zzcp1 = zzwA.zzdw();
        if (zzcp1 == null) goto _L4; else goto _L3
_L3:
        zzcp1 = new zzck(zzcp1);
_L6:
        zzwB = zzcp1;
        return;
        zzcp1;
        zzb.zzb("Failed to get icon.", zzcp1);
_L4:
        zzcp1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence getAdvertiser()
    {
        String s;
        try
        {
            s = zzwA.getAdvertiser();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get attribution.", remoteexception);
            return null;
        }
        return s;
    }

    public CharSequence getBody()
    {
        String s;
        try
        {
            s = zzwA.getBody();
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
            s = zzwA.getCallToAction();
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
            bundle = zzwA.getExtras();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Failed to get extras", remoteexception);
            return null;
        }
        return bundle;
    }

    public CharSequence getHeadline()
    {
        String s;
        try
        {
            s = zzwA.getHeadline();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to get headline.", remoteexception);
            return null;
        }
        return s;
    }

    public List getImages()
    {
        return zzwy;
    }

    public com.google.android.gms.ads.formats.NativeAd.Image getLogo()
    {
        return zzwB;
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
            zzd1 = zzwA.zzdt();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return zzd1;
    }
}
