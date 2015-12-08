// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzab extends zzak
{

    private static final String ID;

    public zzab()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        String s1 = Build.MANUFACTURER;
        String s = Build.MODEL;
        map = s;
        if (!s.startsWith(s1))
        {
            map = s;
            if (!s1.equals("unknown"))
            {
                map = (new StringBuilder()).append(s1).append(" ").append(s).toString();
            }
        }
        return zzdf.zzK(map);
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbq.toString();
    }
}
