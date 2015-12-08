// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Encodable, InMemoryRepresentable, DERExternal, ASN1StreamParser, 
//            ASN1Exception, ASN1ParsingException, ASN1Primitive

public class DERExternalParser
    implements ASN1Encodable, InMemoryRepresentable
{

    private ASN1StreamParser _parser;

    public DERExternalParser(ASN1StreamParser asn1streamparser)
    {
        _parser = asn1streamparser;
    }

    public ASN1Primitive getLoadedObject()
    {
        DERExternal derexternal;
        try
        {
            derexternal = new DERExternal(_parser.readVector());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1Exception(illegalargumentexception.getMessage(), illegalargumentexception);
        }
        return derexternal;
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
            throw new ASN1ParsingException("unable to get DER object", ioexception);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new ASN1ParsingException("unable to get DER object", illegalargumentexception);
        }
        return asn1primitive;
    }
}
