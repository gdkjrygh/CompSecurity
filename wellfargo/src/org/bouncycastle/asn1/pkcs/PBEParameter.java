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

public class PBEParameter extends ASN1Object
{

    ASN1Integer iterations;
    ASN1OctetString salt;

    private PBEParameter(ASN1Sequence asn1sequence)
    {
        salt = (ASN1OctetString)asn1sequence.getObjectAt(0);
        iterations = (ASN1Integer)asn1sequence.getObjectAt(1);
    }

    public PBEParameter(byte abyte0[], int i)
    {
        if (abyte0.length != 8)
        {
            throw new IllegalArgumentException("salt length must be 8");
        } else
        {
            salt = new DEROctetString(abyte0);
            iterations = new ASN1Integer(i);
            return;
        }
    }

    public static PBEParameter getInstance(Object obj)
    {
        if (obj instanceof PBEParameter)
        {
            return (PBEParameter)obj;
        }
        if (obj != null)
        {
            return new PBEParameter(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public BigInteger getIterationCount()
    {
        return iterations.getValue();
    }

    public byte[] getSalt()
    {
        return salt.getOctets();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(salt);
        asn1encodablevector.add(iterations);
        return new DERSequence(asn1encodablevector);
    }
}
