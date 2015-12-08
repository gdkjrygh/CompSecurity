// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ObjectIdentifiers

public class X9FieldID extends ASN1Object
    implements X9ObjectIdentifiers
{

    private ASN1ObjectIdentifier id;
    private ASN1Primitive parameters;

    public X9FieldID(int i, int j, int k, int l)
    {
        id = characteristic_two_field;
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(new ASN1Integer(i));
        if (k == 0)
        {
            asn1encodablevector.add(tpBasis);
            asn1encodablevector.add(new ASN1Integer(j));
        } else
        {
            asn1encodablevector.add(ppBasis);
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.add(new ASN1Integer(j));
            asn1encodablevector1.add(new ASN1Integer(k));
            asn1encodablevector1.add(new ASN1Integer(l));
            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        }
        parameters = new DERSequence(asn1encodablevector);
    }

    public X9FieldID(BigInteger biginteger)
    {
        id = prime_field;
        parameters = new ASN1Integer(biginteger);
    }

    public X9FieldID(ASN1Sequence asn1sequence)
    {
        id = (ASN1ObjectIdentifier)asn1sequence.getObjectAt(0);
        parameters = (ASN1Primitive)asn1sequence.getObjectAt(1);
    }

    public ASN1ObjectIdentifier getIdentifier()
    {
        return id;
    }

    public ASN1Primitive getParameters()
    {
        return parameters;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(id);
        asn1encodablevector.add(parameters);
        return new DERSequence(asn1encodablevector);
    }
}
