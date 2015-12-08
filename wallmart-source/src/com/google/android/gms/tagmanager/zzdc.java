// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

public class zzdc
{
    static class zza
        implements Logger
    {

        private static int zzjl(int i)
        {
            switch (i)
            {
            case 6: // '\006'
            default:
                return 3;

            case 5: // '\005'
                return 2;

            case 3: // '\003'
            case 4: // '\004'
                return 1;

            case 2: // '\002'
                return 0;
            }
        }

        public void error(Exception exception)
        {
            zzbg.zzb("", exception);
        }

        public void error(String s)
        {
            zzbg.e(s);
        }

        public int getLogLevel()
        {
            return zzjl(zzbg.getLogLevel());
        }

        public void info(String s)
        {
            zzbg.zzaD(s);
        }

        public void setLogLevel(int i)
        {
            zzbg.zzaE("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void verbose(String s)
        {
            zzbg.v(s);
        }

        public void warn(String s)
        {
            zzbg.zzaE(s);
        }

        zza()
        {
        }
    }


    private Context mContext;
    private Tracker zzKq;
    private GoogleAnalytics zzKs;

    public zzdc(Context context)
    {
        mContext = context;
    }

    private void zzeW(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (zzKs == null)
        {
            zzKs = GoogleAnalytics.getInstance(mContext);
            zzKs.setLogger(new zza());
            zzKq = zzKs.newTracker(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public Tracker zzeV(String s)
    {
        zzeW(s);
        return zzKq;
    }
}
