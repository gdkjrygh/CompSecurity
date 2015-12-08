// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.Serializable;

public class ByteOrderMark
    implements Serializable
{

    public static final ByteOrderMark UTF_16BE = new ByteOrderMark("UTF-16BE", new int[] {
        254, 255
    });
    public static final ByteOrderMark UTF_16LE = new ByteOrderMark("UTF-16LE", new int[] {
        255, 254
    });
    public static final ByteOrderMark UTF_32BE = new ByteOrderMark("UTF-32BE", new int[] {
        0, 0, 254, 255
    });
    public static final ByteOrderMark UTF_32LE = new ByteOrderMark("UTF-32LE", new int[] {
        255, 254, 0, 0
    });
    public static final ByteOrderMark UTF_8 = new ByteOrderMark("UTF-8", new int[] {
        239, 187, 191
    });
    private static final long serialVersionUID = 1L;
    private final int bytes[];
    private final String charsetName;

    public transient ByteOrderMark(String s, int ai[])
    {
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("No charsetName specified");
        }
        if (ai == null || ai.length == 0)
        {
            throw new IllegalArgumentException("No bytes specified");
        } else
        {
            charsetName = s;
            bytes = new int[ai.length];
            System.arraycopy(ai, 0, bytes, 0, ai.length);
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ByteOrderMark) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (bytes.length == ((ByteOrderMark) (obj = (ByteOrderMark)obj)).length())
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= bytes.length)
                    {
                        break label1;
                    }
                    if (bytes[i] != ((ByteOrderMark) (obj)).get(i))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public int get(int i)
    {
        return bytes[i];
    }

    public byte[] getBytes()
    {
        byte abyte0[] = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++)
        {
            abyte0[i] = (byte)bytes[i];
        }

        return abyte0;
    }

    public String getCharsetName()
    {
        return charsetName;
    }

    public int hashCode()
    {
        int j = getClass().hashCode();
        int ai[] = bytes;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            j += ai[i];
        }

        return j;
    }

    public int length()
    {
        return bytes.length;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append('[');
        stringbuilder.append(charsetName);
        stringbuilder.append(": ");
        for (int i = 0; i < bytes.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append("0x");
            stringbuilder.append(Integer.toHexString(bytes[i] & 0xff).toUpperCase());
        }

        stringbuilder.append(']');
        return stringbuilder.toString();
    }

}
