// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent

public class zzb
{
    public static class zza
    {

        public final PlayLoggerContext zzaGK;
        public final LogEvent zzaGL;
        public final com.google.android.gms.internal.zzrr.zzd zzaGM;

        private zza(PlayLoggerContext playloggercontext, LogEvent logevent)
        {
            zzaGK = (PlayLoggerContext)zzu.zzu(playloggercontext);
            zzaGL = (LogEvent)zzu.zzu(logevent);
            zzaGM = null;
        }

    }


    private final ArrayList zzaGI;
    private int zzaGJ;

    public zzb()
    {
        this(100);
    }

    public zzb(int i)
    {
        zzaGI = new ArrayList();
        zzaGJ = i;
    }

    private void zzxo()
    {
        for (; getSize() > getCapacity(); zzaGI.remove(0)) { }
    }

    public void clear()
    {
        zzaGI.clear();
    }

    public int getCapacity()
    {
        return zzaGJ;
    }

    public int getSize()
    {
        return zzaGI.size();
    }

    public boolean isEmpty()
    {
        return zzaGI.isEmpty();
    }

    public void zza(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzaGI.add(new zza(playloggercontext, logevent));
        zzxo();
    }

    public ArrayList zzxn()
    {
        return zzaGI;
    }
}
