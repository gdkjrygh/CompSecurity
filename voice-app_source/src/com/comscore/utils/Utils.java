// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

// Referenced classes of package com.comscore.utils:
//            Constants, Base64Coder, CSLog

public class Utils
{

    public Utils()
    {
    }

    public static String encrypt(String s)
    {
        Object obj = new X509EncodedKeySpec(Constants.RSA_PUBLIC_KEY);
        obj = KeyFactory.getInstance("RSA").generatePublic(((java.security.spec.KeySpec) (obj)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
        cipher.init(1, ((java.security.Key) (obj)));
        obj = new String(Base64Coder.encode(cipher.doFinal(s.getBytes())));
        CSLog.d(com/comscore/utils/Utils, (new StringBuilder()).append("encrypt(").append(s).append(")=").append(((String) (obj))).toString());
        return ((String) (obj));
    }

    public static boolean getBoolean(String s)
    {
        return getBoolean(s, false);
    }

    public static boolean getBoolean(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("true")) goto _L4; else goto _L3
_L3:
        flag1 = true;
_L2:
        return flag1;
_L4:
        if (s.equalsIgnoreCase("no"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!s.equalsIgnoreCase("false")) goto _L2; else goto _L5
_L5:
        return false;
    }

    public static int getInteger(String s)
    {
        return getInteger(s, 0);
    }

    public static int getInteger(String s, int i)
    {
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public static long getLong(String s)
    {
        return getLong(s, 0L);
    }

    public static long getLong(String s, long l)
    {
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public static boolean isEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean isNotEmpty(String s)
    {
        return s != null && s.length() > 0;
    }

    public static String md5(String s)
    {
        s = s.getBytes();
        Object obj;
        String s1;
        int i;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).reset();
            ((MessageDigest) (obj)).update(s);
            s = ((MessageDigest) (obj)).digest();
            obj = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i = 0;
        if (i >= s.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = Integer.toHexString(s[i] & 0xff);
        if (s1.length() == 1)
        {
            ((StringBuffer) (obj)).append('0');
        }
        ((StringBuffer) (obj)).append(s1);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
_L1:
        s = (new StringBuilder()).append(obj).append("").toString();
        return s;
    }
}
