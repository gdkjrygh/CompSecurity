// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageEncryptor;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.Vector;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McEliecePublicKeyParameters, McEliecePrivateKeyParameters, McElieceKeyParameters

public class McEliecePKCSCipher
    implements MessageEncryptor
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public int cipherTextSize;
    private int k;
    McElieceKeyParameters key;
    public int maxPlainTextSize;
    private int n;
    private SecureRandom sr;
    private int t;

    public McEliecePKCSCipher()
    {
    }

    private byte[] computeMessage(GF2Vector gf2vector)
    {
        gf2vector = gf2vector.getEncoded();
        int i;
        for (i = gf2vector.length - 1; i >= 0 && gf2vector[i] == 0; i--) { }
        if (gf2vector[i] != 1)
        {
            throw new Exception("Bad Padding: invalid ciphertext");
        } else
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(gf2vector, 0, abyte0, 0, i);
            return abyte0;
        }
    }

    private GF2Vector computeMessageRepresentative(byte abyte0[])
    {
        int j = maxPlainTextSize;
        byte abyte1[];
        int i;
        if ((k & 7) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        abyte1 = new byte[i + j];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        abyte1[abyte0.length] = 1;
        return GF2Vector.OS2VP(k, abyte1);
    }

    public int getKeySize(McElieceKeyParameters mceliecekeyparameters)
    {
        if (mceliecekeyparameters instanceof McEliecePublicKeyParameters)
        {
            return ((McEliecePublicKeyParameters)mceliecekeyparameters).getN();
        }
        if (mceliecekeyparameters instanceof McEliecePrivateKeyParameters)
        {
            return ((McEliecePrivateKeyParameters)mceliecekeyparameters).getN();
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
                key = (McEliecePublicKeyParameters)cipherparameters.getParameters();
                initCipherEncrypt((McEliecePublicKeyParameters)key);
                return;
            } else
            {
                sr = new SecureRandom();
                key = (McEliecePublicKeyParameters)cipherparameters;
                initCipherEncrypt((McEliecePublicKeyParameters)key);
                return;
            }
        } else
        {
            key = (McEliecePrivateKeyParameters)cipherparameters;
            initCipherDecrypt((McEliecePrivateKeyParameters)key);
            return;
        }
    }

    public void initCipherDecrypt(McEliecePrivateKeyParameters mcelieceprivatekeyparameters)
    {
        n = mcelieceprivatekeyparameters.getN();
        k = mcelieceprivatekeyparameters.getK();
        maxPlainTextSize = k >> 3;
        cipherTextSize = n >> 3;
    }

    public void initCipherEncrypt(McEliecePublicKeyParameters mceliecepublickeyparameters)
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
        n = mceliecepublickeyparameters.getN();
        k = mceliecepublickeyparameters.getK();
        t = mceliecepublickeyparameters.getT();
        cipherTextSize = n >> 3;
        maxPlainTextSize = k >> 3;
    }

    public byte[] messageDecrypt(byte abyte0[])
    {
        GF2Vector gf2vector = GF2Vector.OS2VP(n, abyte0);
        McEliecePrivateKeyParameters mcelieceprivatekeyparameters = (McEliecePrivateKeyParameters)key;
        Object obj1 = mcelieceprivatekeyparameters.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialgf2msmallm = mcelieceprivatekeyparameters.getGoppaPoly();
        abyte0 = mcelieceprivatekeyparameters.getSInv();
        Object obj = mcelieceprivatekeyparameters.getP1();
        Permutation permutation = mcelieceprivatekeyparameters.getP2();
        GF2Matrix gf2matrix = mcelieceprivatekeyparameters.getH();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM apolynomialgf2msmallm[] = mcelieceprivatekeyparameters.getQInv();
        permutation = ((Permutation) (obj)).rightMultiply(permutation);
        gf2vector = (GF2Vector)gf2vector.multiply(permutation.computeInverse());
        obj1 = GoppaCode.syndromeDecode((GF2Vector)gf2matrix.rightMultiply(gf2vector), ((org.bouncycastle.pqc.math.linearalgebra.GF2mField) (obj1)), polynomialgf2msmallm, apolynomialgf2msmallm);
        obj = (GF2Vector)((GF2Vector)gf2vector.add(((Vector) (obj1)))).multiply(((Permutation) (obj)));
        obj1 = (GF2Vector)((GF2Vector) (obj1)).multiply(permutation);
        return computeMessage((GF2Vector)abyte0.leftMultiply(((GF2Vector) (obj)).extractRightVector(k)));
    }

    public byte[] messageEncrypt(byte abyte0[])
    {
        abyte0 = computeMessageRepresentative(abyte0);
        GF2Vector gf2vector = new GF2Vector(n, t, sr);
        return ((GF2Vector)((McEliecePublicKeyParameters)key).getG().leftMultiply(abyte0).add(gf2vector)).getEncoded();
    }
}
