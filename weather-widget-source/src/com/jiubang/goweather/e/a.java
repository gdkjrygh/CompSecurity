// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.b.d;
import com.jiubang.goweather.b.e;
import com.jiubang.goweather.b.f;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Locale;

// Referenced classes of package com.jiubang.goweather.e:
//            b

public class a
{

    public static String a(Context context)
    {
        try
        {
            context = context.getResources().getConfiguration().locale;
            context = (new StringBuilder()).append(context.getLanguage()).append("_").append(context.getCountry()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "en_US";
        }
        return context;
    }

    public static String a(InputStream inputstream)
    {
        return a(inputstream, "UTF-8");
    }

    public static String a(InputStream inputstream, String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i > 0)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                byte abyte1[] = bytearrayoutputstream.toByteArray();
                inputstream.close();
                bytearrayoutputstream.close();
                return new String(abyte1, s);
            }
        } while (true);
    }

    public static String a(InputStream inputstream, String s, f f1)
    {
        Object obj;
        IOException ioexception;
        StringBuilder stringbuilder;
        ioexception = null;
        obj = null;
        stringbuilder = new StringBuilder();
        if (s != null) goto _L2; else goto _L1
_L1:
        inputstream = new InputStreamReader(inputstream);
_L8:
        s = new BufferedReader(inputstream);
_L5:
        obj = s.readLine();
        if (obj == null) goto _L4; else goto _L3
_L3:
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("\n");
          goto _L5
        ioexception;
        obj = s;
        s = ioexception;
_L9:
        s.printStackTrace();
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        f1.a(s);
        f1.b(11);
        f1.c(7);
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                if (f1 != null)
                {
                    f1.a(s);
                }
            }
        }
        if (inputstream == null) goto _L7; else goto _L6
_L6:
        inputstream.close();
_L7:
        return stringbuilder.toString();
_L2:
        inputstream = new InputStreamReader(inputstream, s);
          goto _L8
        s;
        inputstream = null;
          goto _L9
        s;
        inputstream = null;
        obj = ioexception;
_L11:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                if (f1 != null)
                {
                    f1.a(((Throwable) (obj)));
                }
            }
        }
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
                if (f1 != null)
                {
                    f1.a(inputstream);
                }
            }
        }
        throw s;
        inputstream;
        inputstream.printStackTrace();
        if (f1 == null) goto _L7; else goto _L10
_L10:
        f1.a(inputstream);
        break; /* Loop/switch isn't completed */
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                if (f1 != null)
                {
                    f1.a(s);
                }
            }
        }
        if (inputstream == null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            inputstream.close();
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        if (f1 == null) goto _L7; else goto _L10
        s;
        obj = ioexception;
          goto _L11
        Exception exception;
        exception;
        obj = s;
        s = exception;
          goto _L11
        s;
          goto _L11
        s;
          goto _L9
    }

    public static Proxy a()
    {
        String s = System.getProperty("http.proxyHost");
        String s1 = System.getProperty("http.proxyPort");
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            return new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, Integer.valueOf(s1).intValue()));
        } else
        {
            return null;
        }
    }

    public static boolean a(File file, File file1, long l, long l1)
    {
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!file.isFile())
        {
            return false;
        }
        if (!file.canRead())
        {
            return false;
        }
        if (!file1.getParentFile().exists())
        {
            file1.getParentFile().mkdirs();
        }
        if (file1.exists())
        {
            file1.delete();
        }
        Object obj = new FileInputStream(file);
        file = new FileOutputStream(file1);
        ((FileInputStream) (obj)).skip(l);
        file1 = new byte[(int)Math.min(1024L, l1)];
        l = 0L;
_L4:
        if (l >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = ((FileInputStream) (obj)).read(file1);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        file.write(file1, 0, i);
        long l2;
        long l3;
        l2 = l + (long)i;
        l3 = l1 - l2;
        l = l2;
        if (l3 >= (long)file1.length)
        {
            continue; /* Loop/switch isn't completed */
        }
        file1 = new byte[(int)l3];
        l = l2;
        if (true) goto _L4; else goto _L3
        obj;
        file1 = null;
        file = null;
_L9:
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file1.printStackTrace();
                }
            }
        }
        if (file == null) goto _L1; else goto _L5
_L5:
        file.close();
        return false;
        file;
        if (!com.gtp.a.a.b.c.a()) goto _L1; else goto _L6
_L6:
        file.printStackTrace();
        return false;
        file1;
        obj = null;
        file = null;
_L8:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        throw file1;
_L3:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file1.printStackTrace();
                }
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        return true;
        file1;
        file = null;
        continue; /* Loop/switch isn't completed */
        file1;
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        obj = file1;
        file1 = ((File) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        file = null;
        file1 = ((File) (obj));
        obj = obj1;
          goto _L9
        obj1;
        file1 = ((File) (obj));
        obj = obj1;
          goto _L9
    }

    public static boolean a(File file, File file1, Boolean boolean1)
    {
        Object obj = null;
        if (!file.getAbsolutePath().equals(file1.getAbsolutePath())) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!file.exists())
        {
            return false;
        }
        if (!file.isFile())
        {
            return false;
        }
        if (!file.canRead())
        {
            return false;
        }
        if (!file1.getParentFile().exists())
        {
            file1.getParentFile().mkdirs();
        }
        if (file1.exists() && boolean1.booleanValue())
        {
            file1.delete();
        }
        boolean1 = new FileInputStream(file);
        file = new FileOutputStream(file1);
        file1 = new byte[1024];
_L5:
        int i = boolean1.read(file1);
        if (i <= 0) goto _L4; else goto _L3
_L3:
        file.write(file1, 0, i);
          goto _L5
        obj;
        file1 = boolean1;
        boolean1 = ((Boolean) (obj));
_L8:
        if (com.gtp.a.a.b.c.a())
        {
            boolean1.printStackTrace();
        }
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file1.printStackTrace();
                }
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        return false;
        file1;
        file = null;
        boolean1 = null;
_L7:
        if (boolean1 != null)
        {
            try
            {
                boolean1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    boolean1.printStackTrace();
                }
            }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        throw file1;
_L4:
        if (boolean1 != null)
        {
            try
            {
                boolean1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file1.printStackTrace();
                }
            }
        }
        if (file == null) goto _L1; else goto _L6
_L6:
        file.close();
        return true;
        file;
        if (com.gtp.a.a.b.c.a())
        {
            file.printStackTrace();
            return true;
        }
          goto _L1
        file1;
        file = null;
          goto _L7
        file1;
          goto _L7
        obj;
        boolean1 = file1;
        file1 = ((File) (obj));
          goto _L7
        boolean1;
        file = null;
        file1 = ((File) (obj));
          goto _L8
        Exception exception;
        exception;
        file = null;
        file1 = boolean1;
        boolean1 = exception;
          goto _L8
    }

    public static boolean a(File file, String s)
    {
        return a(file, s, ((b) (null)));
    }

    public static boolean a(File file, String s, b b1)
    {
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = null;
        break MISSING_BLOCK_LABEL_6;
_L2:
        do
        {
            return false;
        } while (TextUtils.isEmpty(s) || file == null);
        if (!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        Object obj;
        s = new URL(s);
        obj = a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        s = (HttpURLConnection)s.openConnection(((Proxy) (obj)));
_L3:
        s.setRequestMethod("GET");
        s.setDoOutput(false);
        s.setConnectTimeout(10000);
        s.setReadTimeout(10000);
        s.setRequestProperty("Connection", "Keep-Alive");
        s.setRequestProperty("Charset", "UTF-8");
        s.setRequestProperty("Accept-Encoding", "gzip, deflate");
        s.connect();
        if (s.getResponseCode() != 200)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        obj = new BufferedInputStream(s.getInputStream());
        int k = s.getContentLength();
        if (k >= 1 && obj != null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        ((BufferedInputStream) (obj)).close();
        boolean flag;
        if (false)
        {
            int i;
            int j;
            boolean flag1;
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            if (com.gtp.a.a.b.c.a())
            {
                file.printStackTrace();
            }
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        s.disconnect();
        return false;
        s = (HttpURLConnection)s.openConnection();
          goto _L3
        file = new FileOutputStream(file);
        obj1 = new byte[1024];
        i = 0;
_L7:
        j = ((BufferedInputStream) (obj)).read(((byte []) (obj1)));
        if (j == -1) goto _L5; else goto _L4
_L4:
        file.write(((byte []) (obj1)), 0, j);
        j = i + j;
        i = j;
        if (b1 == null) goto _L7; else goto _L6
_L6:
        b1.a((j * 100) / k);
        i = j;
          goto _L7
        obj3;
        obj1 = s;
        b1 = ((b) (obj));
        s = file;
        file = ((File) (obj1));
        obj = obj3;
_L12:
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj)).printStackTrace();
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        b1.close();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s.printStackTrace();
                }
            }
        }
        if (file != null)
        {
            file.disconnect();
        }
        flag1 = false;
_L8:
        return flag1;
_L5:
        file.flush();
        flag = true;
_L13:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        ((BufferedInputStream) (obj)).close();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    file.printStackTrace();
                }
            }
        }
        flag1 = flag;
        if (s != null)
        {
            s.disconnect();
            flag1 = flag;
        }
          goto _L8
        file;
        s = null;
        obj = null;
        b1 = ((b) (obj1));
_L11:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        ((BufferedInputStream) (obj)).close();
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        b1.close();
_L10:
        if (s != null)
        {
            s.disconnect();
        }
        throw file;
        b1;
        if (com.gtp.a.a.b.c.a())
        {
            b1.printStackTrace();
        }
        if (true) goto _L10; else goto _L9
        file;
        obj = null;
        b1 = ((b) (obj1));
          goto _L11
        file;
        b1 = ((b) (obj1));
          goto _L11
        Object obj2;
        obj2;
        b1 = file;
        file = ((File) (obj2));
          goto _L11
        obj3;
        obj = b1;
        File file1 = file;
        file = ((File) (obj3));
        b1 = s;
        s = file1;
          goto _L11
        obj;
        s = null;
        b1 = null;
        file = ((File) (obj3));
          goto _L12
        obj;
        b1 = null;
        file = s;
        s = null;
          goto _L12
        file1;
        b1 = ((b) (obj));
        file = s;
        s = null;
        obj = file1;
          goto _L12
        file = null;
        obj = null;
        flag = false;
          goto _L13
    }

    public static byte[] a(String s)
    {
        Object obj;
        IOException ioexception;
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = null;
        obj = null;
        ioexception = null;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        com.jiubang.goweather.b.c c1;
        Object obj1;
        obj = new e(s, "GET");
        obj1 = new f();
        c1 = d.a();
        obj1 = c1.a(s, ((e) (obj)), ((f) (obj1)));
        s = bytearrayoutputstream;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = ioexception;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = ioexception;
        s = new byte[1024];
_L6:
        obj = ioexception;
        int i = ((InputStream) (obj1)).read(s);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ioexception;
        bytearrayoutputstream.write(s, 0, i);
        if (true) goto _L6; else goto _L5
_L4:
        c1.a();
        obj = s;
_L2:
        return ((byte []) (obj));
_L5:
        obj = ioexception;
        s = bytearrayoutputstream.toByteArray();
        obj = s;
        ((InputStream) (obj1)).close();
        obj = s;
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            s = ((String) (obj));
            if (com.gtp.a.a.b.c.a())
            {
                ioexception.printStackTrace();
                s = ((String) (obj));
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public static Bitmap b(String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        httpurlconnection.setRequestMethod("GET");
        httpurlconnection.setDoOutput(false);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(10000);
        httpurlconnection.connect();
        s = obj1;
        if (httpurlconnection.getResponseCode() == 200)
        {
            s = BitmapFactory.decodeStream(httpurlconnection.getInputStream());
        }
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
_L2:
        return s;
        s;
        httpurlconnection = null;
_L5:
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        httpurlconnection = obj;
_L4:
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        s;
          goto _L5
    }

    public static boolean b(Context context)
    {
        if (context != null)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
                if (context != null && context.isConnected())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static String c(Context context)
    {
        Object obj = context.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        context = ((Context) (obj));
        if (((String) (obj)).length() >= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        context = "";
        return context;
    }
}
