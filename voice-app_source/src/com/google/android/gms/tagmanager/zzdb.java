// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, DataLayer

class zzdb extends zzak
{
    private final class zza
        implements Runnable
    {

        private final long zzMC = System.currentTimeMillis();
        private final String zzaOl;
        private final String zzaOm;
        private final long zzaOn;
        private long zzaOo;
        final zzdb zzaOp;
        private final long zzaxU;

        public void run()
        {
            if (zzaOn > 0L && zzaOo >= zzaOn)
            {
                if (!"0".equals(zzaOm))
                {
                    zzdb.zza(zzaOp).remove(zzaOm);
                }
                return;
            }
            zzaOo = zzaOo + 1L;
            if (zzcq())
            {
                long l = System.currentTimeMillis();
                zzdb.zzb(zzaOp).push(DataLayer.mapOf(new Object[] {
                    "event", zzaOl, "gtm.timerInterval", String.valueOf(zzaxU), "gtm.timerLimit", String.valueOf(zzaOn), "gtm.timerStartTime", String.valueOf(zzMC), "gtm.timerCurrentTime", String.valueOf(l), 
                    "gtm.timerElapsedTime", String.valueOf(l - zzMC), "gtm.timerEventNumber", String.valueOf(zzaOo), "gtm.triggers", zzaOm
                }));
            }
            zzdb.zzc(zzaOp).postDelayed(this, zzaxU);
        }

        protected boolean zzcq()
        {
            if (zzdb.zzd(zzaOp))
            {
                return zzdb.zze(zzaOp);
            }
            Object obj = (ActivityManager)zzdb.zzf(zzaOp).getSystemService("activity");
            KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaOp).getSystemService("keyguard");
            PowerManager powermanager = (PowerManager)zzdb.zzf(zzaOp).getSystemService("power");
            for (obj = ((ActivityManager) (obj)).getRunningAppProcesses().iterator(); ((Iterator) (obj)).hasNext();)
            {
                android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
                if (Process.myPid() == runningappprocessinfo.pid && runningappprocessinfo.importance == 100 && !keyguardmanager.inKeyguardRestrictedInputMode() && powermanager.isScreenOn())
                {
                    return true;
                }
            }

            return false;
        }

        zza(String s, String s1, long l, long l1)
        {
            zzaOp = zzdb.this;
            super();
            zzaOl = s;
            zzaOm = s1;
            zzaxU = l;
            zzaOn = l1;
        }
    }


    private static final String ID;
    private static final String NAME;
    private static final String zzaOe;
    private static final String zzaOf;
    private static final String zzaOg;
    private final Context mContext;
    private Handler mHandler;
    private DataLayer zzaKz;
    private boolean zzaOh;
    private boolean zzaOi;
    private final HandlerThread zzaOj = new HandlerThread("Google GTM SDK Timer", 10);
    private final Set zzaOk = new HashSet();

    public zzdb(Context context, DataLayer datalayer)
    {
        super(ID, new String[] {
            zzaOe, NAME
        });
        mContext = context;
        zzaKz = datalayer;
        zzaOj.start();
        mHandler = new Handler(zzaOj.getLooper());
    }

    static Set zza(zzdb zzdb1)
    {
        return zzdb1.zzaOk;
    }

    static DataLayer zzb(zzdb zzdb1)
    {
        return zzdb1.zzaKz;
    }

    static Handler zzc(zzdb zzdb1)
    {
        return zzdb1.mHandler;
    }

    static boolean zzd(zzdb zzdb1)
    {
        return zzdb1.zzaOi;
    }

    static boolean zze(zzdb zzdb1)
    {
        return zzdb1.zzaOh;
    }

    static Context zzf(zzdb zzdb1)
    {
        return zzdb1.mContext;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
label0:
        {
label1:
            {
                String s1 = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(NAME));
                String s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaOg));
                String s2 = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaOe));
                map = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaOf));
                long l;
                long l1;
                try
                {
                    l = Long.parseLong(s2);
                }
                catch (NumberFormatException numberformatexception)
                {
                    l = 0L;
                }
                try
                {
                    l1 = Long.parseLong(map);
                }
                // Misplaced declaration of an exception variable
                catch (Map map)
                {
                    l1 = 0L;
                }
                if (l <= 0L || TextUtils.isEmpty(s1))
                {
                    break label0;
                }
                if (s != null)
                {
                    map = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                map = "0";
            }
            if (!zzaOk.contains(map))
            {
                if (!"0".equals(map))
                {
                    zzaOk.add(map);
                }
                mHandler.postDelayed(new zza(s1, map, l, l1), l);
            }
        }
        return zzdf.zzzQ();
    }

    public boolean zzyh()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzcN.toString();
        NAME = zzae.zzfO.toString();
        zzaOe = zzae.zzft.toString();
        zzaOf = zzae.zzfB.toString();
        zzaOg = zzae.zzhs.toString();
    }
}
