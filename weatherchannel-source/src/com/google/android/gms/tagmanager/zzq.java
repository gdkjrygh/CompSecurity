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
    private final String zzTQ;

    public zzq(String s)
    {
        super(ID, new String[0]);
        zzTQ = s;
    }

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        if (zzTQ == null)
        {
            return zzdf.zzzQ();
        } else
        {
            return zzdf.zzI(zzTQ);
        }
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbl.toString();
    }
}
