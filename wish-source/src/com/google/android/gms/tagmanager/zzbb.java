// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

public class zzbb extends zzak
{

    private static final String ID;

    public zzbb()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return zzdf.zzxU();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return zzdf.zzxU();
        } else
        {
            return zzdf.zzE(map.toLowerCase());
        }
    }

    public volatile String zzwQ()
    {
        return super.zzwQ();
    }

    public volatile Set zzwR()
    {
        return super.zzwR();
    }

    public boolean zzwl()
    {
        return false;
    }

    static 
    {
        ID = zza.zzN.toString();
    }
}
