// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsNullCompression, TlsNullCipher, TlsUtils, TlsCipher, 
//            TlsCompression, CombinedHash, TlsClientContext, ProtocolVersion, 
//            TlsFatalAlert, TlsProtocolHandler

class RecordStream
{

    private ByteArrayOutputStream buffer;
    private TlsClientContext context;
    private TlsProtocolHandler handler;
    private CombinedHash hash;
    private InputStream is;
    private OutputStream os;
    private TlsCipher readCipher;
    private TlsCompression readCompression;
    private TlsCipher writeCipher;
    private TlsCompression writeCompression;

    RecordStream(TlsProtocolHandler tlsprotocolhandler, InputStream inputstream, OutputStream outputstream)
    {
        readCompression = null;
        writeCompression = null;
        readCipher = null;
        writeCipher = null;
        buffer = new ByteArrayOutputStream();
        context = null;
        hash = null;
        handler = tlsprotocolhandler;
        is = inputstream;
        os = outputstream;
        readCompression = new TlsNullCompression();
        writeCompression = readCompression;
        readCipher = new TlsNullCipher();
        writeCipher = readCipher;
    }

    private static byte[] doFinal(Digest digest)
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        return abyte0;
    }

    private byte[] getBufferContents()
    {
        byte abyte0[] = buffer.toByteArray();
        buffer.reset();
        return abyte0;
    }

    void clientCipherSpecDecided(TlsCompression tlscompression, TlsCipher tlscipher)
    {
        writeCompression = tlscompression;
        writeCipher = tlscipher;
    }

    protected void close()
    {
        IOException ioexception = null;
        try
        {
            is.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        try
        {
            os.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        if (ioexception != null)
        {
            throw ioexception;
        } else
        {
            return;
        }
    }

    protected byte[] decodeAndVerify(short word0, InputStream inputstream, int i)
    {
        byte abyte0[] = new byte[i];
        TlsUtils.readFully(abyte0, inputstream);
        inputstream = readCipher.decodeCiphertext(word0, abyte0, 0, abyte0.length);
        OutputStream outputstream = readCompression.decompress(buffer);
        if (outputstream == buffer)
        {
            return inputstream;
        } else
        {
            outputstream.write(inputstream, 0, inputstream.length);
            outputstream.flush();
            return getBufferContents();
        }
    }

    protected void flush()
    {
        os.flush();
    }

    byte[] getCurrentHash(byte abyte0[])
    {
        CombinedHash combinedhash = new CombinedHash(hash);
        boolean flag;
        if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && abyte0 != null)
        {
            combinedhash.update(abyte0, 0, abyte0.length);
        }
        return doFinal(combinedhash);
    }

    void init(TlsClientContext tlsclientcontext)
    {
        context = tlsclientcontext;
        hash = new CombinedHash(tlsclientcontext);
    }

    public void readData()
    {
        short word0 = TlsUtils.readUint8(is);
        if (!ProtocolVersion.TLSv10.equals(TlsUtils.readVersion(is)))
        {
            throw new TlsFatalAlert((short)47);
        } else
        {
            int i = TlsUtils.readUint16(is);
            byte abyte0[] = decodeAndVerify(word0, is, i);
            handler.processData(word0, abyte0, 0, abyte0.length);
            return;
        }
    }

    void serverClientSpecReceived()
    {
        readCompression = writeCompression;
        readCipher = writeCipher;
    }

    void updateHandshakeData(byte abyte0[], int i, int j)
    {
        hash.update(abyte0, i, j);
    }

    protected void writeMessage(short word0, byte abyte0[], int i, int j)
    {
        if (word0 == 22)
        {
            updateHandshakeData(abyte0, i, j);
        }
        byte abyte1[] = writeCompression.compress(buffer);
        if (abyte1 == buffer)
        {
            abyte0 = writeCipher.encodePlaintext(word0, abyte0, i, j);
        } else
        {
            abyte1.write(abyte0, i, j);
            abyte1.flush();
            abyte0 = getBufferContents();
            abyte0 = writeCipher.encodePlaintext(word0, abyte0, 0, abyte0.length);
        }
        abyte1 = new byte[abyte0.length + 5];
        TlsUtils.writeUint8(word0, abyte1, 0);
        TlsUtils.writeVersion(ProtocolVersion.TLSv10, abyte1, 1);
        TlsUtils.writeUint16(abyte0.length, abyte1, 3);
        System.arraycopy(abyte0, 0, abyte1, 5, abyte0.length);
        os.write(abyte1);
        os.flush();
    }
}
