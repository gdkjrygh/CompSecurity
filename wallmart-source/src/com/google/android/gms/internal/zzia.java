// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            zzhq, zzhu

public final class zzia extends zzhq
{

    private final Context mContext;
    private final String zzF;
    private String zzHj;
    private final String zzqK;

    public zzia(Context context, String s, String s1)
    {
        zzHj = null;
        mContext = context;
        zzqK = s;
        zzF = s1;
    }

    public zzia(Context context, String s, String s1, String s2)
    {
        zzHj = null;
        mContext = context;
        zzqK = s;
        zzF = s1;
        zzHj = s2;
    }

    public void onStop()
    {
    }

    public void zzdG()
    {
        HttpURLConnection httpurlconnection;
        zzb.v((new StringBuilder()).append("Pinging URL: ").append(zzF).toString());
        httpurlconnection = (HttpURLConnection)(new URL(zzF)).openConnection();
        if (!TextUtils.isEmpty(zzHj))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        zzp.zzbx().zza(mContext, zzqK, true, httpurlconnection);
_L1:
        int i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        zzb.zzaE((new StringBuilder()).append("Received non-success response code ").append(i).append(" from pinging URL: ").append(zzF).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IndexOutOfBoundsException indexoutofboundsexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while parsing ping URL: ").append(zzF).append(". ").append(indexoutofboundsexception.getMessage()).toString());
            return;
        }
        catch (IOException ioexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while pinging URL: ").append(zzF).append(". ").append(ioexception.getMessage()).toString());
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            zzb.zzaE((new StringBuilder()).append("Error while pinging URL: ").append(zzF).append(". ").append(runtimeexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_273;
        zzp.zzbx().zza(mContext, zzqK, true, httpurlconnection, zzHj);
          goto _L1
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
