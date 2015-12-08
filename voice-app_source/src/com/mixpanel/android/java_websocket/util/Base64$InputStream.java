// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.mixpanel.android.java_websocket.util:
//            Base64

public static class decodabet extends FilterInputStream
{

    private boolean breakLines;
    private byte buffer[];
    private int bufferLength;
    private byte decodabet[];
    private boolean encode;
    private int lineLength;
    private int numSigBytes;
    private int options;
    private int position;

    public int read()
        throws IOException
    {
        if (position >= 0) goto _L2; else goto _L1
_L1:
        if (!encode) goto _L4; else goto _L3
_L3:
        byte abyte0[];
        int i;
        int j;
        abyte0 = new byte[3];
        j = 0;
        i = 0;
_L12:
        if (i < 3)
        {
            if ((k = in.read()) >= 0)
            {
                abyte0[i] = (byte)k;
                j++;
                i++;
                continue; /* Loop/switch isn't completed */
            }
        }
        if (j <= 0) goto _L6; else goto _L5
_L5:
        Base64.access$1(abyte0, 0, j, buffer, 0, options);
        position = 0;
        numSigBytes = 4;
          goto _L2
_L6:
        return -1;
_L4:
        abyte0 = new byte[4];
        i = 0;
_L10:
        if (i < 4) goto _L8; else goto _L7
_L7:
        if (i == 4)
        {
            numSigBytes = Base64.access$2(abyte0, 0, buffer, 0, options);
            position = 0;
        } else
        if (i == 0)
        {
            return -1;
        } else
        {
            throw new IOException("Improperly padded Base64 input.");
        }
          goto _L2
_L8:
        do
        {
            j = in.read();
        } while (j >= 0 && decodabet[j & 0x7f] <= -5);
        if (j < 0) goto _L7; else goto _L9
_L9:
        abyte0[i] = (byte)j;
        i++;
          goto _L10
_L2:
        if (position >= 0)
        {
            int k;
            if (position >= numSigBytes)
            {
                return -1;
            }
            if (encode && breakLines && lineLength >= 76)
            {
                lineLength = 0;
                return 10;
            }
            lineLength = lineLength + 1;
            abyte0 = buffer;
            i = position;
            position = i + 1;
            i = abyte0[i];
            if (position >= bufferLength)
            {
                position = -1;
            }
            return i & 0xff;
        }
        throw new IOException("Error in Base64 code reading stream.");
        if (true) goto _L12; else goto _L11
_L11:
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        int k = 0;
_L5:
        if (k < j) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        int l = read();
        if (l < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0[i + k] = (byte)l;
        k++;
        continue; /* Loop/switch isn't completed */
        if (k != 0) goto _L1; else goto _L3
_L3:
        return -1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public A(InputStream inputstream)
    {
        this(inputstream, 0);
    }

    public <init>(InputStream inputstream, int i)
    {
        boolean flag1 = true;
        super(inputstream);
        options = i;
        int j;
        boolean flag;
        if ((i & 8) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        breakLines = flag;
        if ((i & 1) > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        encode = flag;
        if (encode)
        {
            j = 4;
        } else
        {
            j = 3;
        }
        bufferLength = j;
        buffer = new byte[bufferLength];
        position = -1;
        lineLength = 0;
        decodabet = Base64.access$0(i);
    }
}
