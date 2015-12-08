// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.os.Process;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            l, m, TransferException, e, 
//            d

public class b
    implements l
{

    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final String b;
    private final String c;
    private final m d;
    private final int e;
    private final long f;
    private final long g;
    private volatile boolean h;
    private Object i;
    private final boolean j;
    private final boolean k;
    private long l;
    private final d m;

    private b(String s, String s1, long l1, long l2, m m1, 
            int i1, boolean flag, boolean flag1, d d1)
    {
        c = com.google.android.apps.youtube.common.fromguava.c.a(s);
        b = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        boolean flag2;
        if (0L >= 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag2);
        f = 0L;
        if (l2 >= 0L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag2);
        g = l2;
        d = (m)com.google.android.apps.youtube.common.fromguava.c.a(m1);
        e = 0x100000;
        i = new Object();
        j = flag;
        k = flag1;
        m = d1;
    }

    public b(String s, String s1, long l1, m m1, boolean flag, boolean flag1, 
            d d1)
    {
        this(s, s1, 0L, l1, m1, 0x100000, flag, flag1, d1);
    }

    private static long a(HttpURLConnection httpurlconnection)
    {
        long l1;
        long l2;
        boolean flag;
        l2 = -1L;
        String s = httpurlconnection.getHeaderField("Content-Length");
        l1 = l2;
        Matcher matcher;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                l1 = Long.parseLong(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                l1 = l2;
            }
        }
        httpurlconnection = httpurlconnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(httpurlconnection)) goto _L2; else goto _L1
_L1:
        matcher = a.matcher(httpurlconnection);
        if (!matcher.find()) goto _L2; else goto _L3
_L3:
        try
        {
            l2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1L;
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            return l1;
        }
        if (l1 >= 0L) goto _L5; else goto _L4
_L4:
        L.c((new StringBuilder("Using contentLength parsed from Content-Range ")).append(httpurlconnection).toString());
        return l2;
_L9:
        com.google.android.apps.youtube.common.fromguava.c.b(flag, (new StringBuilder("Content-Length ")).append(s).append(" does not match Content-Range ").append(httpurlconnection).toString());
        return l1;
_L7:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        return l1;
_L5:
        if (l1 != l2) goto _L7; else goto _L6
_L6:
        flag = true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static HttpURLConnection a(URL url, long l1)
    {
        url = (HttpURLConnection)url.openConnection();
        url.setConnectTimeout(10000);
        url.setReadTimeout(10000);
        url.setDoOutput(false);
        url.setRequestProperty("Range", (new StringBuilder("bytes=")).append(l1).append("-").toString());
        url.connect();
        return url;
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return;
        }
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return;
        }
    }

    private void a(InputStream inputstream, FileChannel filechannel, HttpURLConnection httpurlconnection, TransferException transferexception)
    {
        L.a((new StringBuilder("download error [")).append(Thread.currentThread().getName()).append("] ").append(c).toString(), transferexception);
        a(inputstream);
        a(filechannel);
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        d.a(b, transferexception);
    }

    private void a(String s)
    {
        String s1 = s;
        if (j)
        {
            s1 = (new StringBuilder()).append(s).append(" [").append(Thread.currentThread().getName()).append("] ").append(b).toString();
        }
        L.e(s1);
    }

    private static void a(FileChannel filechannel)
    {
        Exception exception;
        if (filechannel == null)
        {
            return;
        }
        try
        {
            filechannel.force(true);
            filechannel.close();
        }
        catch (SyncFailedException syncfailedexception)
        {
            try
            {
                filechannel.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FileChannel filechannel)
            {
                return;
            }
        }
        catch (IOException ioexception)
        {
            try
            {
                filechannel.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FileChannel filechannel)
            {
                return;
            }
        }
        finally { }
        try
        {
            filechannel.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (FileChannel filechannel)
        {
            return;
        }
        try
        {
            filechannel.close();
        }
        // Misplaced declaration of an exception variable
        catch (FileChannel filechannel) { }
        throw exception;
    }

    private static boolean b(int i1)
    {
        return i1 >= 200 && i1 < 300;
    }

    protected int a(FileChannel filechannel, ByteBuffer bytebuffer)
    {
        return filechannel.write(bytebuffer);
    }

    public final void a(int i1)
    {
        synchronized (i)
        {
            h = true;
        }
    }

    public void run()
    {
        Process.setThreadPriority(10);
        File file;
        a("download starting");
        file = new File(b);
        Object obj2;
        byte abyte0[];
        Object obj4;
        obj2 = null;
        abyte0 = null;
        obj4 = null;
        L.f((new StringBuilder("opening output ")).append(b).toString());
        RandomAccessFile randomaccessfile;
        long l1;
        if (!file.exists())
        {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }
        randomaccessfile = new RandomAccessFile(b, "rw");
        if (f <= 0L)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        L.f((new StringBuilder("writing from ")).append(f).toString());
        randomaccessfile.seek(f);
        l1 = f;
_L1:
        FileChannel filechannel = randomaccessfile.getChannel();
        if (g > 0L && l1 == g)
        {
            a(filechannel);
            a("download already completed");
            d.a(b, null);
            return;
        }
        break MISSING_BLOCK_LABEL_273;
        try
        {
            l1 = randomaccessfile.length();
            randomaccessfile.seek(l1);
            L.f((new StringBuilder("appending from ")).append(l1).toString());
        }
        catch (Exception exception)
        {
            try
            {
                a(null, null, null, new TransferException(exception, true));
                return;
            }
            catch (Exception exception1)
            {
                d.a(b, new TransferException(exception1, false));
            }
            return;
        }
          goto _L1
        L.f((new StringBuilder("opening input ")).append(c).toString());
        Object obj = obj2;
        URL url = new URL(c.toString());
        obj = obj2;
        HttpURLConnection httpurlconnection = a(url, l1);
        obj = httpurlconnection;
        int i1 = httpurlconnection.getResponseCode();
        obj = httpurlconnection;
        long l2 = a(httpurlconnection);
        obj = httpurlconnection;
        L.f((new StringBuilder("responseCode=")).append(i1).append(" contentLength=").append(l2).toString());
        obj = httpurlconnection;
        obj2 = httpurlconnection;
        if (g != 0L) goto _L3; else goto _L2
_L2:
        obj2 = httpurlconnection;
        if (i1 != 416) goto _L3; else goto _L4
_L4:
        obj = httpurlconnection;
        httpurlconnection.disconnect();
        obj = httpurlconnection;
        httpurlconnection = a(url, l1 - 1L);
        obj = httpurlconnection;
        obj2 = httpurlconnection;
        if (!b(httpurlconnection.getResponseCode())) goto _L3; else goto _L5
_L5:
        obj = httpurlconnection;
        a("download already completed");
        obj = httpurlconnection;
        a(filechannel);
        obj = httpurlconnection;
        httpurlconnection.disconnect();
        obj = httpurlconnection;
        d.a(b, l1);
        obj = httpurlconnection;
        try
        {
            d.a(b, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj3 = obj;
        }
        obj = obj4;
_L8:
        a(((InputStream) (obj)), filechannel, ((HttpURLConnection) (obj3)), new TransferException(((Throwable) (obj2)), false));
        return;
_L3:
        obj = abyte0;
        if (b(i1)) goto _L7; else goto _L6
_L6:
        obj = abyte0;
        obj3 = (new StringBuilder("http status ")).append(i1).toString();
        obj = abyte0;
        boolean flag;
        Exception exception2;
        ByteBuffer bytebuffer;
        int j1;
        long l3;
        long l4;
        if (i1 / 100 == 4 && i1 != 408)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = abyte0;
        try
        {
            a(null, filechannel, ((HttpURLConnection) (obj2)), new TransferException(((String) (obj3)), flag));
            return;
        }
        catch (Exception exception3)
        {
            obj3 = obj2;
            obj2 = exception3;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (l2 >= 1L)
        {
            break MISSING_BLOCK_LABEL_632;
        }
        obj = abyte0;
        a(null, filechannel, ((HttpURLConnection) (obj2)), new TransferException((new StringBuilder("content length ")).append(l2).toString(), true));
        return;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_730;
        }
        obj = abyte0;
        obj3 = ((HttpURLConnection) (obj2)).getHeaderField("Content-Range");
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_683;
        }
        obj = abyte0;
        if (((String) (obj3)).contains((new StringBuilder()).append(l1).append("-").toString()))
        {
            break MISSING_BLOCK_LABEL_730;
        }
        obj = abyte0;
        a(null, filechannel, ((HttpURLConnection) (obj2)), new TransferException((new StringBuilder("Content-Range ")).append(((String) (obj3))).append(", not ").append(l1).toString(), false));
        l3 = l1 + l2;
        obj = abyte0;
        L.f((new StringBuilder("size is ")).append(l3).toString());
        obj = abyte0;
        if (g <= 0L)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        obj = abyte0;
        if (l3 == g)
        {
            break MISSING_BLOCK_LABEL_842;
        }
        obj = abyte0;
        a(null, filechannel, ((HttpURLConnection) (obj2)), new TransferException((new StringBuilder("unexpected size ")).append(l3).toString(), true));
        return;
        obj = abyte0;
        d.a(b, l3);
        obj = abyte0;
        if (!k)
        {
            break MISSING_BLOCK_LABEL_862;
        }
        obj = abyte0;
        randomaccessfile.setLength(l3);
        obj = abyte0;
        obj3 = ((HttpURLConnection) (obj2)).getInputStream();
        obj = obj3;
        if (m == null) goto _L10; else goto _L9
_L9:
        obj = obj3;
        obj3 = new e(((InputStream) (obj3)), m);
        obj1 = obj3;
_L14:
        abyte0 = new byte[0x10000];
        bytebuffer = ByteBuffer.wrap(abyte0);
        i1 = 0;
_L12:
        flag = h;
        if (flag || i1 == -1)
        {
            break MISSING_BLOCK_LABEL_958;
        }
        j1 = ((InputStream) (obj1)).read(abyte0, 0, 0x10000);
        synchronized (i)
        {
            if (!h)
            {
                break MISSING_BLOCK_LABEL_1005;
            }
        }
        a(((InputStream) (obj1)));
        a(filechannel);
        ((HttpURLConnection) (obj2)).disconnect();
        if (h)
        {
            a("download canceled");
            return;
        }
        break; /* Loop/switch isn't completed */
        obj3;
        a(((InputStream) (obj1)), filechannel, ((HttpURLConnection) (obj2)), new TransferException(((Throwable) (obj3)), false));
        return;
        flag = k;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1161;
        }
        l2 = filechannel.position();
        l4 = filechannel.size();
        if (l2 != l1)
        {
            break MISSING_BLOCK_LABEL_1055;
        }
        if (f != 0L || l4 == l1)
        {
            break MISSING_BLOCK_LABEL_1161;
        }
        a(((InputStream) (obj1)), filechannel, ((HttpURLConnection) (obj2)), new TransferException((new StringBuilder("Inconsistent filechannel status [")).append(l1).append(",").append(l4).append(",").append(l2).append(",").append(f).append("]").toString(), true));
        obj3;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        exception2;
        a(((InputStream) (obj1)), filechannel, ((HttpURLConnection) (obj2)), new TransferException(exception2, true));
        obj3;
        JVM INSTR monitorexit ;
        return;
        l2 = l1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1247;
        }
        bytebuffer.position(0);
        bytebuffer.limit(j1);
        i1 = a(filechannel, bytebuffer);
        if (i1 == j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag, (new StringBuilder("wrote ")).append(i1).append(" != ").append(j1).toString());
        l2 = l1 + (long)j1;
        if (j1 == -1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l2 - l <= (long)e && i1 == 0)
        {
            break MISSING_BLOCK_LABEL_1332;
        }
        L.f((new StringBuilder("progress ")).append(l2).append(" ").append(b).toString());
        d.b(b, l2);
        l = l2;
        obj3;
        JVM INSTR monitorexit ;
        i1 = j1;
        l1 = l2;
        if (true) goto _L12; else goto _L11
        exception2;
        a(((InputStream) (obj1)), filechannel, ((HttpURLConnection) (obj2)), new TransferException(exception2, false));
        obj3;
        JVM INSTR monitorexit ;
        return;
_L11:
        if (file.length() != l3)
        {
            a(((InputStream) (obj1)), filechannel, ((HttpURLConnection) (obj2)), new TransferException((new StringBuilder("download completed with unexpected size ")).append(file.length()).append(" expecting ").append(l3).toString(), true));
            return;
        }
        a("download completed");
        d.a(b, null);
        return;
_L10:
        obj1 = obj3;
        if (true) goto _L14; else goto _L13
_L13:
        break; /* Loop/switch isn't completed */
    }

}
