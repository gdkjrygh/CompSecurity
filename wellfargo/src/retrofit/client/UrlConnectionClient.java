// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit.mime.TypedOutput;

// Referenced classes of package retrofit.client:
//            Client, Request, Header, Response

public class UrlConnectionClient
    implements Client
{

    private static final int CHUNK_SIZE = 4096;

    public UrlConnectionClient()
    {
    }

    public Response execute(Request request)
    {
        HttpURLConnection httpurlconnection = openConnection(request);
        prepareRequest(httpurlconnection, request);
        return readResponse(httpurlconnection);
    }

    protected HttpURLConnection openConnection(Request request)
    {
        request = (HttpURLConnection)(new URL(request.getUrl())).openConnection();
        request.setConnectTimeout(15000);
        request.setReadTimeout(20000);
        return request;
    }

    void prepareRequest(HttpURLConnection httpurlconnection, Request request)
    {
        httpurlconnection.setRequestMethod(request.getMethod());
        httpurlconnection.setDoInput(true);
        Header header;
        for (Iterator iterator = request.getHeaders().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(header.getName(), header.getValue()))
        {
            header = (Header)iterator.next();
        }

        request = request.getBody();
        if (request != null)
        {
            httpurlconnection.setDoOutput(true);
            httpurlconnection.addRequestProperty("Content-Type", request.mimeType());
            long l = request.length();
            if (l != -1L)
            {
                httpurlconnection.setFixedLengthStreamingMode((int)l);
                httpurlconnection.addRequestProperty("Content-Length", String.valueOf(l));
            } else
            {
                httpurlconnection.setChunkedStreamingMode(4096);
            }
            request.writeTo(httpurlconnection.getOutputStream());
        }
    }

    Response readResponse(HttpURLConnection httpurlconnection)
    {
        int i = httpurlconnection.getResponseCode();
        String s = httpurlconnection.getResponseMessage();
        if (s == null)
        {
            s = "";
        }
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = httpurlconnection.getHeaderFields().entrySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            String s1 = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                arraylist.add(new Header(s1, (String)((Iterator) (obj1)).next()));
            }
        }

        String s2 = httpurlconnection.getContentType();
        int j = httpurlconnection.getContentLength();
        Object obj;
        if (i >= 400)
        {
            obj = httpurlconnection.getErrorStream();
        } else
        {
            obj = httpurlconnection.getInputStream();
        }
        obj = new TypedInputStream(s2, j, ((InputStream) (obj)), null);
        return new Response(httpurlconnection.getURL().toString(), i, s, arraylist, ((TypedInput) (obj)));
    }

    private class TypedInputStream
        implements TypedInput
    {

        private final long length;
        private final String mimeType;
        private final InputStream stream;

        public InputStream in()
        {
            return stream;
        }

        public long length()
        {
            return length;
        }

        public String mimeType()
        {
            return mimeType;
        }

        private TypedInputStream(String s, long l, InputStream inputstream)
        {
            mimeType = s;
            length = l;
            stream = inputstream;
        }

        TypedInputStream(String s, long l, InputStream inputstream, _cls1 _pcls1)
        {
            this(s, l, inputstream);
        }
    }

}
