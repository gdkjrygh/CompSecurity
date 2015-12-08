// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedContentInfo extends ASN1Object
{

    private AlgorithmIdentifier contentEncryptionAlgorithm;
    private ASN1ObjectIdentifier contentType;
    private ASN1OctetString encryptedContent;

    public EncryptedContentInfo(ASN1ObjectIdentifier asn1objectidentifier, AlgorithmIdentifier algorithmidentifier, ASN1OctetString asn1octetstring)
    {
        contentType = asn1objectidentifier;
        contentEncryptionAlgorithm = algorithmidentifier;
        encryptedContent = asn1octetstring;
    }

    private EncryptedContentInfo(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 2)
        {
            throw new IllegalArgumentException("Truncated Sequence Found");
        }
        contentType = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        contentEncryptionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequence.getObjectAt(1));
        if (asn1sequence.size() > 2)
        {
            encryptedContent = ASN1OctetString.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(2), false);
        }
    }

    public static EncryptedContentInfo getInstance(Object obj)
    {
        if (obj instanceof EncryptedContentInfo)
        {
            return (EncryptedContentInfo)obj;
        }
        if (obj != null)
        {
            return new EncryptedContentInfo(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm()
    {
        return contentEncryptionAlgorithm;
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return contentType;
    }

    public ASN1OctetString getEncryptedContent()
    {
        return encryptedContent;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(contentType);
        asn1encodablevector.add(contentEncryptionAlgorithm);
        if (encryptedContent != null)
        {
            asn1encodablevector.add(new BERTaggedObject(false, 0, encryptedContent));
        }
        return new BERSequence(asn1encodablevector);
    }
}
