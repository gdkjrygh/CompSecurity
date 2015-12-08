// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedData extends ASN1Object
{

    ASN1ObjectIdentifier bagId;
    ASN1Primitive bagValue;
    ASN1Sequence data;

    public EncryptedData(ASN1ObjectIdentifier asn1objectidentifier, AlgorithmIdentifier algorithmidentifier, ASN1Encodable asn1encodable)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(asn1objectidentifier);
        asn1encodablevector.add(algorithmidentifier.toASN1Primitive());
        asn1encodablevector.add(new BERTaggedObject(false, 0, asn1encodable));
        data = new BERSequence(asn1encodablevector);
    }

    private EncryptedData(ASN1Sequence asn1sequence)
    {
        if (((ASN1Integer)asn1sequence.getObjectAt(0)).getValue().intValue() != 0)
        {
            throw new IllegalArgumentException("sequence not version 0");
        } else
        {
            data = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public static EncryptedData getInstance(Object obj)
    {
        if (obj instanceof EncryptedData)
        {
            return (EncryptedData)obj;
        }
        if (obj != null)
        {
            return new EncryptedData(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1OctetString getContent()
    {
        if (data.size() == 3)
        {
            return ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(data.getObjectAt(2)), false);
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return ASN1ObjectIdentifier.getInstance(data.getObjectAt(0));
    }

    public AlgorithmIdentifier getEncryptionAlgorithm()
    {
        return AlgorithmIdentifier.getInstance(data.getObjectAt(1));
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(0L));
        asn1encodablevector.add(data);
        return new BERSequence(asn1encodablevector);
    }
}
