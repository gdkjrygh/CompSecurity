// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class b1 extends ByteArrayOutputStream
{

    private static final String z[];

    public b1()
    {
    }

    public int a(InputStream inputstream, int i)
    {
        if (buf.length - count < i)
        {
            byte abyte0[] = buf;
            buf = new byte[count + i];
            System.arraycopy(abyte0, 0, buf, 0, count);
        }
        i = inputstream.read(buf, count, i);
        count = count + Math.max(i, 0);
        return i;
    }

    public byte[] a()
    {
        byte abyte0[] = buf;
        if (abyte0 == null)
        {
            throw new IOException(z[0]);
        } else
        {
            return abyte0;
        }
    }

    public int b()
    {
        int i = count;
        if (i < 0 || buf == null)
        {
            throw new IOException(z[1]);
        } else
        {
            return i;
        }
    }

    static 
    {
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        Object obj;
        int j;
        int k;
        as1 = as;
        obj = "}>Ijqz".toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 128
    //                   0 149
    //                   1 155
    //                   2 161
    //                   3 167;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_167;
_L3:
        byte byte0 = 20;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 30;
          goto _L9
_L5:
        byte0 = 82;
          goto _L9
_L6:
        byte0 = 38;
          goto _L9
        byte0 = 25;
          goto _L9
    }
}
