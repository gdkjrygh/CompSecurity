// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak

class zzn extends zzak
{

    private static final String ID;
    private static final String VALUE;

    public zzn()
    {
        super(ID, new String[] {
            VALUE
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return (com.google.android.gms.internal.zzd.zza)map.get(VALUE);
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzA.toString();
        VALUE = zzb.zzfU.toString();
    }
}
