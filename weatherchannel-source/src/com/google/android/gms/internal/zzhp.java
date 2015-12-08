// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzhh, zzhl

public final class zzhp extends zzhh
{

    private final Context mContext;
    private final String zzF;
    private String zzFP;
    private final String zzqr;

    public zzhp(Context context, String s, String s1)
    {
        zzFP = null;
        mContext = context;
        zzqr = s;
        zzF = s1;
    }

    public zzhp(Context context, String s, String s1, String s2)
    {
        zzFP = null;
        mContext = context;
        zzqr = s;
        zzF = s1;
        zzFP = s2;
    }

    public void onStop()
    {
    }

    public void zzdP()
    {
        HttpURLConnection httpurlconnection;
        zzb.zzaB((new StringBuilder()).append("Pinging URL: ").append(zzF).toString());
        httpurlconnection = (HttpURLConnection)(new URL(zzF)).openConnection();
        if (!TextUtils.isEmpty(zzFP))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzo.zzbv().zza(mContext, zzqr, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb.zzaC((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(zzF).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzb.zzaC((new StringBuilder()).append("Error while parsing ping URL: ").append(zzF).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzb.zzaC((new StringBuilder()).append("Error while pinging URL: ").append(zzF).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb.zzaC((new StringBuilder()).append("Error while pinging URL: ").append(zzF).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_273;
        zzo.zzbv().zza(mContext, zzqr, true, httpurlconnection, zzFP);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
