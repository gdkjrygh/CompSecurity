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
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PrivateKeySpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2PublicKeySpec;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            BCMcElieceCCA2PrivateKey, BCMcElieceCCA2PublicKey

public class McElieceCCA2KeyFactorySpi extends KeyFactorySpi
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";

    public McElieceCCA2KeyFactorySpi()
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
        byte abyte3[][];
        int j;
        int k;
        int i = 0;
        if (keyspec instanceof McElieceCCA2PrivateKeySpec)
        {
            return new BCMcElieceCCA2PrivateKey((McElieceCCA2PrivateKeySpec)keyspec);
        }
        if (!(keyspec instanceof PKCS8EncodedKeySpec))
        {
            break MISSING_BLOCK_LABEL_288;
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
        asn1sequence = (ASN1Sequence)asn1sequence.getObjectAt(7);
        abyte3 = new byte[asn1sequence.size()][];
_L1:
        if (i >= asn1sequence.size())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        abyte3[i] = ((ASN1OctetString)asn1sequence.getObjectAt(i)).getOctets();
        i++;
          goto _L1
        try
        {
            keyspec = new BCMcElieceCCA2PrivateKey(new McElieceCCA2PrivateKeySpec("1.3.6.1.4.1.8301.3.1.3.4.2", j, k, keyspec, abyte0, abyte1, abyte2, abyte3));
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
            privatekeyinfo = McElieceCCA2PrivateKey.getInstance(privatekeyinfo.parsePrivateKey().toASN1Primitive());
            privatekeyinfo = new BCMcElieceCCA2PrivateKey(privatekeyinfo.getOID().getId(), privatekeyinfo.getN(), privatekeyinfo.getK(), privatekeyinfo.getField(), privatekeyinfo.getGoppaPoly(), privatekeyinfo.getP(), privatekeyinfo.getH(), privatekeyinfo.getQInv());
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
        if (keyspec instanceof McElieceCCA2PublicKeySpec)
        {
            return new BCMcElieceCCA2PublicKey((McElieceCCA2PublicKeySpec)keyspec);
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
                keyspec = new BCMcElieceCCA2PublicKey(new McElieceCCA2PublicKeySpec("1.3.6.1.4.1.8301.3.1.3.4.2", ((ASN1Integer)keyspec.getObjectAt(1)).getValue().intValue(), ((ASN1Integer)keyspec.getObjectAt(2)).getValue().intValue(), ((ASN1OctetString)keyspec.getObjectAt(3)).getOctets()));
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
            subjectpublickeyinfo = McElieceCCA2PublicKey.getInstance((ASN1Sequence)subjectpublickeyinfo.parsePublicKey());
            subjectpublickeyinfo = new BCMcElieceCCA2PublicKey(subjectpublickeyinfo.getOID().getId(), subjectpublickeyinfo.getN(), subjectpublickeyinfo.getT(), subjectpublickeyinfo.getG());
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
        if (key instanceof BCMcElieceCCA2PrivateKey)
        {
            if (java/security/spec/PKCS8EncodedKeySpec.isAssignableFrom(class1))
            {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/McElieceCCA2PrivateKeySpec.isAssignableFrom(class1))
            {
                key = (BCMcElieceCCA2PrivateKey)key;
                return new McElieceCCA2PrivateKeySpec("1.3.6.1.4.1.8301.3.1.3.4.2", key.getN(), key.getK(), key.getField(), key.getGoppaPoly(), key.getP(), key.getH(), key.getQInv());
            }
        } else
        if (key instanceof BCMcElieceCCA2PublicKey)
        {
            if (java/security/spec/X509EncodedKeySpec.isAssignableFrom(class1))
            {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (org/bouncycastle/pqc/jcajce/spec/McElieceCCA2PublicKeySpec.isAssignableFrom(class1))
            {
                key = (BCMcElieceCCA2PublicKey)key;
                return new McElieceCCA2PublicKeySpec("1.3.6.1.4.1.8301.3.1.3.4.2", key.getN(), key.getT(), key.getG());
            }
        } else
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("Unsupported key type: ").append(key.getClass()).append(".").toString());
        }
        throw new InvalidKeySpecException((new StringBuilder()).append("Unknown key specification: ").append(class1).append(".").toString());
    }

    public Key translateKey(Key key)
    {
        if ((key instanceof BCMcElieceCCA2PrivateKey) || (key instanceof BCMcElieceCCA2PublicKey))
        {
            return key;
        } else
        {
            throw new InvalidKeyException("Unsupported key type.");
        }
    }
}
