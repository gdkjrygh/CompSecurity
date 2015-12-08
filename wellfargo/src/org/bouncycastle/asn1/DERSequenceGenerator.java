// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DERGenerator, ASN1Encodable, DEROutputStream, ASN1Primitive

public class DERSequenceGenerator extends DERGenerator
{

    private final ByteArrayOutputStream _bOut;

    public DERSequenceGenerator(OutputStream outputstream)
    {
        super(outputstream);
        _bOut = new ByteArrayOutputStream();
    }

    public DERSequenceGenerator(OutputStream outputstream, int i, boolean flag)
    {
        super(outputstream, i, flag);
        _bOut = new ByteArrayOutputStream();
    }

    public void addObject(ASN1Encodable asn1encodable)
    {
        asn1encodable.toASN1Primitive().encode(new DEROutputStream(_bOut));
    }

    public void close()
    {
        writeDEREncoded(48, _bOut.toByteArray());
    }

    public OutputStream getRawOutputStream()
    {
        return _bOut;
    }
}
