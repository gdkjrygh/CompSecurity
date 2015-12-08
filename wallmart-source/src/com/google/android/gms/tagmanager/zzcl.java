// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzqp;
import com.google.android.gms.internal.zzqv;
import com.google.android.gms.internal.zzqw;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzbf, zzs, zzcb

class zzcl
    implements Runnable
{

    private final Context mContext;
    private final String zzaOS;
    private volatile String zzaPp;
    private final zzqw zzaRm;
    private final String zzaRn;
    private zzbf zzaRo;
    private volatile zzs zzaRp;
    private volatile String zzaRq;

    zzcl(Context context, String s, zzqw zzqw1, zzs zzs1)
    {
        mContext = context;
        zzaRm = zzqw1;
        zzaOS = s;
        zzaRp = zzs1;
        zzaRn = (new StringBuilder()).append("/r?id=").append(s).toString();
        zzaPp = zzaRn;
        zzaRq = null;
    }

    public zzcl(Context context, String s, zzs zzs1)
    {
        this(context, s, new zzqw(), zzs1);
    }

    private boolean zzAy()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.v("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void zzAz()
    {
        zzqv zzqv1;
        String s;
        if (!zzAy())
        {
            zzaRo.zza(zzbf.zza.zzaQC);
            return;
        }
        zzbg.v("Start loading resource from network ...");
        s = zzAA();
        zzqv1 = zzaRm.zzBW();
        Object obj = zzqv1.zzfs(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzqp.zzc(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.zzaf.zzj.zzd(bytearrayoutputstream.toByteArray());
        zzbg.v((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if (((com.google.android.gms.internal.zzaf.zzj) (obj)).zziR == null && ((com.google.android.gms.internal.zzaf.zzj) (obj)).zziQ.length == 0)
        {
            zzbg.v((new StringBuilder()).append("No change for container: ").append(zzaOS).toString());
        }
        zzaRo.zzB(obj);
        zzqv1.close();
        zzbg.v("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        zzbg.zzaE((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(zzaOS).append(" is correct.").toString());
        zzaRo.zza(zzbf.zza.zzaQE);
        zzqv1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaRo.zza(zzbf.zza.zzaQD);
        zzqv1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaRo.zza(zzbf.zza.zzaQE);
        zzqv1.close();
        return;
        Exception exception;
        exception;
        zzqv1.close();
        throw exception;
    }

    public void run()
    {
        if (zzaRo == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            zzaRo.zzzL();
            zzAz();
            return;
        }
    }

    String zzAA()
    {
        String s1 = (new StringBuilder()).append(zzaRp.zzzN()).append(zzaPp).append("&v=a65833898").toString();
        String s = s1;
        if (zzaRq != null)
        {
            s = s1;
            if (!zzaRq.trim().equals(""))
            {
                s = (new StringBuilder()).append(s1).append("&pv=").append(zzaRq).toString();
            }
        }
        s1 = s;
        if (zzcb.zzAv().zzAw().equals(zzcb.zza.zzaRe))
        {
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        }
        return s1;
    }

    void zza(zzbf zzbf1)
    {
        zzaRo = zzbf1;
    }

    void zzeB(String s)
    {
        if (s == null)
        {
            zzaPp = zzaRn;
            return;
        } else
        {
            zzbg.zzaC((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            zzaPp = s;
            return;
        }
    }

    void zzeQ(String s)
    {
        zzbg.zzaC((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        zzaRq = s;
    }
}
