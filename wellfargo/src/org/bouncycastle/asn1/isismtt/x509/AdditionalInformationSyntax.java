// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.DirectoryString;

public class AdditionalInformationSyntax extends ASN1Object
{

    private DirectoryString information;

    public AdditionalInformationSyntax(String s)
    {
        this(new DirectoryString(s));
    }

    private AdditionalInformationSyntax(DirectoryString directorystring)
    {
        information = directorystring;
    }

    public static AdditionalInformationSyntax getInstance(Object obj)
    {
        if (obj instanceof AdditionalInformationSyntax)
        {
            return (AdditionalInformationSyntax)obj;
        }
        if (obj != null)
        {
            return new AdditionalInformationSyntax(DirectoryString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public DirectoryString getInformation()
    {
        return information;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return information.toASN1Primitive();
    }
}
