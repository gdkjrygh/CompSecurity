// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.commonshttp;

import java.io.IOException;
import java.io.InputStream;
import oauth.signpost.http.HttpResponse;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;

public class HttpResponseAdapter
    implements HttpResponse
{

    private org.apache.http.HttpResponse response;

    public HttpResponseAdapter(org.apache.http.HttpResponse httpresponse)
    {
        response = httpresponse;
    }

    public InputStream getContent()
        throws IOException
    {
        return response.getEntity().getContent();
    }

    public String getReasonPhrase()
        throws Exception
    {
        return response.getStatusLine().getReasonPhrase();
    }

    public int getStatusCode()
        throws IOException
    {
        return response.getStatusLine().getStatusCode();
    }

    public Object unwrap()
    {
        return response;
    }
}
