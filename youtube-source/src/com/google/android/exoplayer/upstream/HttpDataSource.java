// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer.e.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            i, k, j, l, 
//            UnexpectedLengthException

public class HttpDataSource
    implements i
{

    public static final d a = new k();
    private static final String b = com/google/android/exoplayer/upstream/HttpDataSource.getSimpleName();
    private static final Pattern c = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int d;
    private final int e;
    private final String f;
    private final d g;
    private final HashMap h;
    private final l i;
    private HttpURLConnection j;
    private InputStream k;
    private boolean l;
    private long m;
    private long n;

    public HttpDataSource(String s, d d1, l l1, int i1, int j1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException();
        } else
        {
            f = s;
            g = d1;
            i = l1;
            h = new HashMap();
            d = i1;
            e = j1;
            return;
        }
    }

    private static long a(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        long l1 = Long.parseLong(s);
_L4:
        Matcher matcher;
        long l2;
        httpurlconnection = httpurlconnection.getHeaderField("Content-Range");
        l2 = l1;
        if (TextUtils.isEmpty(httpurlconnection))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        matcher = c.matcher(httpurlconnection);
        l2 = l1;
        if (!matcher.find())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        long l3;
        l2 = Long.parseLong(matcher.group(2));
        l3 = Long.parseLong(matcher.group(1));
        l3 = (l2 - l3) + 1L;
        NumberFormatException numberformatexception;
        if (l1 < 0L)
        {
            l2 = l3;
        } else
        {
            l2 = l1;
            if (l1 != l3)
            {
                try
                {
                    Log.w(b, (new StringBuilder("Inconsistent headers [")).append(s).append("] [").append(httpurlconnection).append("]").toString());
                    l2 = Math.max(l1, l3);
                }
                catch (NumberFormatException numberformatexception1)
                {
                    Log.e(b, (new StringBuilder("Unexpected Content-Range [")).append(httpurlconnection).append("]").toString());
                    l2 = l1;
                }
            }
        }
        if (l2 == -1L)
        {
            Log.w(b, (new StringBuilder("Unable to parse content length [")).append(s).append("] [").append(httpurlconnection).append("]").toString());
        }
        return l2;
        numberformatexception;
        Log.e(b, (new StringBuilder("Unexpected Content-Length [")).append(s).append("]").toString());
_L2:
        l1 = -1L;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HttpURLConnection b(j j1)
    {
        HttpURLConnection httpurlconnection;
        httpurlconnection = (HttpURLConnection)(new URL(j1.a.toString())).openConnection();
        httpurlconnection.setConnectTimeout(d);
        httpurlconnection.setReadTimeout(e);
        httpurlconnection.setDoOutput(false);
        HashMap hashmap = h;
        hashmap;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); httpurlconnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_119;
        j1;
        throw j1;
        hashmap;
        JVM INSTR monitorexit ;
        httpurlconnection.setRequestProperty("Accept-Encoding", "deflate");
        httpurlconnection.setRequestProperty("User-Agent", f);
        String s1 = (new StringBuilder("bytes=")).append(j1.d).append("-").toString();
        String s = s1;
        if (j1.e != -1L)
        {
            s = (new StringBuilder()).append(s1).append((j1.d + j1.e) - 1L).toString();
        }
        httpurlconnection.setRequestProperty("Range", s);
        httpurlconnection.connect();
        return httpurlconnection;
    }

    private void b()
    {
        if (j != null)
        {
            j.disconnect();
            j = null;
        }
    }

    public final int a(byte abyte0[], int i1, int j1)
    {
        try
        {
            i1 = k.read(abyte0, i1, j1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new HttpDataSourceException(abyte0);
        }
        if (i1 > 0)
        {
            n = n + (long)i1;
            if (i != null)
            {
                i.a(i1);
            }
        } else
        if (m != n)
        {
            throw new HttpDataSourceException(new UnexpectedLengthException(m, n));
        }
        return i1;
    }

    public final long a(j j1)
    {
        n = 0L;
        int i1;
        try
        {
            j = b(j1);
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new HttpDataSourceException(j1);
        }
        try
        {
            i1 = j.getResponseCode();
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            throw new HttpDataSourceException(j1);
        }
        if (i1 < 200 || i1 > 299)
        {
            j1 = j.getHeaderFields();
            b();
            throw new InvalidResponseCodeException(i1, j1);
        }
        String s = j.getContentType();
        if (g != null && !g.a(s))
        {
            b();
            throw new InvalidContentTypeException(s);
        }
        long l2 = a(j);
        long l1;
        if (j1.e == -1L)
        {
            l1 = l2;
        } else
        {
            l1 = j1.e;
        }
        m = l1;
        if (m == -1L)
        {
            throw new HttpDataSourceException(new UnexpectedLengthException(-1L, -1L));
        }
        if (j1.e != -1L && l2 != -1L && l2 != j1.e)
        {
            b();
            throw new HttpDataSourceException(new UnexpectedLengthException(j1.e, l2));
        }
        try
        {
            k = j.getInputStream();
        }
        // Misplaced declaration of an exception variable
        catch (j j1)
        {
            b();
            throw new HttpDataSourceException(j1);
        }
        l = true;
        if (i != null)
        {
            i.a();
        }
        return m;
    }

    public final void a()
    {
        InputStream inputstream = k;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        k.close();
        k = null;
        if (l)
        {
            l = false;
            if (i != null)
            {
                i.b();
            }
            b();
        }
        return;
        Object obj;
        obj;
        throw new HttpDataSourceException(((IOException) (obj)));
        obj;
        if (l)
        {
            l = false;
            if (i != null)
            {
                i.b();
            }
            b();
        }
        throw obj;
    }


    private class HttpDataSourceException extends IOException
    {

        public HttpDataSourceException()
        {
        }

        public HttpDataSourceException(IOException ioexception)
        {
            super(ioexception);
        }

        public HttpDataSourceException(String s)
        {
            super(s);
        }
    }


    private class InvalidResponseCodeException extends HttpDataSourceException
    {

        public final Map headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i1, Map map)
        {
            super((new StringBuilder("Response code: ")).append(i1).toString());
            responseCode = i1;
            headerFields = map;
        }
    }


    private class InvalidContentTypeException extends HttpDataSourceException
    {

        public final String contentType;

        public InvalidContentTypeException(String s)
        {
            super((new StringBuilder("Invalid content type: ")).append(s).toString());
            contentType = s;
        }
    }

}
