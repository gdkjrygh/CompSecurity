// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ObjectIdentifiers, X9FieldID, X9FieldElement

public class X9Curve extends ASN1Object
    implements X9ObjectIdentifiers
{

    private ECCurve curve;
    private ASN1ObjectIdentifier fieldIdentifier;
    private byte seed[];

    public X9Curve(X9FieldID x9fieldid, ASN1Sequence asn1sequence)
    {
        fieldIdentifier = null;
        fieldIdentifier = x9fieldid.getIdentifier();
        if (!fieldIdentifier.equals(prime_field)) goto _L2; else goto _L1
_L1:
        x9fieldid = ((ASN1Integer)x9fieldid.getParameters()).getValue();
        X9FieldElement x9fieldelement = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.getObjectAt(0));
        X9FieldElement x9fieldelement2 = new X9FieldElement(x9fieldid, (ASN1OctetString)asn1sequence.getObjectAt(1));
        curve = new org.bouncycastle.math.ec.ECCurve.Fp(x9fieldid, x9fieldelement.getValue().toBigInteger(), x9fieldelement2.getValue().toBigInteger());
_L4:
        if (asn1sequence.size() == 3)
        {
            seed = ((DERBitString)asn1sequence.getObjectAt(2)).getBytes();
        }
        return;
_L2:
        if (fieldIdentifier.equals(characteristic_two_field))
        {
            x9fieldid = ASN1Sequence.getInstance(x9fieldid.getParameters());
            int l = ((ASN1Integer)x9fieldid.getObjectAt(0)).getValue().intValue();
            X9FieldElement x9fieldelement1;
            int i;
            int j;
            int k;
            if (((ASN1ObjectIdentifier)x9fieldid.getObjectAt(1)).equals(tpBasis))
            {
                i = ((ASN1Integer)x9fieldid.getObjectAt(2)).getValue().intValue();
                k = 0;
                j = 0;
            } else
            {
                x9fieldid = (DERSequence)x9fieldid.getObjectAt(2);
                i = ((ASN1Integer)x9fieldid.getObjectAt(0)).getValue().intValue();
                j = ((ASN1Integer)x9fieldid.getObjectAt(1)).getValue().intValue();
                k = ((ASN1Integer)x9fieldid.getObjectAt(2)).getValue().intValue();
            }
            x9fieldid = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.getObjectAt(0));
            x9fieldelement1 = new X9FieldElement(l, i, j, k, (ASN1OctetString)asn1sequence.getObjectAt(1));
            curve = new org.bouncycastle.math.ec.ECCurve.F2m(l, i, j, k, x9fieldid.getValue().toBigInteger(), x9fieldelement1.getValue().toBigInteger());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public X9Curve(ECCurve eccurve)
    {
        fieldIdentifier = null;
        curve = eccurve;
        seed = null;
        setFieldIdentifier();
    }

    public X9Curve(ECCurve eccurve, byte abyte0[])
    {
        fieldIdentifier = null;
        curve = eccurve;
        seed = abyte0;
        setFieldIdentifier();
    }

    private void setFieldIdentifier()
    {
        if (curve instanceof org.bouncycastle.math.ec.ECCurve.Fp)
        {
            fieldIdentifier = prime_field;
            return;
        }
        if (curve instanceof org.bouncycastle.math.ec.ECCurve.F2m)
        {
            fieldIdentifier = characteristic_two_field;
            return;
        } else
        {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
    }

    public ECCurve getCurve()
    {
        return curve;
    }

    public byte[] getSeed()
    {
        return seed;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (!fieldIdentifier.equals(prime_field)) goto _L2; else goto _L1
_L1:
        asn1encodablevector.add((new X9FieldElement(curve.getA())).toASN1Primitive());
        asn1encodablevector.add((new X9FieldElement(curve.getB())).toASN1Primitive());
_L4:
        if (seed != null)
        {
            asn1encodablevector.add(new DERBitString(seed));
        }
        return new DERSequence(asn1encodablevector);
_L2:
        if (fieldIdentifier.equals(characteristic_two_field))
        {
            asn1encodablevector.add((new X9FieldElement(curve.getA())).toASN1Primitive());
            asn1encodablevector.add((new X9FieldElement(curve.getB())).toASN1Primitive());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
