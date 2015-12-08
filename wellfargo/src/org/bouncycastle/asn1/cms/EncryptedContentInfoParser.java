// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class EncryptedContentInfoParser
{

    private AlgorithmIdentifier _contentEncryptionAlgorithm;
    private ASN1ObjectIdentifier _contentType;
    private ASN1TaggedObjectParser _encryptedContent;

    public EncryptedContentInfoParser(ASN1SequenceParser asn1sequenceparser)
    {
        _contentType = (ASN1ObjectIdentifier)asn1sequenceparser.readObject();
        _contentEncryptionAlgorithm = AlgorithmIdentifier.getInstance(asn1sequenceparser.readObject().toASN1Primitive());
        _encryptedContent = (ASN1TaggedObjectParser)asn1sequenceparser.readObject();
    }

    public AlgorithmIdentifier getContentEncryptionAlgorithm()
    {
        return _contentEncryptionAlgorithm;
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return _contentType;
    }

    public ASN1Encodable getEncryptedContent(int i)
    {
        return _encryptedContent.getObjectParser(i, false);
    }
}
