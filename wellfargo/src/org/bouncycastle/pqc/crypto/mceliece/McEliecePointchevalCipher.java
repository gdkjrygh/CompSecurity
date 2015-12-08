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
//            McElieceCCA2PublicKeyParameters, McElieceCCA2PrivateKeyParameters, McElieceCCA2Parameters, McElieceCCA2Primitives, 
//            Conversions, McElieceCCA2KeyParameters

public class McEliecePointchevalCipher
    implements MessageEncryptor
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2.2";
    private int k;
    McElieceCCA2KeyParameters key;
    private Digest messDigest;
    private int n;
    private SecureRandom sr;
    private int t;

    public McEliecePointchevalCipher()
    {
    }

    protected int decryptOutputSize(int i)
    {
        return 0;
    }

    protected int encryptOutputSize(int i)
    {
        return 0;
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

    public void initCipherEncrypt(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters)
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

    public byte[] messageDecrypt(byte abyte0[])
    {
        int i = n + 7 >> 3;
        int l = abyte0.length - i;
        abyte0 = ByteUtils.split(abyte0, i);
        Object aobj[] = abyte0[0];
        abyte0 = abyte0[1];
        GF2Vector gf2vector = GF2Vector.OS2VP(n, ((byte []) (aobj)));
        gf2vector = McElieceCCA2Primitives.decryptionPrimitive((McElieceCCA2PrivateKeyParameters)key, gf2vector);
        byte abyte1[] = gf2vector[0].getEncoded();
        gf2vector = gf2vector[1];
        DigestRandomGenerator digestrandomgenerator = new DigestRandomGenerator(new SHA1Digest());
        digestrandomgenerator.addSeedMaterial(abyte1);
        abyte1 = new byte[l];
        digestrandomgenerator.nextBytes(abyte1);
        for (int j = 0; j < l; j++)
        {
            abyte1[j] = (byte)(abyte1[j] ^ abyte0[j]);
        }

        messDigest.update(abyte1, 0, abyte1.length);
        abyte0 = new byte[messDigest.getDigestSize()];
        messDigest.doFinal(abyte0, 0);
        if (!Conversions.encode(n, t, abyte0).equals(gf2vector))
        {
            throw new Exception("Bad Padding: Invalid ciphertext.");
        } else
        {
            return ByteUtils.split(abyte1, l - (k >> 3))[0];
        }
    }

    public byte[] messageEncrypt(byte abyte0[])
    {
        boolean flag = false;
        int i1 = k >> 3;
        byte abyte1[] = new byte[i1];
        sr.nextBytes(abyte1);
        GF2Vector gf2vector = new GF2Vector(k, sr);
        byte abyte2[] = gf2vector.getEncoded();
        byte abyte4[] = ByteUtils.concatenate(abyte0, abyte1);
        messDigest.update(abyte4, 0, abyte4.length);
        abyte4 = new byte[messDigest.getDigestSize()];
        messDigest.doFinal(abyte4, 0);
        Object obj = Conversions.encode(n, t, abyte4);
        byte abyte3[] = McElieceCCA2Primitives.encryptionPrimitive((McElieceCCA2PublicKeyParameters)key, gf2vector, ((GF2Vector) (obj))).getEncoded();
        obj = new DigestRandomGenerator(new SHA1Digest());
        ((DigestRandomGenerator) (obj)).addSeedMaterial(abyte2);
        abyte2 = new byte[abyte0.length + i1];
        ((DigestRandomGenerator) (obj)).nextBytes(abyte2);
        int j = 0;
        int i;
        do
        {
            i = ((flag) ? 1 : 0);
            if (j >= abyte0.length)
            {
                break;
            }
            abyte2[j] = (byte)(abyte2[j] ^ abyte0[j]);
            j++;
        } while (true);
        for (; i < i1; i++)
        {
            int l = abyte0.length + i;
            abyte2[l] = (byte)(abyte2[l] ^ abyte1[i]);
        }

        return ByteUtils.concatenate(abyte3, abyte2);
    }
}
