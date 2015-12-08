// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzqw, zzqs, zzqx, zzqn, 
//            zzqv, zzlr

public class zzqy
    implements Runnable
{

    private final Context mContext;
    private final zzqw zzaRm;
    private final zzqn zzaUo;
    private final zzqx zzaUv;
    private final zzqs zzaUw;

    public zzqy(Context context, zzqn zzqn1, zzqx zzqx1)
    {
        this(context, zzqn1, zzqx1, new zzqw(), new zzqs());
    }

    zzqy(Context context, zzqn zzqn1, zzqx zzqx1, zzqw zzqw1, zzqs zzqs1)
    {
        zzx.zzv(context);
        zzx.zzv(zzqx1);
        mContext = context;
        zzaUo = zzqn1;
        zzaUv = zzqx1;
        zzaRm = zzqw1;
        zzaUw = zzqs1;
    }

    public zzqy(Context context, zzqn zzqn1, zzqx zzqx1, String s)
    {
        this(context, zzqn1, zzqx1, new zzqw(), new zzqs());
        zzaUw.zzfj(s);
    }

    public void run()
    {
        zzeP();
    }

    boolean zzBY()
    {
        if (!zzbf("android.permission.INTERNET"))
        {
            zzbg.e("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (!zzbf("android.permission.ACCESS_NETWORK_STATE"))
        {
            zzbg.e("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzaE("NetworkLoader: No network connectivity - Offline");
            return false;
        } else
        {
            return true;
        }
    }

    boolean zzbf(String s)
    {
        return mContext.getPackageManager().checkPermission(s, mContext.getPackageName()) == 0;
    }

    void zzeP()
    {
        zzqv zzqv1;
        if (!zzBY())
        {
            zzaUv.zza(zzqx.zza.zzaUq);
            return;
        }
        zzbg.v("NetworkLoader: Starting to load resource from Network.");
        zzqv1 = zzaRm.zzBW();
        String s = zzaUw.zzt(zzaUo.zzBv());
        java.io.InputStream inputstream = zzqv1.zzfs(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlr.zza(inputstream, bytearrayoutputstream);
        zzaUv.zzu(bytearrayoutputstream.toByteArray());
        zzqv1.close();
        zzbg.v("NetworkLoader: Resource loaded.");
        return;
        Object obj;
        obj;
        zzbg.e((new StringBuilder()).append("NetworkLoader: No data is retrieved from the given url: ").append(s).toString());
        zzaUv.zza(zzqx.zza.zzaUs);
        zzqv1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when loading resource from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaUv.zza(zzqx.zza.zzaUr);
        zzqv1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaUv.zza(zzqx.zza.zzaUs);
        zzqv1.close();
        return;
        Exception exception;
        exception;
        zzqv1.close();
        throw exception;
    }
}
