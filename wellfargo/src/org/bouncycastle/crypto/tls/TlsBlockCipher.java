// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipher, TlsClientContext, TlsUtils, TlsMac, 
//            ProtocolVersion, TlsFatalAlert

public class TlsBlockCipher
    implements TlsCipher
{

    protected TlsClientContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected byte randomData[];
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsClientContext tlsclientcontext, BlockCipher blockcipher, BlockCipher blockcipher1, Digest digest, Digest digest1, int i)
    {
        context = tlsclientcontext;
        randomData = new byte[256];
        tlsclientcontext.getSecureRandom().nextBytes(randomData);
        encryptCipher = blockcipher;
        decryptCipher = blockcipher1;
        byte abyte0[] = TlsUtils.calculateKeyBlock(tlsclientcontext, i * 2 + digest.getDigestSize() + digest1.getDigestSize() + blockcipher.getBlockSize() + blockcipher1.getBlockSize());
        writeMac = new TlsMac(tlsclientcontext, digest, abyte0, 0, digest.getDigestSize());
        int j = 0 + digest.getDigestSize();
        readMac = new TlsMac(tlsclientcontext, digest1, abyte0, j, digest1.getDigestSize());
        j += digest1.getDigestSize();
        initCipher(true, blockcipher, abyte0, i, j, j + i * 2);
        j += i;
        initCipher(false, blockcipher1, abyte0, i, j, j + i + blockcipher.getBlockSize());
    }

    protected int checkPaddingConstantTime(byte abyte0[], int i, int j, int k, int l)
    {
        int i1;
        byte byte0;
        int j1;
        j1 = i + j;
        byte0 = abyte0[j1 - 1];
        i1 = (byte0 & 0xff) + 1;
        if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if ((i != 0 || i1 <= k) && l + i1 <= j) goto _L2; else goto _L1
_L1:
        j = 0;
        i = 0;
        i1 = 0;
_L4:
        abyte0 = randomData;
        for (; i < 256; i++)
        {
            j = (byte)(j | abyte0[i] ^ byte0);
        }

          goto _L3
_L2:
        i = j1 - i1;
        j = 0;
_L5:
        k = i + 1;
        j = (byte)(abyte0[i] ^ byte0 | j);
        if (k < j1)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        if (j != 0)
        {
            i = i1;
            i1 = 0;
        } else
        {
            i = i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        abyte0[0] = (byte)(j ^ abyte0[0]);
        return i1;
        i = k;
          goto _L5
    }

    protected int chooseExtraPadBlocks(SecureRandom securerandom, int i)
    {
        return Math.min(lowestBitSet(securerandom.nextInt()), i);
    }

    public byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
    {
        int j1 = decryptCipher.getBlockSize();
        int i1 = readMac.getSize();
        if (j < Math.max(j1, i1 + 1))
        {
            throw new TlsFatalAlert((short)50);
        }
        if (j % j1 != 0)
        {
            throw new TlsFatalAlert((short)21);
        }
        for (int k = 0; k < j; k += j1)
        {
            decryptCipher.processBlock(abyte0, i + k, abyte0, i + k);
        }

        int l = checkPaddingConstantTime(abyte0, i, j, j1, i1);
        j1 = j - l - i1;
        byte abyte1[] = Arrays.copyOfRange(abyte0, i + j1, i + j1 + i1);
        if (!Arrays.constantTimeAreEqual(readMac.calculateMacConstantTime(word0, abyte0, i, j1, j - i1, randomData), abyte1))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0 || l == 0)
        {
            throw new TlsFatalAlert((short)20);
        } else
        {
            return Arrays.copyOfRange(abyte0, i, i + j1);
        }
    }

    public byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
    {
        int j1 = encryptCipher.getBlockSize();
        int i1 = j1 - 1 - (writeMac.getSize() + j) % j1;
        byte abyte1[];
        int k;
        int l;
        if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = i1;
        if (l != 0)
        {
            k = (255 - i1) / j1;
            k = i1 + chooseExtraPadBlocks(context.getSecureRandom(), k) * j1;
        }
        l = writeMac.getSize() + j + k + 1;
        abyte1 = new byte[l];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        abyte0 = writeMac.calculateMac(word0, abyte0, i, j);
        System.arraycopy(abyte0, 0, abyte1, j, abyte0.length);
        i1 = abyte0.length;
        for (i = 0; i <= k; i++)
        {
            abyte1[i + (j + i1)] = (byte)k;
        }

        for (i = 0; i < l; i += j1)
        {
            encryptCipher.processBlock(abyte1, i, abyte1, i);
        }

        return abyte1;
    }

    public TlsMac getReadMac()
    {
        return readMac;
    }

    public TlsMac getWriteMac()
    {
        return writeMac;
    }

    protected void initCipher(boolean flag, BlockCipher blockcipher, byte abyte0[], int i, int j, int k)
    {
        blockcipher.init(flag, new ParametersWithIV(new KeyParameter(abyte0, j, i), abyte0, k, blockcipher.getBlockSize()));
    }

    protected int lowestBitSet(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = 32;
_L4:
        return k;
_L2:
        k = 0;
        int j = i;
        i = k;
        do
        {
            k = i;
            if ((j & 1) != 0)
            {
                continue;
            }
            i++;
            j >>= 1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
