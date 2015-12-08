// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERUniversalString extends ASN1Primitive
    implements ASN1String
{

    private static final char table[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F'
    };
    private byte string[];

    public DERUniversalString(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERUniversalString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERUniversalString))
        {
            return (DERUniversalString)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERUniversalString)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERUniversalString) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERUniversalString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERUniversalString))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERUniversalString(((ASN1OctetString)asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERUniversalString))
        {
            return false;
        } else
        {
            return Arrays.areEqual(string, ((DERUniversalString)asn1primitive).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(28, getOctets());
    }

    int encodedLength()
    {
        return StreamUtil.calculateBodyLength(string.length) + 1 + string.length;
    }

    public byte[] getOctets()
    {
        return string;
    }

    public String getString()
    {
        Object obj = new StringBuffer("#");
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ASN1OutputStream asn1outputstream = new ASN1OutputStream(bytearrayoutputstream);
        byte abyte0[];
        try
        {
            asn1outputstream.writeObject(this);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("internal error encoding BitString");
        }
        abyte0 = bytearrayoutputstream.toByteArray();
        for (int i = 0; i != abyte0.length; i++)
        {
            ((StringBuffer) (obj)).append(table[abyte0[i] >>> 4 & 0xf]);
            ((StringBuffer) (obj)).append(table[abyte0[i] & 0xf]);
        }

        return ((StringBuffer) (obj)).toString();
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
