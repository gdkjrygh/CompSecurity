// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
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

    public static String zzyk()
    {
        return ID;
    }

    public static String zzyl()
    {
        return VALUE;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        return (com.google.android.gms.internal.zzag.zza)map.get(VALUE);
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbi.toString();
        VALUE = zzae.zzhC.toString();
    }
}
