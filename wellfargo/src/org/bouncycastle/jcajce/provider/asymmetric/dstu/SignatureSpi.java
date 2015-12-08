// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.DSTU4145Signer;
import org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dstu:
//            BCDSTU4145PublicKey

public class SignatureSpi extends java.security.SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private static byte DEFAULT_SBOX[] = {
        10, 9, 13, 6, 14, 11, 4, 5, 15, 1, 
        3, 12, 7, 0, 8, 2, 8, 0, 12, 4, 
        9, 6, 7, 11, 2, 3, 1, 15, 5, 14, 
        10, 13, 15, 6, 5, 8, 14, 11, 10, 4, 
        12, 0, 3, 7, 2, 9, 1, 13, 3, 8, 
        13, 9, 6, 11, 15, 0, 2, 5, 12, 10, 
        4, 14, 1, 7, 15, 8, 14, 9, 7, 2, 
        0, 13, 12, 6, 1, 5, 11, 4, 3, 10, 
        2, 8, 9, 7, 5, 15, 0, 11, 12, 1, 
        13, 14, 10, 3, 6, 4, 3, 8, 11, 5, 
        6, 4, 14, 10, 2, 12, 1, 7, 9, 15, 
        13, 0, 1, 2, 3, 14, 6, 13, 11, 8, 
        15, 10, 12, 5, 7, 9, 0, 4
    };
    private Digest digest;
    private DSA signer;

    public SignatureSpi()
    {
        signer = new DSTU4145Signer();
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetrickeyparameter = null;
        if (privatekey instanceof ECKey)
        {
            asymmetrickeyparameter = ECUtil.generatePrivateKeyParameter(privatekey);
        }
        digest = new GOST3411Digest(DEFAULT_SBOX);
        if (appRandom != null)
        {
            signer.init(true, new ParametersWithRandom(asymmetrickeyparameter, appRandom));
            return;
        } else
        {
            signer.init(true, asymmetrickeyparameter);
            return;
        }
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof ECPublicKey)) goto _L2; else goto _L1
_L1:
        org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetrickeyparameter = ECUtil.generatePublicKeyParameter(publickey);
_L4:
        digest = new GOST3411Digest(expandSbox(((BCDSTU4145PublicKey)publickey).getSbox()));
        signer.init(false, asymmetrickeyparameter);
        return;
_L2:
        publickey = BouncyCastleProvider.getPublicKey(SubjectPublicKeyInfo.getInstance(publickey.getEncoded()));
        if (!(publickey instanceof ECPublicKey))
        {
            break; /* Loop/switch isn't completed */
        }
        asymmetrickeyparameter = ECUtil.generatePublicKeyParameter(publickey);
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            throw new InvalidKeyException("can't recognise key type in DSA based signer");
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new InvalidKeyException("can't recognise key type in DSA based signer");
        }
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected byte[] engineSign()
    {
        byte abyte0[];
        abyte0 = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        Object aobj[];
        aobj = signer.generateSignature(abyte0);
        abyte0 = aobj[0].toByteArray();
        aobj = aobj[1].toByteArray();
        if (abyte0.length <= aobj.length) goto _L2; else goto _L1
_L1:
        int i = abyte0.length * 2;
_L3:
        byte abyte1[] = new byte[i];
        System.arraycopy(((Object) (aobj)), 0, abyte1, abyte1.length / 2 - aobj.length, aobj.length);
        System.arraycopy(abyte0, 0, abyte1, abyte1.length - abyte0.length, aobj.length);
        return (new DEROctetString(abyte1)).getEncoded();
_L2:
        i = aobj.length;
        i *= 2;
          goto _L3
        Exception exception;
        exception;
        throw new SignatureException(exception.toString());
    }

    protected void engineUpdate(byte byte0)
    {
        digest.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        Object aobj[];
        try
        {
            aobj = ((ASN1OctetString)ASN1OctetString.fromByteArray(abyte0)).getOctets();
            abyte0 = new byte[aobj.length / 2];
            byte abyte2[] = new byte[aobj.length / 2];
            System.arraycopy(((Object) (aobj)), 0, abyte2, 0, aobj.length / 2);
            System.arraycopy(((Object) (aobj)), aobj.length / 2, abyte0, 0, aobj.length / 2);
            aobj = new BigInteger[2];
            aobj[0] = new BigInteger(1, abyte0);
            aobj[1] = new BigInteger(1, abyte2);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return signer.verifySignature(abyte1, aobj[0], aobj[1]);
    }

    byte[] expandSbox(byte abyte0[])
    {
        byte abyte1[] = new byte[128];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i * 2] = (byte)(abyte0[i] >> 4 & 0xf);
            abyte1[i * 2 + 1] = (byte)(abyte0[i] & 0xf);
        }

        return abyte1;
    }

}
