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

    public com.google.android.gms.internal.zzag.zza zzE(Map map)
    {
        map = zzaG(mContext);
        if (map == null)
        {
            return zzdf.zzzQ();
        } else
        {
            return zzdf.zzI(map);
        }
    }

    protected String zzaG(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzyh()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbH.toString();
    }
}
