// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.rest;

import android.net.Uri;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.UserVoice;
import com.uservoice.uservoicesdk.model.AccessToken;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import oauth.signpost.OAuthConsumer;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.uservoice.uservoicesdk.rest:
//            RestMethod, RestResult, RestTaskCallback

public class RestTask extends AsyncTask
{

    private RestTaskCallback callback;
    private RestMethod method;
    private List params;
    private String urlPath;

    public RestTask(RestMethod restmethod, String s, List list, RestTaskCallback resttaskcallback)
    {
        method = restmethod;
        urlPath = s;
        callback = resttaskcallback;
        params = list;
    }

    public RestTask(RestMethod restmethod, String s, Map map, RestTaskCallback resttaskcallback)
    {
        if (map == null)
        {
            map = null;
        } else
        {
            map = paramsToList(map);
        }
        this(restmethod, s, ((List) (map)), resttaskcallback);
    }

    private HttpUriRequest createRequest()
        throws URISyntaxException, UnsupportedEncodingException
    {
        String s1 = Session.getInstance().getConfig().getSite();
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        String s;
        if (s1.contains(".us.com"))
        {
            s = "http";
        } else
        {
            s = "https";
        }
        builder.scheme(s);
        builder.encodedAuthority(s1);
        builder.path(urlPath);
        if (method == RestMethod.GET)
        {
            return requestWithQueryString(new HttpGet(), builder);
        }
        if (method == RestMethod.DELETE)
        {
            return requestWithQueryString(new HttpDelete(), builder);
        }
        if (method == RestMethod.POST)
        {
            return requestWithEntity(new HttpPost(), builder);
        }
        if (method == RestMethod.PUT)
        {
            return requestWithEntity(new HttpPut(), builder);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Method must be one of [GET, POST, PUT, DELETE], but was ").append(method).toString());
        }
    }

    public static List paramsToList(Map map)
    {
        ArrayList arraylist = new ArrayList(map.size());
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)map.get(s);
            if (s1 != null)
            {
                arraylist.add(new BasicNameValuePair(s, s1));
            }
        } while (true);
        return arraylist;
    }

    private HttpUriRequest requestWithEntity(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, android.net.Uri.Builder builder)
        throws UnsupportedEncodingException, URISyntaxException
    {
        if (params != null)
        {
            httpentityenclosingrequestbase.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        }
        httpentityenclosingrequestbase.setURI(new URI(builder.build().toString()));
        return httpentityenclosingrequestbase;
    }

    private HttpUriRequest requestWithQueryString(HttpRequestBase httprequestbase, android.net.Uri.Builder builder)
        throws URISyntaxException
    {
        if (params != null)
        {
            BasicNameValuePair basicnamevaluepair;
            for (Iterator iterator = params.iterator(); iterator.hasNext(); builder.appendQueryParameter(basicnamevaluepair.getName(), basicnamevaluepair.getValue()))
            {
                basicnamevaluepair = (BasicNameValuePair)iterator.next();
            }

        }
        httprequestbase.setURI(new URI(builder.build().toString()));
        return httprequestbase;
    }

    protected transient RestResult doInBackground(String as[])
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        as = ((String []) (obj1));
        obj = obj2;
        Object obj3 = createRequest();
        as = ((String []) (obj1));
        obj = obj2;
        if (!isCancelled()) goto _L2; else goto _L1
_L1:
        as = ((String []) (obj1));
        obj = obj2;
        OAuthConsumer oauthconsumer;
        AccessToken accesstoken;
        try
        {
            throw new InterruptedException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = as;
        }
        finally
        {
            if (obj == null) goto _L0; else goto _L0
        }
        obj1 = new RestResult(((Exception) (obj1)));
        obj = obj1;
        if (as != null)
        {
            as.close();
            obj = obj1;
        }
_L5:
        return ((RestResult) (obj));
_L2:
        as = ((String []) (obj1));
        obj = obj2;
        oauthconsumer = Session.getInstance().getOAuthConsumer();
        if (oauthconsumer == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        as = ((String []) (obj1));
        obj = obj2;
        accesstoken = Session.getInstance().getAccessToken();
        if (accesstoken == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        as = ((String []) (obj1));
        obj = obj2;
        oauthconsumer.setTokenWithSecret(accesstoken.getKey(), accesstoken.getSecret());
        as = ((String []) (obj1));
        obj = obj2;
        oauthconsumer.sign(obj3);
        as = ((String []) (obj1));
        obj = obj2;
        ((HttpUriRequest) (obj3)).setHeader("Accept-Language", Locale.getDefault().getLanguage());
        as = ((String []) (obj1));
        obj = obj2;
        ((HttpUriRequest) (obj3)).setHeader("API-Client", String.format("uservoice-android-%s", new Object[] {
            UserVoice.getVersion()
        }));
        as = ((String []) (obj1));
        obj = obj2;
        obj1 = AndroidHttpClient.newInstance(String.format("uservoice-android-%s", new Object[] {
            UserVoice.getVersion()
        }), Session.getInstance().getContext());
        as = ((String []) (obj1));
        obj = obj1;
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_257;
        }
        as = ((String []) (obj1));
        obj = obj1;
        throw new InterruptedException();
        ((AndroidHttpClient) (obj)).close();
        throw as;
        as = ((String []) (obj1));
        obj = obj1;
        obj3 = ((AndroidHttpClient) (obj1)).execute(((HttpUriRequest) (obj3)));
        as = ((String []) (obj1));
        obj = obj1;
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_292;
        }
        as = ((String []) (obj1));
        obj = obj1;
        throw new InterruptedException();
        as = ((String []) (obj1));
        obj = obj1;
        obj2 = ((HttpResponse) (obj3)).getEntity();
        as = ((String []) (obj1));
        obj = obj1;
        obj3 = ((HttpResponse) (obj3)).getStatusLine();
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        as = ((String []) (obj1));
        obj = obj1;
        int i = ((StatusLine) (obj3)).getStatusCode();
_L6:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        as = ((String []) (obj1));
        obj = obj1;
        obj2 = EntityUtils.toString(((org.apache.http.HttpEntity) (obj2)));
_L7:
        as = ((String []) (obj1));
        obj = obj1;
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_375;
        }
        as = ((String []) (obj1));
        obj = obj1;
        throw new InterruptedException();
        as = ((String []) (obj1));
        obj = obj1;
        obj2 = new RestResult(i, new JSONObject(((String) (obj2))));
        obj = obj2;
        if (obj1 != null)
        {
            ((AndroidHttpClient) (obj1)).close();
            return ((RestResult) (obj2));
        }
          goto _L5
_L4:
        i = 0;
          goto _L6
        obj2 = null;
          goto _L7
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected void onPostExecute(RestResult restresult)
    {
        if (restresult.isError())
        {
            callback.onError(restresult);
        } else
        {
            try
            {
                callback.onComplete(restresult.getObject());
            }
            catch (JSONException jsonexception)
            {
                callback.onError(new RestResult(jsonexception, restresult.getStatusCode(), restresult.getObject()));
            }
        }
        super.onPostExecute(restresult);
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((RestResult)obj);
    }
}
