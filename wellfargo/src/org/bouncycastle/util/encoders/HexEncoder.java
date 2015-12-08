// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.util.encoders:
//            Encoder

public class HexEncoder
    implements Encoder
{

    protected final byte decodingTable[] = new byte[128];
    protected final byte encodingTable[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };

    public HexEncoder()
    {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c)
    {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public int decode(String s, OutputStream outputstream)
    {
        int i;
        int j;
        i = 0;
        j = s.length();
_L6:
        if (j > 0 && ignore(s.charAt(j - 1))) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; i < j && ignore(s.charAt(i)); i++) { }
        byte abyte0[] = decodingTable;
        int l = i + 1;
        byte byte0 = abyte0[s.charAt(i)];
        for (i = l; i < j && ignore(s.charAt(i)); i++) { }
        l = decodingTable[s.charAt(i)];
        if ((byte0 | l) < 0)
        {
            throw new IOException("invalid characters encountered in Hex string");
        }
        outputstream.write(l | byte0 << 4);
        k++;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        j--;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int decode(byte abyte0[], int i, int j, OutputStream outputstream)
    {
        j = i + j;
_L6:
        if (j > i && ignore((char)abyte0[j - 1])) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; i < j && ignore((char)abyte0[i]); i++) { }
        byte abyte1[] = decodingTable;
        int l = i + 1;
        byte byte0 = abyte1[abyte0[i]];
        for (i = l; i < j && ignore((char)abyte0[i]); i++) { }
        l = decodingTable[abyte0[i]];
        if ((byte0 | l) < 0)
        {
            throw new IOException("invalid characters encountered in Hex data");
        }
        outputstream.write(l | byte0 << 4);
        k++;
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        j--;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int encode(byte abyte0[], int i, int j, OutputStream outputstream)
    {
        for (int k = i; k < i + j; k++)
        {
            int l = abyte0[k] & 0xff;
            outputstream.write(encodingTable[l >>> 4]);
            outputstream.write(encodingTable[l & 0xf]);
        }

        return j * 2;
    }

    protected void initialiseDecodingTable()
    {
        boolean flag = false;
        int i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= decodingTable.length)
            {
                break;
            }
            decodingTable[i] = -1;
            i++;
        } while (true);
        for (; j < encodingTable.length; j++)
        {
            decodingTable[encodingTable[j]] = (byte)j;
        }

        decodingTable[65] = decodingTable[97];
        decodingTable[66] = decodingTable[98];
        decodingTable[67] = decodingTable[99];
        decodingTable[68] = decodingTable[100];
        decodingTable[69] = decodingTable[101];
        decodingTable[70] = decodingTable[102];
    }
}
