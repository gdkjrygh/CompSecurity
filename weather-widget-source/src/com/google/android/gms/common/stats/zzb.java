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
import com.google.android.gms.internal.zzkq;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlw;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd, zze, ConnectionEvent

public class zzb
{

    private static final Object zzadT = new Object();
    private static Integer zzafB;
    private static zzb zzafu;
    private static final ComponentName zzafz = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private zze zzafA;
    private final List zzafv;
    private final List zzafw;
    private final List zzafx;
    private final List zzafy;

    private zzb()
    {
        if (getLogLevel() == zzd.LOG_LEVEL_OFF)
        {
            zzafv = Collections.EMPTY_LIST;
            zzafw = Collections.EMPTY_LIST;
            zzafx = Collections.EMPTY_LIST;
            zzafy = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)zzc.zza.zzafE.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzafv = ((List) (obj));
        obj = (String)zzc.zza.zzafF.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzafw = ((List) (obj));
        obj = (String)zzc.zza.zzafG.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzafx = ((List) (obj));
        obj = (String)zzc.zza.zzafH.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzafy = ((List) (obj));
        zzafA = new zze(1024, ((Long)zzc.zza.zzafI.get()).longValue());
    }

    private static int getLogLevel()
    {
        if (zzafB != null) goto _L2; else goto _L1
_L1:
        if (!zzll.zzjk()) goto _L4; else goto _L3
_L3:
        int i = ((Integer)zzc.zza.zzafD.get()).intValue();
_L5:
        zzafB = Integer.valueOf(i);
_L2:
        return zzafB.intValue();
_L4:
        i = zzd.LOG_LEVEL_OFF;
          goto _L5
        SecurityException securityexception;
        securityexception;
        zzafB = Integer.valueOf(zzd.LOG_LEVEL_OFF);
          goto _L2
    }

    private void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent, int i)
    {
        String s1;
        if (zzd.zzacF)
        {
            if (zza(context, s, intent, s1 = zzb(serviceconnection), i))
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = null;
                if ((getLogLevel() & zzd.zzafM) != 0)
                {
                    serviceconnection = zzlw.zzm(3, 5);
                }
                long l = 0L;
                if ((getLogLevel() & zzd.zzafO) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (i == 1 || i == 4)
                {
                    serviceconnection = new ConnectionEvent(l1, i, null, null, null, null, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = zzc(context, intent);
                    serviceconnection = new ConnectionEvent(l1, i, zzlw.zzap(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(zzafz).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private boolean zza(Context context, String s, Intent intent, String s1, int i)
    {
        int j = getLogLevel();
        if (j != zzd.LOG_LEVEL_OFF && zzafA != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i != 4 && i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (zzafA.zzcz(s1))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj = zzc(context, intent);
        if (obj == null)
        {
            Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                s, intent.toUri(0)
            }));
            return false;
        }
        context = zzlw.zzap(context);
        intent = ((ServiceInfo) (obj)).processName;
        obj = ((ServiceInfo) (obj)).name;
        if (!zzafv.contains(context) && !zzafw.contains(s) && !zzafx.contains(intent) && !zzafy.contains(obj) && (!intent.equals(context) || (j & zzd.zzafN) == 0))
        {
            zzafA.zzcy(s1);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private String zzb(ServiceConnection serviceconnection)
    {
        return String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceconnection));
    }

    private boolean zzb(Context context, Intent intent)
    {
        intent = intent.getComponent();
        if (intent == null || zzd.zzacF && "com.google.android.gms".equals(intent.getPackageName()))
        {
            return false;
        } else
        {
            return zzll.zzi(context, intent.getPackageName());
        }
    }

    private static ServiceInfo zzc(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzlw.zzm(3, 20)
            }));
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzlw.zzm(3, 20)
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

    public static zzb zzpD()
    {
        synchronized (zzadT)
        {
            if (zzafu == null)
            {
                zzafu = new zzb();
            }
        }
        return zzafu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), 1);
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
        if (zzb(context, intent))
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        boolean flag = context.bindService(intent, serviceconnection, i);
        if (flag)
        {
            zza(context, serviceconnection, s, intent, 2);
        }
        return flag;
    }

    public void zzb(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), 4);
    }

}
