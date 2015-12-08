// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PrivateKeyInfo extends ASN1Object
{

    private AlgorithmIdentifier algId;
    private ASN1Set attributes;
    private ASN1OctetString privKey;

    public PrivateKeyInfo(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        if (((ASN1Integer)asn1sequence.nextElement()).getValue().intValue() != 0)
        {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        algId = AlgorithmIdentifier.getInstance(asn1sequence.nextElement());
        privKey = ASN1OctetString.getInstance(asn1sequence.nextElement());
        if (asn1sequence.hasMoreElements())
        {
            attributes = ASN1Set.getInstance((ASN1TaggedObject)asn1sequence.nextElement(), false);
        }
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        this(algorithmidentifier, asn1encodable, null);
    }

    public PrivateKeyInfo(AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable, ASN1Set asn1set)
    {
        privKey = new DEROctetString(asn1encodable.toASN1Primitive().getEncoded("DER"));
        algId = algorithmidentifier;
        attributes = asn1set;
    }

    public static PrivateKeyInfo getInstance(Object obj)
    {
        if (obj instanceof PrivateKeyInfo)
        {
            return (PrivateKeyInfo)obj;
        }
        if (obj != null)
        {
            return new PrivateKeyInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static PrivateKeyInfo getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public AlgorithmIdentifier getAlgorithmId()
    {
        return algId;
    }

    public ASN1Set getAttributes()
    {
        return attributes;
    }

    public ASN1Primitive getPrivateKey()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = parsePrivateKey().toASN1Primitive();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("unable to parse private key");
        }
        return asn1primitive;
    }

    public AlgorithmIdentifier getPrivateKeyAlgorithm()
    {
        return algId;
    }

    public ASN1Encodable parsePrivateKey()
    {
        return ASN1Primitive.fromByteArray(privKey.getOctets());
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(0L));
        asn1encodablevector.add(algId);
        asn1encodablevector.add(privKey);
        if (attributes != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, attributes));
        }
        return new DERSequence(asn1encodablevector);
    }
}
