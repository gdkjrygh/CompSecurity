// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.apps.ytremote.backend.a:
//            m, h

public class g
    implements a
{

    private static final String a = com/google/android/apps/ytremote/backend/a/g.getCanonicalName();
    private final DefaultHttpClient b = com.google.android.apps.ytremote.a.d.a.a();
    private final String c;

    public g(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException();
        } else
        {
            c = s;
            return;
        }
    }

    private static List a(String s)
    {
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = new JSONArray(s);
        int i = 0;
_L2:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add((new m(jsonarray.getJSONObject(i))).a());
        i++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.e(a, (new StringBuilder("Error parsing json response : ")).append(s).toString(), jsonexception);
_L1:
        return arraylist;
    }

    private void a(HttpRequestBase httprequestbase, int i)
    {
        HttpResponse httpresponse;
        HttpResponse httpresponse1;
        httpresponse1 = null;
        httpresponse = null;
        HttpResponse httpresponse2 = b.execute(httprequestbase);
        httpresponse = httpresponse2;
        httpresponse1 = httpresponse2;
        int j = httpresponse2.getStatusLine().getStatusCode();
        if (j == i)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        httpresponse = httpresponse2;
        httpresponse1 = httpresponse2;
        Log.w(a, (new StringBuilder()).append(httprequestbase.getURI()).append(" failed. Response code is: ").append(j).append(" instead of: ").append(i).toString());
        com.google.android.apps.ytremote.a.c.a.a(httpresponse2);
        return;
        httprequestbase;
        httpresponse1 = httpresponse;
        Log.e(a, "Error on connection to screens's cloud.", httprequestbase);
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return;
        httprequestbase;
        com.google.android.apps.ytremote.a.c.a.a(httpresponse1);
        throw httprequestbase;
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid)
    {
        s = new HttpDelete((new StringBuilder("https://www.youtube.com/api/lounge/screens/")).append(screenid.toString()).toString());
        s.setHeader("Authorization", (new StringBuilder("Bearer ")).append(s1).toString());
        s.setHeader("Cache-Control", "max-age=0");
        a(((HttpRequestBase) (s)), 204);
        return null;
    }

    public final CloudScreen a(String s, String s1, ScreenId screenid, String s2)
    {
        a(((HttpRequestBase) (com.google.android.apps.ytremote.backend.a.h.a(s1, screenid, s2))), 204);
        return null;
    }

    public final List a(String s, String s1)
    {
        ArrayList arraylist;
        Object obj;
        obj = new HttpGet("https://www.youtube.com/api/lounge/screens/");
        ((HttpGet) (obj)).setHeader("Authorization", (new StringBuilder("Bearer ")).append(s1).toString());
        ((HttpGet) (obj)).setHeader("Cache-Control", "max-age=0");
        s1 = null;
        s = null;
        arraylist = new ArrayList();
        HttpResponse httpresponse = b.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        s = httpresponse;
        s1 = httpresponse;
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 200) goto _L2; else goto _L1
_L1:
        s = httpresponse;
        s1 = httpresponse;
        Log.w(a, (new StringBuilder("GET ")).append(((HttpGet) (obj)).getURI()).append(" failed. Response code is: ").append(i).toString());
        s = arraylist;
_L4:
        com.google.android.apps.ytremote.a.c.a.a(httpresponse);
        return s;
_L2:
        s = httpresponse;
        s1 = httpresponse;
        obj = a(EntityUtils.toString(httpresponse.getEntity(), "UTF-8"));
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        s1 = s;
        Log.e(a, "Error retrieving screens.", exception);
        com.google.android.apps.ytremote.a.c.a.a(s);
        return arraylist;
        s;
        com.google.android.apps.ytremote.a.c.a.a(s1);
        throw s;
    }

    public final void a(String s, String s1, CloudScreen cloudscreen)
    {
        a(((HttpRequestBase) (com.google.android.apps.ytremote.backend.a.h.a(s1, cloudscreen.getScreenId().toString(), cloudscreen.getName(), c))), 201);
    }

}
