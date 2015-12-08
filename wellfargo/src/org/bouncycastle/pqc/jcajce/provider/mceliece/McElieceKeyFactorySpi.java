// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.jcajce.spec.McEliecePrivateKeySpec;
import org.bouncycastle.pqc.jcajce.spec.McEliecePublicKeySpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            BCMcEliecePrivateKey, BCMcEliecePublicKey

public class McElieceKeyFactorySpi extends KeyFactorySpi
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";

    public McElieceKeyFactorySpi()
    {
    }

    protected PrivateKey engineGeneratePrivate(KeySpec keyspec)
    {
        return null;
    }

    protected PublicKey engineGeneratePublic(KeySpec keyspec)
    {
        return null;
    }

    protected KeySpec engineGetKeySpec(Key key, Class class1)
    {
        return null;
    }

    protected Key engineTranslateKey(Key key)
    {
        return null;
    }

    public PrivateKey generatePrivate(KeySpec keyspec)
    {
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        byte abyte5[][];
        int j;
        int k;
        int i = 0;
        if (keyspec instanceof McEliecePrivateKeySpec)
        {
            return new BCMcEliecePrivateKey((McEliecePrivateKeySpec)keyspec);
        }
        if (!(keyspec instanceof PKCS8EncodedKeySpec))
        {
            break MISSING_BLOCK_LABEL_322;
        }
        keyspec = ((PKCS8EncodedKeySpec)keyspec).getEncoded();
        ASN1Sequence asn1sequence;
        try
        {
            keyspec = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(keyspec));
        }
        // Misplaced declaration of an exception variable
        catch (KeySpec keyspec)
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unable to decode PKCS8EncodedKeySpec: ").append(keyspec).toString());
        }
        asn1sequence = (ASN1Sequence)keyspec.parsePrivateKey().toASN1Primitive();
        ((ASN1ObjectIdentifier)asn1sequence.getObjectAt(0)).toString();
        j = ((ASN1Integer)asn1sequence.getObjectAt(1)).getValue().intValue();
        k = ((ASN1Integer)asn1sequence.getObjectAt(2)).getValue().intValue();
        keyspec = ((ASN1OctetString)asn1sequence.getObjectAt(3)).getOctets();
        abyte0 = ((ASN1OctetString)asn1sequence.getObjectAt(4)).getOctets();
        abyte1 = ((ASN1OctetString)asn1sequence.getObjectAt(5)).getOctets();
        abyte2 = ((ASN1OctetString)asn1sequence.getObjectAt(6)).getOctets();
        abyte3 = ((ASN1OctetString)asn1sequence.getObjectAt(7)).getOctets();
        abyte4 = ((ASN1OctetString)asn1sequence.getObjectAt(8)).getOctets();
        asn1sequence = (ASN1Sequence)asn1sequence.getObjectAt(9);
        abyte5 = new byte[asn1sequence.size()][];
_L1:
        if (i >= asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_277;
        }
        abyte5[i] = ((ASN1OctetString)asn1sequence.getObjectAt(i)).getOctets();
        i++;
          goto _L1
        try
        {
            keyspec = new BCMcEliecePrivateKey(new McEliecePrivateKeySpec("1.3.6.1.4.1.8301.3.1.3.4.1", j, k, keyspec, abyte0, abyte1, abyte2, abyte3, abyte4, abyte5));
        }
        // Misplaced declaration of an exception variable
        catch (KeySpec keyspec)
        {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
        }
        return keyspec;
        throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key specification: ").append(keyspec.getClass()).append(".").toString());
    }

    public PrivateKey generatePrivate(PrivateKeyInfo privatekeyinfo)
    {
        try
        {
            privatekeyinfo = McEliecePrivateKey.getInstance(privatekeyinfo.parsePrivateKey().toASN1Primitive());
            privatekeyinfo = new BCMcEliecePrivateKey(privatekeyinfo.getOID().getId(), privatekeyinfo.getN(), privatekeyinfo.getK(), privatekeyinfo.getField(), privatekeyinfo.getGoppaPoly(), privatekeyinfo.getSInv(), privatekeyinfo.getP1(), privatekeyinfo.getP2(), privatekeyinfo.getH(), privatekeyinfo.getQInv());
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKeyInfo privatekeyinfo)
        {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec");
        }
        return privatekeyinfo;
    }

    public PublicKey generatePublic(KeySpec keyspec)
    {
        if (keyspec instanceof McEliecePublicKeySpec)
        {
            return new BCMcEliecePublicKey((McEliecePublicKeySpec)keyspec);
        }
        if (keyspec instanceof X509EncodedKeySpec)
        {
            keyspec = ((X509EncodedKeySpec)keyspec).getEncoded();
            try
            {
                keyspec = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(keyspec));
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException(keyspec.toString());
            }
            try
            {
                keyspec = (ASN1Sequence)keyspec.parsePublicKey();
                ((ASN1ObjectIdentifier)keyspec.getObjectAt(0)).toString();
                int i = ((ASN1Integer)keyspec.getObjectAt(1)).getValue().intValue();
                keyspec = new BCMcEliecePublicKey(new McEliecePublicKeySpec("1.3.6.1.4.1.8301.3.1.3.4.1", ((ASN1Integer)keyspec.getObjectAt(2)).getValue().intValue(), i, ((ASN1OctetString)keyspec.getObjectAt(3)).getOctets()));
            }
            // Misplaced declaration of an exception variable
            catch (KeySpec keyspec)
            {
                throw new InvalidKeySpecException((new StringBuilder()).append("Unable to decode X509EncodedKeySpec: ").append(keyspec.getMessage()).toString());
            }
            return keyspec;
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key specification: ").append(keyspec.getClass()).append(".").toString());
        }
    }

    public PublicKey generatePublic(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        try
        {
            subjectpublickeyinfo = McEliecePublicKey.getInstance(subjectpublickeyinfo.parsePublicKey());
            subjectpublickeyinfo = new BCMcEliecePublicKey(subjectpublickeyinfo.getOID().getId(), subjectpublickeyinfo.getN(), subjectpublickeyinfo.getT(), subjectpublickeyinfo.getG());
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec");
        }
        return subjectpublickeyinfo;
    }

    public KeySpec getKeySpec(Key key, Class class1)
    {
        if (key instanceof BCMcEliecePrivateKey)
        {
            if (java/security/spec/PKCS8EncodedKeySpec.isAssignableFrom(class1))
            {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/McEliecePrivateKeySpec.isAssignableFrom(class1))
            {
                key = (BCMcEliecePrivateKey)key;
                return new McEliecePrivateKeySpec("1.3.6.1.4.1.8301.3.1.3.4.1", key.getN(), key.getK(), key.getField(), key.getGoppaPoly(), key.getSInv(), key.getP1(), key.getP2(), key.getH(), key.getQInv());
            }
        } else
        if (key instanceof BCMcEliecePublicKey)
        {
            if (java/security/spec/X509EncodedKeySpec.isAssignableFrom(class1))
            {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/McEliecePublicKeySpec.isAssignableFrom(class1))
            {
                key = (BCMcEliecePublicKey)key;
                return new McEliecePublicKeySpec("1.3.6.1.4.1.8301.3.1.3.4.1", key.getN(), key.getT(), key.getG());
            }
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key type: ").append(key.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException((new StringBuilder()).append("Unknown key specification: ").append(class1).append(".").toString());
    }

    public Key translateKey(Key key)
    {
        if ((key instanceof BCMcEliecePrivateKey) || (key instanceof BCMcEliecePublicKey))
        {
            return key;
        } else
        {
            throw new InvalidKeyException("Unsupported key type.");
        }
    }
}
