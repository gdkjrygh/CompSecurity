// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Encodable, ASN1Primitive, ASN1OutputStream, DEROutputStream, 
//            DLOutputStream

public abstract class ASN1Object
    implements ASN1Encodable
{

    public ASN1Object()
    {
    }

    protected static boolean hasEncodedTagValue(Object obj, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof byte[])
        {
            flag = flag1;
            if (((byte[])(byte[])obj)[0] == i)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ASN1Encodable))
        {
            return false;
        } else
        {
            obj = (ASN1Encodable)obj;
            return toASN1Primitive().equals(((ASN1Encodable) (obj)).toASN1Primitive());
        }
    }

    public byte[] getEncoded()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        (new ASN1OutputStream(bytearrayoutputstream)).writeObject(this);
        return bytearrayoutputstream.toByteArray();
    }

    public byte[] getEncoded(String s)
    {
        if (s.equals("DER"))
        {
            s = new ByteArrayOutputStream();
            (new DEROutputStream(s)).writeObject(this);
            return s.toByteArray();
        }
        if (s.equals("DL"))
        {
            s = new ByteArrayOutputStream();
            (new DLOutputStream(s)).writeObject(this);
            return s.toByteArray();
        } else
        {
            return getEncoded();
        }
    }

    public int hashCode()
    {
        return toASN1Primitive().hashCode();
    }

    public ASN1Primitive toASN1Object()
    {
        return toASN1Primitive();
    }

    public abstract ASN1Primitive toASN1Primitive();
}
