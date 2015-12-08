// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class PKCS12PBEParams extends ASN1Object
{

    ASN1Integer iterations;
    ASN1OctetString iv;

    private PKCS12PBEParams(ASN1Sequence asn1sequence)
    {
        iv = (ASN1OctetString)asn1sequence.getObjectAt(0);
        iterations = ASN1Integer.getInstance(asn1sequence.getObjectAt(1));
    }

    public PKCS12PBEParams(byte abyte0[], int i)
    {
        iv = new DEROctetString(abyte0);
        iterations = new ASN1Integer(i);
    }

    public static PKCS12PBEParams getInstance(Object obj)
    {
        if (obj instanceof PKCS12PBEParams)
        {
            return (PKCS12PBEParams)obj;
        }
        if (obj != null)
        {
            return new PKCS12PBEParams(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getIV()
    {
        return iv.getOctets();
    }

    public BigInteger getIterations()
    {
        return iterations.getValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(iv);
        asn1encodablevector.add(iterations);
        return new DERSequence(asn1encodablevector);
    }
}
