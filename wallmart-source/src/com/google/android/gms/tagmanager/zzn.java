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

    public static String zzzA()
    {
        return ID;
    }

    public static String zzzB()
    {
        return VALUE;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        return (com.google.android.gms.internal.zzag.zza)map.get(VALUE);
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbl.toString();
        VALUE = zzae.zzhF.toString();
    }
}
