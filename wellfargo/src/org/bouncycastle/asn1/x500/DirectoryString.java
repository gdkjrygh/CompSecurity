// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUniversalString;

public class DirectoryString extends ASN1Object
    implements ASN1Choice, ASN1String
{

    private ASN1String string;

    public DirectoryString(String s)
    {
        string = new DERUTF8String(s);
    }

    private DirectoryString(DERBMPString derbmpstring)
    {
        string = derbmpstring;
    }

    private DirectoryString(DERPrintableString derprintablestring)
    {
        string = derprintablestring;
    }

    private DirectoryString(DERT61String dert61string)
    {
        string = dert61string;
    }

    private DirectoryString(DERUTF8String derutf8string)
    {
        string = derutf8string;
    }

    private DirectoryString(DERUniversalString deruniversalstring)
    {
        string = deruniversalstring;
    }

    public static DirectoryString getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DirectoryString))
        {
            return (DirectoryString)obj;
        }
        if (obj instanceof DERT61String)
        {
            return new DirectoryString((DERT61String)obj);
        }
        if (obj instanceof DERPrintableString)
        {
            return new DirectoryString((DERPrintableString)obj);
        }
        if (obj instanceof DERUniversalString)
        {
            return new DirectoryString((DERUniversalString)obj);
        }
        if (obj instanceof DERUTF8String)
        {
            return new DirectoryString((DERUTF8String)obj);
        }
        if (obj instanceof DERBMPString)
        {
            return new DirectoryString((DERBMPString)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DirectoryString getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException("choice item must be explicitly tagged");
        } else
        {
            return getInstance(asn1taggedobject.getObject());
        }
    }

    public String getString()
    {
        return string.getString();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return ((ASN1Encodable)string).toASN1Primitive();
    }

    public String toString()
    {
        return string.getString();
    }
}
