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

    private LruCache zzaMe;

    zzba(int i, zzm.zza zza)
    {
        zzaMe = new LruCache(i, zza) {

            final zzm.zza zzaMf;
            final zzba zzaMg;

            protected int sizeOf(Object obj, Object obj1)
            {
                return zzaMf.sizeOf(obj, obj1);
            }

            
            {
                zzaMg = zzba.this;
                zzaMf = zza;
                super(i);
            }
        };
    }

    public Object get(Object obj)
    {
        return zzaMe.get(obj);
    }

    public void zzf(Object obj, Object obj1)
    {
        zzaMe.put(obj, obj1);
    }
}
