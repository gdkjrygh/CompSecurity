// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import android.os.SystemClock;
import com.android.a.aa;
import com.android.a.ab;
import com.android.a.c;
import com.android.a.j;
import com.android.a.l;
import com.android.a.m;
import com.android.a.n;
import com.android.a.p;
import com.android.a.x;
import com.android.a.y;
import com.android.a.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.android.a.a:
//            b, p, j

public class a
    implements j
{

    protected static final boolean a;
    protected final com.android.a.a.j b;
    protected final b c;

    public a(com.android.a.a.j j1)
    {
        this(j1, new b(4096));
    }

    public a(com.android.a.a.j j1, b b1)
    {
        b = j1;
        c = b1;
    }

    private static Map a(Header aheader[])
    {
        HashMap hashmap = new HashMap();
        int i = 0;
        do
        {
            if (i >= aheader.length)
            {
                return hashmap;
            }
            hashmap.put(aheader[i].getName(), aheader[i].getValue());
            i++;
        } while (true);
    }

    private void a(long l1, p p1, byte abyte0[], StatusLine statusline)
    {
        if (a || l1 > 3000L)
        {
            if (abyte0 != null)
            {
                abyte0 = Integer.valueOf(abyte0.length);
            } else
            {
                abyte0 = "null";
            }
            ab.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", new Object[] {
                p1, Long.valueOf(l1), abyte0, Integer.valueOf(statusline.getStatusCode()), Integer.valueOf(p1.u().b())
            });
        }
    }

    private static void a(String s, p p1, aa aa1)
    {
        x x1 = p1.u();
        int i = p1.t();
        try
        {
            x1.a(aa1);
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            p1.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[] {
                s, Integer.valueOf(i)
            }));
            throw aa1;
        }
        p1.a(String.format("%s-retry [timeout=%s]", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    private byte[] a(HttpEntity httpentity)
    {
        Object obj;
        Exception exception;
        com.android.a.a.p p1;
        p1 = new com.android.a.a.p(c, (int)httpentity.getContentLength());
        exception = null;
        obj = exception;
        InputStream inputstream = httpentity.getContent();
        if (inputstream != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        obj = exception;
        throw new y();
        exception;
        byte abyte0[];
        byte abyte1[];
        int i;
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            ab.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(((byte []) (obj)));
        p1.close();
        throw exception;
        obj = exception;
        abyte0 = c.a(1024);
_L1:
        obj = abyte0;
        i = inputstream.read(abyte0);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = abyte0;
        abyte1 = p1.toByteArray();
        try
        {
            httpentity.consumeContent();
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            ab.a("Error occured when calling consumingContent", new Object[0]);
        }
        c.a(abyte0);
        p1.close();
        return abyte1;
        obj = abyte0;
        p1.write(abyte0, 0, i);
          goto _L1
    }

    public m a(p p1)
    {
        long l1 = SystemClock.elapsedRealtime();
_L6:
        Object obj;
        byte abyte0[];
        Object obj2;
        Map map;
        map = null;
        abyte0 = null;
        obj = null;
        obj2 = new HashMap();
        Object obj1;
        obj1 = new HashMap();
        obj1 = b.a(p1, ((Map) (obj1)));
        StatusLine statusline;
        int i;
        statusline = ((HttpResponse) (obj1)).getStatusLine();
        i = statusline.getStatusCode();
        map = a(((HttpResponse) (obj1)).getAllHeaders());
        if (i == 304)
        {
            obj = abyte0;
            m m1;
            IOException ioexception;
            try
            {
                return new m(304, p1.f().a, map, true);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a("socket", p1, ((aa) (new z())));
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a("connection", p1, ((aa) (new z())));
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException((new StringBuilder("Bad URL ")).append(p1.d()).toString(), ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                obj2 = map;
            }
            break MISSING_BLOCK_LABEL_268;
        }
        obj = abyte0;
        if (((HttpResponse) (obj1)).getEntity() == null) goto _L2; else goto _L1
_L1:
        obj = abyte0;
        abyte0 = a(((HttpResponse) (obj1)).getEntity());
_L4:
        obj = abyte0;
        a(SystemClock.elapsedRealtime() - l1, p1, abyte0, statusline);
        if (i >= 200 && i <= 299)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0;
        throw new IOException();
_L2:
        obj = abyte0;
        abyte0 = new byte[0];
        if (true) goto _L4; else goto _L3
_L3:
        obj = abyte0;
        m1 = new m(i, abyte0, map, false);
        return m1;
        ioexception;
        obj1 = map;
_L7:
        if (obj1 != null)
        {
            i = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
            ab.c("Unexpected response code %d for %s", new Object[] {
                Integer.valueOf(i), p1.d()
            });
            if (obj != null)
            {
                obj = new m(i, ((byte []) (obj)), ((Map) (obj2)), false);
                if (i == 401 || i == 403)
                {
                    a("auth", p1, ((aa) (new com.android.a.a(((m) (obj))))));
                } else
                {
                    throw new y(((m) (obj)));
                }
            } else
            {
                throw new l(null);
            }
        } else
        {
            throw new n(ioexception);
        }
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
    }

    static 
    {
        a = ab.b;
    }
}
