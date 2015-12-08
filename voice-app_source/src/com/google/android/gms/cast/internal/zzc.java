// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzd

public abstract class zzc extends zzd
{
    private class zza
        implements Runnable
    {

        final zzc zzUh;

        public void run()
        {
            zzUh.zzUg = false;
            long l = SystemClock.elapsedRealtime();
            boolean flag = zzUh.zzz(l);
            zzUh.zzQ(flag);
        }

        private zza()
        {
            zzUh = zzc.this;
            super();
        }

    }


    protected final Handler mHandler;
    protected final long zzUe;
    protected final Runnable zzUf;
    protected boolean zzUg;

    public zzc(String s, String s1, String s2)
    {
        this(s, s1, s2, 1000L);
    }

    public zzc(String s, String s1, String s2, long l)
    {
        super(s, s1, s2);
        mHandler = new Handler(Looper.getMainLooper());
        zzUf = new zza();
        zzUe = l;
        zzQ(false);
    }

    protected final void zzQ(boolean flag)
    {
label0:
        {
            if (zzUg != flag)
            {
                zzUg = flag;
                if (!flag)
                {
                    break label0;
                }
                mHandler.postDelayed(zzUf, zzUe);
            }
            return;
        }
        mHandler.removeCallbacks(zzUf);
    }

    public void zzlJ()
    {
        zzQ(false);
    }

    protected abstract boolean zzz(long l);
}
