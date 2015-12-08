// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1OctetStringParser, ASN1Encodable, ASN1TaggedObject, 
//            ASN1Sequence, BEROctetString, DEROctetString, ASN1OutputStream

public abstract class ASN1OctetString extends ASN1Primitive
    implements ASN1OctetStringParser
{

    byte string[];

    public ASN1OctetString(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("string cannot be null");
        } else
        {
            string = abyte0;
            return;
        }
    }

    public static ASN1OctetString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof ASN1OctetString))
        {
            return (ASN1OctetString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])obj));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("failed to construct OCTET STRING from byte[]: ").append(((IOException) (obj)).getMessage()).toString());
            }
            return ((ASN1OctetString) (obj));
        }
        if (obj instanceof ASN1Encodable)
        {
            ASN1Primitive asn1primitive = ((ASN1Encodable)obj).toASN1Primitive();
            if (asn1primitive instanceof ASN1OctetString)
            {
                return (ASN1OctetString)asn1primitive;
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
    }

    public static ASN1OctetString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof ASN1OctetString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return BEROctetString.fromSequence(ASN1Sequence.getInstance(asn1taggedobject));
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof ASN1OctetString))
        {
            return false;
        } else
        {
            asn1primitive = (ASN1OctetString)asn1primitive;
            return Arrays.areEqual(string, ((ASN1OctetString) (asn1primitive)).string);
        }
    }

    abstract void encode(ASN1OutputStream asn1outputstream);

    public ASN1Primitive getLoadedObject()
    {
        return toASN1Primitive();
    }

    public InputStream getOctetStream()
    {
        return new ByteArrayInputStream(string);
    }

    public byte[] getOctets()
    {
        return string;
    }

    public int hashCode()
    {
        return Arrays.hashCode(getOctets());
    }

    public ASN1OctetStringParser parser()
    {
        return this;
    }

    ASN1Primitive toDERObject()
    {
        return new DEROctetString(string);
    }

    ASN1Primitive toDLObject()
    {
        return new DEROctetString(string);
    }

    public String toString()
    {
        return (new StringBuilder()).append("#").append(new String(Hex.encode(string))).toString();
    }
}
