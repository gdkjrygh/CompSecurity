// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.google.android.gms.internal:
//            zzqv

class zzqt
    implements zzqv
{

    private HttpClient zzaD;

    zzqt()
    {
    }

    private InputStream zza(HttpClient httpclient, HttpResponse httpresponse)
        throws IOException
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 200)
        {
            zzbg.v("Success response");
            return httpresponse.getEntity().getContent();
        }
        httpclient = (new StringBuilder()).append("Bad response: ").append(i).toString();
        if (i == 404)
        {
            throw new FileNotFoundException(httpclient);
        } else
        {
            throw new IOException(httpclient);
        }
    }

    private void zza(HttpClient httpclient)
    {
        if (httpclient != null && httpclient.getConnectionManager() != null)
        {
            httpclient.getConnectionManager().shutdown();
        }
    }

    public void close()
    {
        zza(zzaD);
    }

    HttpClient zzBV()
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 20000);
        return new DefaultHttpClient(basichttpparams);
    }

    public InputStream zzfs(String s)
        throws IOException
    {
        zzaD = zzBV();
        s = zzaD.execute(new HttpGet(s));
        return zza(zzaD, s);
    }
}
