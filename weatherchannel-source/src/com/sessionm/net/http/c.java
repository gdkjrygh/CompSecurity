// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.net.http;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.sessionm.core.Config;
import com.sessionm.core.h;
import com.sessionm.net.b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.sessionm.net.http:
//            d

public class c
    implements Runnable
{

    static final String TAG = "SessionM.Request";
    static final String hZ = "SessionM.Cookies";
    public static final int ia = 30000;
    private static final int ib = 10;
    private static int il = 0;
    private Throwable fT;
    private boolean fW;
    private boolean gm;
    private b ic;
    private String id;
    private Map ie;
    private Map _fldif;
    private d ig;
    private int ih;
    private String ii;
    private long ij;
    private long ik;
    private int im;
    private String method;
    private int priority;
    private int statusCode;
    private String url;

    public c()
    {
        gm = true;
        ik = 30000L;
        im = 0;
    }

    public static List a(Map map, String s)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (s1 != null && s.equalsIgnoreCase(s1))
            {
                return (List)map.get(s1);
            }
        }

        return null;
    }

    public static int bB()
    {
        return il;
    }

    void G(String s)
    {
        url = s;
    }

    void H(String s)
    {
        id = s;
    }

    public void I(String s)
    {
        ii = s;
    }

    void a(b b1)
    {
        ic = b1;
    }

    public boolean bA()
    {
        return gm;
    }

    protected b bz()
    {
        return ic;
    }

    void c(Map map)
    {
        _fldif = map;
    }

    void e(long l)
    {
        ij = l;
    }

    public void g(boolean flag)
    {
        gm = flag;
    }

    int getPriority()
    {
        return priority;
    }

    void h(boolean flag)
    {
        fW = flag;
    }

    public void run()
    {
        Object obj;
        Object obj2;
        Object obj3;
        long l3;
        obj2 = null;
        obj3 = null;
        if (Log.isLoggable("SessionM.Request", 3))
        {
            Log.d("SessionM.Request", (new StringBuilder()).append("Start request, URL: ").append(url).append(", POST params: ").append(id).append(", timeout: ").append(ik).toString());
        }
        l3 = System.currentTimeMillis();
        obj = obj2;
        Object obj1 = new URL(url);
        obj = obj2;
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = obj2;
        if (!Config.f().getServerType().equals(com.sessionm.core.Config.ServerType.aF))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj = obj2;
        URI uri = new URI(url);
        obj = obj2;
        obj1 = new URL(((URL) (obj1)).getProtocol(), uri.getHost(), uri.getPort(), ((URL) (obj1)).getFile());
        obj = obj2;
        obj1 = (HttpURLConnection)((URL) (obj1)).openConnection();
        long l2;
        long l4;
        ((HttpURLConnection) (obj1)).setInstanceFollowRedirects(false);
        l2 = ik;
        l4 = System.currentTimeMillis();
        ((HttpURLConnection) (obj1)).setConnectTimeout((int)l2);
        long l = l2;
        if (l2 <= 0L) goto _L2; else goto _L1
_L1:
        l2 -= System.currentTimeMillis() - l4;
        l = l2;
        if (l2 > 0L) goto _L2; else goto _L3
_L3:
        throw new SocketTimeoutException("Connect timeout");
        obj2;
_L15:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj = obj1;
        statusCode = ((HttpURLConnection) (obj1)).getResponseCode();
_L12:
        obj = obj1;
        if (!(obj2 instanceof SocketTimeoutException)) goto _L5; else goto _L4
_L4:
        obj = obj1;
        if (!Log.isLoggable("SessionM.Request", 3))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj = obj1;
        Log.d("SessionM.Request", "Request timeout");
_L14:
        obj = obj1;
        fT = ((Throwable) (obj2));
        l = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Request", 3))
        {
            obj = String.format(Locale.US, "URL: %s, code: %d, error: %s, start delta: %d, finish delta: %d, processing time: %d, response size: %d", new Object[] {
                url, Integer.valueOf(statusCode), fT, Long.valueOf(l3 - ij), Long.valueOf(l - ij), Long.valueOf(l - l3), Integer.valueOf(ih)
            });
            Log.d("SessionM.Request", (new StringBuilder()).append("Finish request, ").append(((String) (obj))).toString());
        }
        if (ic != null)
        {
            ic.a(ig, fT, statusCode, ie);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        ((HttpURLConnection) (obj1)).disconnect();
_L9:
        return;
_L2:
        int i = (int)l;
        ((HttpURLConnection) (obj1)).setReadTimeout(i);
        if (_fldif != null)
        {
            for (obj = _fldif.keySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                obj2 = (String)((Iterator) (obj)).next();
                obj3 = ((List)_fldif.get(obj2)).iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    ((HttpURLConnection) (obj1)).addRequestProperty(((String) (obj2)), (String)((Iterator) (obj3)).next());
                }
            }

        }
          goto _L6
        obj2;
        obj = obj1;
        obj1 = obj2;
_L16:
        long l1 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Request", 3))
        {
            obj2 = String.format(Locale.US, "URL: %s, code: %d, error: %s, start delta: %d, finish delta: %d, processing time: %d, response size: %d", new Object[] {
                url, Integer.valueOf(statusCode), fT, Long.valueOf(l3 - ij), Long.valueOf(l1 - ij), Long.valueOf(l1 - l3), Integer.valueOf(ih)
            });
            Log.d("SessionM.Request", (new StringBuilder()).append("Finish request, ").append(((String) (obj2))).toString());
        }
        if (ic != null)
        {
            ic.a(ig, fT, statusCode, ie);
        }
        Throwable throwable;
        if (obj != null)
        {
            try
            {
                ((HttpURLConnection) (obj)).disconnect();
            }
            catch (Throwable throwable1)
            {
                if (Log.isLoggable("SessionM.Request", 3))
                {
                    Log.d("SessionM.Request", "Exception on disconnect.", throwable1);
                }
            }
        }
        throw obj1;
_L6:
        ((HttpURLConnection) (obj1)).setRequestMethod(method);
        if (ic != null)
        {
            ic.aM();
        }
        if (Log.isLoggable("SessionM.Cookies", 3))
        {
            Log.d("SessionM.Cookies", String.format("Full cookie for api request: %s", new Object[] {
                ii
            }));
        }
        ((HttpURLConnection) (obj1)).setRequestProperty("Cookie", CookieManager.getInstance().getCookie(url));
        if (fW)
        {
            ((HttpURLConnection) (obj1)).addRequestProperty(com.sessionm.net.Request.Header.go.getKey(), "only-if-cached");
        }
        if (ig != null || fW)
        {
            break MISSING_BLOCK_LABEL_1275;
        }
        if (method.equalsIgnoreCase("POST") || method.equalsIgnoreCase("PUT"))
        {
            ((HttpURLConnection) (obj1)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            ((HttpURLConnection) (obj1)).setDoOutput(true);
            ((HttpURLConnection) (obj1)).setDoInput(true);
            obj = new BufferedOutputStream(((HttpURLConnection) (obj1)).getOutputStream());
            ((OutputStream) (obj)).write(id.getBytes("UTF-8"));
            ((OutputStream) (obj)).flush();
            ((OutputStream) (obj)).close();
        }
        obj = new BufferedInputStream(((HttpURLConnection) (obj1)).getInputStream(), 0x10000);
        statusCode = ((HttpURLConnection) (obj1)).getResponseCode();
        ie = ((HttpURLConnection) (obj1)).getHeaderFields();
        ic.b(ie);
        obj2 = ic.aN();
        ig = null;
        if (statusCode < 200 || statusCode >= 400)
        {
            break MISSING_BLOCK_LABEL_1035;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1128;
        }
        obj3 = new BufferedOutputStream(new FileOutputStream(((java.io.File) (obj2))));
        ih = com.sessionm.core.h.a(((InputStream) (obj)), ((OutputStream) (obj3)));
        ig = new d(null);
        ig.b(((java.io.File) (obj2)));
        ((OutputStream) (obj3)).close();
_L7:
        ((InputStream) (obj)).close();
        if (fT != null || ie == null || !gm)
        {
            break MISSING_BLOCK_LABEL_1169;
        }
        obj2 = a(ie, com.sessionm.net.Request.Header.gr.getKey());
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1169;
        }
        obj = CookieManager.getInstance();
        CookieSyncManager.getInstance().startSync();
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((CookieManager) (obj)).setCookie(url, ((String) (obj3))))
        {
            obj3 = (String)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_1163;
        obj2 = new ByteArrayOutputStream(0x10000);
        ih = com.sessionm.core.h.a(((InputStream) (obj)), ((OutputStream) (obj2)));
        ig = new d(((ByteArrayOutputStream) (obj2)));
          goto _L7
        CookieSyncManager.getInstance().stopSync();
        if (statusCode >= 300 && statusCode < 310 && statusCode != 304 && im < 10 && ((HttpURLConnection) (obj1)).getHeaderField("Location") != null)
        {
            url = (new URL(((HttpURLConnection) (obj1)).getHeaderField("Location"))).toString();
            ig = null;
            il = statusCode;
            im = im + 1;
            while (ig == null) 
            {
                run();
            }
        }
        l1 = System.currentTimeMillis();
        if (Log.isLoggable("SessionM.Request", 3))
        {
            obj = String.format(Locale.US, "URL: %s, code: %d, error: %s, start delta: %d, finish delta: %d, processing time: %d, response size: %d", new Object[] {
                url, Integer.valueOf(statusCode), fT, Long.valueOf(l3 - ij), Long.valueOf(l1 - ij), Long.valueOf(l1 - l3), Integer.valueOf(ih)
            });
            Log.d("SessionM.Request", (new StringBuilder()).append("Finish request, ").append(((String) (obj))).toString());
        }
        if (ic != null)
        {
            ic.a(ig, fT, statusCode, ie);
        }
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        try
        {
            ((HttpURLConnection) (obj1)).disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (!Log.isLoggable("SessionM.Request", 3)) goto _L9; else goto _L10
_L10:
        Log.d("SessionM.Request", "Exception on disconnect.", ((Throwable) (obj)));
        return;
        obj3;
        obj = obj1;
        if (!Log.isLoggable("SessionM.Request", 3)) goto _L12; else goto _L11
_L11:
        obj = obj1;
        Log.d("SessionM.Request", "Status code unavailable.", ((Throwable) (obj3)));
          goto _L12
_L5:
        obj = obj1;
        if (!Log.isLoggable("SessionM.Request", 3)) goto _L14; else goto _L13
_L13:
        obj = obj1;
        Log.d("SessionM.Request", "Uncaught exception during request processing", ((Throwable) (obj2)));
          goto _L14
        throwable;
        if (Log.isLoggable("SessionM.Request", 3))
        {
            Log.d("SessionM.Request", "Exception on disconnect.", throwable);
            return;
        }
          goto _L9
        obj2;
        obj1 = obj3;
          goto _L15
        obj1;
          goto _L16
    }

    void setMethod(String s)
    {
        method = s;
    }

    void setPriority(int i)
    {
        priority = i;
    }

    void setTimeout(long l)
    {
        if (l < 0L)
        {
            ik = 30000L;
            return;
        } else
        {
            ik = l;
            return;
        }
    }

}
