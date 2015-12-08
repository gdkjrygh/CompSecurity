// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1.ua:
//            DSTU4145ECBinary

public class DSTU4145Params extends ASN1Object
{

    private static final byte DEFAULT_DKE[] = {
        -87, -42, -21, 69, -15, 60, 112, -126, -128, -60, 
        -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, 
        -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 
        78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 
        40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 
        100, -22, 44, 23, -97, -48, 18, 62, 109, -72, 
        -6, -59, 121, 4
    };
    private byte dke[];
    private DSTU4145ECBinary ecbinary;
    private ASN1ObjectIdentifier namedCurve;

    public DSTU4145Params(ASN1ObjectIdentifier asn1objectidentifier)
    {
        dke = DEFAULT_DKE;
        namedCurve = asn1objectidentifier;
    }

    public DSTU4145Params(DSTU4145ECBinary dstu4145ecbinary)
    {
        dke = DEFAULT_DKE;
        ecbinary = dstu4145ecbinary;
    }

    public static byte[] getDefaultDKE()
    {
        return DEFAULT_DKE;
    }

    public static DSTU4145Params getInstance(Object obj)
    {
        if (obj instanceof DSTU4145Params)
        {
            return (DSTU4145Params)obj;
        }
        if (obj != null)
        {
            ASN1Sequence asn1sequence = ASN1Sequence.getInstance(obj);
            if (asn1sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier)
            {
                obj = new DSTU4145Params(ASN1ObjectIdentifier.getInstance(asn1sequence.getObjectAt(0)));
            } else
            {
                obj = new DSTU4145Params(DSTU4145ECBinary.getInstance(asn1sequence.getObjectAt(0)));
            }
            if (asn1sequence.size() == 2)
            {
                obj.dke = ASN1OctetString.getInstance(asn1sequence.getObjectAt(1)).getOctets();
                if (((DSTU4145Params) (obj)).dke.length != DEFAULT_DKE.length)
                {
                    throw new IllegalArgumentException("object parse error");
                }
            }
            return ((DSTU4145Params) (obj));
        } else
        {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public byte[] getDKE()
    {
        return dke;
    }

    public DSTU4145ECBinary getECBinary()
    {
        return ecbinary;
    }

    public ASN1ObjectIdentifier getNamedCurve()
    {
        return namedCurve;
    }

    public boolean isNamedCurve()
    {
        return namedCurve != null;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (namedCurve != null)
        {
            asn1encodablevector.add(namedCurve);
        } else
        {
            asn1encodablevector.add(ecbinary);
        }
        if (!Arrays.areEqual(dke, DEFAULT_DKE))
        {
            asn1encodablevector.add(new DEROctetString(dke));
        }
        return new DERSequence(asn1encodablevector);
    }

}
