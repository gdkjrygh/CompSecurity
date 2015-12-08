// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.zzkq;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlv;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd, WakeLockEvent

public class zzh
{

    private static String TAG = "WakeLockTracker";
    private static Integer zzafB;
    private static final ComponentName zzafz = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static zzh zzaga = new zzh();
    private static IntentFilter zzagb = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public zzh()
    {
    }

    private static int getLogLevel()
    {
        int i;
        try
        {
            if (zzll.zzjk())
            {
                return ((Integer)zzc.zzb.zzafD.get()).intValue();
            }
            i = zzd.LOG_LEVEL_OFF;
        }
        catch (SecurityException securityexception)
        {
            return zzd.LOG_LEVEL_OFF;
        }
        return i;
    }

    private int zzal(Context context)
    {
        boolean flag = true;
        Intent intent = context.getApplicationContext().registerReceiver(null, zzagb);
        int i;
        int j;
        boolean flag1;
        if (intent == null)
        {
            i = 0;
        } else
        {
            i = intent.getIntExtra("plugged", 0);
        }
        if ((i & 7) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (zzlv.zzpW())
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isInteractive();
        } else
        {
            flag1 = ((PowerManager)context.getSystemService("power")).isScreenOn();
        }
        if (flag1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        return j << 1 | i;
    }

    private float zzam(Context context)
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        context = context.getApplicationContext().registerReceiver(null, intentfilter);
        float f = (0.0F / 0.0F);
        if (context != null)
        {
            int i = context.getIntExtra("level", -1);
            int j = context.getIntExtra("scale", -1);
            f = (float)i / (float)j;
        }
        return f;
    }

    private static boolean zzan(Context context)
    {
        if (zzafB == null)
        {
            zzafB = Integer.valueOf(getLogLevel());
        }
        return zzafB.intValue() != zzd.LOG_LEVEL_OFF;
    }

    public static zzh zzpL()
    {
        return zzaga;
    }

    public void zza(Context context, String s, int i, String s1, String s2, int j, List list)
    {
        if (zzan(context))
        {
            if (TextUtils.isEmpty(s))
            {
                Log.e(TAG, (new StringBuilder()).append("missing wakeLock key. ").append(s).toString());
                return;
            }
            long l = System.currentTimeMillis();
            if (7 == i || 8 == i || 10 == i || 11 == i)
            {
                s = new WakeLockEvent(l, i, s1, j, list, s, SystemClock.elapsedRealtime(), zzal(context), s2, context.getPackageName(), zzam(context));
                try
                {
                    context.startService((new Intent()).setComponent(zzafz).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.wtf(TAG, context);
                }
                return;
            }
        }
    }

}
