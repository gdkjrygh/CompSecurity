// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Object, ASN1InputStream, ASN1Encodable, ASN1OutputStream

public abstract class ASN1Primitive extends ASN1Object
{

    ASN1Primitive()
    {
    }

    public static ASN1Primitive fromByteArray(byte abyte0[])
    {
        abyte0 = new ASN1InputStream(abyte0);
        try
        {
            abyte0 = abyte0.readObject();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IOException("cannot recognise object in stream");
        }
        return abyte0;
    }

    abstract boolean asn1Equals(ASN1Primitive asn1primitive);

    abstract void encode(ASN1OutputStream asn1outputstream);

    abstract int encodedLength();

    public final boolean equals(Object obj)
    {
        while (this == obj || (obj instanceof ASN1Encodable) && asn1Equals(((ASN1Encodable)obj).toASN1Primitive())) 
        {
            return true;
        }
        return false;
    }

    public abstract int hashCode();

    abstract boolean isConstructed();

    public ASN1Primitive toASN1Primitive()
    {
        return this;
    }

    ASN1Primitive toDERObject()
    {
        return this;
    }

    ASN1Primitive toDLObject()
    {
        return this;
    }
}
