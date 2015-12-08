// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERIA5String extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERIA5String(String s)
    {
        this(s, false);
    }

    public DERIA5String(String s, boolean flag)
    {
        if (s == null)
        {
            throw new NullPointerException("string cannot be null");
        }
        if (flag && !isIA5String(s))
        {
            throw new IllegalArgumentException("string contains illegal characters");
        } else
        {
            string = Strings.toByteArray(s);
            return;
        }
    }

    DERIA5String(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERIA5String getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERIA5String))
        {
            return (DERIA5String)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERIA5String)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERIA5String) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERIA5String getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERIA5String))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERIA5String(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    public static boolean isIA5String(String s)
    {
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (s.charAt(i) > '\177')
            {
                return false;
            }
        }

        return true;
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERIA5String))
        {
            return false;
        } else
        {
            asn1primitive = (DERIA5String)asn1primitive;
            return Arrays.areEqual(string, ((DERIA5String) (asn1primitive)).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(22, string);
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
