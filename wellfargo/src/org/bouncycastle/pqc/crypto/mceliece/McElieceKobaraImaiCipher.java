// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2PublicKeyParameters, McElieceCCA2Parameters, McElieceCCA2PrivateKeyParameters, McElieceCCA2Primitives, 
//            Conversions, McElieceCCA2KeyParameters

public class McElieceKobaraImaiCipher
    implements MessageEncryptor
{

    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    public static final byte PUBLIC_CONSTANT[] = "a predetermined public constant".getBytes();
    private int k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;
    private int n;
    private SecureRandom sr;
    private int t;

    public McElieceKobaraImaiCipher()
    {
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters)
    {
        messDigest = mceliececca2publickeyparameters.getParameters().getDigest();
        n = mceliececca2publickeyparameters.getN();
        k = mceliececca2publickeyparameters.getK();
        t = mceliececca2publickeyparameters.getT();
    }

    public int getKeySize(McElieceCCA2KeyParameters mceliececca2keyparameters)
    {
        if (mceliececca2keyparameters instanceof McElieceCCA2PublicKeyParameters)
        {
            return ((McElieceCCA2PublicKeyParameters)mceliececca2keyparameters).getN();
        }
        if (mceliececca2keyparameters instanceof McElieceCCA2PrivateKeyParameters)
        {
            return ((McElieceCCA2PrivateKeyParameters)mceliececca2keyparameters).getN();
        } else
        {
            throw new IllegalArgumentException("unsupported type");
        }
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (flag)
        {
            if (cipherparameters instanceof ParametersWithRandom)
            {
                cipherparameters = (ParametersWithRandom)cipherparameters;
                sr = cipherparameters.getRandom();
                key = (McElieceCCA2PublicKeyParameters)cipherparameters.getParameters();
                initCipherEncrypt((McElieceCCA2PublicKeyParameters)key);
                return;
            } else
            {
                sr = new SecureRandom();
                key = (McElieceCCA2PublicKeyParameters)cipherparameters;
                initCipherEncrypt((McElieceCCA2PublicKeyParameters)key);
                return;
            }
        } else
        {
            key = (McElieceCCA2PrivateKeyParameters)cipherparameters;
            initCipherDecrypt((McElieceCCA2PrivateKeyParameters)key);
            return;
        }
    }

    public void initCipherDecrypt(McElieceCCA2PrivateKeyParameters mceliececca2privatekeyparameters)
    {
        messDigest = mceliececca2privatekeyparameters.getParameters().getDigest();
        n = mceliececca2privatekeyparameters.getN();
        k = mceliececca2privatekeyparameters.getK();
        t = mceliececca2privatekeyparameters.getT();
    }

    public byte[] messageDecrypt(byte abyte0[])
    {
        int i1 = n >> 3;
        if (abyte0.length < i1)
        {
            throw new Exception("Bad Padding: Ciphertext too short.");
        }
        int i = messDigest.getDigestSize();
        int l = k >> 3;
        i1 = abyte0.length - i1;
        Object obj;
        byte abyte2[];
        GF2Vector gf2vector;
        if (i1 > 0)
        {
            abyte0 = ByteUtils.split(abyte0, i1);
            obj = abyte0[0];
            abyte0 = abyte0[1];
        } else
        {
            obj = new byte[0];
        }
        abyte0 = GF2Vector.OS2VP(n, abyte0);
        abyte0 = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters)key, abyte0);
        abyte2 = abyte0[0].getEncoded();
        gf2vector = abyte0[1];
        abyte0 = abyte2;
        if (abyte2.length > l)
        {
            abyte0 = ByteUtils.subArray(abyte2, 0, l);
        }
        abyte0 = ByteUtils.concatenate(ByteUtils.concatenate(((byte []) (obj)), Conversions.decode(n, t, gf2vector)), abyte0);
        l = abyte0.length - i;
        abyte0 = ByteUtils.split(abyte0, i);
        obj = abyte0[0];
        abyte0 = abyte0[1];
        abyte2 = new byte[messDigest.getDigestSize()];
        messDigest.update(abyte0, 0, abyte0.length);
        messDigest.doFinal(abyte2, 0);
        for (i--; i >= 0; i--)
        {
            abyte2[i] = (byte)(abyte2[i] ^ obj[i]);
        }

        obj = new DigestRandomGenerator(new SHA1Digest());
        ((DigestRandomGenerator) (obj)).addSeedMaterial(abyte2);
        abyte2 = new byte[l];
        ((DigestRandomGenerator) (obj)).nextBytes(abyte2);
        for (int j = l - 1; j >= 0; j--)
        {
            abyte2[j] = (byte)(abyte2[j] ^ abyte0[j]);
        }

        if (abyte2.length < l)
        {
            throw new Exception("Bad Padding: invalid ciphertext");
        }
        abyte0 = ByteUtils.split(abyte2, l - PUBLIC_CONSTANT.length);
        byte abyte1[] = abyte0[0];
        if (!ByteUtils.equals(abyte0[1], PUBLIC_CONSTANT))
        {
            throw new Exception("Bad Padding: invalid ciphertext");
        } else
        {
            return abyte1;
        }
    }

    public byte[] messageEncrypt(byte abyte0[])
    {
        int l1 = messDigest.getDigestSize();
        int j1 = k >> 3;
        int k1 = IntegerFunctions.binomial(n, t).bitLength() - 1 >> 3;
        int i1 = (j1 + k1) - l1 - PUBLIC_CONSTANT.length;
        int i = i1;
        if (abyte0.length > i1)
        {
            i = abyte0.length;
        }
        int i2 = PUBLIC_CONSTANT.length + i;
        i1 = (i2 + l1) - j1 - k1;
        byte abyte1[] = new byte[i2];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        System.arraycopy(PUBLIC_CONSTANT, 0, abyte1, i, PUBLIC_CONSTANT.length);
        abyte0 = new byte[l1];
        sr.nextBytes(abyte0);
        DigestRandomGenerator digestrandomgenerator = new DigestRandomGenerator(new SHA1Digest());
        digestrandomgenerator.addSeedMaterial(abyte0);
        byte abyte2[] = new byte[i2];
        digestrandomgenerator.nextBytes(abyte2);
        for (int j = i2 - 1; j >= 0; j--)
        {
            abyte2[j] = (byte)(abyte2[j] ^ abyte1[j]);
        }

        abyte1 = new byte[messDigest.getDigestSize()];
        messDigest.update(abyte2, 0, abyte2.length);
        messDigest.doFinal(abyte1, 0);
        for (int l = l1 - 1; l >= 0; l--)
        {
            abyte1[l] = (byte)(abyte1[l] ^ abyte0[l]);
        }

        abyte1 = ByteUtils.concatenate(abyte1, abyte2);
        abyte0 = new byte[0];
        if (i1 > 0)
        {
            abyte0 = new byte[i1];
            System.arraycopy(abyte1, 0, abyte0, 0, i1);
        }
        abyte2 = new byte[k1];
        System.arraycopy(abyte1, i1, abyte2, 0, k1);
        byte abyte3[] = new byte[j1];
        System.arraycopy(abyte1, k1 + i1, abyte3, 0, j1);
        GF2Vector gf2vector = GF2Vector.OS2VP(k, abyte3);
        GF2Vector gf2vector1 = Conversions.encode(n, t, abyte2);
        gf2vector1 = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters)key, gf2vector, gf2vector1).getEncoded();
        gf2vector = gf2vector1;
        if (i1 > 0)
        {
            gf2vector = ByteUtils.concatenate(abyte0, gf2vector1);
        }
        return gf2vector;
    }

}
