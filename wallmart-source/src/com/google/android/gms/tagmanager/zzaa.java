// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzaa extends zzak
{

    private static final String ID;
    private final Context mContext;

    public zzaa(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        map = zzaN(mContext);
        if (map == null)
        {
            return zzdf.zzBg();
        } else
        {
            return zzdf.zzK(map);
        }
    }

    protected String zzaN(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbK.toString();
    }
}
