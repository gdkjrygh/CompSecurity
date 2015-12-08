// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipher, TlsClientContext, SecurityParameters, TlsUtils, 
//            TlsMac, TlsFatalAlert

public class TlsStreamCipher
    implements TlsCipher
{

    protected TlsClientContext context;
    protected StreamCipher decryptCipher;
    protected StreamCipher encryptCipher;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsStreamCipher(TlsClientContext tlsclientcontext, StreamCipher streamcipher, StreamCipher streamcipher1, Digest digest, Digest digest1, int i)
    {
        context = tlsclientcontext;
        encryptCipher = streamcipher;
        decryptCipher = streamcipher1;
        int j = i * 2 + digest.getDigestSize() + digest1.getDigestSize();
        SecurityParameters securityparameters = tlsclientcontext.getSecurityParameters();
        byte abyte0[] = TlsUtils.PRF(securityparameters.masterSecret, "key expansion", TlsUtils.concat(securityparameters.serverRandom, securityparameters.clientRandom), j);
        writeMac = new TlsMac(tlsclientcontext, digest, abyte0, 0, digest.getDigestSize());
        int k = 0 + digest.getDigestSize();
        readMac = new TlsMac(tlsclientcontext, digest1, abyte0, k, digest1.getDigestSize());
        k = digest1.getDigestSize() + k;
        tlsclientcontext = new KeyParameter(abyte0, k, i);
        k += i;
        digest = new KeyParameter(abyte0, k, i);
        if (k + i != j)
        {
            throw new TlsFatalAlert((short)80);
        } else
        {
            streamcipher.init(true, tlsclientcontext);
            streamcipher1.init(true, digest);
            return;
        }
    }

    protected byte[] copyData(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        return abyte1;
    }

    public byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[j];
        decryptCipher.processBytes(abyte0, i, j, abyte1, 0);
        i = abyte1.length - readMac.getSize();
        abyte0 = copyData(abyte1, 0, i);
        if (!Arrays.constantTimeAreEqual(copyData(abyte1, i, readMac.getSize()), readMac.calculateMac(word0, abyte0, 0, abyte0.length)))
        {
            throw new TlsFatalAlert((short)20);
        } else
        {
            return abyte0;
        }
    }

    public byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
    {
        byte abyte1[] = writeMac.calculateMac(word0, abyte0, i, j);
        byte abyte2[] = new byte[abyte1.length + j];
        encryptCipher.processBytes(abyte0, i, j, abyte2, 0);
        encryptCipher.processBytes(abyte1, 0, abyte1.length, abyte2, j);
        return abyte2;
    }
}
