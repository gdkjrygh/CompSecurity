// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.StreamCipher;

public class CipherOutputStream extends FilterOutputStream
{

    private byte buf[];
    private BufferedBlockCipher bufferedBlockCipher;
    private byte oneByte[];
    private StreamCipher streamCipher;

    public CipherOutputStream(OutputStream outputstream, BufferedBlockCipher bufferedblockcipher)
    {
        super(outputstream);
        oneByte = new byte[1];
        bufferedBlockCipher = bufferedblockcipher;
        buf = new byte[bufferedblockcipher.getBlockSize()];
    }

    public CipherOutputStream(OutputStream outputstream, StreamCipher streamcipher)
    {
        super(outputstream);
        oneByte = new byte[1];
        streamCipher = streamcipher;
    }

    public void close()
    {
        byte abyte0[];
        int i;
        if (bufferedBlockCipher == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        abyte0 = new byte[bufferedBlockCipher.getOutputSize(0)];
        i = bufferedBlockCipher.doFinal(abyte0, 0);
        if (i != 0)
        {
            try
            {
                out.write(abyte0, 0, i);
            }
            catch (Exception exception)
            {
                throw new IOException((new StringBuilder()).append("Error closing stream: ").append(exception.toString()).toString());
            }
        }
        flush();
        super.close();
        return;
    }

    public void flush()
    {
        super.flush();
    }

    public void write(int i)
    {
        oneByte[0] = (byte)i;
        if (bufferedBlockCipher != null)
        {
            i = bufferedBlockCipher.processBytes(oneByte, 0, 1, buf, 0);
            if (i != 0)
            {
                out.write(buf, 0, i);
            }
            return;
        } else
        {
            out.write(streamCipher.returnByte((byte)i));
            return;
        }
    }

    public void write(byte abyte0[])
    {
        write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        if (bufferedBlockCipher != null)
        {
            byte abyte1[] = new byte[bufferedBlockCipher.getOutputSize(j)];
            i = bufferedBlockCipher.processBytes(abyte0, i, j, abyte1, 0);
            if (i != 0)
            {
                out.write(abyte1, 0, i);
            }
            return;
        } else
        {
            byte abyte2[] = new byte[j];
            streamCipher.processBytes(abyte0, i, j, abyte2, 0);
            out.write(abyte2, 0, j);
            return;
        }
    }
}
