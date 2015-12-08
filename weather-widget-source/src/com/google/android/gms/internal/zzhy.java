// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzac, zzl, zzih, zzk, 
//            zzi, zzx, zzm, zzr, 
//            zzie, zzab, zza

public class zzhy
{
    public static interface zza
    {

        public abstract Object zzfv();

        public abstract Object zzh(InputStream inputstream);
    }

    private static class zzb extends zzk
    {

        private final zza zzIk;
        private final zzm.zzb zzaG;

        protected zzm zza(zzi zzi1)
        {
            return zzm.zza(new ByteArrayInputStream(zzi1.data), zzx.zzb(zzi1));
        }

        protected void zza(Object obj)
        {
            zzj((InputStream)obj);
        }

        protected void zzj(InputStream inputstream)
        {
            zzaG.zzb(zzIk.zzh(inputstream));
        }

        public zzb(String s, zza zza1, zzm.zzb zzb1)
        {
            super(0, s, new _cls1(zzb1, zza1));
            zzIk = zza1;
            zzaG = zzb1;
        }
    }

    private class zzc extends zzie
        implements zzm.zzb
    {

        final zzhy zzIi;

        public void zzb(Object obj)
        {
            super.zzf(obj);
        }

        private zzc()
        {
            zzIi = zzhy.this;
            super();
        }

    }


    private static zzl zzIf;
    public static final zza zzIg = new zza() {

        public Object zzfv()
        {
            return zzgA();
        }

        public Void zzgA()
        {
            return null;
        }

        public Object zzh(InputStream inputstream)
        {
            return zzi(inputstream);
        }

        public Void zzi(InputStream inputstream)
        {
            return null;
        }

    };
    private static final Object zzpm = new Object();

    public zzhy(Context context)
    {
        zzIf = zzP(context);
    }

    private static zzl zzP(Context context)
    {
        synchronized (zzpm)
        {
            if (zzIf == null)
            {
                zzIf = zzac.zza(context.getApplicationContext());
            }
            context = zzIf;
        }
        return context;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public zzih zza(String s, zza zza1)
    {
        zzc zzc1 = new zzc();
        zzIf.zze(new zzb(s, zza1, zzc1));
        return zzc1;
    }

    public zzih zzb(String s, Map map)
    {
        zzc zzc1 = new zzc();
        s = new zzab(s, zzc1, new zzm.zza(s, zzc1) {

            final zzc zzIh;
            final zzhy zzIi;
            final String zzxv;

            public void zze(zzr zzr1)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Failed to load URL: ").append(zzxv).append("\n").append(zzr1.toString()).toString());
                zzIh.zzb(null);
            }

            
            {
                zzIi = zzhy.this;
                zzxv = s;
                zzIh = zzc1;
                super();
            }
        }, map) {

            final zzhy zzIi;
            final Map zzIj;

            public Map getHeaders()
                throws com.google.android.gms.internal.zza
            {
                if (zzIj == null)
                {
                    return super.getHeaders();
                } else
                {
                    return zzIj;
                }
            }

            
            {
                zzIi = zzhy.this;
                zzIj = map;
                super(s, zzb1, zza1);
            }
        };
        zzIf.zze(s);
        return zzc1;
    }


    // Unreferenced inner class com/google/android/gms/internal/zzhy$zzb$1

/* anonymous class */
    class zzb._cls1
        implements zzm.zza
    {

        final zzm.zzb zzIl;
        final zza zzIm;

        public void zze(zzr zzr)
        {
            zzIl.zzb(zzIm.zzfv());
        }

            
            {
                zzIl = zzb1;
                zzIm = zza1;
                super();
            }
    }

}
