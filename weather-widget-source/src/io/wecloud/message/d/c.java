// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.ArrayBlockingQueue;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package io.wecloud.message.d:
//            d

public class c extends Thread
{

    private int a;
    private int b;
    private RandomAccessFile c;
    private String d;
    private int e;
    private boolean f;
    private ArrayBlockingQueue g;
    private ArrayBlockingQueue h;
    private d i;

    public c(int j, int k, RandomAccessFile randomaccessfile, String s, int l, ArrayBlockingQueue arrayblockingqueue, ArrayBlockingQueue arrayblockingqueue1)
    {
        f = true;
        a = j;
        b = k;
        c = randomaccessfile;
        d = s;
        e = l;
        g = arrayblockingqueue;
        h = arrayblockingqueue1;
    }

    private void a(int j, int k)
    {
        i = (d)h.poll();
        if (i == null)
        {
            i = new d(j, k, e);
        } else
        {
            i.a = j;
            i.b = k;
            i.c = e;
        }
        g.put(i);
    }

    private void b()
    {
        c = null;
        g = null;
        h = null;
    }

    public void a()
    {
        f = false;
    }

    public void run()
    {
        DefaultHttpClient defaulthttpclient1;
        Object obj1;
        c.seek(a);
        obj1 = new HttpGet(d);
        defaulthttpclient1 = new DefaultHttpClient();
        DefaultHttpClient defaulthttpclient = defaulthttpclient1;
        obj1 = defaulthttpclient1.execute(((org.apache.http.client.methods.HttpUriRequest) (obj1)));
        defaulthttpclient = defaulthttpclient1;
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200) goto _L2; else goto _L1
_L1:
        defaulthttpclient = defaulthttpclient1;
        obj1 = new BufferedInputStream(((HttpResponse) (obj1)).getEntity().getContent(), 8192);
        defaulthttpclient = defaulthttpclient1;
        byte abyte0[] = new byte[8192];
_L6:
        defaulthttpclient = defaulthttpclient1;
        int j = ((InputStream) (obj1)).read(abyte0);
        if (j == -1) goto _L4; else goto _L3
_L3:
        defaulthttpclient = defaulthttpclient1;
        if (f) goto _L5; else goto _L4
_L4:
        defaulthttpclient = defaulthttpclient1;
        a(0, 0);
_L7:
        Object obj2;
        try
        {
            a(3, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((InterruptedException) (obj)).printStackTrace();
        }
        if (c != null)
        {
            try
            {
                c.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        c = null;
        if (defaulthttpclient1 != null)
        {
            defaulthttpclient1.getConnectionManager().shutdown();
        }
        b();
        return;
_L5:
        defaulthttpclient = defaulthttpclient1;
        c.write(abyte0, 0, j);
        defaulthttpclient = defaulthttpclient1;
        a(1, j);
          goto _L6
        obj2;
_L10:
        defaulthttpclient = defaulthttpclient1;
        ((Exception) (obj2)).printStackTrace();
        defaulthttpclient = defaulthttpclient1;
        a(2, 0);
_L8:
        Object obj;
        try
        {
            a(3, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((InterruptedException) (obj)).printStackTrace();
        }
        if (c != null)
        {
            try
            {
                c.close();
            }
            catch (IOException ioexception) { }
        }
        c = null;
        if (defaulthttpclient1 != null)
        {
            defaulthttpclient1.getConnectionManager().shutdown();
        }
        b();
        return;
_L2:
        defaulthttpclient = defaulthttpclient1;
        a(2, 10);
          goto _L7
        obj2;
        defaulthttpclient1 = defaulthttpclient;
        obj = obj2;
_L9:
        try
        {
            a(3, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            ((InterruptedException) (obj2)).printStackTrace();
        }
        if (c != null)
        {
            try
            {
                c.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        c = null;
        if (defaulthttpclient1 != null)
        {
            defaulthttpclient1.getConnectionManager().shutdown();
        }
        b();
        throw obj;
        obj2;
        obj = defaulthttpclient1;
        ((InterruptedException) (obj2)).printStackTrace();
          goto _L8
        obj;
        defaulthttpclient1 = null;
          goto _L9
        obj2;
        defaulthttpclient1 = null;
          goto _L10
    }
}
