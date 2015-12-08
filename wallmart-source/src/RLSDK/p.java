// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.ContentResolver;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class p
{

    private static String a = null;

    public static String a()
    {
        return a;
    }

    public static void a(ContentResolver contentresolver)
    {
        long l1 = 0L;
        if (a == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("http://android.ebay.com/");
            stringbuilder.append(android.provider.Settings.Secure.getString(contentresolver, "android_id"));
            try
            {
                contentresolver = MessageDigest.getInstance("SHA-1");
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return;
            }
            contentresolver = contentresolver.digest(stringbuilder.toString().getBytes());
            if (contentresolver.length == 20)
            {
                contentresolver[6] = (byte)(contentresolver[6] & 0xf);
                contentresolver[6] = (byte)(contentresolver[6] | 0x50);
                contentresolver[8] = (byte)(contentresolver[8] & 0xbf);
                contentresolver[8] = (byte)(contentresolver[8] | 0x80);
                int i = 0;
                long l = 0L;
                for (; i < 8; i++)
                {
                    l = l << 8 ^ (long)contentresolver[i] & 255L;
                }

                for (int j = 8; j < 16; j++)
                {
                    l1 = l1 << 8 ^ (long)contentresolver[j] & 255L;
                }

                contentresolver = (new UUID(l, l1)).toString().toUpperCase();
                a = (new StringBuilder()).append(contentresolver).append(",").append("1").append(",").append("0").toString();
                return;
            }
        }
    }

}
