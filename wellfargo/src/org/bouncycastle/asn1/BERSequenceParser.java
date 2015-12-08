// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1SequenceParser, BERSequence, ASN1StreamParser, ASN1Primitive, 
//            ASN1Encodable

public class BERSequenceParser
    implements ASN1SequenceParser
{

    private ASN1StreamParser _parser;

    BERSequenceParser(ASN1StreamParser asn1streamparser)
    {
        _parser = asn1streamparser;
    }

    public ASN1Primitive getLoadedObject()
    {
        return new BERSequence(_parser.readVector());
    }

    public ASN1Encodable readObject()
    {
        return _parser.readObject();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1Primitive asn1primitive;
        try
        {
            asn1primitive = getLoadedObject();
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception.getMessage());
        }
        return asn1primitive;
    }
}
