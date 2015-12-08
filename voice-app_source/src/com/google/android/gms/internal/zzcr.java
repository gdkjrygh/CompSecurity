// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzcq, zzcl, zzck

public class zzcr extends NativeContentAd
{

    private final List zzvL;
    private final zzcq zzvN;
    private final zzcl zzvO;

    public zzcr(zzcq zzcq1)
    {
        zzvL = new ArrayList();
        zzvN = zzcq1;
        zzcq1 = zzvN.getImages().iterator();
_L2:
        zzck zzck;
        do
        {
            if (!zzcq1.hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            zzck = zzd(zzcq1.next());
        } while (zzck == null);
        zzvL.add(new zzcl(zzck));
        if (true) goto _L2; else goto _L1
_L1:
        zzcq1;
        zzb.zzb("Failed to get image.", zzcq1);
        zzcq1 = zzvN.zzdG();
        if (zzcq1 == null) goto _L4; else goto _L3
_L3:
        zzcq1 = new zzcl(zzcq1);
_L6:
        zzvO = zzcq1;
        return;
        zzcq1;
        zzb.zzb("Failed to get icon.", zzcq1);
_L4:
        zzcq1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public CharSequence getAdvertiser()
    {
        String s;
        try
        {
            s = zzvN.zzdH();
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
            s = zzvN.getBody();
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
            s = zzvN.zzdz();
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
            s = zzvN.zzdx();
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
        return zzvL;
    }

    public com.google.android.gms.ads.formats.NativeAd.Image getLogo()
    {
        return zzvO;
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
            zzd1 = zzvN.zzdD();
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzb("Failed to retrieve native ad engine.", remoteexception);
            return null;
        }
        return zzd1;
    }
}
