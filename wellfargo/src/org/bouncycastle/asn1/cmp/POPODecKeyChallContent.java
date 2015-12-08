// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

// Referenced classes of package org.bouncycastle.asn1.cmp:
//            Challenge

public class POPODecKeyChallContent extends ASN1Object
{

    private ASN1Sequence content;

    private POPODecKeyChallContent(ASN1Sequence asn1sequence)
    {
        content = asn1sequence;
    }

    public static POPODecKeyChallContent getInstance(Object obj)
    {
        if (obj instanceof POPODecKeyChallContent)
        {
            return (POPODecKeyChallContent)obj;
        }
        if (obj != null)
        {
            return new POPODecKeyChallContent(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return content;
    }

    public Challenge[] toChallengeArray()
    {
        Challenge achallenge[] = new Challenge[content.size()];
        for (int i = 0; i != achallenge.length; i++)
        {
            achallenge[i] = Challenge.getInstance(content.getObjectAt(i));
        }

        return achallenge;
    }
}
