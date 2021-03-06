// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.DSAKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dsa:
//            DSAUtil, BCDSAPublicKey

public class DSASigner extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private Digest digest;
    private SecureRandom random;
    private DSA signer;

    protected DSASigner(Digest digest1, DSA dsa)
    {
        digest = digest1;
        signer = dsa;
    }

    private BigInteger[] derDecode(byte abyte0[])
    {
        abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
        return (new BigInteger[] {
            ((ASN1Integer)abyte0.getObjectAt(0)).getValue(), ((ASN1Integer)abyte0.getObjectAt(1)).getValue()
        });
    }

    private byte[] derEncode(BigInteger biginteger, BigInteger biginteger1)
    {
        return (new DERSequence(new ASN1Integer[] {
            new ASN1Integer(biginteger), new ASN1Integer(biginteger1)
        })).getEncoded("DER");
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        privatekey = DSAUtil.generatePrivateKeyParameter(privatekey);
        if (random != null)
        {
            privatekey = new ParametersWithRandom(privatekey, random);
        }
        digest.reset();
        signer.init(true, privatekey);
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        random = securerandom;
        engineInitSign(privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof DSAKey)) goto _L2; else goto _L1
_L1:
        publickey = DSAUtil.generatePublicKeyParameter(publickey);
_L4:
        digest.reset();
        signer.init(false, publickey);
        return;
_L2:
        publickey = new BCDSAPublicKey(SubjectPublicKeyInfo.getInstance(publickey.getEncoded()));
        if (!(publickey instanceof DSAKey))
        {
            break; /* Loop/switch isn't completed */
        }
        publickey = DSAUtil.generatePublicKeyParameter(publickey);
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
        Object aobj[] = new byte[digest.getDigestSize()];
        digest.doFinal(((byte []) (aobj)), 0);
        try
        {
            aobj = signer.generateSignature(((byte []) (aobj)));
            aobj = derEncode(aobj[0], aobj[1]);
        }
        catch (Exception exception)
        {
            throw new SignatureException(exception.toString());
        }
        return ((byte []) (aobj));
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
        try
        {
            abyte0 = derDecode(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return signer.verifySignature(abyte1, abyte0[0], abyte0[1]);
    }
}
