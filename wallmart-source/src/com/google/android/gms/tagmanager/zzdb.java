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

        private final long zzOC = System.currentTimeMillis();
        private final long zzaBW;
        private final String zzaSF;
        private final String zzaSG;
        private final long zzaSH;
        private long zzaSI;
        final zzdb zzaSJ;

        public void run()
        {
            if (zzaSH > 0L && zzaSI >= zzaSH)
            {
                if (!"0".equals(zzaSG))
                {
                    zzdb.zza(zzaSJ).remove(zzaSG);
                }
                return;
            }
            zzaSI = zzaSI + 1L;
            if (zzcu())
            {
                long l = System.currentTimeMillis();
                zzdb.zzb(zzaSJ).push(DataLayer.mapOf(new Object[] {
                    "event", zzaSF, "gtm.timerInterval", String.valueOf(zzaBW), "gtm.timerLimit", String.valueOf(zzaSH), "gtm.timerStartTime", String.valueOf(zzOC), "gtm.timerCurrentTime", String.valueOf(l), 
                    "gtm.timerElapsedTime", String.valueOf(l - zzOC), "gtm.timerEventNumber", String.valueOf(zzaSI), "gtm.triggers", zzaSG
                }));
            }
            zzdb.zzc(zzaSJ).postDelayed(this, zzaBW);
        }

        protected boolean zzcu()
        {
            if (zzdb.zzd(zzaSJ))
            {
                return zzdb.zze(zzaSJ);
            }
            Object obj = (ActivityManager)zzdb.zzf(zzaSJ).getSystemService("activity");
            KeyguardManager keyguardmanager = (KeyguardManager)zzdb.zzf(zzaSJ).getSystemService("keyguard");
            PowerManager powermanager = (PowerManager)zzdb.zzf(zzaSJ).getSystemService("power");
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
            zzaSJ = zzdb.this;
            super();
            zzaSF = s;
            zzaSG = s1;
            zzaBW = l;
            zzaSH = l1;
        }
    }


    private static final String ID;
    private static final String NAME;
    private static final String zzaSA;
    private static final String zzaSy;
    private static final String zzaSz;
    private final Context mContext;
    private Handler mHandler;
    private DataLayer zzaOT;
    private boolean zzaSB;
    private boolean zzaSC;
    private final HandlerThread zzaSD = new HandlerThread("Google GTM SDK Timer", 10);
    private final Set zzaSE = new HashSet();

    public zzdb(Context context, DataLayer datalayer)
    {
        super(ID, new String[] {
            zzaSy, NAME
        });
        mContext = context;
        zzaOT = datalayer;
        zzaSD.start();
        mHandler = new Handler(zzaSD.getLooper());
    }

    static Set zza(zzdb zzdb1)
    {
        return zzdb1.zzaSE;
    }

    static DataLayer zzb(zzdb zzdb1)
    {
        return zzdb1.zzaOT;
    }

    static Handler zzc(zzdb zzdb1)
    {
        return zzdb1.mHandler;
    }

    static boolean zzd(zzdb zzdb1)
    {
        return zzdb1.zzaSC;
    }

    static boolean zze(zzdb zzdb1)
    {
        return zzdb1.zzaSB;
    }

    static Context zzf(zzdb zzdb1)
    {
        return zzdb1.mContext;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
label0:
        {
label1:
            {
                String s1 = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(NAME));
                String s = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaSA));
                String s2 = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaSy));
                map = zzdf.zzg((com.google.android.gms.internal.zzag.zza)map.get(zzaSz));
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
            if (!zzaSE.contains(map))
            {
                if (!"0".equals(map))
                {
                    zzaSE.add(map);
                }
                mHandler.postDelayed(new zza(s1, map, l, l1), l);
            }
        }
        return zzdf.zzBg();
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzcQ.toString();
        NAME = zzae.zzfR.toString();
        zzaSy = zzae.zzfw.toString();
        zzaSz = zzae.zzfE.toString();
        zzaSA = zzae.zzhv.toString();
    }
}
