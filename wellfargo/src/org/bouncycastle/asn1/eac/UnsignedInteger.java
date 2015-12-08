// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.eac;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

public class UnsignedInteger extends ASN1Object
{

    private int tagNo;
    private BigInteger value;

    public UnsignedInteger(int i, BigInteger biginteger)
    {
        tagNo = i;
        value = biginteger;
    }

    private UnsignedInteger(ASN1TaggedObject asn1taggedobject)
    {
        tagNo = asn1taggedobject.getTagNo();
        value = new BigInteger(1, ASN1OctetString.getInstance(asn1taggedobject, false).getOctets());
    }

    private byte[] convertValue()
    {
        byte abyte0[] = value.toByteArray();
        if (abyte0[0] == 0)
        {
            byte abyte1[] = new byte[abyte0.length - 1];
            System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
            return abyte1;
        } else
        {
            return abyte0;
        }
    }

    public static UnsignedInteger getInstance(Object obj)
    {
        if (obj instanceof UnsignedInteger)
        {
            return (UnsignedInteger)obj;
        }
        if (obj != null)
        {
            return new UnsignedInteger(ASN1TaggedObject.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public int getTagNo()
    {
        return tagNo;
    }

    public BigInteger getValue()
    {
        return value;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DERTaggedObject(false, tagNo, new DEROctetString(convertValue()));
    }
}
