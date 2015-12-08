// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            AccessDescription, GeneralName

public class AuthorityInformationAccess extends ASN1Object
{

    private AccessDescription descriptions[];

    public AuthorityInformationAccess(ASN1ObjectIdentifier asn1objectidentifier, GeneralName generalname)
    {
        descriptions = new AccessDescription[1];
        descriptions[0] = new AccessDescription(asn1objectidentifier, generalname);
    }

    private AuthorityInformationAccess(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1)
        {
            throw new IllegalArgumentException("sequence may not be empty");
        }
        descriptions = new AccessDescription[asn1sequence.size()];
        for (int i = 0; i != asn1sequence.size(); i++)
        {
            descriptions[i] = AccessDescription.getInstance(asn1sequence.getObjectAt(i));
        }

    }

    public static AuthorityInformationAccess getInstance(Object obj)
    {
        if (obj instanceof AuthorityInformationAccess)
        {
            return (AuthorityInformationAccess)obj;
        }
        if (obj != null)
        {
            return new AuthorityInformationAccess(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public AccessDescription[] getAccessDescriptions()
    {
        return descriptions;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        for (int i = 0; i != descriptions.length; i++)
        {
            asn1encodablevector.add(descriptions[i]);
        }

        return new DERSequence(asn1encodablevector);
    }

    public String toString()
    {
        return (new StringBuilder()).append("AuthorityInformationAccess: Oid(").append(descriptions[0].getAccessMethod().getId()).append(")").toString();
    }
}
