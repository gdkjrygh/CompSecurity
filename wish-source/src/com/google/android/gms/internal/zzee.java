// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzfl, zzfa, zzgd

public abstract class zzee extends zzfh
{
    protected static final class zza extends Exception
    {

        private final int zzyl;

        public int getErrorCode()
        {
            return zzyl;
        }

        public zza(String s, int i)
        {
            super(s);
            zzyl = i;
        }
    }


    protected final Context mContext;
    protected final zzgd zznp;
    protected final Object zzoe = new Object();
    protected final zzef.zza zzyf;
    protected final Object zzyg = new Object();
    protected final zzfa.zza zzyh;
    protected AdResponseParcel zzyi;

    protected zzee(Context context, zzfa.zza zza1, zzgd zzgd, zzef.zza zza2)
    {
        mContext = context;
        zzyh = zza1;
        zzyi = zza1.zzBz;
        zznp = zzgd;
        zzyf = zza2;
    }

    public void onStop()
    {
    }

    public void zzcX()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        int i;
        zzb.zzaj("AdRendererBackgroundTask started.");
        i = zzyh.errorCode;
        zzg(SystemClock.elapsedRealtime());
_L3:
        zzfa zzfa1 = zzt(i);
        zzfl.zzCr.post(new Runnable(zzfa1) {

            final zzee zzyj;
            final zzfa zzyk;

            public void run()
            {
                synchronized (zzyj.zzoe)
                {
                    zzyj.zzh(zzyk);
                }
                return;
                exception;
                obj2;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                zzyj = zzee.this;
                zzyk = zzfa1;
                super();
            }
        });
        return;
        Object obj1;
        obj1;
        i = ((zza) (obj1)).getErrorCode();
        if (i != 3 && i != -1) goto _L2; else goto _L1
_L1:
        zzb.zzal(((zza) (obj1)).getMessage());
_L4:
        if (zzyi != null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzyi = new AdResponseParcel(i);
_L5:
        zzfl.zzCr.post(new Runnable() {

            final zzee zzyj;

            public void run()
            {
                zzyj.onStop();
            }

            
            {
                zzyj = zzee.this;
                super();
            }
        });
          goto _L3
_L2:
        zzb.zzan(((zza) (obj1)).getMessage());
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzyi = new AdResponseParcel(i, zzyi.zzuG);
          goto _L5
    }

    protected abstract void zzg(long l)
        throws zza;

    protected void zzh(zzfa zzfa1)
    {
        zzyf.zza(zzfa1);
    }

    protected zzfa zzt(int i)
    {
        AdRequestInfoParcel adrequestinfoparcel = zzyh.zzBy;
        return new zzfa(adrequestinfoparcel.zzyW, zznp, zzyi.zzuC, i, zzyi.zzuD, zzyi.zzzv, zzyi.orientation, zzyi.zzuG, adrequestinfoparcel.zzyZ, zzyi.zzzt, null, null, null, null, null, zzyi.zzzu, zzyh.zzmP, zzyi.zzzs, zzyh.zzBv, zzyi.zzzx, zzyi.zzzy, zzyh.zzBs, null, adrequestinfoparcel.zzzm);
    }
}
