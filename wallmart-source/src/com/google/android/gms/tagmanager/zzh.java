// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zzad;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzbg

class zzh extends zzak
{

    private static final String ID;
    private final Context mContext;

    public zzh(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzag.zza zzG(Map map)
    {
        try
        {
            map = zzdf.zzK(Integer.valueOf(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            zzbg.e((new StringBuilder()).append("Package name ").append(mContext.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return zzdf.zzBg();
        }
        return map;
    }

    public boolean zzzx()
    {
        return true;
    }

    static 
    {
        ID = zzad.zzbj.toString();
    }
}
