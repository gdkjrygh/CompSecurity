// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzkk;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzh, zzq, zzab

protected class zzGe
    implements ServiceConnection
{

    final zzh zzGe;
    private volatile zzab zzGf;
    private volatile boolean zzGg;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzv.zzbI("AnalyticsServiceConnection.onServiceConnected");
        this;
        JVM INSTR monitorenter ;
        if (ibinder != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzGe.zzaJ("Service connected with null binder");
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        componentname = obj1;
        String s = ibinder.getInterfaceDescriptor();
        componentname = obj1;
        if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(s)) goto _L2; else goto _L1
_L1:
        componentname = obj1;
        ibinder = .zzG(ibinder);
        componentname = ibinder;
        zzGe.zzaF("Bound to IAnalyticsService interface");
        componentname = ibinder;
_L4:
        {
            if (componentname != null)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                zzb.zzna().zza(zzGe.getContext(), zzh.zza(zzGe));
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            finally { }
        }
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        componentname;
        this;
        JVM INSTR monitorexit ;
        throw componentname;
_L2:
        componentname = obj1;
        zzGe.zze("Got binder with a wrong descriptor", s);
        componentname = obj;
        continue; /* Loop/switch isn't completed */
        ibinder;
        zzGe.zzaJ("Service connect failed to get IAnalyticsService");
        if (true) goto _L4; else goto _L3
        notifyAll();
        throw componentname;
_L3:
label0:
        {
            if (zzGg)
            {
                break label0;
            }
            zzGe.zzaI("onServiceConnected received after the timeout limit");
            zzGe.zzgJ().zze(new Runnable(componentname) {

                final zzab zzGh;
                final zzh.zza zzGi;

                public void run()
                {
                    if (!zzGi.zzGe.isConnected())
                    {
                        zzGi.zzGe.zzaG("Connected to service after a timeout");
                        zzh.zza(zzGi.zzGe, zzGh);
                    }
                }

            
            {
                zzGi = zzh.zza.this;
                zzGh = zzab;
                super();
            }
            });
        }
        break MISSING_BLOCK_LABEL_101;
        zzGf = componentname;
        break MISSING_BLOCK_LABEL_101;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzv.zzbI("AnalyticsServiceConnection.onServiceDisconnected");
        zzGe.zzgJ().zze(new Runnable(componentname) {

            final zzh.zza zzGi;
            final ComponentName zzGj;

            public void run()
            {
                zzh.zza(zzGi.zzGe, zzGj);
            }

            
            {
                zzGi = zzh.zza.this;
                zzGj = componentname;
                super();
            }
        });
    }

    public zzab zzhi()
    {
        Object obj;
        Context context;
        zzGe.zzgF();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = zzGe.getContext();
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        zzb zzb1 = zzb.zzna();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        zzGf = null;
        zzGg = true;
        flag = zzb1.zza(context, ((Intent) (obj)), zzh.zza(zzGe), 129);
        zzGe.zza("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        zzGg = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(zzGe.zzgI().zzik());
_L1:
        zzGg = false;
        obj = zzGf;
        zzGf = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        zzGe.zzaJ("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((zzab) (obj));
        Object obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzGe.zzaI("Wait for service connect was interrupted");
          goto _L1
    }

    protected _cls2.zzGj(zzh zzh1)
    {
        zzGe = zzh1;
        super();
    }
}
