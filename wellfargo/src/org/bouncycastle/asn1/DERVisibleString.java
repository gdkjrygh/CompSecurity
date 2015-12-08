// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERVisibleString extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERVisibleString(String s)
    {
        string = Strings.toByteArray(s);
    }

    DERVisibleString(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERVisibleString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERVisibleString))
        {
            return (DERVisibleString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERVisibleString)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERVisibleString) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERVisibleString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERVisibleString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERVisibleString(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERVisibleString))
        {
            return false;
        } else
        {
            return Arrays.areEqual(string, ((DERVisibleString)asn1primitive).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(26, string);
    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(string.length) + 1 + string.length;
    }

    public byte[] getOctets()
    {
        return Arrays.clone(string);
    }

    public String getString()
    {
        return Strings.fromByteArray(string);
    }

    public int hashCode()
    {
        return Arrays.hashCode(string);
    }

    boolean isConstructed()
    {
        return false;
    }

    public String toString()
    {
        return getString();
    }
}
