// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import com.gtp.a.a.b.c;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;

// Referenced classes of package com.jiubang.core.util:
//            NaiveTrustManager

class HttpUtils
{

    private static final AllowAllHostnameVerifier HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    private static final String LOG_TAG = "ACRA";
    private static final int SOCKET_TIMEOUT = 3000;
    private static final TrustManager TRUST_MANAGER[] = {
        new NaiveTrustManager()
    };

    HttpUtils()
    {
    }

    static void doPost(Map map, URL url)
    {
        url = getConnection(url);
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); stringbuilder.append(URLEncoder.encode(s, "UTF-8")).append('=').append(URLEncoder.encode((String)map.get(s), "UTF-8")))
        {
            if (stringbuilder.length() != 0)
            {
                stringbuilder.append('&');
            }
            s = (String)iterator.next();
        }

        url.setDoOutput(true);
        map = new OutputStreamWriter(url.getOutputStream());
        c.a("ACRA", "Posting crash report data");
        map.write(stringbuilder.toString());
        map.flush();
        map.close();
        c.a("ACRA", "Reading response");
        map = new BufferedReader(new InputStreamReader(url.getInputStream()));
        do
        {
            url = map.readLine();
            if (url != null)
            {
                c.a("ACRA", url);
            } else
            {
                map.close();
                return;
            }
        } while (true);
    }

    private static URLConnection getConnection(URL url)
    {
        url = url.openConnection();
        if (url instanceof HttpsURLConnection)
        {
            Object obj = SSLContext.getInstance("TLS");
            TrustManager atrustmanager[] = TRUST_MANAGER;
            SecureRandom securerandom = new SecureRandom();
            ((SSLContext) (obj)).init(new KeyManager[0], atrustmanager, securerandom);
            obj = ((SSLContext) (obj)).getSocketFactory();
            ((HttpsURLConnection)url).setSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj)));
            ((HttpsURLConnection)url).setHostnameVerifier(HOSTNAME_VERIFIER);
        }
        url.setConnectTimeout(3000);
        url.setReadTimeout(3000);
        return url;
    }

}
