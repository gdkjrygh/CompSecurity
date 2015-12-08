// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERVisibleString;

public class DisplayText extends ASN1Object
    implements ASN1Choice
{

    public static final int CONTENT_TYPE_BMPSTRING = 1;
    public static final int CONTENT_TYPE_IA5STRING = 0;
    public static final int CONTENT_TYPE_UTF8STRING = 2;
    public static final int CONTENT_TYPE_VISIBLESTRING = 3;
    public static final int DISPLAY_TEXT_MAXIMUM_SIZE = 200;
    int contentType;
    ASN1String contents;

    public DisplayText(int i, String s)
    {
        String s1 = s;
        if (s.length() > 200)
        {
            s1 = s.substring(0, 200);
        }
        contentType = i;
        switch (i)
        {
        default:
            contents = new DERUTF8String(s1);
            return;

        case 0: // '\0'
            contents = new DERIA5String(s1);
            return;

        case 2: // '\002'
            contents = new DERUTF8String(s1);
            return;

        case 3: // '\003'
            contents = new DERVisibleString(s1);
            return;

        case 1: // '\001'
            contents = new DERBMPString(s1);
            return;
        }
    }

    public DisplayText(String s)
    {
        String s1 = s;
        if (s.length() > 200)
        {
            s1 = s.substring(0, 200);
        }
        contentType = 2;
        contents = new DERUTF8String(s1);
    }

    private DisplayText(ASN1String asn1string)
    {
        contents = asn1string;
    }

    public static DisplayText getInstance(Object obj)
    {
        if (obj instanceof ASN1String)
        {
            return new DisplayText((ASN1String)obj);
        }
        if (obj == null || (obj instanceof DisplayText))
        {
            return (DisplayText)obj;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public static DisplayText getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public String getString()
    {
        return contents.getString();
    }

    public ASN1Primitive toASN1Primitive()
    {
        return (ASN1Primitive)contents;
    }
}
