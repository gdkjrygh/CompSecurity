// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
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

    public volatile String zzAc()
    {
        return super.zzAc();
    }

    public volatile Set zzAd()
    {
        return super.zzAd();
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return zzdf.zzBg();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return zzdf.zzBg();
        } else
        {
            return zzdf.zzK(map.toLowerCase());
        }
    }

    public boolean zzzx()
    {
        return false;
    }

    static 
    {
        ID = zzad.zzby.toString();
    }
}
