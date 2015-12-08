// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrx;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zzd, zzb, zza, PlayLoggerContext, 
//            LogEvent

public class zzf extends zzj
{

    private final String zzOZ;
    private final zzd zzaKZ;
    private final com.google.android.gms.playlog.internal.zzb zzaLa = new com.google.android.gms.playlog.internal.zzb();
    private boolean zzaLb;
    private final Object zzpc = new Object();

    public zzf(Context context, Looper looper, zzd zzd1, com.google.android.gms.common.internal.zzf zzf1)
    {
        super(context, looper, 24, zzf1, zzd1, zzd1);
        zzOZ = context.getPackageName();
        zzaKZ = (zzd)zzx.zzv(zzd1);
        zzaKZ.zza(this);
        zzaLb = true;
    }

    private void zzc(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzaLa.zza(playloggercontext, logevent);
    }

    private void zzd(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        try
        {
            zzyE();
            ((zza)zzoA()).zza(zzOZ, playloggercontext, logevent);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
            zzc(playloggercontext, logevent);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        }
        zzc(playloggercontext, logevent);
    }

    private void zzyE()
    {
        Object obj;
        ArrayList arraylist;
        zzb.zza zza1;
        Iterator iterator;
        boolean flag;
        if (!zzaLb)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzb.zzY(flag);
        if (zzaLa.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = zzaLa.zzyC().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        zza1 = (zzb.zza)iterator.next();
        if (zza1.zzaKO == null) goto _L4; else goto _L3
_L3:
        ((zza)zzoA()).zza(zzOZ, zza1.zzaKM, zzrx.zzf(zza1.zzaKO));
          goto _L5
_L2:
        return;
_L4:
label0:
        {
            if (!zza1.zzaKM.equals(obj))
            {
                break label0;
            }
            arraylist.add(zza1.zzaKN);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((zza)zzoA()).zza(zzOZ, ((PlayLoggerContext) (obj)), arraylist);
            arraylist.clear();
        }
        obj = zza1.zzaKM;
        arraylist.add(zza1.zzaKN);
          goto _L5
        try
        {
            if (!arraylist.isEmpty())
            {
                ((zza)zzoA()).zza(zzOZ, ((PlayLoggerContext) (obj)), arraylist);
            }
            zzaLa.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
          goto _L2
    }

    public void start()
    {
label0:
        {
            synchronized (zzpc)
            {
                if (!isConnecting() && !isConnected())
                {
                    break label0;
                }
            }
            return;
        }
        zzaKZ.zzan(true);
        zzox();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        synchronized (zzpc)
        {
            zzaKZ.zzan(false);
            disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected IInterface zzV(IBinder ibinder)
    {
        return zzdu(ibinder);
    }

    void zzao(boolean flag)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = zzaLb;
        zzaLb = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!zzaLb)
        {
            zzyE();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzb(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaLb)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        zzc(playloggercontext, logevent);
_L2:
        return;
        zzd(playloggercontext, logevent);
        if (true) goto _L2; else goto _L1
_L1:
        playloggercontext;
        obj;
        JVM INSTR monitorexit ;
        throw playloggercontext;
    }

    protected zza zzdu(IBinder ibinder)
    {
        return zza.zza.zzdt(ibinder);
    }

    protected String zzfA()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    protected String zzfB()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }
}
