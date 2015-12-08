// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class f
{

    public static File a(String s, boolean flag)
    {
        File file = new File(s);
        if (flag) goto _L2; else goto _L1
_L1:
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        file.delete();
_L2:
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        try
        {
            s = file.getParentFile();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return file;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!s.exists())
        {
            s.mkdirs();
        }
        file.createNewFile();
        return file;
_L4:
        s = new File((new StringBuilder()).append(s).append(".png").toString());
        if (s != null && s.exists())
        {
            s.delete();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static String a(InputStream inputstream, String s)
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        inputstream = "";
_L5:
        return inputstream;
_L2:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
_L3:
        int i = inputstream.read(abyte0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L3
        s;
        s.printStackTrace();
        if (inputstream != null)
        {
            inputstream.close();
        }
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
        }
        return null;
        byte abyte1[] = bytearrayoutputstream.toByteArray();
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "UTF-8";
        }
        s = new String(abyte1, s1);
        if (inputstream != null)
        {
            inputstream.close();
        }
        inputstream = s;
        if (bytearrayoutputstream == null) goto _L5; else goto _L4
_L4:
        bytearrayoutputstream.close();
        return s;
        s;
        if (inputstream != null)
        {
            inputstream.close();
        }
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
        }
        throw s;
    }

    public static String a(InputStream inputstream, String s, int i)
    {
        int j = 0;
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        inputstream = "";
_L5:
        return inputstream;
_L2:
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
_L3:
        int k = inputstream.read(abyte0);
        if (k <= 0 || j >= i)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        bytearrayoutputstream.write(abyte0, 0, k);
        j++;
          goto _L3
        byte abyte1[] = bytearrayoutputstream.toByteArray();
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "UTF-8";
        }
        s = new String(abyte1, s1);
        if (inputstream != null)
        {
            inputstream.close();
        }
        inputstream = s;
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
            return s;
        }
        if (true) goto _L5; else goto _L4
_L4:
        s;
        s.printStackTrace();
        if (inputstream != null)
        {
            inputstream.close();
        }
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
        }
        return null;
        s;
        if (inputstream != null)
        {
            inputstream.close();
        }
        if (bytearrayoutputstream != null)
        {
            bytearrayoutputstream.close();
        }
        throw s;
    }

    public static boolean a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a(s.getBytes("UTF-8"), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return flag;
    }

    public static boolean a(byte abyte0[], String s)
    {
        if (abyte0 == null || TextUtils.isEmpty(s))
        {
            return false;
        }
        try
        {
            s = new FileOutputStream(a(s, false));
            s.write(abyte0);
            s.flush();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            abyte0.printStackTrace();
            return false;
        }
        return true;
    }

    public static byte[] a(String s)
    {
        FileInputStream fileinputstream;
        BufferedInputStream bufferedinputstream;
        s = new File(s);
        fileinputstream = new FileInputStream(s);
        bufferedinputstream = new BufferedInputStream(new DataInputStream(fileinputstream));
        s = new byte[(int)s.length()];
        bufferedinputstream.read(s);
        fileinputstream.close();
        return s;
        Object obj;
        obj;
        s = null;
_L8:
        ((FileNotFoundException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L6:
        ((SecurityException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L4:
        ((IOException) (obj)).printStackTrace();
        return s;
        obj;
        s = null;
_L2:
        ((Exception) (obj)).printStackTrace();
        return s;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = new File(s)).exists())
            {
                try
                {
                    s = a(new FileInputStream(s), "UTF-8");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    return null;
                }
                return s;
            }
        }
        return null;
    }

    public static boolean c(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!TextUtils.isEmpty(s))
        {
            s = new File(s);
            flag = flag1;
            if (s.exists())
            {
                flag = s.delete();
            }
        }
        return flag;
    }

    public static boolean d(String s)
    {
        boolean flag;
        try
        {
            flag = (new File(s)).exists();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }
}
