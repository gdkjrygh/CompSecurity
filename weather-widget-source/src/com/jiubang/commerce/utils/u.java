// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

public class u
{

    public static int a(InputStream inputstream, OutputStream outputstream)
    {
        int i = 0;
        byte abyte0[] = new byte[4096];
_L1:
        int j = inputstream.read(abyte0);
        if (-1 != j)
        {
            try
            {
                outputstream.write(abyte0, 0, j);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
            i += j;
        } else
        {
            return i;
        }
          goto _L1
    }

    public static String a(InputStream inputstream)
    {
        try
        {
            inputstream = new String(a(b(inputstream)), "utf-8");
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return null;
        }
        return inputstream;
    }

    public static byte[] a(byte abyte0[])
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
        abyte1 = b(((InputStream) (obj1)));
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

    public static byte[] b(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream1 = new ByteArrayOutputStream();
        ByteArrayOutputStream bytearrayoutputstream = bytearrayoutputstream1;
        a(inputstream, bytearrayoutputstream1);
        bytearrayoutputstream = bytearrayoutputstream1;
        inputstream = bytearrayoutputstream1.toByteArray();
        if (bytearrayoutputstream1 != null)
        {
            try
            {
                bytearrayoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        return inputstream;
        inputstream;
        bytearrayoutputstream = null;
_L4:
        throw inputstream;
        inputstream;
_L2:
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                throw inputstream;
            }
        }
        throw inputstream;
        inputstream;
        bytearrayoutputstream = null;
        if (true) goto _L2; else goto _L1
_L1:
        inputstream;
        bytearrayoutputstream = bytearrayoutputstream1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
