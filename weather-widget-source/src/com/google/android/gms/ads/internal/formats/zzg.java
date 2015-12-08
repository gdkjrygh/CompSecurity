// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzan;
import com.google.android.gms.internal.zzek;
import com.google.android.gms.internal.zzel;
import com.google.android.gms.internal.zzip;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zzh, zzb

public class zzg extends zzh
{

    private Object zzpc;
    private zzek zzvZ;
    private zzel zzwa;
    private final zzn zzwb;
    private zzh zzwc;
    private boolean zzwd;

    private zzg(Context context, zzn zzn1, zzan zzan)
    {
        super(context, zzn1, null, zzan, null, null, null);
        zzwd = false;
        zzpc = new Object();
        zzwb = zzn1;
    }

    public zzg(Context context, zzn zzn1, zzan zzan, zzek zzek1)
    {
        this(context, zzn1, zzan);
        zzvZ = zzek1;
    }

    public zzg(Context context, zzn zzn1, zzan zzan, zzel zzel1)
    {
        this(context, zzn1, zzan);
        zzwa = zzel1;
    }

    public void recordImpression()
    {
        zzx.zzch("recordImpression must be called on the main UI thread.");
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzl(true);
        if (zzwc == null) goto _L2; else goto _L1
_L1:
        zzwc.recordImpression();
_L5:
        zzwb.recordImpression();
        return;
_L2:
        if (zzvZ == null || zzvZ.getOverrideClickHandling()) goto _L4; else goto _L3
_L3:
        zzvZ.recordImpression();
          goto _L5
        Object obj1;
        obj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call recordImpression", ((Throwable) (obj1)));
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L4:
        if (zzwa == null || zzwa.getOverrideClickHandling()) goto _L5; else goto _L6
_L6:
        zzwa.recordImpression();
          goto _L5
    }

    public com.google.android.gms.ads.internal.formats.zzb zza(android.view.View.OnClickListener onclicklistener)
    {
        return null;
    }

    public void zzb(View view, Map map)
    {
        zzx.zzch("performClick must be called on the main UI thread.");
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzwc == null) goto _L2; else goto _L1
_L1:
        zzwc.zzb(view, map);
_L3:
        zzwb.onAdClicked();
        return;
_L2:
        if (zzvZ != null && !zzvZ.getOverrideClickHandling())
        {
            zzvZ.zzc(zze.zzx(view));
        }
        if (zzwa != null && !zzwa.getOverrideClickHandling())
        {
            zzvZ.zzc(zze.zzx(view));
        }
          goto _L3
        view;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call performClick", view);
          goto _L3
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public void zzb(zzh zzh1)
    {
        synchronized (zzpc)
        {
            zzwc = zzh1;
        }
        return;
        zzh1;
        obj;
        JVM INSTR monitorexit ;
        throw zzh1;
    }

    public boolean zzdx()
    {
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzwd;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public zzip zzdy()
    {
        return null;
    }

    public void zzh(View view)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzwd = true;
        if (zzvZ == null) goto _L2; else goto _L1
_L1:
        zzvZ.zzd(zze.zzx(view));
_L4:
        zzwd = false;
        return;
_L2:
        if (zzwa == null) goto _L4; else goto _L3
_L3:
        zzwa.zzd(zze.zzx(view));
          goto _L4
        view;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to call prepareAd", view);
          goto _L4
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }
}
