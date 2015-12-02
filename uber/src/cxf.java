// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class cxf
{

    public static String a(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return a(s.getBytes());
        }
    }

    private static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuilder stringbuilder;
        int i;
        try
        {
            abyte0 = MessageDigest.getInstance("MD5").digest((new String(abyte0)).getBytes("UTF-8"));
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return "";
        }
        i = 0;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(Integer.toHexString(abyte0[i] & 0xff | 0x100).substring(1, 3));
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_39;
_L1:
        abyte0 = stringbuilder.toString();
        return abyte0;
    }

    public static String b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        } else
        {
            return s.replaceAll("\\.$", "");
        }
    }
}
