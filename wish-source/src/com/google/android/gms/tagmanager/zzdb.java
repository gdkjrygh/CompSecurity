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
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
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

        private final long zzIG = System.currentTimeMillis();
        private final String zzaFX;
        private final String zzaFY;
        private final long zzaFZ;
        private long zzaGa;
        final zzdb zzaGb;
        private final long zzaqe;

        public void run()
        {
            if (zzaFZ > 0L && zzaGa >= zzaFZ)
            {
                if (!"0".equals(zzaFY))
                {
                    com.google.android.gms.tagmanager.zzdb.zza(zzaGb).remove(zzaFY);
                }
                return;
            }
            zzaGa = zzaGa + 1L;
            if (zzbA())
            {
                long l = System.currentTimeMillis();
                com.google.android.gms.tagmanager.zzdb.zzb(zzaGb).push(DataLayer.mapOf(new Object[] {
                    "event", zzaFX, "gtm.timerInterval", String.valueOf(zzaqe), "gtm.timerLimit", String.valueOf(zzaFZ), "gtm.timerStartTime", String.valueOf(zzIG), "gtm.timerCurrentTime", String.valueOf(l), 
                    "gtm.timerElapsedTime", String.valueOf(l - zzIG), "gtm.timerEventNumber", String.valueOf(zzaGa), "gtm.triggers", zzaFY
                }));
            }
            zzdb.zzc(zzaGb).postDelayed(this, zzaqe);
        }

        protected boolean zzbA()
        {
            if (zzdb.zzd(zzaGb))
            {
                return zzdb.zze(zzaGb);
            }
            Object obj = (ActivityManager)zzdb.zzf(zzaGb).getSystemService("activity");
            KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaGb).getSystemService("keyguard");
            PowerManager powermanager = (PowerManager)zzdb.zzf(zzaGb).getSystemService("power");
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
            zzaGb = zzdb.this;
            super();
            zzaFX = s;
            zzaFY = s1;
            zzaqe = l;
            zzaFZ = l1;
        }
    }


    private static final String ID;
    private static final String NAME;
    private static final String zzaFQ;
    private static final String zzaFR;
    private static final String zzaFS;
    private final Context mContext;
    private Handler mHandler;
    private DataLayer zzaCl;
    private boolean zzaFT;
    private boolean zzaFU;
    private final HandlerThread zzaFV = new HandlerThread("Google GTM SDK Timer", 10);
    private final Set zzaFW = new HashSet();

    public zzdb(Context context, DataLayer datalayer)
    {
        super(ID, new String[] {
            zzaFQ, NAME
        });
        mContext = context;
        zzaCl = datalayer;
        zzaFV.start();
        mHandler = new Handler(zzaFV.getLooper());
    }

    static Set zza(zzdb zzdb1)
    {
        return zzdb1.zzaFW;
    }

    static DataLayer zzb(zzdb zzdb1)
    {
        return zzdb1.zzaCl;
    }

    static Handler zzc(zzdb zzdb1)
    {
        return zzdb1.mHandler;
    }

    static boolean zzd(zzdb zzdb1)
    {
        return zzdb1.zzaFU;
    }

    static boolean zze(zzdb zzdb1)
    {
        return zzdb1.zzaFT;
    }

    static Context zzf(zzdb zzdb1)
    {
        return zzdb1.mContext;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
label0:
        {
label1:
            {
                String s1 = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(NAME));
                String s = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaFS));
                String s2 = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaFQ));
                map = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaFR));
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
            if (!zzaFW.contains(map))
            {
                if (!"0".equals(map))
                {
                    zzaFW.add(map);
                }
                mHandler.postDelayed(new zza(s1, map, l, l1), l);
            }
        }
        return zzdf.zzxU();
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = com.google.android.gms.internal.zza.zzbf.toString();
        NAME = zzb.zzeg.toString();
        zzaFQ = zzb.zzdL.toString();
        zzaFR = zzb.zzdT.toString();
        zzaFS = zzb.zzfK.toString();
    }
}
