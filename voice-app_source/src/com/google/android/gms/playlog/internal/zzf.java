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
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzrn;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zzd, zzb, zza, PlayLoggerContext, 
//            LogEvent

public class zzf extends zzi
{

    private final String zzMZ;
    private final zzd zzaGW;
    private final com.google.android.gms.playlog.internal.zzb zzaGX = new com.google.android.gms.playlog.internal.zzb();
    private boolean zzaGY;
    private final Object zzqt = new Object();

    public zzf(Context context, Looper looper, zzd zzd1, zze zze)
    {
        super(context, looper, 24, zzd1, zzd1, zze);
        zzMZ = context.getPackageName();
        zzaGW = (zzd)zzu.zzu(zzd1);
        zzaGW.zza(this);
        zzaGY = true;
    }

    private void zzc(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzaGX.zza(playloggercontext, logevent);
    }

    private void zzd(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        try
        {
            zzxp();
            ((zza)zznM()).zza(zzMZ, playloggercontext, logevent);
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

    private void zzxp()
    {
        Object obj;
        ArrayList arraylist;
        zzb.zza zza1;
        Iterator iterator;
        boolean flag;
        if (!zzaGY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzb.zzU(flag);
        if (zzaGX.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = null;
        arraylist = new ArrayList();
        iterator = zzaGX.zzxn().iterator();
_L5:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        zza1 = (zzb.zza)iterator.next();
        if (zza1.zzaGM == null) goto _L4; else goto _L3
_L3:
        ((zza)zznM()).zza(zzMZ, zza1.zzaGK, zzrn.zzf(zza1.zzaGM));
          goto _L5
_L2:
        return;
_L4:
label0:
        {
            if (!zza1.zzaGK.equals(obj))
            {
                break label0;
            }
            arraylist.add(zza1.zzaGL);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((zza)zznM()).zza(zzMZ, ((PlayLoggerContext) (obj)), arraylist);
            arraylist.clear();
        }
        obj = zza1.zzaGK;
        arraylist.add(zza1.zzaGL);
          goto _L5
        try
        {
            if (!arraylist.isEmpty())
            {
                ((zza)zznM()).zza(zzMZ, ((PlayLoggerContext) (obj)), arraylist);
            }
            zzaGX.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
        }
          goto _L2
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    public void start()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (!isConnecting() && !isConnected())
                {
                    break label0;
                }
            }
            return;
        }
        zzaGW.zzaj(true);
        zznJ();
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
        synchronized (zzqt)
        {
            zzaGW.zzaj(false);
            disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzdq(ibinder);
    }

    void zzak(boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = zzaGY;
        zzaGY = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!zzaGY)
        {
            zzxp();
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
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaGY)
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

    protected zza zzdq(IBinder ibinder)
    {
        return zza.zza.zzdp(ibinder);
    }
}
