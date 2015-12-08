// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1.ua:
//            DSTU4145BinaryField, DSTU4145PointEncoder

public class DSTU4145ECBinary extends ASN1Object
{

    ASN1Integer a;
    ASN1OctetString b;
    ASN1OctetString bp;
    DSTU4145BinaryField f;
    ASN1Integer n;
    BigInteger version;

    private DSTU4145ECBinary(ASN1Sequence asn1sequence)
    {
label0:
        {
            super();
            version = BigInteger.valueOf(0L);
            int i = 0;
            if (asn1sequence.getObjectAt(0) instanceof ASN1TaggedObject)
            {
                ASN1TaggedObject asn1taggedobject = (ASN1TaggedObject)asn1sequence.getObjectAt(0);
                if (!asn1taggedobject.isExplicit() || asn1taggedobject.getTagNo() != 0)
                {
                    break label0;
                }
                version = ASN1Integer.getInstance(asn1taggedobject.getLoadedObject()).getValue();
                i = 1;
            }
            f = DSTU4145BinaryField.getInstance(asn1sequence.getObjectAt(i));
            i++;
            a = ASN1Integer.getInstance(asn1sequence.getObjectAt(i));
            i++;
            b = ASN1OctetString.getInstance(asn1sequence.getObjectAt(i));
            i++;
            n = ASN1Integer.getInstance(asn1sequence.getObjectAt(i));
            bp = ASN1OctetString.getInstance(asn1sequence.getObjectAt(i + 1));
            return;
        }
        throw new IllegalArgumentException("object parse error");
    }

    public DSTU4145ECBinary(ECDomainParameters ecdomainparameters)
    {
        version = BigInteger.valueOf(0L);
        if (!(ecdomainparameters.getCurve() instanceof org.bouncycastle.math.ec.ECCurve.F2m))
        {
            throw new IllegalArgumentException("only binary domain is possible");
        } else
        {
            org.bouncycastle.math.ec.ECCurve.F2m f2m = (org.bouncycastle.math.ec.ECCurve.F2m)ecdomainparameters.getCurve();
            f = new DSTU4145BinaryField(f2m.getM(), f2m.getK1(), f2m.getK2(), f2m.getK3());
            a = new ASN1Integer(f2m.getA().toBigInteger());
            X9IntegerConverter x9integerconverter = new X9IntegerConverter();
            b = new DEROctetString(x9integerconverter.integerToBytes(f2m.getB().toBigInteger(), x9integerconverter.getByteLength(f2m)));
            n = new ASN1Integer(ecdomainparameters.getN());
            bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(ecdomainparameters.getG()));
            return;
        }
    }

    public static DSTU4145ECBinary getInstance(Object obj)
    {
        if (obj instanceof DSTU4145ECBinary)
        {
            return (DSTU4145ECBinary)obj;
        }
        if (obj != null)
        {
            return new DSTU4145ECBinary(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getA()
    {
        return a.getValue();
    }

    public byte[] getB()
    {
        return Arrays.clone(b.getOctets());
    }

    public DSTU4145BinaryField getField()
    {
        return f;
    }

    public byte[] getG()
    {
        return Arrays.clone(bp.getOctets());
    }

    public BigInteger getN()
    {
        return n.getValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (version.compareTo(BigInteger.valueOf(0L)) != 0)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 0, new ASN1Integer(version)));
        }
        asn1encodablevector.add(f);
        asn1encodablevector.add(a);
        asn1encodablevector.add(b);
        asn1encodablevector.add(n);
        asn1encodablevector.add(bp);
        return new DERSequence(asn1encodablevector);
    }
}
