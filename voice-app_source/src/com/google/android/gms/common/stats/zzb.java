// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzll;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd, zze, ConnectionEvent

public class zzb
{

    private static final Object zzaaJ = new Object();
    private static zzb zzack;
    private static final ComponentName zzacp = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List zzacl;
    private final List zzacm;
    private final List zzacn;
    private final List zzaco;
    private zze zzacq;

    private zzb()
    {
        if (getLogLevel() == zzd.zzacz)
        {
            zzacl = Collections.EMPTY_LIST;
            zzacm = Collections.EMPTY_LIST;
            zzacn = Collections.EMPTY_LIST;
            zzaco = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)zzc.zza.zzacu.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzacl = ((List) (obj));
        obj = (String)zzc.zza.zzacv.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzacm = ((List) (obj));
        obj = (String)zzc.zza.zzacw.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzacn = ((List) (obj));
        obj = (String)zzc.zza.zzacx.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzaco = ((List) (obj));
        zzacq = new zze(1024, ((Long)zzc.zza.zzacy.get()).longValue());
    }

    private int getLogLevel()
    {
        int i;
        try
        {
            if (zzla.zziW())
            {
                return ((Integer)zzc.zza.zzact.get()).intValue();
            }
            i = zzd.zzacz;
        }
        catch (SecurityException securityexception)
        {
            return zzd.zzacz;
        }
        return i;
    }

    private void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent, int i)
    {
        String s1;
        if (zzd.zzZR)
        {
            if (zza(context, s, intent, s1 = zzb(serviceconnection), i))
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = null;
                if ((getLogLevel() & zzd.zzacD) != 0)
                {
                    serviceconnection = zzll.zzl(3, 5);
                }
                long l = 0L;
                if ((getLogLevel() & zzd.zzacF) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (i == 1 || i == 4)
                {
                    serviceconnection = new ConnectionEvent(l1, i, null, null, null, null, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = zzb(context, intent);
                    serviceconnection = new ConnectionEvent(l1, i, zzll.zzaj(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(zzacp).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private boolean zza(Context context, Intent intent)
    {
        intent = intent.getComponent();
        if (intent == null || zzd.zzZR && "com.google.android.gms".equals(intent.getPackageName()))
        {
            return false;
        } else
        {
            return zzla.zzi(context, intent.getPackageName());
        }
    }

    private boolean zza(Context context, String s, Intent intent, String s1, int i)
    {
        int j = getLogLevel();
        if (j != zzd.zzacz && zzacq != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i != 4 && i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (zzacq.zzcq(s1))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj = zzb(context, intent);
        if (obj == null)
        {
            Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                s, intent.toUri(0)
            }));
            return false;
        }
        context = zzll.zzaj(context);
        intent = ((ServiceInfo) (obj)).processName;
        obj = ((ServiceInfo) (obj)).name;
        if (!zzacl.contains(context) && !zzacm.contains(s) && !zzacn.contains(intent) && !zzaco.contains(obj) && (!intent.equals(context) || (j & zzd.zzacE) == 0))
        {
            zzacq.zzcp(s1);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static ServiceInfo zzb(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzll.zzl(3, 20)
            }));
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzll.zzl(3, 20)
            }));
            intent = context.iterator();
            if (intent.hasNext())
            {
                Log.w("ConnectionTracker", ((ResolveInfo)intent.next()).serviceInfo.name);
                return null;
            }
        }
        return ((ResolveInfo)context.get(0)).serviceInfo;
    }

    private String zzb(ServiceConnection serviceconnection)
    {
        return String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceconnection));
    }

    public static zzb zzoO()
    {
        synchronized (zzaaJ)
        {
            if (zzack == null)
            {
                zzack = new zzb();
            }
        }
        return zzack;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), 1);
        context.unbindService(serviceconnection);
    }

    public void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        zza(context, serviceconnection, s, intent, 3);
    }

    public boolean zza(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        return zza(context, context.getClass().getName(), intent, serviceconnection, i);
    }

    public boolean zza(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
    {
        if (zza(context, intent))
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        } else
        {
            zza(context, serviceconnection, s, intent, 2);
            return context.bindService(intent, serviceconnection, i);
        }
    }

    public void zzb(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), 4);
    }

}
