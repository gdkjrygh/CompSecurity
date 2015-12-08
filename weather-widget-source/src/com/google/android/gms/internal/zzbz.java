// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzby, zzbu, zzhu, zzgs, 
//            zzgr

public class zzbz
{

    private Context mContext;
    private String zzqK;
    private boolean zzvf;
    private String zzvg;
    private Map zzvh;

    public zzbz(Context context, String s)
    {
        mContext = null;
        zzqK = null;
        mContext = context;
        zzqK = s;
        zzvf = ((Boolean)zzby.zzuB.get()).booleanValue();
        zzvg = (String)zzby.zzuC.get();
        zzvh = new LinkedHashMap();
        zzvh.put("s", "gmob_sdk");
        zzvh.put("v", "3");
        zzvh.put("os", android.os.Build.VERSION.RELEASE);
        zzvh.put("sdk", android.os.Build.VERSION.SDK);
        zzvh.put("device", zzp.zzbx().zzgt());
        zzvh.put("ua", zzp.zzbx().zzf(context, s));
        Map map = zzvh;
        if (context.getApplicationContext() != null)
        {
            s = context.getApplicationContext().getPackageName();
        } else
        {
            s = context.getPackageName();
        }
        map.put("app", s);
        if (zzp.zzbx().zza(context.getPackageManager(), context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
        {
            context = zzp.zzbD().zzD(mContext);
            zzvh.put("network_coarse", Integer.toString(((zzgr) (context)).zzFN));
            zzvh.put("network_fine", Integer.toString(((zzgr) (context)).zzFO));
        }
    }

    Context getContext()
    {
        return mContext;
    }

    String zzbV()
    {
        return zzqK;
    }

    boolean zzdf()
    {
        return zzvf;
    }

    String zzdg()
    {
        return zzvg;
    }

    Map zzdh()
    {
        return zzvh;
    }
}
