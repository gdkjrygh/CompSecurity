// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oauth.signpost.http.HttpRequest;

public class HttpURLConnectionRequestAdapter
    implements HttpRequest
{

    protected HttpURLConnection connection;

    public HttpURLConnectionRequestAdapter(HttpURLConnection httpurlconnection)
    {
        connection = httpurlconnection;
    }

    public Map getAllHeaders()
    {
        Map map = connection.getRequestProperties();
        HashMap hashmap = new HashMap(map.size());
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            List list = (List)map.get(s);
            if (!list.isEmpty())
            {
                hashmap.put(s, list.get(0));
            }
        } while (true);
        return hashmap;
    }

    public String getContentType()
    {
        return connection.getRequestProperty("Content-Type");
    }

    public String getHeader(String s)
    {
        return connection.getRequestProperty(s);
    }

    public InputStream getMessagePayload()
        throws IOException
    {
        return null;
    }

    public String getMethod()
    {
        return connection.getRequestMethod();
    }

    public String getRequestUrl()
    {
        return connection.getURL().toExternalForm();
    }

    public void setHeader(String s, String s1)
    {
        connection.setRequestProperty(s, s1);
    }

    public void setRequestUrl(String s)
    {
    }

    public volatile Object unwrap()
    {
        return unwrap();
    }

    public HttpURLConnection unwrap()
    {
        return connection;
    }
}
