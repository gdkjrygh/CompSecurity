// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;

public class ContentInfoParser
{

    private ASN1TaggedObjectParser content;
    private ASN1ObjectIdentifier contentType;

    public ContentInfoParser(ASN1SequenceParser asn1sequenceparser)
    {
        contentType = (ASN1ObjectIdentifier)asn1sequenceparser.readObject();
        content = (ASN1TaggedObjectParser)asn1sequenceparser.readObject();
    }

    public ASN1Encodable getContent(int i)
    {
        if (content != null)
        {
            return content.getObjectParser(i, true);
        } else
        {
            return null;
        }
    }

    public ASN1ObjectIdentifier getContentType()
    {
        return contentType;
    }
}
