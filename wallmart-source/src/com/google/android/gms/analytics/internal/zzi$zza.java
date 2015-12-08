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
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi, zzr, zzac

protected class zzMa
    implements ServiceConnection
{

    final zzi zzMa;
    private volatile zzac zzMb;
    private volatile boolean zzMc;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzx.zzch("AnalyticsServiceConnection.onServiceConnected");
        this;
        JVM INSTR monitorenter ;
        if (ibinder != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzMa.zzbc("Service connected with null binder");
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
        ibinder = .zzae(ibinder);
        componentname = ibinder;
        zzMa.zzaY("Bound to IAnalyticsService interface");
        componentname = ibinder;
_L4:
        {
            if (componentname != null)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                zzb.zzpD().zza(zzMa.getContext(), zzi.zza(zzMa));
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
        zzMa.zze("Got binder with a wrong descriptor", s);
        componentname = obj;
        continue; /* Loop/switch isn't completed */
        ibinder;
        zzMa.zzbc("Service connect failed to get IAnalyticsService");
        if (true) goto _L4; else goto _L3
        notifyAll();
        throw componentname;
_L3:
label0:
        {
            if (zzMc)
            {
                break label0;
            }
            zzMa.zzbb("onServiceConnected received after the timeout limit");
            zzMa.zzig().zzf(new Runnable(componentname) {

                final zzac zzMd;
                final zzi.zza zzMe;

                public void run()
                {
                    if (!zzMe.zzMa.isConnected())
                    {
                        zzMe.zzMa.zzaZ("Connected to service after a timeout");
                        zzi.zza(zzMe.zzMa, zzMd);
                    }
                }

            
            {
                zzMe = zzi.zza.this;
                zzMd = zzac;
                super();
            }
            });
        }
        break MISSING_BLOCK_LABEL_101;
        zzMb = componentname;
        break MISSING_BLOCK_LABEL_101;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzx.zzch("AnalyticsServiceConnection.onServiceDisconnected");
        zzMa.zzig().zzf(new Runnable(componentname) {

            final zzi.zza zzMe;
            final ComponentName zzMf;

            public void run()
            {
                zzi.zza(zzMe.zzMa, zzMf);
            }

            
            {
                zzMe = zzi.zza.this;
                zzMf = componentname;
                super();
            }
        });
    }

    public zzac zziD()
    {
        Object obj;
        Context context;
        zzMa.zzic();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = zzMa.getContext();
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        zzb zzb1 = zzb.zzpD();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        zzMb = null;
        zzMc = true;
        flag = zzb1.zza(context, ((Intent) (obj)), zzi.zza(zzMa), 129);
        zzMa.zza("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        zzMc = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(zzMa.zzif().zzjG());
_L1:
        zzMc = false;
        obj = zzMb;
        zzMb = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        zzMa.zzbc("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((zzac) (obj));
        Object obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzMa.zzbb("Wait for service connect was interrupted");
          goto _L1
    }

    protected _cls2.zzMf(zzi zzi1)
    {
        zzMa = zzi1;
        super();
    }
}
