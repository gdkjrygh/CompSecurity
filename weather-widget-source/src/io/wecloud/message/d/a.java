// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.d;

import io.wecloud.message.e.c;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package io.wecloud.message.d:
//            c, b, d, e

public class a
    implements Runnable
{

    public static int a = 10000;
    private String b;
    private int c;
    private String d;
    private List e;
    private ArrayBlockingQueue f;
    private ArrayBlockingQueue g;
    private b h;
    private e i;
    private boolean j;

    private a()
    {
        b = "";
        c = 4;
        f = new ArrayBlockingQueue(100);
        g = new ArrayBlockingQueue(100);
    }

    public a(String s, String s1, int k)
    {
        this();
        b = s;
        d = s1;
        c = k;
    }

    private void a()
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = e.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        f = null;
        g = null;
        h = null;
        i = null;
        return;
_L3:
        ((io.wecloud.message.d.c)iterator.next()).a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(int k)
    {
        int j1 = 0;
        if (k < c)
        {
            c = 1;
        }
        e = new ArrayList();
        if (c > 1)
        {
            int i2 = k / c;
            do
            {
                if (j1 >= c)
                {
                    return;
                }
                io.wecloud.message.d.c c1;
                int l;
                int k1;
                int l1;
                if (j1 == c - 1)
                {
                    k1 = k - 1;
                    l = j1 * i2;
                } else
                {
                    k1 = (j1 + 1) * i2 - 1;
                    l = j1 * i2;
                }
                l1 = l;
                if (h != null)
                {
                    l1 = l + ((Integer)io.wecloud.message.d.b.a(h).get(Integer.valueOf(j1))).intValue();
                }
                c1 = new io.wecloud.message.d.c(l1, k1, new RandomAccessFile(d, "rwd"), b, j1, f, g);
                e.add(c1);
                c1.start();
                j1++;
            } while (true);
        }
        io.wecloud.message.d.c c2;
        int i1;
        if (h != null)
        {
            i1 = 0 + ((Integer)io.wecloud.message.d.b.a(h).get(Integer.valueOf(0))).intValue();
        } else
        {
            i1 = 0;
        }
        c2 = new io.wecloud.message.d.c(i1, k - 1, new RandomAccessFile(d, "rwd"), b, 0, f, g);
        e.add(c2);
        c2.start();
    }

    private void a(d d1)
    {
        if (j)
        {
            d1.a = -1;
            d1.c = -1;
            g.offer(d1);
        }
    }

    private void b(int k)
    {
        if (i != null)
        {
            i.b(k);
        }
    }

    public void a(e e1)
    {
        i = e1;
    }

    public void run()
    {
        Object obj1;
        int k;
        int l;
        int i1;
        k = 0;
        l = 0;
        i1 = 0;
        obj1 = null;
        Object obj;
        long l1;
        l1 = System.currentTimeMillis();
        io.wecloud.message.e.c.a("DownLoadTask", (new StringBuilder("\u5F00\u59CB\u4E0B\u8F7DURL = ")).append(b).toString());
        obj = (HttpURLConnection)(new URL(b)).openConnection();
        int j1;
        i1 = k;
        j1 = l;
        ((HttpURLConnection) (obj)).setConnectTimeout(a);
        i1 = k;
        j1 = l;
        int k1 = ((HttpURLConnection) (obj)).getContentLength();
        i1 = k;
        j1 = l;
        if (200 == ((HttpURLConnection) (obj)).getResponseCode() && k1 >= 0)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        i1 = k;
        j1 = l;
        b(0);
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        if (i != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            i.a(0);
        }
        a();
        return;
        i1 = k;
        j1 = l;
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        i1 = k;
        j1 = l;
        if (io.wecloud.message.d.b.b(h) == k1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        i1 = k;
        j1 = l;
        io.wecloud.message.e.c.a("DownLoadTask", "\u5730\u5740\u6570\u636E\u5DF2\u66F4\u6539\uFF0C\u91CD\u65B0\u4E0B\u8F7D");
        i1 = k;
        j1 = l;
        a(k1);
        i1 = k;
        j1 = l;
        j = true;
        l = 0;
        k = 0;
_L6:
        if (c != k && j && c != l)
        {
            break MISSING_BLOCK_LABEL_346;
        }
        io.wecloud.message.e.c.a("DownLoadTask", (new StringBuilder("\u8017\u65F6")).append(System.currentTimeMillis() - l1).toString());
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        if (i != null)
        {
            Iterator iterator;
            Exception exception;
            try
            {
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            i.a(k);
        }
        a();
        return;
        obj1 = (d)f.take();
        i1 = ((d) (obj1)).a;
        i1;
        JVM INSTR tableswitch 0 3: default 396
    //                   0 412
    //                   1 458
    //                   2 487
    //                   3 587;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        i1 = k;
        j1 = k;
        a(((d) (obj1)));
          goto _L6
_L2:
        k++;
        i1 = k;
        j1 = k;
        io.wecloud.message.e.c.a("DownLoadTask", (new StringBuilder("\u7EBF\u7A0BId=")).append(((d) (obj1)).c).append("\u5DF2\u5B8C\u6210\u4E0B\u8F7D").toString());
          goto _L1
_L3:
        if (i == null) goto _L1; else goto _L7
_L7:
        i.a(k1, ((d) (obj1)).b, ((d) (obj1)).c);
          goto _L1
_L4:
        j = false;
        iterator = e.iterator();
_L9:
        if (iterator.hasNext()) goto _L8; else goto _L1
_L8:
        ((io.wecloud.message.d.c)iterator.next()).a();
          goto _L9
        obj1;
_L18:
        if (!(obj1 instanceof ConnectException)) goto _L11; else goto _L10
_L10:
        b(2);
        io.wecloud.message.e.c.a("DownLoadTask", "\u8FDE\u63A5\u5F02\u5E38", ((Throwable) (obj1)));
_L14:
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        if (i != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
            i.a(k);
        }
        a();
        return;
_L5:
        l++;
          goto _L1
_L11:
        if (!(obj1 instanceof FileNotFoundException)) goto _L13; else goto _L12
_L12:
        b(1);
        io.wecloud.message.e.c.a("DownLoadTask", "\u6587\u4EF6\u8DEF\u5F84\u9519\u8BEF", ((Throwable) (obj1)));
          goto _L14
        exception;
        i1 = k;
        obj1 = obj;
        obj = exception;
_L17:
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        if (i != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((InterruptedException) (obj1)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((Exception) (obj1)).printStackTrace();
            }
            i.a(i1);
        }
        a();
        throw obj;
_L13:
        if (!(obj1 instanceof SocketTimeoutException)) goto _L16; else goto _L15
_L15:
        b(1);
        io.wecloud.message.e.c.a("DownLoadTask", "\u8FDE\u63A5\u8D85\u65F6", ((Throwable) (obj1)));
          goto _L14
_L16:
        io.wecloud.message.e.c.d("DownLoadTask", (new StringBuilder()).append(obj1).toString());
          goto _L14
        obj;
          goto _L17
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
          goto _L17
        exception1;
        obj1 = obj;
        obj = exception1;
        i1 = k;
          goto _L17
        obj1;
        obj = null;
        k = 0;
          goto _L18
        obj1;
        k = j1;
          goto _L18
    }

}
