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

    private LruCache zzaQy;

    zzba(int i, zzm.zza zza)
    {
        zzaQy = new LruCache(i, zza) {

            final zzba zzaQA;
            final zzm.zza zzaQz;

            protected int sizeOf(Object obj, Object obj1)
            {
                return zzaQz.sizeOf(obj, obj1);
            }

            
            {
                zzaQA = zzba.this;
                zzaQz = zza;
                super(i);
            }
        };
    }

    public Object get(Object obj)
    {
        return zzaQy.get(obj);
    }

    public void zzf(Object obj, Object obj1)
    {
        zzaQy.put(obj, obj1);
    }
}
