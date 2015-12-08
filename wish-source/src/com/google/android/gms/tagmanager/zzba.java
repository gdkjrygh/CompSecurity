// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzl

class zzba
    implements zzl
{

    private LruCache zzaDQ;

    zzba(int i, zzm.zza zza)
    {
        zzaDQ = new LruCache(i, zza) {

            final zzm.zza zzaDR;
            final zzba zzaDS;

            protected int sizeOf(Object obj, Object obj1)
            {
                return zzaDR.sizeOf(obj, obj1);
            }

            
            {
                zzaDS = zzba.this;
                zzaDR = zza;
                super(i);
            }
        };
    }

    public Object get(Object obj)
    {
        return zzaDQ.get(obj);
    }

    public void zze(Object obj, Object obj1)
    {
        zzaDQ.put(obj, obj1);
    }
}
