// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder;

class <init>
    implements DSAEncoder
{

    public BigInteger[] decode(byte abyte0[])
    {
        abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
        return (new BigInteger[] {
            ((DERInteger)abyte0.getObjectAt(0)).getValue(), ((DERInteger)abyte0.getObjectAt(1)).getValue()
        });
    }

    public byte[] encode(BigInteger biginteger, BigInteger biginteger1)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new DERInteger(biginteger));
        asn1encodablevector.add(new DERInteger(biginteger1));
        return (new DERSequence(asn1encodablevector)).getEncoded("DER");
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
