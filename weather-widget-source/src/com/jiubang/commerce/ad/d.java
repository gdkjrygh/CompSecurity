// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.text.TextUtils;
import com.jiubang.commerce.utils.f;
import com.jiubang.commerce.utils.j;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// Referenced classes of package com.jiubang.commerce.ad:
//            c

public class d
{

    private static final String a;
    private static d b = null;

    private d()
    {
        b();
    }

    public static d a()
    {
        if (b == null)
        {
            b = new d();
        }
        return b;
    }

    private String a(String s, String s1)
    {
        Properties properties = new Properties();
        FileInputStream fileinputstream = new FileInputStream(a);
        Object obj = fileinputstream;
        properties.load(fileinputstream);
        obj = fileinputstream;
        s = properties.getProperty(s, s1);
        obj = s;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return s;
            }
            obj = s;
        }
_L2:
        return ((String) (obj));
        IOException ioexception;
        ioexception;
        s = null;
_L5:
        obj = s;
        ioexception.printStackTrace();
        obj = s1;
        if (s == null) goto _L2; else goto _L1
_L1:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return s1;
        }
        return s1;
        s;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
        s = fileinputstream;
          goto _L5
    }

    public static int[] a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        String as[];
        return null;
_L2:
        if ((as = s.split(",")) == null || as.length == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        int ai[] = new int[as.length];
        int i = 0;
_L4:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = Integer.parseInt(as[i]);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return ai;
        NumberFormatException numberformatexception;
        numberformatexception;
        numberformatexception.printStackTrace();
        if (j.a)
        {
            j.c("Ad_SDK", (new StringBuilder()).append("AdSdkDebugConfig::toIntArray<>NumberFormatException error, by value:").append(s).toString());
            return null;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void b()
    {
        if (f.d(a))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        f.a(a, true);
        FileOutputStream fileoutputstream = new FileOutputStream(a);
        Object obj = fileoutputstream;
        Properties properties = new Properties();
        obj = fileoutputstream;
        properties.setProperty("virtualmoduleId_supportAds", "0,1,2,3,4,5,6,7,8,9");
        obj = fileoutputstream;
        properties.store(fileoutputstream, null);
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        fileoutputstream.close();
_L2:
        return;
        obj;
        ((IOException) (obj)).printStackTrace();
        return;
        IOException ioexception1;
        ioexception1;
        fileoutputstream = null;
_L5:
        obj = fileoutputstream;
        ioexception1.printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
        return;
        Exception exception;
        exception;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception1;
          goto _L5
    }

    public int[] a(int i)
    {
        return a(a((new StringBuilder()).append(i).append("_supportAds").toString(), null));
    }

    static 
    {
        a = c.d;
    }
}
