// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.IOException;
import java.io.OutputStream;

public class HexDump
{

    public static final String EOL = System.getProperty("line.separator");
    private static final char _hexcodes[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private static final int _shifts[] = {
        28, 24, 20, 16, 12, 8, 4, 0
    };

    public HexDump()
    {
    }

    private static StringBuilder dump(StringBuilder stringbuilder, byte byte0)
    {
        for (int i = 0; i < 2; i++)
        {
            stringbuilder.append(_hexcodes[byte0 >> _shifts[i + 6] & 0xf]);
        }

        return stringbuilder;
    }

    private static StringBuilder dump(StringBuilder stringbuilder, long l)
    {
        for (int i = 0; i < 8; i++)
        {
            stringbuilder.append(_hexcodes[(int)(l >> _shifts[i]) & 0xf]);
        }

        return stringbuilder;
    }

    public static void dump(byte abyte0[], long l, OutputStream outputstream, int i)
        throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException
    {
        if (i < 0 || i >= abyte0.length)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("illegal index: ").append(i).append(" into array of length ").append(abyte0.length).toString());
        }
        if (outputstream == null)
        {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        l += i;
        StringBuilder stringbuilder = new StringBuilder(74);
        for (; i < abyte0.length; i += 16)
        {
            int k = abyte0.length - i;
            int j = k;
            if (k > 16)
            {
                j = 16;
            }
            dump(stringbuilder, l).append(' ');
            k = 0;
            while (k < 16) 
            {
                if (k < j)
                {
                    dump(stringbuilder, abyte0[k + i]);
                } else
                {
                    stringbuilder.append("  ");
                }
                stringbuilder.append(' ');
                k++;
            }
            k = 0;
            while (k < j) 
            {
                if (abyte0[k + i] >= 32 && abyte0[k + i] < 127)
                {
                    stringbuilder.append((char)abyte0[k + i]);
                } else
                {
                    stringbuilder.append('.');
                }
                k++;
            }
            stringbuilder.append(EOL);
            outputstream.write(stringbuilder.toString().getBytes());
            outputstream.flush();
            stringbuilder.setLength(0);
            l += j;
        }

    }

}
