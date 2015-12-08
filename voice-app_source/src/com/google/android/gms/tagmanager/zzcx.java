// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzac, zzbg, zzaq, zzbl

class zzcx
    implements zzac
{
    public static interface zza
    {

        public abstract void zza(zzaq zzaq1);

        public abstract void zzb(zzaq zzaq1);

        public abstract void zzc(zzaq zzaq1);
    }


    private final Context zzaNE;
    private final String zzaNV;
    private final HttpClient zzaNW;
    private zza zzaNX;

    zzcx(HttpClient httpclient, Context context, zza zza1)
    {
        zzaNE = context.getApplicationContext();
        zzaNV = zza("GoogleTagManager", "4.00", android.os.Build.VERSION.RELEASE, zzc(Locale.getDefault()), Build.MODEL, Build.ID);
        zzaNW = httpclient;
        zzaNX = zza1;
    }

    private void zza(HttpEntityEnclosingRequest httpentityenclosingrequest)
    {
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        org.apache.http.Header aheader[] = httpentityenclosingrequest.getAllHeaders();
        int k = aheader.length;
        for (int i = 0; i < k; i++)
        {
            stringbuffer.append(aheader[i].toString()).append("\n");
        }

        stringbuffer.append(httpentityenclosingrequest.getRequestLine().toString()).append("\n");
        if (httpentityenclosingrequest.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        httpentityenclosingrequest = httpentityenclosingrequest.getEntity().getContent();
        if (httpentityenclosingrequest == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        int j = httpentityenclosingrequest.available();
        if (j > 0)
        {
            try
            {
                byte abyte0[] = new byte[j];
                httpentityenclosingrequest.read(abyte0);
                stringbuffer.append("POST:\n");
                stringbuffer.append(new String(abyte0)).append("\n");
            }
            // Misplaced declaration of an exception variable
            catch (HttpEntityEnclosingRequest httpentityenclosingrequest)
            {
                zzbg.zzaB("Error Writing hit to log...");
            }
        }
        zzbg.zzaB(stringbuffer.toString());
        return;
    }

    static String zzc(Locale locale)
    {
        while (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) 
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(locale.getLanguage().toLowerCase());
        if (locale.getCountry() != null && locale.getCountry().length() != 0)
        {
            stringbuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringbuilder.toString();
    }

    private HttpEntityEnclosingRequest zzd(URL url)
    {
        url = new BasicHttpEntityEnclosingRequest("GET", url.toURI().toString());
        url.addHeader("User-Agent", zzaNV);
        return url;
        URISyntaxException urisyntaxexception;
        urisyntaxexception;
        url = null;
_L2:
        zzbg.zzaC((new StringBuilder()).append("Exception sending hit: ").append(urisyntaxexception.getClass().getSimpleName()).toString());
        zzbg.zzaC(urisyntaxexception.getMessage());
        return url;
        urisyntaxexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    String zza(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    URL zzd(zzaq zzaq1)
    {
        zzaq1 = zzaq1.zzyQ();
        try
        {
            zzaq1 = new URL(zzaq1);
        }
        // Misplaced declaration of an exception variable
        catch (zzaq zzaq1)
        {
            zzbg.zzaz("Error trying to parse the GTM url.");
            return null;
        }
        return zzaq1;
    }

    public void zzr(List list)
    {
        boolean flag;
        int i;
        int j;
        j = Math.min(list.size(), 40);
        flag = true;
        i = 0;
_L2:
        zzaq zzaq1;
        Object obj;
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        zzaq1 = (zzaq)list.get(i);
        obj1 = zzd(zzaq1);
        if (obj1 == null)
        {
            zzbg.zzaC("No destination: discarding hit.");
            zzaNX.zzb(zzaq1);
        } else
        {
label0:
            {
                obj = zzd(((URL) (obj1)));
                if (obj != null)
                {
                    break label0;
                }
                zzaNX.zzb(zzaq1);
            }
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        boolean flag1;
        boolean flag2;
        obj1 = new HttpHost(((URL) (obj1)).getHost(), ((URL) (obj1)).getPort(), ((URL) (obj1)).getProtocol());
        ((HttpEntityEnclosingRequest) (obj)).addHeader("Host", ((HttpHost) (obj1)).toHostString());
        zza(((HttpEntityEnclosingRequest) (obj)));
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        flag2 = flag;
        zzbl.zzaJ(zzaNE);
        flag1 = false;
        flag2 = flag1;
        flag = flag1;
        obj = zzaNW.execute(((HttpHost) (obj1)), ((org.apache.http.HttpRequest) (obj)));
        flag2 = flag1;
        flag = flag1;
        int k = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        flag2 = flag1;
        flag = flag1;
        obj1 = ((HttpResponse) (obj)).getEntity();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        flag2 = flag1;
        flag = flag1;
        ((HttpEntity) (obj1)).consumeContent();
        if (k == 200)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        flag2 = flag1;
        flag = flag1;
        zzbg.zzaC((new StringBuilder()).append("Bad response: ").append(((HttpResponse) (obj)).getStatusLine().getStatusCode()).toString());
        flag2 = flag1;
        flag = flag1;
        try
        {
            zzaNX.zzc(zzaq1);
            break MISSING_BLOCK_LABEL_407;
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            zzbg.zzaC("ClientProtocolException sending hit; discarding hit...");
            zzaNX.zzb(zzaq1);
            flag = flag2;
        }
        catch (IOException ioexception)
        {
            zzbg.zzaC((new StringBuilder()).append("Exception sending hit: ").append(ioexception.getClass().getSimpleName()).toString());
            zzbg.zzaC(ioexception.getMessage());
            zzaNX.zzc(zzaq1);
        }
          goto _L3
        flag2 = flag1;
        flag = flag1;
        zzaNX.zza(zzaq1);
        break MISSING_BLOCK_LABEL_407;
_L1:
        return;
        flag = flag1;
          goto _L3
    }

    public boolean zzyH()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)zzaNE.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzaB("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }
}
