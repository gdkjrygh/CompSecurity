// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.netscape;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public class NetscapeCertRequest extends ASN1Object
{

    String challenge;
    DERBitString content;
    AlgorithmIdentifier keyAlg;
    PublicKey pubkey;
    AlgorithmIdentifier sigAlg;
    byte sigBits[];

    public NetscapeCertRequest(String s, AlgorithmIdentifier algorithmidentifier, PublicKey publickey)
    {
        challenge = s;
        sigAlg = algorithmidentifier;
        pubkey = publickey;
        algorithmidentifier = new ASN1EncodableVector();
        algorithmidentifier.add(getKeySpec());
        algorithmidentifier.add(new DERIA5String(s));
        try
        {
            content = new DERBitString(new DERSequence(algorithmidentifier));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InvalidKeySpecException((new StringBuilder()).append("exception encoding key: ").append(s.toString()).toString());
        }
    }

    public NetscapeCertRequest(ASN1Sequence asn1sequence)
    {
        try
        {
            if (asn1sequence.size() != 3)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid SPKAC (size):").append(asn1sequence.size()).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (ASN1Sequence asn1sequence)
        {
            throw new IllegalArgumentException(asn1sequence.toString());
        }
        sigAlg = new AlgorithmIdentifier((ASN1Sequence)asn1sequence.getObjectAt(1));
        sigBits = ((DERBitString)asn1sequence.getObjectAt(2)).getBytes();
        asn1sequence = (ASN1Sequence)asn1sequence.getObjectAt(0);
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid PKAC (len): ").append(asn1sequence.size()).toString());
        } else
        {
            challenge = ((DERIA5String)asn1sequence.getObjectAt(1)).getString();
            content = new DERBitString(asn1sequence);
            asn1sequence = new SubjectPublicKeyInfo((ASN1Sequence)asn1sequence.getObjectAt(0));
            X509EncodedKeySpec x509encodedkeyspec = new X509EncodedKeySpec((new DERBitString(asn1sequence)).getBytes());
            keyAlg = asn1sequence.getAlgorithmId();
            pubkey = KeyFactory.getInstance(keyAlg.getObjectId().getId(), "BC").generatePublic(x509encodedkeyspec);
            return;
        }
    }

    public NetscapeCertRequest(byte abyte0[])
    {
        this(getReq(abyte0));
    }

    private ASN1Primitive getKeySpec()
    {
        Object obj = new ByteArrayOutputStream();
        try
        {
            ((ByteArrayOutputStream) (obj)).write(pubkey.getEncoded());
            ((ByteArrayOutputStream) (obj)).close();
            obj = (new ASN1InputStream(new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray()))).readObject();
        }
        catch (IOException ioexception)
        {
            throw new InvalidKeySpecException(ioexception.getMessage());
        }
        return ((ASN1Primitive) (obj));
    }

    private static ASN1Sequence getReq(byte abyte0[])
    {
        return ASN1Sequence.getInstance((new ASN1InputStream(new ByteArrayInputStream(abyte0))).readObject());
    }

    public String getChallenge()
    {
        return challenge;
    }

    public AlgorithmIdentifier getKeyAlgorithm()
    {
        return keyAlg;
    }

    public PublicKey getPublicKey()
    {
        return pubkey;
    }

    public AlgorithmIdentifier getSigningAlgorithm()
    {
        return sigAlg;
    }

    public void setChallenge(String s)
    {
        challenge = s;
    }

    public void setKeyAlgorithm(AlgorithmIdentifier algorithmidentifier)
    {
        keyAlg = algorithmidentifier;
    }

    public void setPublicKey(PublicKey publickey)
    {
        pubkey = publickey;
    }

    public void setSigningAlgorithm(AlgorithmIdentifier algorithmidentifier)
    {
        sigAlg = algorithmidentifier;
    }

    public void sign(PrivateKey privatekey)
    {
        sign(privatekey, null);
    }

    public void sign(PrivateKey privatekey, SecureRandom securerandom)
    {
        Signature signature = Signature.getInstance(sigAlg.getAlgorithm().getId(), "BC");
        if (securerandom != null)
        {
            signature.initSign(privatekey, securerandom);
        } else
        {
            signature.initSign(privatekey);
        }
        privatekey = new ASN1EncodableVector();
        privatekey.add(getKeySpec());
        privatekey.add(new DERIA5String(challenge));
        try
        {
            signature.update((new DERSequence(privatekey)).getEncoded("DER"));
        }
        // Misplaced declaration of an exception variable
        catch (PrivateKey privatekey)
        {
            throw new SignatureException(privatekey.getMessage());
        }
        sigBits = signature.sign();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        try
        {
            asn1encodablevector1.add(getKeySpec());
        }
        catch (Exception exception) { }
        asn1encodablevector1.add(new DERIA5String(challenge));
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        asn1encodablevector.add(sigAlg);
        asn1encodablevector.add(new DERBitString(sigBits));
        return new DERSequence(asn1encodablevector);
    }

    public boolean verify(String s)
    {
        if (!s.equals(challenge))
        {
            return false;
        } else
        {
            s = Signature.getInstance(sigAlg.getObjectId().getId(), "BC");
            s.initVerify(pubkey);
            s.update(content.getBytes());
            return s.verify(sigBits);
        }
    }
}
