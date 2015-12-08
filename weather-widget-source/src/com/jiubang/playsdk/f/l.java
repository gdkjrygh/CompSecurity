// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.jiubang.playsdk.f:
//            c

public class l
{

    public static String a(Object obj, String s)
    {
        if (obj == null)
        {
            return s;
        } else
        {
            return a(obj.toString(), s);
        }
    }

    public static String a(String s, String s1)
    {
        String s2;
label0:
        {
            if (s != null && s.trim().length() != 0)
            {
                s2 = s;
                if (!"null".equalsIgnoreCase(s.trim()))
                {
                    break label0;
                }
            }
            s2 = s1;
        }
        return s2;
    }

    public static String a(byte abyte0[])
    {
        try
        {
            abyte0 = new String(b(abyte0), "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public static boolean a(Object obj)
    {
        return a(obj, "").trim().length() == 0 || a(obj, "").equals("null");
    }

    public static byte[] b(byte abyte0[])
    {
        Object obj1;
        Object obj2;
        Object obj3;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        abyte0 = new ByteArrayInputStream(abyte0);
        byte abyte1[] = abyte0;
        obj2 = obj1;
        Object obj;
        try
        {
            obj1 = new GZIPInputStream(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            abyte0 = abyte1;
            obj = obj1;
        }
        abyte1 = c.a(((java.io.InputStream) (obj1)));
        if (abyte0 != null)
        {
            abyte0.close();
        }
        if (obj1 != null)
        {
            ((GZIPInputStream) (obj1)).close();
        }
        return abyte1;
        obj1;
        abyte0 = null;
        obj2 = obj3;
_L4:
        abyte1 = abyte0;
        throw obj1;
_L2:
        if (abyte0 != null)
        {
            abyte0.close();
        }
        if (obj2 != null)
        {
            ((GZIPInputStream) (obj2)).close();
        }
        throw obj;
        obj;
        abyte0 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        obj2 = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        obj2 = obj1;
        obj1 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
