// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.net.Uri;
import android.util.Log;
import android.util.Xml;
import com.google.android.apps.ytremote.fork.youtube.L;
import com.google.android.apps.ytremote.logic.a;
import com.google.android.apps.ytremote.model.AppStatus;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.apps.ytremote.model.b;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.xml.sax.SAXException;

public class c
    implements a
{

    protected static final String a = com/google/android/apps/ytremote/b/c.getCanonicalName();
    private final HttpClient b = com.google.android.apps.ytremote.a.d.a.c();

    public c()
    {
    }

    public final AppStatus a(Uri uri)
    {
        Object obj;
        b b1;
        b1 = null;
        obj = new HttpGet(uri.toString());
        ((HttpGet) (obj)).setHeader("Origin", "package:com.google.android.youtube");
        HttpResponse httpresponse = b.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj = httpresponse;
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i != 404)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = httpresponse;
        uri = new AppStatus(-1);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return uri;
        if (i == 200)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = httpresponse;
        L.a((new StringBuilder("Request for app status from ")).append(uri).append(" got response code").append(i).toString());
        obj = httpresponse;
        uri = new AppStatus(-2);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return uri;
        obj = httpresponse;
        com.google.android.apps.ytremote.backend.b.a a1 = new com.google.android.apps.ytremote.backend.b.a();
        obj = httpresponse;
        Xml.parse(httpresponse.getEntity().getContent(), android.util.Xml.Encoding.UTF_8, a1);
        obj = httpresponse;
        i = a1.d();
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        obj = httpresponse;
        uri = new AppStatus(-2);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return uri;
        obj = httpresponse;
        if (a1.c() != null) goto _L2; else goto _L1
_L1:
        uri = b1;
_L4:
        obj = httpresponse;
        b1 = new b();
        obj = httpresponse;
        b1.a(i);
        obj = httpresponse;
        b1.a(a1.a());
        obj = httpresponse;
        b1.a(a1.b());
        obj = httpresponse;
        b1.a(uri);
        obj = httpresponse;
        b1.a(a1.e());
        obj = httpresponse;
        uri = b1.a();
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return uri;
_L2:
        obj = httpresponse;
        uri = new ScreenId(a1.c());
        if (true) goto _L4; else goto _L3
_L3:
        uri;
_L12:
        obj = httpresponse;
        Log.e(a, "Could not send the request to TV.", uri);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
_L5:
        return new AppStatus(-2);
        uri;
        httpresponse = null;
_L10:
        obj = httpresponse;
        Log.e(a, "Illegal state exception.", uri);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
          goto _L5
        uri;
        httpresponse = null;
_L9:
        obj = httpresponse;
        Log.e(a, "Sax exception", uri);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
          goto _L5
        uri;
        httpresponse = null;
_L8:
        obj = httpresponse;
        Log.e(a, "Assertion error", uri);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
          goto _L5
        uri;
        obj = null;
_L7:
        com.google.android.apps.ytremote.a.c.a.a(((HttpResponse) (obj)));
        throw uri;
        uri;
        if (true) goto _L7; else goto _L6
_L6:
        uri;
          goto _L8
        uri;
          goto _L9
        uri;
          goto _L10
        uri;
        httpresponse = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

}
