// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.restclient;

import com.urbanairship.Logger;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;

public class Response
{

    String body;
    HttpResponse resp;

    public Response(HttpResponse httpresponse)
    {
        resp = httpresponse;
    }

    public String body()
    {
        if (body == null)
        {
            body = "";
            if (resp.getEntity() != null)
            {
                try
                {
                    body = EntityUtils.toString(resp.getEntity());
                }
                catch (IOException ioexception)
                {
                    Logger.error("Error fetching HTTP entity: IO Exception");
                }
            }
        }
        return body;
    }

    public String contentType()
    {
        Header header = resp.getFirstHeader("Content-Type");
        if (header != null)
        {
            return header.getValue();
        } else
        {
            return "";
        }
    }

    public Header getFirstHeader(String s)
    {
        return resp.getFirstHeader(s);
    }

    public long length()
    {
        if (resp.getEntity() != null)
        {
            return resp.getEntity().getContentLength();
        } else
        {
            return 0L;
        }
    }

    public InputStream rawBody()
        throws IllegalStateException, IOException
    {
        if (resp.getEntity() != null)
        {
            return resp.getEntity().getContent();
        } else
        {
            return null;
        }
    }

    public String reason()
    {
        if (resp.getStatusLine() != null)
        {
            return resp.getStatusLine().getReasonPhrase();
        } else
        {
            return "";
        }
    }

    public int status()
    {
        if (resp.getStatusLine() != null)
        {
            return resp.getStatusLine().getStatusCode();
        } else
        {
            return -1;
        }
    }
}
