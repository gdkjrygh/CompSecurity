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
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzai, zze, zzb, 
//            zzq, zzs, zzaa, zzab

public class zzh extends zzd
{
    protected class zza
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
            ibinder = zzab.zza.zzG(ibinder);
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
                    com.google.android.gms.common.stats.zzb.zzna().zza(zzGe.getContext(), zzh.zza(zzGe));
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
                zzGe.zzgJ().zze(new Runnable(this, componentname) {

                    final zzab zzGh;
                    final zza zzGi;

                    public void run()
                    {
                        if (!zzGi.zzGe.isConnected())
                        {
                            zzGi.zzGe.zzaG("Connected to service after a timeout");
                            zzh.zza(zzGi.zzGe, zzGh);
                        }
                    }

            
            {
                zzGi = zza1;
                zzGh = zzab1;
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
            zzGe.zzgJ().zze(new Runnable(this, componentname) {

                final zza zzGi;
                final ComponentName zzGj;

                public void run()
                {
                    zzh.zza(zzGi.zzGe, zzGj);
                }

            
            {
                zzGi = zza1;
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
            zzb zzb1 = com.google.android.gms.common.stats.zzb.zzna();
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

        protected zza()
        {
            zzGe = zzh.this;
            super();
        }
    }


    private final zza zzGa = new zza();
    private zzab zzGb;
    private final zzs zzGc;
    private zzai zzGd;

    protected zzh(zze zze1)
    {
        super(zze1);
        zzGd = new zzai(zze1.zzgG());
        zzGc = new zzs(zze1) {

            final zzh zzGe;

            public void run()
            {
                com.google.android.gms.analytics.internal.zzh.zzb(zzGe);
            }

            
            {
                zzGe = zzh.this;
                super(zze1);
            }
        };
    }

    private void onDisconnect()
    {
        zzfZ().zzgz();
    }

    private void onServiceDisconnected(ComponentName componentname)
    {
        zzgF();
        if (zzGb != null)
        {
            zzGb = null;
            zza("Disconnected from device AnalyticsService", componentname);
            onDisconnect();
        }
    }

    static zza zza(zzh zzh1)
    {
        return zzh1.zzGa;
    }

    private void zza(zzab zzab1)
    {
        zzgF();
        zzGb = zzab1;
        zzhg();
        zzfZ().onServiceConnected();
    }

    static void zza(zzh zzh1, ComponentName componentname)
    {
        zzh1.onServiceDisconnected(componentname);
    }

    static void zza(zzh zzh1, zzab zzab1)
    {
        zzh1.zza(zzab1);
    }

    static void zzb(zzh zzh1)
    {
        zzh1.zzhh();
    }

    private void zzhg()
    {
        zzGd.start();
        zzGc.zzr(zzgI().zzij());
    }

    private void zzhh()
    {
        zzgF();
        if (!isConnected())
        {
            return;
        } else
        {
            zzaF("Inactivity, disconnecting from device AnalyticsService");
            disconnect();
            return;
        }
    }

    public boolean connect()
    {
        zzgF();
        zzgR();
        if (zzGb != null)
        {
            return true;
        }
        zzab zzab1 = zzGa.zzhi();
        if (zzab1 != null)
        {
            zzGb = zzab1;
            zzhg();
            return true;
        } else
        {
            return false;
        }
    }

    public void disconnect()
    {
        zzgF();
        zzgR();
        try
        {
            com.google.android.gms.common.stats.zzb.zzna().zza(getContext(), zzGa);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (zzGb != null)
        {
            zzGb = null;
            onDisconnect();
        }
    }

    public boolean isConnected()
    {
        zzgF();
        zzgR();
        return zzGb != null;
    }

    public boolean zzb(zzaa zzaa1)
    {
        zzv.zzr(zzaa1);
        zzgF();
        zzgR();
        zzab zzab1 = zzGb;
        if (zzab1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (zzaa1.zziQ())
        {
            s = zzgI().zzic();
        } else
        {
            s = zzgI().zzid();
        }
        list = Collections.emptyList();
        try
        {
            zzab1.zza(zzaa1.zzhe(), zzaa1.zziO(), s, list);
            zzhg();
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa1)
        {
            zzaF("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    protected void zzgb()
    {
    }
}
