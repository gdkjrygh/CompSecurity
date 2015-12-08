// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Primitive, ASN1String, ASN1TaggedObject, ASN1OctetString, 
//            ASN1OutputStream, StreamUtil

public class DERT61String extends ASN1Primitive
    implements ASN1String
{

    private byte string[];

    public DERT61String(String s)
    {
        string = Strings.toUTF8ByteArray(s);
    }

    DERT61String(byte abyte0[])
    {
        string = abyte0;
    }

    public static DERT61String getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DERT61String))
        {
            return (DERT61String)obj;
        }
        if (obj instanceof byte[])
        {
            try
            {
                obj = (DERT61String)fromByteArray((byte[])(byte[])obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("encoding error in getInstance: ").append(((Exception) (obj)).toString()).toString());
            }
            return ((DERT61String) (obj));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DERT61String getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        asn1taggedobject = asn1taggedobject.getObject();
        if (flag || (asn1taggedobject instanceof DERT61String))
        {
            return getInstance(asn1taggedobject);
        } else
        {
            return new DERT61String(ASN1OctetString.getInstance(asn1taggedobject).getOctets());
        }
    }

    boolean asn1Equals(ASN1Primitive asn1primitive)
    {
        if (!(asn1primitive instanceof DERT61String))
        {
            return false;
        } else
        {
            return Arrays.areEqual(string, ((DERT61String)asn1primitive).string);
        }
    }

    void encode(ASN1OutputStream asn1outputstream)
    {
        asn1outputstream.writeEncoded(20, string);
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
        return Strings.fromUTF8ByteArray(string);
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
