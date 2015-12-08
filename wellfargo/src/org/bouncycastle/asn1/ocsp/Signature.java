// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class Signature extends ASN1Object
{

    ASN1Sequence certs;
    DERBitString signature;
    AlgorithmIdentifier signatureAlgorithm;

    private Signature(ASN1Sequence asn1sequence)
    {
        signatureAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(0));
        signature = (DERBitString)asn1sequence.getObjectAt(1);
        if (asn1sequence.size() == 3)
        {
            certs = ASN1Sequence.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(2), true);
        }
    }

    public Signature(AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring)
    {
        signatureAlgorithm = algorithmidentifier;
        signature = derbitstring;
    }

    public Signature(AlgorithmIdentifier algorithmidentifier, DERBitString derbitstring, ASN1Sequence asn1sequence)
    {
        signatureAlgorithm = algorithmidentifier;
        signature = derbitstring;
        certs = asn1sequence;
    }

    public static Signature getInstance(Object obj)
    {
        if (obj instanceof Signature)
        {
            return (Signature)obj;
        }
        if (obj != null)
        {
            return new Signature(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public static Signature getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Sequence getCerts()
    {
        return certs;
    }

    public DERBitString getSignature()
    {
        return signature;
    }

    public AlgorithmIdentifier getSignatureAlgorithm()
    {
        return signatureAlgorithm;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(signatureAlgorithm);
        asn1encodablevector.add(signature);
        if (certs != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, certs));
        }
        return new DERSequence(asn1encodablevector);
    }
}
