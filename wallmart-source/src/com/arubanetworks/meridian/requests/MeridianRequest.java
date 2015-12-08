// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.requests;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpHeaderParser;
import com.arubanetworks.meridian.Meridian;
import com.arubanetworks.meridian.internal.util.Dev;
import com.arubanetworks.meridian.log.MeridianLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class MeridianRequest
{
    public static interface ErrorListener
    {

        public abstract void onError(Throwable throwable);
    }

    public static interface Listener
    {

        public abstract void onResponse(Object obj);
    }


    private static final MeridianLogger a;
    private final BodyContentType b;
    private final JSONObject c;
    private final Uri d;
    private final int e;
    private final Request f;

    public MeridianRequest(Uri uri)
    {
        this(uri, null, null, null);
    }

    private MeridianRequest(Uri uri, BodyContentType bodycontenttype, JSONObject jsonobject, Map map)
    {
        if (!uri.isAbsolute())
        {
            uri = Meridian.getShared().getAPIBaseUri().buildUpon().path(uri.getPath()).encodedQuery(uri.getEncodedQuery()).build();
        }
        d = uri;
        if (jsonobject != null || map != null) goto _L2; else goto _L1
_L1:
        e = 0;
        c = null;
        b = null;
_L4:
        f = buildVolleyRequest();
        f.setTag(getRequestTag());
        a();
        return;
_L2:
    /* anonymous class not found */
    class _anm1 {}

    /* block-local class not found */
    class BodyContentType {}

        if (bodycontenttype == null)
        {
            bodycontenttype = BodyContentType.X_WWW_FORM_URLENCODED;
        }
        b = bodycontenttype;
        e = 1;
        if (jsonobject != null)
        {
            switch (_cls1.a[b.ordinal()])
            {
            default:
                c = null;
                break;

            case 1: // '\001'
                c = jsonobject;
                break;

            case 2: // '\002'
                c = a(jsonobject);
                break;
            }
        } else
        {
            c = a(map);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public MeridianRequest(Uri uri, Map map)
    {
        this(uri, map, BodyContentType.X_WWW_FORM_URLENCODED);
    }

    public MeridianRequest(Uri uri, Map map, BodyContentType bodycontenttype)
    {
        this(uri, bodycontenttype, null, map);
    }

    public MeridianRequest(Uri uri, JSONObject jsonobject)
    {
        this(uri, jsonobject, BodyContentType.JSON);
    }

    public MeridianRequest(Uri uri, JSONObject jsonobject, BodyContentType bodycontenttype)
    {
        this(uri, bodycontenttype, jsonobject, null);
    }

    private JSONObject a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            try
            {
                jsonobject.put((String)entry.getKey(), entry.getValue());
            }
            catch (JSONException jsonexception)
            {
                a.e("Failed to build key value body into json!", jsonexception);
            }
        }

        return jsonobject;
    }

    private JSONObject a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        JSONObject jsonobject1 = new JSONObject();
        Iterator iterator = jsonobject.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = jsonobject.opt(s);
            if (obj != null)
            {
                try
                {
                    jsonobject1.put(s, String.valueOf(obj));
                }
                catch (JSONException jsonexception)
                {
                    jsonexception.printStackTrace();
                }
            }
        } while (true);
        return jsonobject1;
    }

    private void a()
    {
        Object obj;
        MeridianLogger meridianlogger = a;
        if (getMethod() == 1)
        {
            obj = "Post";
        } else
        {
            obj = "Get";
        }
        meridianlogger.d("Requesting %s %s", new Object[] {
            obj, f.getUrl()
        });
        a.d("Headers: %s", new Object[] {
            f.getHeaders().toString()
        });
        if (f.getBody() == null)
        {
            obj = "";
        } else
        {
            try
            {
                obj = new String(f.getBody());
            }
            catch (AuthFailureError authfailureerror)
            {
                authfailureerror.printStackTrace();
                authfailureerror = "";
            }
        }
        a.d("With Type \"%s\" and Body %s", new Object[] {
            f.getBodyContentType(), obj
        });
        return;
    }

    private static boolean a(NetworkResponse networkresponse)
    {
        if (networkresponse == null || networkresponse.headers == null)
        {
            return false;
        }
        networkresponse = (String)networkresponse.headers.get("Content-Encoding");
        return networkresponse != null && networkresponse.equals("gzip");
    }

    protected static Map appendAPIVersionHeaders(Map map, BodyContentType bodycontenttype)
    {
        ArrayMap arraymap = new ArrayMap();
        arraymap.putAll(map);
        if (bodycontenttype != BodyContentType.JSON)
        {
            arraymap.put("Accept", String.format("application/vnd.meridian.%s+json", new Object[] {
                Meridian.getShared().getAPIVersion()
            }));
        }
        return arraymap;
    }

    protected static Map appendGZIPHeaders(Map map)
    {
        PackageInfo packageinfo = Meridian.getShared().getPackageInfo();
        ArrayMap arraymap = new ArrayMap();
        arraymap.putAll(map);
        arraymap.put("Accept-Encoding", "gzip");
        arraymap.put("User-Agent", (new StringBuilder()).append(packageinfo.packageName).append("/").append(packageinfo.versionName).append(" Meridian/").append(Meridian.getShared().getSDKVersion()).append(" (Android; gzip)").toString());
        return arraymap;
    }

    protected static Map appendLanguageHeaders(Map map)
    {
        ArrayMap arraymap = new ArrayMap();
        arraymap.putAll(map);
        arraymap.put("Accept-Language", Dev.getLanguageCode());
        return arraymap;
    }

    protected static byte[] encodeParameters(Map map, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("Encoding not supported: ").append(s).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s);
        return map;
    }

    protected static NetworkResponse unGZIP(NetworkResponse networkresponse)
    {
        if (!a(networkresponse))
        {
            if (networkresponse == null)
            {
                return null;
            } else
            {
                return new NetworkResponse(networkresponse.statusCode, networkresponse.data, networkresponse.headers, false);
            }
        }
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        obj = new GZIPInputStream(new ByteArrayInputStream(networkresponse.data));
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte0 = new byte[16384];
_L3:
        int i = ((GZIPInputStream) (obj)).read(abyte0, 0, abyte0.length);
        if (i == -1) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L3
        IOException ioexception;
        ioexception;
        a.e("Error unzipping response", ioexception);
_L5:
        return networkresponse;
_L2:
        bytearrayoutputstream.flush();
        ioexception = new NetworkResponse(networkresponse.statusCode, bytearrayoutputstream.toByteArray(), networkresponse.headers, false);
        networkresponse = ioexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected abstract Request buildVolleyRequest();

    public void cancel()
    {
        f.cancel();
    }

    protected BodyContentType getBodyContentType()
    {
        return b;
    }

    protected JSONObject getJSONBody()
    {
        return c;
    }

    protected int getMethod()
    {
        return e;
    }

    protected abstract String getRequestTag();

    protected Map getStringMapBody()
    {
        if (c == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        Iterator iterator = c.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = c.optString(s, null);
            if (s1 != null)
            {
                hashmap.put(s, s1);
            }
        } while (true);
        return hashmap;
    }

    protected Uri getUri()
    {
        return d;
    }

    protected boolean overrideCacheHeaders()
    {
        return Meridian.getShared().shouldOverrideCacheHeaders();
    }

    protected com.android.volley.Cache.Entry parseCacheHeaders(NetworkResponse networkresponse)
    {
        if (!overrideCacheHeaders())
        {
            return HttpHeaderParser.parseCacheHeaders(networkresponse);
        }
        com.android.volley.Cache.Entry entry = new com.android.volley.Cache.Entry();
        entry.data = networkresponse.data;
        entry.responseHeaders = networkresponse.headers;
        long l = System.currentTimeMillis() + Meridian.getShared().getCacheOverrideTimeout();
        entry.softTtl = l;
        entry.ttl = l;
        entry.etag = (String)networkresponse.headers.get("ETag");
        networkresponse = (String)networkresponse.headers.get("Date");
        if (networkresponse != null)
        {
            entry.serverDate = HttpHeaderParser.parseDateAsEpoch(networkresponse);
        }
        return entry;
    }

    public MeridianRequest sendRequest()
    {
        Meridian.getShared().getRequestQueue().add(f);
        return this;
    }

    static 
    {
        a = MeridianLogger.forTag("MeridianRequest").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.REQUESTS);
    }
}
