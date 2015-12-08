// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzbk extends zzak
{

    private static final String ID;
    private final Context mContext;

    public zzbk(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = zzap(mContext);
        if (map == null)
        {
            return zzdf.zzxU();
        } else
        {
            return zzdf.zzE(map);
        }
    }

    protected String zzap(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzwl()
    {
        return true;
    }

    static 
    {
        ID = zza.zzaf.toString();
    }
}
