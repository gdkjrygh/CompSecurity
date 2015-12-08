// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.go.weatherex.home.b:
//            c, a, f, b

class e
    implements Runnable
{

    final a a;
    private SparseArray b;
    private String c;
    private File d;
    private c e;
    private String f;

    private e(a a1, String s, String s1)
    {
        a = a1;
        super();
        c = s;
        e = c.a;
        b = new SparseArray();
        f = s1;
    }

    e(a a1, String s, String s1, b b1)
    {
        this(a1, s, s1);
    }

    public void a(int i, f f1)
    {
        if (b.get(i) == null)
        {
            b.put(i, f1);
        }
    }

    public void run()
    {
        boolean flag = false;
        if (e != c.b) goto _L2; else goto _L1
_L1:
        Object obj1;
        int i;
        if (d.exists())
        {
            obj1 = com.go.weatherex.home.b.a.b(d.getAbsolutePath());
            break MISSING_BLOCK_LABEL_34;
        }
          goto _L3
_L2:
        if (e != c.a) goto _L3; else goto _L4
_L4:
        Object obj = c.substring(c.lastIndexOf("/") + 1);
        Object obj2 = new File((new StringBuilder()).append(f).append(((String) (obj))).toString());
        byte abyte0[];
        Object obj3;
        ByteArrayOutputStream bytearrayoutputstream;
        long l;
        long l1;
        long l2;
        long l3;
        if (((File) (obj2)).exists())
        {
            obj = com.go.weatherex.home.b.a.b(((File) (obj2)).getAbsolutePath());
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj1 = obj;
            i = ((flag) ? 1 : 0);
            if (!((Bitmap) (obj)).isRecycled())
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        ((File) (obj2)).delete();
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj1 = new DefaultHttpClient();
        HttpConnectionParams.setConnectionTimeout(((HttpClient) (obj1)).getParams(), 10000);
        HttpConnectionParams.setSoTimeout(((HttpClient) (obj1)).getParams(), 15000);
        obj2 = ((HttpClient) (obj1)).execute(new HttpGet(c));
        obj1 = ((HttpResponse) (obj2)).getFirstHeader("Content-Length");
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        if (!TextUtils.isEmpty(((Header) (obj1)).getValue())) goto _L8; else goto _L7
_L7:
        obj1 = "0";
_L13:
        l = Long.parseLong(((String) (obj1)));
_L18:
        try
        {
            i = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
            obj1 = ((HttpResponse) (obj2)).getEntity().getContent();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj1 = null;
            l1 = 0L;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            obj1 = null;
            l1 = 0L;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            l3 = 0L;
            obj1 = null;
            continue; /* Loop/switch isn't completed */
        }
_L14:
        if (i != 200 && i != 206) goto _L10; else goto _L9
_L9:
        try
        {
            abyte0 = new byte[2048];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            l1 = 0L;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            l1 = 0L;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            l3 = 0L;
            continue; /* Loop/switch isn't completed */
        }
        l1 = 0L;
_L12:
        l3 = l1;
        l2 = l;
        obj2 = obj1;
        i = ((InputStream) (obj1)).read(abyte0);
        l2 = l1;
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l3 = l1;
        l2 = l;
        obj2 = obj1;
        bytearrayoutputstream.write(abyte0, 0, i);
        l1 += i;
        if (true) goto _L12; else goto _L11
_L8:
        obj1 = ((Header) (obj1)).getValue();
          goto _L13
_L10:
        l2 = 0L;
_L11:
        if (l > 0L && l2 != l)
        {
            Log.d("ImageManager", (new StringBuilder()).append("Content-Length error, contentLength:").append(l).append(", readLength:").append(l2).toString());
        } else
        {
            obj = com.go.weatherex.home.b.a.a(bytearrayoutputstream.toByteArray());
        }
        if (obj != null)
        {
            a.a(c, ((Bitmap) (obj)));
            com.go.weatherex.home.b.a.a(a, c, ((Bitmap) (obj)), f);
            Log.d("ImageManager", (new StringBuilder()).append("Image cached ").append(c).toString());
        } else
        {
            Log.w("ImageManager", (new StringBuilder()).append("Failed to cache ").append(c).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_516;
        }
        ((InputStream) (obj1)).close();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = obj;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
        obj3;
        l = 0L;
        obj1 = null;
        l1 = 0L;
_L17:
        l3 = l1;
        l2 = l;
        obj2 = obj1;
        Log.w("ImageManager", (new StringBuilder()).append("Couldn't load bitmap from url: ").append(c).append(", exception:").append(((Exception) (obj3)).toString()).toString());
        if (l > 0L && l1 != l)
        {
            Log.d("ImageManager", (new StringBuilder()).append("Content-Length error, contentLength:").append(l).append(", readLength:").append(l1).toString());
        } else
        {
            obj = com.go.weatherex.home.b.a.a(bytearrayoutputstream.toByteArray());
        }
        if (obj != null)
        {
            a.a(c, ((Bitmap) (obj)));
            com.go.weatherex.home.b.a.a(a, c, ((Bitmap) (obj)), f);
            Log.d("ImageManager", (new StringBuilder()).append("Image cached ").append(c).toString());
        } else
        {
            Log.w("ImageManager", (new StringBuilder()).append("Failed to cache ").append(c).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_715;
        }
        ((InputStream) (obj1)).close();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = obj;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
        obj3;
        l = 0L;
        obj1 = null;
        l1 = 0L;
_L16:
        l3 = l1;
        l2 = l;
        obj2 = obj1;
        Log.w("ImageManager", (new StringBuilder()).append("Couldn't load bitmap from url: ").append(c).append(", exception:").append(((OutOfMemoryError) (obj3)).toString()).toString());
        if (l > 0L && l1 != l)
        {
            Log.d("ImageManager", (new StringBuilder()).append("Content-Length error, contentLength:").append(l).append(", readLength:").append(l1).toString());
        } else
        {
            obj = com.go.weatherex.home.b.a.a(bytearrayoutputstream.toByteArray());
        }
        if (obj != null)
        {
            a.a(c, ((Bitmap) (obj)));
            com.go.weatherex.home.b.a.a(a, c, ((Bitmap) (obj)), f);
            Log.d("ImageManager", (new StringBuilder()).append("Image cached ").append(c).toString());
        } else
        {
            Log.w("ImageManager", (new StringBuilder()).append("Failed to cache ").append(c).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_914;
        }
        ((InputStream) (obj1)).close();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = obj;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
        obj3;
        l3 = 0L;
        l = 0L;
        obj1 = null;
_L15:
        if (l > 0L && l3 != l)
        {
            Log.d("ImageManager", (new StringBuilder()).append("Content-Length error, contentLength:").append(l).append(", readLength:").append(l3).toString());
        } else
        {
            obj = com.go.weatherex.home.b.a.a(bytearrayoutputstream.toByteArray());
        }
        if (obj != null)
        {
            a.a(c, ((Bitmap) (obj)));
            com.go.weatherex.home.b.a.a(a, c, ((Bitmap) (obj)), f);
            Log.d("ImageManager", (new StringBuilder()).append("Image cached ").append(c).toString());
        } else
        {
            Log.w("ImageManager", (new StringBuilder()).append("Failed to cache ").append(c).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1062;
        }
        ((InputStream) (obj1)).close();
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj3;
_L20:
        for (i = ((flag) ? 1 : 0); i < b.size(); i++)
        {
            f f1 = (f)b.valueAt(i);
            if (f1 != null)
            {
                f1.a(((Bitmap) (obj1)), c);
            }
        }

        a.e.remove(c);
        return;
        obj3;
        l = l2;
        obj1 = obj2;
        if (true) goto _L15; else goto _L14
        obj3;
        if (true) goto _L16; else goto _L14
        obj3;
        if (true) goto _L17; else goto _L6
_L6:
        l = 0L;
          goto _L18
_L3:
        obj1 = null;
        i = ((flag) ? 1 : 0);
        if (true) goto _L20; else goto _L19
_L19:
    }
}
