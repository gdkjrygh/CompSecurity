// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.api.Releasable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzip

public abstract class zzdr
    implements Releasable
{

    protected zzip zzoL;

    public zzdr(zzip zzip)
    {
        zzoL = zzip;
    }

    public abstract void abort();

    public void release()
    {
    }

    public abstract boolean zzZ(String s);

    protected void zza(String s, String s1, int i)
    {
        zza.zzIy.post(new Runnable(s, s1, i) {

            final zzdr zzxA;
            final String zzxv;
            final String zzxw;
            final int zzxy;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheComplete");
                hashmap.put("src", zzxv);
                hashmap.put("cachedSrc", zzxw);
                hashmap.put("totalBytes", Integer.toString(zzxy));
                zzxA.zzoL.zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzxA = zzdr.this;
                zzxv = s;
                zzxw = s1;
                zzxy = i;
                super();
            }
        });
    }

    protected void zza(String s, String s1, int i, int j, boolean flag)
    {
        zza.zzIy.post(new Runnable(s, s1, i, j, flag) {

            final zzdr zzxA;
            final String zzxv;
            final String zzxw;
            final int zzxx;
            final int zzxy;
            final boolean zzxz;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheProgress");
                hashmap.put("src", zzxv);
                hashmap.put("cachedSrc", zzxw);
                hashmap.put("bytesLoaded", Integer.toString(zzxx));
                hashmap.put("totalBytes", Integer.toString(zzxy));
                String s2;
                if (zzxz)
                {
                    s2 = "1";
                } else
                {
                    s2 = "0";
                }
                hashmap.put("cacheReady", s2);
                zzxA.zzoL.zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzxA = zzdr.this;
                zzxv = s;
                zzxw = s1;
                zzxx = i;
                zzxy = j;
                zzxz = flag;
                super();
            }
        });
    }

    protected String zzaa(String s)
    {
        return zzk.zzcE().zzaB(s);
    }

    protected void zzf(String s, String s1)
    {
        zza.zzIy.post(new Runnable(s, s1) {

            final zzdr zzxA;
            final String zzxv;
            final String zzxw;

            public void run()
            {
                HashMap hashmap = new HashMap();
                hashmap.put("event", "precacheCanceled");
                hashmap.put("src", zzxv);
                if (zzxw != null)
                {
                    hashmap.put("cachedSrc", zzxw);
                }
                zzxA.zzoL.zzc("onPrecacheEvent", hashmap);
            }

            
            {
                zzxA = zzdr.this;
                zzxv = s;
                zzxw = s1;
                super();
            }
        });
    }
}
