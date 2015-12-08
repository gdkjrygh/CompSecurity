// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.jiubang.commerce.utils:
//            f, k, l, j, 
//            h

public class i
{

    public static Bitmap a(Context context, String s, String s1)
    {
        Bitmap bitmap = null;
        Bitmap bitmap1 = null;
        if (!TextUtils.isEmpty(s))
        {
            if (!TextUtils.isEmpty(s1))
            {
                bitmap = a(s1);
            }
            bitmap1 = bitmap;
            if (bitmap == null)
            {
                return b(context, s, s1);
            }
        }
        return bitmap1;
    }

    public static Bitmap a(String s)
    {
        File file;
        if (s != null)
        {
            if ((file = new File(s)).exists() && file.isFile())
            {
                Bitmap bitmap;
                try
                {
                    bitmap = BitmapFactory.decodeFile(s);
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    outofmemoryerror.printStackTrace();
                    System.gc();
                    try
                    {
                        s = BitmapFactory.decodeFile(s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        s.printStackTrace();
                        return null;
                    }
                    return s;
                }
                return bitmap;
            }
        }
        return null;
    }

    public static boolean a(Bitmap bitmap, String s, android.graphics.Bitmap.CompressFormat compressformat)
    {
        boolean flag;
        f.a(s, false);
        s = new FileOutputStream(s);
        flag = bitmap.compress(compressformat, 100, s);
        s.close();
        return flag;
        bitmap;
        flag = false;
_L4:
        bitmap.printStackTrace();
        return flag;
        bitmap;
        flag = false;
_L2:
        bitmap.printStackTrace();
        return flag;
        bitmap;
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Bitmap b(Context context, String s, String s1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (context != null && !TextUtils.isEmpty(s) && k.a(context)) goto _L2; else goto _L1
_L1:
        s = null;
_L6:
        return s;
_L2:
        if (android.os.Build.VERSION.SDK_INT > 8) goto _L4; else goto _L3
_L3:
        context = b(s);
_L9:
        s = context;
        if (context == null) goto _L6; else goto _L5
_L5:
        s = context;
        if (TextUtils.isEmpty(s1)) goto _L6; else goto _L7
_L7:
        s = context;
        if (!l.a()) goto _L6; else goto _L8
_L8:
        a(context, s1, android.graphics.Bitmap.CompressFormat.PNG);
        return context;
_L4:
        context = (HttpURLConnection)(new URL(s)).openConnection();
        context.setConnectTimeout(10000);
        context.setReadTimeout(30000);
        obj = (InputStream)context.getContent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj1 = BitmapFactory.decodeStream(((InputStream) (obj)));
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        Object obj2;
        Object obj3;
        if (context != null)
        {
            context.disconnect();
            context = ((Context) (obj1));
        } else
        {
            context = ((Context) (obj1));
        }
          goto _L9
        obj3;
        context = null;
        obj2 = null;
_L15:
        obj1 = context;
        obj = obj2;
        ((OutOfMemoryError) (obj3)).printStackTrace();
        obj1 = context;
        obj = obj2;
        j.b("Ad_SDK", (new StringBuilder()).append("downloadNetworkImage(").append(s).append(")====").append(((OutOfMemoryError) (obj3)).toString()).toString(), ((Throwable) (obj3)));
        obj1 = context;
        obj = obj2;
        System.gc();
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        context.disconnect();
        context = null;
          goto _L9
        obj3;
        context = null;
        obj2 = null;
_L14:
        obj1 = context;
        obj = obj2;
        ((SocketTimeoutException) (obj3)).printStackTrace();
        obj1 = context;
        obj = obj2;
        j.b("Ad_SDK", (new StringBuilder()).append("downloadNetworkImage(").append(s).append(")====").append(((SocketTimeoutException) (obj3)).toString()).toString(), ((Throwable) (obj3)));
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        context.disconnect();
        context = null;
          goto _L9
        obj1;
        obj2 = null;
        context = ((Context) (obj));
        obj = obj2;
_L13:
        j.b("Ad_SDK", (new StringBuilder()).append("downloadNetworkImage(").append(s).append(")====").append(((SSLHandshakeException) (obj1)).toString()).toString(), ((Throwable) (obj1)));
        s = b(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_411;
        }
        ((SSLHandshakeException) (obj1)).printStackTrace();
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        if (context != null)
        {
            context.disconnect();
            context = s;
        } else
        {
            context = s;
        }
          goto _L9
        obj3;
        context = null;
        obj2 = null;
_L12:
        obj1 = context;
        obj = obj2;
        ((Exception) (obj3)).printStackTrace();
        obj1 = context;
        obj = obj2;
        j.b("Ad_SDK", (new StringBuilder()).append("downloadNetworkImage(").append(s).append(")====").append(((Exception) (obj3)).toString()).toString(), ((Throwable) (obj3)));
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        context.disconnect();
        context = null;
          goto _L9
        context;
        s = null;
        s1 = null;
_L11:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
        }
        if (s != null)
        {
            s.disconnect();
        }
        throw context;
        s;
        obj = null;
        s1 = context;
        context = s;
        s = s1;
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        obj1;
        s1 = ((String) (obj));
        s = context;
        context = ((Context) (obj1));
        continue; /* Loop/switch isn't completed */
        context;
        s = ((String) (obj1));
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        obj1;
        s1 = ((String) (obj));
        s = context;
        context = ((Context) (obj1));
        if (true) goto _L11; else goto _L10
_L10:
        obj3;
        obj2 = null;
          goto _L12
        obj3;
        obj2 = obj;
          goto _L12
        obj1;
        obj = null;
          goto _L13
        obj1;
          goto _L13
        obj3;
        obj2 = null;
          goto _L14
        obj3;
        obj2 = obj;
          goto _L14
        obj3;
        obj2 = null;
          goto _L15
        obj3;
        obj2 = obj;
          goto _L15
        context = null;
          goto _L9
    }

    private static Bitmap b(String s)
    {
        Object obj2 = null;
        Object obj = h.a(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        s = ((HttpResponse) (obj)).getStatusLine();
_L8:
        if (s == null) goto _L4; else goto _L3
_L3:
        if (s.getStatusCode() != 200 && s.getStatusCode() != 203 || ((HttpResponse) (obj)).getEntity() == null) goto _L4; else goto _L5
_L5:
        s = ((HttpResponse) (obj)).getEntity().getContent();
        Object obj1 = s;
        if (s == null) goto _L7; else goto _L6
_L6:
        obj = s;
        obj1 = BitmapFactory.decodeStream(s);
        obj = obj1;
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
                return ((Bitmap) (obj1));
            }
            obj = obj1;
        }
_L10:
        return ((Bitmap) (obj));
_L2:
        s = null;
          goto _L8
_L4:
        obj1 = null;
_L7:
        obj = obj2;
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        try
        {
            ((InputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        Exception exception1;
        exception1;
        s = null;
_L14:
        obj = s;
        exception1.printStackTrace();
        obj = obj2;
        if (s == null) goto _L10; else goto _L11
_L11:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
        obj = null;
_L13:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L13; else goto _L12
_L12:
        exception1;
          goto _L14
    }
}
