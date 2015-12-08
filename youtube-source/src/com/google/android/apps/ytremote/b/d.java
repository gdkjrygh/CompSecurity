// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.net.Uri;
import android.os.HandlerThread;
import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.backend.logic.b;
import com.google.android.apps.ytremote.logic.e;
import com.google.android.apps.ytremote.model.PairingCode;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            e, g, f

public class d
    implements com.google.android.apps.ytremote.logic.d
{

    private static final String a = com/google/android/apps/ytremote/b/d.getCanonicalName();
    private final g b;
    private final f c;
    private final HttpClient d;

    public d(b b1)
    {
        this(b1, ((f) (new com.google.android.apps.ytremote.b.e((byte)0))), ((HttpClient) (com.google.android.apps.ytremote.a.d.a.b())));
    }

    private d(b b1, f f1, HttpClient httpclient)
    {
        c = f1;
        d = httpclient;
        f1 = new HandlerThread(getClass().getName());
        f1.start();
        b = new g(f1.getLooper(), b1, (byte)0);
    }

    static String b()
    {
        return a;
    }

    public final void a()
    {
        b.removeMessages(1);
    }

    public final void a(Uri uri)
    {
        uri = new HttpDelete(uri.toString());
        uri.setHeader("Origin", "package:com.google.android.youtube");
        int i;
        try
        {
            i = d.execute(uri).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e(a, (new StringBuilder("Error stopping YouTubeTV.")).append(uri).toString());
            return;
        }
        if (i != 200)
        {
            Log.e(a, (new StringBuilder("Error stopping YouTubeTV. Response code is ")).append(i).toString());
        }
        try
        {
            Thread.sleep(1000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            uri.printStackTrace();
        }
    }

    public final void a(Uri uri, String s, long l, PairingCode pairingcode, e e1)
    {
        PairingCode pairingcode1;
        pairingcode1 = c.a();
        HttpPost httppost = new HttpPost(uri.toString());
        httppost.setHeader(new BasicHeader("Content-Type", "text/plain; charset=\"utf-8\""));
        httppost.setHeader("Origin", "package:com.google.android.youtube");
        int i;
        try
        {
            pairingcode = (new StringBuilder("pairingCode=")).append(pairingcode1.toString()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            e1.a(4);
            return;
        }
        uri = pairingcode;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        uri = (new StringBuilder()).append(pairingcode).append("&v=").append(s).append("&t=").append(l / 1000L).toString();
        httppost.setEntity(new StringEntity(uri, "UTF-8"));
        s = d.execute(httppost);
        i = s.getStatusLine().getStatusCode();
        switch (i)
        {
        default:
            return;

        case 201: 
            b.a(pairingcode1, e1);
            uri = null;
            if (s.containsHeader("LOCATION"))
            {
                uri = Uri.parse(s.getFirstHeader("LOCATION").getValue());
            }
            e1.a(uri);
            return;

        case 303: 
            e1.a(1);
            return;

        case 404: 
            e1.a(2);
            return;

        case 503: 
            e1.a(0);
            return;
        }
    }

}
