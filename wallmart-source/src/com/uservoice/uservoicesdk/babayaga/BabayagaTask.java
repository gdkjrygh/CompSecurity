// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.babayaga;

import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.util.Base64;
import android.util.Log;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.UserVoice;
import com.uservoice.uservoicesdk.model.ClientConfig;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.babayaga:
//            Babayaga

public class BabayagaTask extends AsyncTask
{

    private final String event;
    private final Map eventProps;
    private final Map traits;
    private final String uvts;

    public BabayagaTask(String s, String s1, Map map, Map map1)
    {
        event = s;
        uvts = s1;
        traits = map;
        eventProps = map1;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj1;
        as = ((String []) (obj2));
        Object obj3 = new JSONObject();
        obj = obj1;
        as = ((String []) (obj2));
        if (traits == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = obj1;
        as = ((String []) (obj2));
        if (traits.isEmpty())
        {
            break MISSING_BLOCK_LABEL_72;
        }
        obj = obj1;
        as = ((String []) (obj2));
        ((JSONObject) (obj3)).put("u", new JSONObject(traits));
        obj = obj1;
        as = ((String []) (obj2));
        if (eventProps == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = obj1;
        as = ((String []) (obj2));
        if (eventProps.isEmpty())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = obj1;
        as = ((String []) (obj2));
        ((JSONObject) (obj3)).put("e", eventProps);
        obj = obj1;
        as = ((String []) (obj2));
        Object obj4 = Session.getInstance().getClientConfig().getSubdomainId();
        obj = obj1;
        as = ((String []) (obj2));
        obj4 = new StringBuilder(String.format("https://%s/t/%s/%s/%s", new Object[] {
            Babayaga.DOMAIN, obj4, Babayaga.CHANNEL, event
        }));
        obj = obj1;
        as = ((String []) (obj2));
        if (uvts == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append("/");
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append(uvts);
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append("/track.js?_=");
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append((new Date()).getTime());
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append("&c=_");
        obj = obj1;
        as = ((String []) (obj2));
        if (((JSONObject) (obj3)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append("&d=");
        obj = obj1;
        as = ((String []) (obj2));
        ((StringBuilder) (obj4)).append(URLEncoder.encode(Base64.encodeToString(((JSONObject) (obj3)).toString().getBytes(), 2), "UTF-8"));
        obj = obj1;
        as = ((String []) (obj2));
        obj3 = new HttpGet();
        obj = obj1;
        as = ((String []) (obj2));
        ((HttpRequestBase) (obj3)).setURI(new URI(((StringBuilder) (obj4)).toString()));
        obj = obj1;
        as = ((String []) (obj2));
        obj1 = AndroidHttpClient.newInstance(String.format("uservoice-android-%s", new Object[] {
            UserVoice.getVersion()
        }), Session.getInstance().getContext());
        obj = obj1;
        as = ((String []) (obj1));
        obj3 = ((AndroidHttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj3)));
        obj = obj1;
        as = ((String []) (obj1));
        obj2 = ((HttpResponse) (obj3)).getEntity();
        obj = obj1;
        as = ((String []) (obj1));
        obj3 = ((HttpResponse) (obj3)).getStatusLine();
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        as = ((String []) (obj1));
        int i;
        i = ((StatusLine) (obj3)).getStatusCode();
        break MISSING_BLOCK_LABEL_444;
        unsupportedencodingexception;
        Exception exception;
        obj = obj1;
        as = ((String []) (obj2));
        try
        {
            throw new RuntimeException(unsupportedencodingexception);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            as = ((String []) (obj));
        }
        finally
        {
            if (as == null) goto _L0; else goto _L0
        }
        ((Exception) (obj1)).printStackTrace();
        as = ((String []) (obj));
        Log.e("UV", String.format("%s: %s", new Object[] {
            obj1.getClass().getName(), ((Exception) (obj1)).getMessage()
        }));
        if (obj != null)
        {
            ((AndroidHttpClient) (obj)).close();
        }
_L3:
        return null;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        UnsupportedEncodingException unsupportedencodingexception;
        if (i != 200)
        {
            if (obj1 != null)
            {
                ((AndroidHttpClient) (obj1)).close();
            }
            return null;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_612;
        }
        obj = obj1;
        as = ((String []) (obj1));
        obj2 = EntityUtils.toString(((org.apache.http.HttpEntity) (obj2)));
_L4:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = obj1;
        as = ((String []) (obj1));
        if (((String) (obj2)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        obj = obj1;
        as = ((String []) (obj1));
        Babayaga.setUvts((new JSONObject(((String) (obj2)).substring(2, ((String) (obj2)).length() - 2))).getString("uvts"));
        if (obj1 != null)
        {
            ((AndroidHttpClient) (obj1)).close();
        }
          goto _L3
        obj2 = null;
          goto _L4
        as.close();
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
