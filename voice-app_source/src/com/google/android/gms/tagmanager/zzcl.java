// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzqf;
import com.google.android.gms.internal.zzql;
import com.google.android.gms.internal.zzqm;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzbf, zzs, zzcb

class zzcl
    implements Runnable
{

    private final Context mContext;
    private volatile String zzaKV;
    private final String zzaKy;
    private final zzqm zzaMS;
    private final String zzaMT;
    private zzbf zzaMU;
    private volatile zzs zzaMV;
    private volatile String zzaMW;

    zzcl(Context context, String s, zzqm zzqm1, zzs zzs1)
    {
        mContext = context;
        zzaMS = zzqm1;
        zzaKy = s;
        zzaMV = zzs1;
        zzaMT = (new StringBuilder()).append("/r?id=").append(s).toString();
        zzaKV = zzaMT;
        zzaMW = null;
    }

    public zzcl(Context context, String s, zzs zzs1)
    {
        this(context, s, new zzqm(), zzs1);
    }

    private boolean zzzi()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzaB("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void zzzj()
    {
        zzql zzql1;
        String s;
        if (!zzzi())
        {
            zzaMU.zza(zzbf.zza.zzaMi);
            return;
        }
        zzbg.zzaB("Start loading resource from network ...");
        s = zzzk();
        zzql1 = zzaMS.zzAG();
        Object obj = zzql1.zzfd(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzqf.zzc(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.zzaf.zzj.zzd(bytearrayoutputstream.toByteArray());
        zzbg.zzaB((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.zzaf.zzj) (obj)).zziO == null && ((com.google.android.gms.internal.zzaf.zzj) (obj)).zziN.length == 0)
        {
            zzbg.zzaB((new StringBuilder()).append("No change for container: ").append(zzaKy).toString());
        }
        zzaMU.zzz(obj);
        zzql1.close();
        zzbg.zzaB("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        zzbg.zzaC((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(zzaKy).append(" is correct.").toString());
        zzaMU.zza(zzbf.zza.zzaMk);
        zzql1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaMU.zza(zzbf.zza.zzaMj);
        zzql1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaMU.zza(zzbf.zza.zzaMk);
        zzql1.close();
        return;
        Exception exception;
        exception;
        zzql1.close();
        throw exception;
    }

    public void run()
    {
        if (zzaMU == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            zzaMU.zzyv();
            zzzj();
            return;
        }
    }

    void zza(zzbf zzbf1)
    {
        zzaMU = zzbf1;
    }

    void zzeB(String s)
    {
        zzbg.zzay((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        zzaMW = s;
    }

    void zzem(String s)
    {
        if (s == null)
        {
            zzaKV = zzaMT;
            return;
        } else
        {
            zzbg.zzay((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            zzaKV = s;
            return;
        }
    }

    String zzzk()
    {
        String s1 = (new StringBuilder()).append(zzaMV.zzyx()).append(zzaKV).append("&v=a65833898").toString();
        String s = s1;
        if (zzaMW != null)
        {
            s = s1;
            if (!zzaMW.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(zzaMW).toString();
            }
        }
        s1 = s;
        if (zzcb.zzzf().zzzg().equals(zzcb.zza.zzaMK))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }
}
