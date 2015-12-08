// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.walmartlabs.utils.WLog;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

public class HttpUtils
{

    public static final long NO_CACHE = -1L;
    private static final String TAG = com/walmart/android/utils/HttpUtils.getSimpleName();
    private static final ThreadLocal sFormatter = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        }

    };
    private static Pattern sMaxAgePattern = Pattern.compile("max-age=(\\d+)");

    public HttpUtils()
    {
    }

    public static HttpUriRequest createGetRequest(String s, Map map)
    {
        s = Uri.parse(s).buildUpon();
        if (map != null)
        {
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (entry.getValue() != null)
                {
                    s.appendQueryParameter((String)entry.getKey(), (String)entry.getValue());
                }
            } while (true);
        }
        return new HttpGet(s.build().toString());
    }

    public static transient HttpUriRequest createGetRequest(String s, String as[], String as1[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        if (as != null && as.length > 0)
        {
            s = as[0];
            String s1 = as1[0];
            stringbuilder.append("?");
            stringbuilder.append(s);
            stringbuilder.append("=");
            stringbuilder.append(Uri.encode(s1));
            for (int i = 1; i < as.length; i++)
            {
                s = as[i];
                String s2 = as1[i];
                if (s2 != null)
                {
                    stringbuilder.append("&");
                    stringbuilder.append(s);
                    stringbuilder.append("=");
                    stringbuilder.append(Uri.encode(s2));
                }
            }

        }
        return new HttpGet(stringbuilder.toString());
    }

    public static HttpPost createPostRequest(String s, List list)
    {
        return (HttpPost)createRequest(new HttpPost(s), s, list);
    }

    public static HttpPost createPostRequest(String s, Map map)
    {
        return (HttpPost)createRequest(new HttpPost(s), s, map);
    }

    public static transient HttpPost createPostRequest(String s, String as[], String as1[])
    {
        return (HttpPost)createRequest(new HttpPost(s), s, as, as1);
    }

    public static HttpUriRequest createPostRequest(String s, String s1)
    {
        s = new HttpPost(s);
        try
        {
            s.setEntity(new StringEntity(s1));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return s;
        }
        return s;
    }

    public static HttpPut createPutRequest(String s, List list)
    {
        return (HttpPut)createRequest(new HttpPut(s), s, list);
    }

    public static HttpPut createPutRequest(String s, Map map)
    {
        return (HttpPut)createRequest(new HttpPut(s), s, map);
    }

    public static transient HttpPut createPutRequest(String s, String as[], String as1[])
    {
        return (HttpPut)createRequest(new HttpPut(s), s, as, as1);
    }

    private static HttpEntityEnclosingRequestBase createRequest(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, String s, List list)
    {
        try
        {
            httpentityenclosingrequestbase.setEntity(new UrlEncodedFormEntity(list));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Unsupported encoding", s);
            return httpentityenclosingrequestbase;
        }
        return httpentityenclosingrequestbase;
    }

    private static HttpEntityEnclosingRequestBase createRequest(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, String s, Map map)
    {
        ArrayList arraylist = new ArrayList();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return createRequest(httpentityenclosingrequestbase, s, ((List) (arraylist)));
    }

    private static transient HttpEntityEnclosingRequestBase createRequest(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, String s, String as[], String as1[])
    {
        ArrayList arraylist = new ArrayList();
        if (as != null && as1 != null)
        {
            for (int i = 0; i < as.length; i++)
            {
                arraylist.add(new BasicNameValuePair(as[i], as1[i]));
            }

        }
        return createRequest(httpentityenclosingrequestbase, s, ((List) (arraylist)));
    }

    public static long getCacheMaxAge(HttpMessage httpmessage)
    {
        long l;
        long l1;
        l1 = 0L;
        httpmessage = httpmessage.getFirstHeader("Cache-Control");
        l = l1;
        if (httpmessage == null) goto _L2; else goto _L1
_L1:
        httpmessage = httpmessage.getValue();
        l = l1;
        if (httpmessage == null) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        httpmessage = httpmessage.split("\\s*,\\s*");
        j = httpmessage.length;
        i = 0;
_L8:
        l = l1;
        if (i >= j) goto _L2; else goto _L4
_L4:
        Object obj = httpmessage[i];
        if (!"no-cache".equals(obj) && !"no-store".equals(obj)) goto _L6; else goto _L5
_L5:
        l = -1L;
_L2:
        return l;
_L6:
        obj = sMaxAgePattern.matcher(((CharSequence) (obj)));
        if (((Matcher) (obj)).matches())
        {
            l1 = Long.parseLong(((Matcher) (obj)).group(1));
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Date getDate(HttpMessage httpmessage, String s)
    {
        Object obj = null;
        s = httpmessage.getFirstHeader(s);
        httpmessage = obj;
        if (s != null)
        {
            httpmessage = s.getValue();
            try
            {
                httpmessage = ((SimpleDateFormat)sFormatter.get()).parse(httpmessage);
            }
            // Misplaced declaration of an exception variable
            catch (HttpMessage httpmessage)
            {
                return null;
            }
        }
        return httpmessage;
    }

    public static boolean isCacheHeaderEnabled(HttpMessage httpmessage)
    {
        boolean flag1 = false;
        httpmessage = httpmessage.getFirstHeader("Cache-Control");
        boolean flag = flag1;
        if (httpmessage != null)
        {
            httpmessage = httpmessage.getValue();
            flag = flag1;
            if (!TextUtils.isEmpty(httpmessage))
            {
                flag = flag1;
                if (!httpmessage.contains("no-cache"))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
