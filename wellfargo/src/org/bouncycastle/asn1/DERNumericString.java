// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERNumericString extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERNumericString(String s)
    {
        this(s, false);
    }

    public DERNumericString(String s, boolean flag)
    {
        if (flag && !isNumericString(s))
        {
            throw new IllegalArgumentException("string contains illegal characters");
        } else
        {
            string = Strings.toByteArray(s);
            return;
        }
    }

    DERNumericString(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERNumericString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERNumericString))
        {
            return (DERNumericString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERNumericString)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERNumericString) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERNumericString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERNumericString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERNumericString(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    public static boolean isNumericString(String s)
    {
        for (int i = s.length() - 1; i >= 0; i--)
        {
            for (char c = s.charAt(i); c > '\177' || ('0' > c || c > '9') && c != ' ';)
            {
                return false;
            }

        }

        return true;
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERNumericString))
        {
            return false;
        } else
        {
            asn1primitive = (DERNumericString)asn1primitive;
            return Arrays.areEqual(string, ((DERNumericString) (asn1primitive)).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(18, string);
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
