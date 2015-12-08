// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzq extends zzak
{

    private static final String ID;
    private final String zzWs;

    public zzq(String s)
    {
        super(ID, new String[0]);
        zzWs = s;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        if (zzWs == null)
        {
            return zzdf.zzBg();
        } else
        {
            return zzdf.zzK(zzWs);
        }
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbo.toString();
    }
}
