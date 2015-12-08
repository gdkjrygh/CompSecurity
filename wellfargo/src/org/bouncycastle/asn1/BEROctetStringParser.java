// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1OctetStringParser, BEROctetString, ConstructedOctetStream, ASN1ParsingException, 
//            ASN1StreamParser, ASN1Primitive

public class BEROctetStringParser
    implements ASN1OctetStringParser
{

    private ASN1StreamParser _parser;

    BEROctetStringParser(ASN1StreamParser asn1streamparser)
    {
        _parser = asn1streamparser;
    }

    public ASN1Primitive getLoadedObject()
    {
        return new BEROctetString(Streams.readAll(getOctetStream()));
    }

    public InputStream getOctetStream()
    {
        return new ConstructedOctetStream(_parser);
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
            throw new ASN1ParsingException((new StringBuilder()).append("IOException converting stream to byte array: ").append(ioexception.getMessage()).toString(), ioexception);
        }
        return asn1primitive;
    }
}
