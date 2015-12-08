// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.ytremote.a.d.a;
import com.google.android.apps.ytremote.logic.exception.BackendUnavailableException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            a, b

public class i
    implements com.google.android.apps.ytremote.b.a
{

    private static final String b = com/google/android/apps/ytremote/b/i.getCanonicalName();
    HttpClient a;

    public i()
    {
        a = com.google.android.apps.ytremote.a.d.a.a();
    }

    private static String a(HttpResponse httpresponse)
    {
        StringBuilder stringbuilder = new StringBuilder();
        httpresponse = new BufferedReader(new InputStreamReader(httpresponse.getEntity().getContent()));
_L1:
        String s = httpresponse.readLine();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        stringbuilder.append(s);
          goto _L1
        httpresponse;
        Log.i(b, "Unexpected response body format");
        return stringbuilder.toString();
    }

    public final b a(String s)
    {
        s = new HttpGet(Uri.parse("https://www.youtube.com/api/lounge/data/device_properties").buildUpon().appendQueryParameter("model", s).build().toString());
        JSONObject jsonobject;
        try
        {
            s = a.execute(s);
            if (s.getStatusLine().getStatusCode() != 200)
            {
                throw new BackendUnavailableException("Wrong status code");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i(b, (new StringBuilder("Something went wrong when sending the request.")).append(s).toString());
            throw new BackendUnavailableException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i(b, (new StringBuilder("Something went wrong when sending the request.")).append(s).toString());
            throw new BackendUnavailableException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new BackendUnavailableException((new StringBuilder("Unexpected body response ")).append(s.toString()).toString());
        }
        s = a(((HttpResponse) (s)));
        jsonobject = new JSONObject(s);
        if (!jsonobject.has("hasSupport"))
        {
            throw new BackendUnavailableException((new StringBuilder("Unexpected body response, missing hasSupport field ")).append(s).toString());
        }
        if (jsonobject.getBoolean("hasSupport"))
        {
            return new b(true, jsonobject.getString("friendlyName"));
        }
        s = new b(false, "");
        return s;
    }

}
