// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1Integer, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERInteger extends ASN1Primitive
{

    byte bytes[];

    public DERInteger(long l)
    {
        bytes = BigInteger.valueOf(l).toByteArray();
    }

    public DERInteger(BigInteger biginteger)
    {
        bytes = biginteger.toByteArray();
    }

    public DERInteger(byte abyte0[])
    {
        bytes = abyte0;
    }

    public static ASN1Integer getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1Integer))
        {
            return (ASN1Integer)obj;
        }
        if (obj instanceof DERInteger)
        {
            return new ASN1Integer(((DERInteger)obj).getValue());
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (ASN1Integer)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((ASN1Integer) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static ASN1Integer getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        ASN1Primitive asn1primitive = asn1taggedobject.getObject();
        if (flag || (asn1primitive instanceof DERInteger))
        {
            return getInstance(asn1primitive);
        } else
        {
            return new ASN1Integer(ASN1OctetString.getInstance(asn1taggedobject.getObject()).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERInteger))
        {
            return false;
        } else
        {
            asn1primitive = (DERInteger)asn1primitive;
            return Arrays.areEqual(bytes, ((DERInteger) (asn1primitive)).bytes);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(2, bytes);
    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(bytes.length) + 1 + bytes.length;
    }

    public BigInteger getPositiveValue()
    {
        return new BigInteger(1, bytes);
    }

    public BigInteger getValue()
    {
        return new BigInteger(bytes);
    }

    public int hashCode()
    {
        int i = 0;
        int j = 0;
        for (; i != bytes.length; i++)
        {
            j ^= (bytes[i] & 0xff) << i % 4;
        }

        return j;
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return getValue().toString();
    }
}
