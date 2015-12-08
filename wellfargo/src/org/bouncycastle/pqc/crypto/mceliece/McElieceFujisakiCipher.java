// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.prng.DigestRandomGenerator;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2PublicKeyParameters, McElieceCCA2Parameters, McElieceCCA2PrivateKeyParameters, McElieceCCA2Primitives, 
//            Conversions, McElieceCCA2KeyParameters

public class McElieceFujisakiCipher
    implements MessageEncryptor
{

    private static final String DEFAULT_PRNG_NAME = "SHA1PRNG";
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.1";
    private int k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;
    private int n;
    private SecureRandom sr;
    private int t;

    public McElieceFujisakiCipher()
    {
    }

    private void initCipherEncrypt(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters)
    {
        SecureRandom securerandom;
        if (sr != null)
        {
            securerandom = sr;
        } else
        {
            securerandom = new SecureRandom();
        }
        sr = securerandom;
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
        t = mceliececca2privatekeyparameters.getT();
    }

    public byte[] messageDecrypt(byte abyte0[])
    {
        int i = n + 7 >> 3;
        int l = abyte0.length - i;
        abyte0 = ByteUtils.split(abyte0, i);
        Object aobj[] = abyte0[0];
        abyte0 = abyte0[1];
        GF2Vector gf2vector = GF2Vector.OS2VP(n, ((byte []) (aobj)));
        gf2vector = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters)key, gf2vector);
        byte abyte2[] = gf2vector[0].getEncoded();
        gf2vector = gf2vector[1];
        DigestRandomGenerator digestrandomgenerator = new DigestRandomGenerator(new SHA1Digest());
        digestrandomgenerator.addSeedMaterial(abyte2);
        byte abyte1[] = new byte[l];
        digestrandomgenerator.nextBytes(abyte1);
        for (int j = 0; j < l; j++)
        {
            abyte1[j] = (byte)(abyte1[j] ^ abyte0[j]);
        }

        abyte0 = ByteUtils.concatenate(abyte2, abyte1);
        abyte2 = new byte[messDigest.getDigestSize()];
        messDigest.update(abyte0, 0, abyte0.length);
        messDigest.doFinal(abyte2, 0);
        if (!Conversions.encode(n, t, abyte2).equals(gf2vector))
        {
            throw new Exception("Bad Padding: invalid ciphertext");
        } else
        {
            return abyte1;
        }
    }

    public byte[] messageEncrypt(byte abyte0[])
    {
        GF2Vector gf2vector = new GF2Vector(k, sr);
        byte abyte1[] = gf2vector.getEncoded();
        byte abyte3[] = ByteUtils.concatenate(abyte1, abyte0);
        messDigest.update(abyte3, 0, abyte3.length);
        abyte3 = new byte[messDigest.getDigestSize()];
        messDigest.doFinal(abyte3, 0);
        Object obj = Conversions.encode(n, t, abyte3);
        byte abyte2[] = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters)key, gf2vector, ((GF2Vector) (obj))).getEncoded();
        obj = new DigestRandomGenerator(new SHA1Digest());
        ((DigestRandomGenerator) (obj)).addSeedMaterial(abyte1);
        abyte1 = new byte[abyte0.length];
        ((DigestRandomGenerator) (obj)).nextBytes(abyte1);
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = (byte)(abyte1[i] ^ abyte0[i]);
        }

        return ByteUtils.concatenate(abyte2, abyte1);
    }
}
