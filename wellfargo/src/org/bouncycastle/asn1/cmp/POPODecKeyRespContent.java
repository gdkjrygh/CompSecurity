// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

public class POPODecKeyRespContent extends ASN1Object
{

    private ASN1Sequence content;

    private POPODecKeyRespContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public static POPODecKeyRespContent getInstance(Object obj)
    {
        if (obj instanceof POPODecKeyRespContent)
        {
            return (POPODecKeyRespContent)obj;
        }
        if (obj != null)
        {
            return new POPODecKeyRespContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Integer[] toASN1IntegerArray()
    {
        ASN1Integer aasn1integer[] = new ASN1Integer[content.size()];
        for (int i = 0; i != aasn1integer.length; i++)
        {
            aasn1integer[i] = ASN1Integer.getInstance(content.getObjectAt(i));
        }

        return aasn1integer;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }
}
