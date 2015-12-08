// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.misc;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class CAST5CBCParameters extends ASN1Object
{

    ASN1OctetString iv;
    ASN1Integer keyLength;

    public CAST5CBCParameters(ASN1Sequence asn1sequence)
    {
        iv = (ASN1OctetString)asn1sequence.getObjectAt(0);
        keyLength = (ASN1Integer)asn1sequence.getObjectAt(1);
    }

    public CAST5CBCParameters(byte abyte0[], int i)
    {
        iv = new DEROctetString(abyte0);
        keyLength = new ASN1Integer(i);
    }

    public static CAST5CBCParameters getInstance(Object obj)
    {
        if (obj instanceof CAST5CBCParameters)
        {
            return (CAST5CBCParameters)obj;
        }
        if (obj != null)
        {
            return new CAST5CBCParameters(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public byte[] getIV()
    {
        return iv.getOctets();
    }

    public int getKeyLength()
    {
        return keyLength.getValue().intValue();
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(iv);
        asn1encodablevector.add(keyLength);
        return new DERSequence(asn1encodablevector);
    }
}
