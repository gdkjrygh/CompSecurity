// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent

public class zzb
{
    public static class zza
    {

        public final PlayLoggerContext zzaKM;
        public final LogEvent zzaKN;
        public final com.google.android.gms.internal.zzsb.zzd zzaKO;

        private zza(PlayLoggerContext playloggercontext, LogEvent logevent)
        {
            zzaKM = (PlayLoggerContext)zzx.zzv(playloggercontext);
            zzaKN = (LogEvent)zzx.zzv(logevent);
            zzaKO = null;
        }

    }


    private final ArrayList zzaKK;
    private int zzaKL;

    public zzb()
    {
        this(100);
    }

    public zzb(int i)
    {
        zzaKK = new ArrayList();
        zzaKL = i;
    }

    private void zzyD()
    {
        for (; getSize() > getCapacity(); zzaKK.remove(0)) { }
    }

    public void clear()
    {
        zzaKK.clear();
    }

    public int getCapacity()
    {
        return zzaKL;
    }

    public int getSize()
    {
        return zzaKK.size();
    }

    public boolean isEmpty()
    {
        return zzaKK.isEmpty();
    }

    public void zza(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzaKK.add(new zza(playloggercontext, logevent));
        zzyD();
    }

    public ArrayList zzyC()
    {
        return zzaKK;
    }
}
