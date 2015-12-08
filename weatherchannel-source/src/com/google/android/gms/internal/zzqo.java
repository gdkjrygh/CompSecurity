// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzqm, zzqi, zzqn, zzqd, 
//            zzql, zzlg

public class zzqo
    implements Runnable
{

    private final Context mContext;
    private final zzqm zzaMS;
    private final zzqd zzaPU;
    private final zzqn zzaQb;
    private final zzqi zzaQc;

    public zzqo(Context context, zzqd zzqd1, zzqn zzqn1)
    {
        this(context, zzqd1, zzqn1, new zzqm(), new zzqi());
    }

    zzqo(Context context, zzqd zzqd1, zzqn zzqn1, zzqm zzqm1, zzqi zzqi1)
    {
        zzu.zzu(context);
        zzu.zzu(zzqn1);
        mContext = context;
        zzaPU = zzqd1;
        zzaQb = zzqn1;
        zzaMS = zzqm1;
        zzaQc = zzqi1;
    }

    public zzqo(Context context, zzqd zzqd1, zzqn zzqn1, String s)
    {
        this(context, zzqd1, zzqn1, new zzqm(), new zzqi());
        zzaQc.zzeU(s);
    }

    public void run()
    {
        zzeH();
    }

    boolean zzAI()
    {
        if (!zzba("android.permission.INTERNET"))
        {
            zzbg.zzaz("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        }
        if (!zzba("android.permission.ACCESS_NETWORK_STATE"))
        {
            zzbg.zzaz("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzaC("NetworkLoader: No network connectivity - Offline");
            return false;
        } else
        {
            return true;
        }
    }

    boolean zzba(String s)
    {
        return mContext.getPackageManager().checkPermission(s, mContext.getPackageName()) == 0;
    }

    void zzeH()
    {
        zzql zzql1;
        if (!zzAI())
        {
            zzaQb.zza(zzqn.zza.zzaPW);
            return;
        }
        zzbg.zzaB("NetworkLoader: Starting to load resource from Network.");
        zzql1 = zzaMS.zzAG();
        String s = zzaQc.zzt(zzaPU.zzAf());
        java.io.InputStream inputstream = zzql1.zzfd(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzlg.zza(inputstream, bytearrayoutputstream);
        zzaQb.zzu(bytearrayoutputstream.toByteArray());
        zzql1.close();
        zzbg.zzaB("NetworkLoader: Resource loaded.");
        return;
        Object obj;
        obj;
        zzbg.zzaz((new StringBuilder()).append("NetworkLoader: No data is retrieved from the given url: ").append(s).toString());
        zzaQb.zza(zzqn.zza.zzaPY);
        zzql1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when loading resource from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaQb.zza(zzqn.zza.zzaPX);
        zzql1.close();
        return;
        obj;
        zzbg.zzb((new StringBuilder()).append("NetworkLoader: Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        zzaQb.zza(zzqn.zza.zzaPY);
        zzql1.close();
        return;
        Exception exception;
        exception;
        zzql1.close();
        throw exception;
    }
}
