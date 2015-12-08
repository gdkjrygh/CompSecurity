// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.download;

import android.os.AsyncTask;
import com.gau.go.launcherex.gowidget.c.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

// Referenced classes of package com.gau.go.launcherex.gowidget.download:
//            e, DownloadService, g, c

class d extends AsyncTask
{

    final DownloadService a;
    private e b;

    public d(DownloadService downloadservice, e e1)
    {
        a = downloadservice;
        super();
        b = e1;
    }

    private int a()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        if (b.h() != 7) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        boolean flag;
        try
        {
            File file = new File(b.g());
            File file1 = file.getParentFile();
            if (!file1.exists())
            {
                file1.mkdirs();
            }
            file.createNewFile();
            if (b.e() > 0L)
            {
                b.a();
                b.c(6);
            }
            flag = a(b.c(), file);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return 0;
        }
        if (!flag) goto _L1; else goto _L3
_L3:
        return 1;
        return -1;
    }

    private HttpURLConnection a(String s)
    {
        s = new URL(s);
        if (!g.c(a.getApplicationContext()) || g.c(a.getApplicationContext()) == 1) goto _L2; else goto _L1
_L1:
        HttpURLConnection httpurlconnection;
        String s1 = g.a(a.getApplicationContext());
        int i = g.b(a.getApplicationContext());
        httpurlconnection = (HttpURLConnection)s.openConnection(new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s1, i)));
        Object obj;
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setConnectTimeout(60000);
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setReadTimeout(60000);
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setChunkedStreamingMode(4096);
_L4:
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setRequestProperty("User-Agent", "NetFox");
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setRequestProperty("RANGE", (new StringBuilder()).append("bytes=").append(b.e()).append("-").toString());
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setDoInput(true);
        return httpurlconnection;
_L2:
        httpurlconnection = (HttpURLConnection)s.openConnection();
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setConnectTimeout(45000);
        s = httpurlconnection;
        obj = httpurlconnection;
        httpurlconnection.setReadTimeout(45000);
        if (true) goto _L4; else goto _L3
_L3:
        obj;
_L8:
        ((MalformedURLException) (obj)).printStackTrace();
        return s;
        s;
        obj = null;
_L6:
        s.printStackTrace();
        return ((HttpURLConnection) (obj));
        s;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(int i, int j)
    {
        if (b != null)
        {
            b.b(i);
            c.a(a.getApplicationContext()).a(Long.valueOf(b.b()));
            b.c(j);
        }
    }

    private boolean a(String s, File file)
    {
        Object obj1;
        Object obj2;
        long l;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        obj2 = null;
        obj1 = null;
        l = b.e();
        s = a(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            s.disconnect();
        }
        if (false)
        {
            throw new NullPointerException();
        }
        flag1 = flag;
        if (false)
        {
            throw new NullPointerException();
        }
_L7:
        return flag1;
_L2:
        if (!String.valueOf(s.getResponseCode()).startsWith("2"))
        {
            throw new Exception("fail!");
        }
          goto _L3
        Object obj;
        obj;
        obj2 = null;
        file = s;
        s = ((String) (obj2));
_L5:
        ((Exception) (obj)).printStackTrace();
        throw obj;
        obj2;
        obj = s;
        s = file;
        file = ((File) (obj2));
_L8:
        if (s != null)
        {
            s.disconnect();
        }
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        if (obj1 != null)
        {
            ((RandomAccessFile) (obj1)).close();
        }
        throw file;
_L3:
        obj = s.getInputStream();
        String s1;
        String s2;
        s1 = s.getHeaderField("ETag");
        s2 = b.i();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (!s2.equals(s1))
        {
            throw new Exception("fail!");
        }
        byte abyte0[];
        int i;
        b.c(s1);
        if (s.getHeaderField("Content-Range") == null)
        {
            throw new Exception("fail!");
        }
        i = (int)((long)s.getContentLength() + l);
        b.f();
        abyte0 = new byte[4096];
        file = new RandomAccessFile(file, "rw");
        file.seek(l);
        b.b(3);
_L4:
        int j;
        if (b.h() == 7 || b.h() == 6)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        j = ((InputStream) (obj)).read(abyte0);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        file.write(abyte0, 0, j);
        l += j;
        b.a(l);
        int k = ((int)l * 100) / i;
        b.a(k);
        b.c(2);
          goto _L4
        Exception exception;
        exception;
        obj1 = file;
        obj2 = obj;
        file = s;
        obj = exception;
        s = ((String) (obj2));
          goto _L5
        flag = flag1;
        if (l > 0L)
        {
            flag = flag1;
            if (i > 0)
            {
                flag = flag1;
                if (l == (long)i)
                {
                    flag = true;
                }
            }
        }
        if (s != null)
        {
            s.disconnect();
        }
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        flag1 = flag;
        if (file == null) goto _L7; else goto _L6
_L6:
        file.close();
        return flag;
        file;
        obj = null;
        s = null;
        obj1 = obj2;
          goto _L8
        file;
        obj = null;
        obj1 = obj2;
          goto _L8
        obj2;
        obj1 = file;
        file = ((File) (obj2));
          goto _L8
        obj;
        s = null;
        file = null;
          goto _L5
        exception;
        file = ((File) (obj));
        obj2 = s;
        obj = exception;
        s = file;
        file = ((File) (obj2));
          goto _L5
        file;
        obj1 = obj2;
          goto _L8
    }

    protected transient Integer a(Object aobj[])
    {
        int i = -1;
        if (b == null) goto _L2; else goto _L1
_L1:
        b.b(2);
        b.c(1);
        i = a();
        i;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 70
    //                   1 61
    //                   2 79;
           goto _L2 _L3 _L4 _L5
_L2:
        return Integer.valueOf(i);
_L4:
        a(5, 3);
        continue; /* Loop/switch isn't completed */
_L3:
        a(4, 4);
        continue; /* Loop/switch isn't completed */
_L5:
        a(7, 5);
        if (true) goto _L2; else goto _L6
_L6:
    }

    protected void a(Integer integer)
    {
        super.onPostExecute(integer);
        integer.intValue();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 32
    //                   1 58;
           goto _L1 _L1 _L2
_L1:
        DownloadService.a(a);
        if (DownloadService.b(a) <= 0)
        {
            a.stopSelf();
        }
        return;
_L2:
        c.a(a.getApplicationContext()).c(b);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected transient void a(e ae[])
    {
        super.onProgressUpdate(ae);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((e[])aobj);
    }
}
