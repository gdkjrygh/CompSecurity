// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERPrintableString extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERPrintableString(String s)
    {
        this(s, false);
    }

    public DERPrintableString(String s, boolean flag)
    {
        if (flag && !isPrintableString(s))
        {
            throw new IllegalArgumentException("string contains illegal characters");
        } else
        {
            string = Strings.toByteArray(s);
            return;
        }
    }

    DERPrintableString(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERPrintableString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERPrintableString))
        {
            return (DERPrintableString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERPrintableString)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERPrintableString) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERPrintableString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERPrintableString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERPrintableString(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    public static boolean isPrintableString(String s)
    {
        int i = s.length() - 1;
        do
        {
            if (i < 0)
            {
                break;
            }
            char c = s.charAt(i);
            if (c > '\177')
            {
                return false;
            }
            if (('a' > c || c > 'z') && ('A' > c || c > 'Z') && ('0' > c || c > '9'))
            {
                switch (c)
                {
                default:
                    return false;

                case 32: // ' '
                case 39: // '\''
                case 40: // '('
                case 41: // ')'
                case 43: // '+'
                case 44: // ','
                case 45: // '-'
                case 46: // '.'
                case 47: // '/'
                case 58: // ':'
                case 61: // '='
                case 63: // '?'
                    break;
                }
            }
            i--;
        } while (true);
        return true;
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERPrintableString))
        {
            return false;
        } else
        {
            asn1primitive = (DERPrintableString)asn1primitive;
            return Arrays.areEqual(string, ((DERPrintableString) (asn1primitive)).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(19, string);
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
