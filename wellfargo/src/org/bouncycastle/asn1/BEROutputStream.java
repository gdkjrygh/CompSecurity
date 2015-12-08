// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DEROutputStream, ASN1Primitive, ASN1Encodable

public class BEROutputStream extends DEROutputStream
{

    public BEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public void writeObject(Object obj)
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (obj instanceof ASN1Primitive)
        {
            ((ASN1Primitive)obj).encode(this);
            return;
        }
        if (obj instanceof ASN1Encodable)
        {
            ((ASN1Encodable)obj).toASN1Primitive().encode(this);
            return;
        } else
        {
            throw new IOException("object not BEREncodable");
        }
    }
}
