// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


class zzk
{

    public static byte[] zzdw(String s)
    {
        int j = s.length();
        if (j % 2 != 0)
        {
            throw new IllegalArgumentException("purported base16 string has odd number of characters");
        }
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            int k = Character.digit(s.charAt(i), 16);
            int l = Character.digit(s.charAt(i + 1), 16);
            if (k == -1 || l == -1)
            {
                throw new IllegalArgumentException("purported base16 string has illegal char");
            }
            abyte0[i / 2] = (byte)((k << 4) + l);
        }

        return abyte0;
    }

    public static String zzg(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = abyte0[i];
            if ((byte0 & 0xf0) == 0)
            {
                stringbuilder.append("0");
            }
            stringbuilder.append(Integer.toHexString(byte0 & 0xff));
        }

        return stringbuilder.toString().toUpperCase();
    }
}
