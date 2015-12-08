// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.GeneralName;

public class SemanticsInformation extends ASN1Object
{

    private GeneralName nameRegistrationAuthorities[];
    private ASN1ObjectIdentifier semanticsIdentifier;

    public SemanticsInformation(ASN1ObjectIdentifier asn1objectidentifier)
    {
        semanticsIdentifier = asn1objectidentifier;
        nameRegistrationAuthorities = null;
    }

    public SemanticsInformation(ASN1ObjectIdentifier asn1objectidentifier, GeneralName ageneralname[])
    {
        semanticsIdentifier = asn1objectidentifier;
        nameRegistrationAuthorities = ageneralname;
    }

    private SemanticsInformation(ASN1Sequence asn1sequence)
    {
        Enumeration enumeration = asn1sequence.getObjects();
        if (asn1sequence.size() < 1)
        {
            throw new IllegalArgumentException("no objects in SemanticsInformation");
        }
        Object obj = enumeration.nextElement();
        asn1sequence = ((ASN1Sequence) (obj));
        if (obj instanceof ASN1ObjectIdentifier)
        {
            semanticsIdentifier = ASN1ObjectIdentifier.getInstance(obj);
            int i;
            if (enumeration.hasMoreElements())
            {
                asn1sequence = ((ASN1Sequence) (enumeration.nextElement()));
            } else
            {
                asn1sequence = null;
            }
        }
        if (asn1sequence != null)
        {
            asn1sequence = ASN1Sequence.getInstance(asn1sequence);
            nameRegistrationAuthorities = new GeneralName[asn1sequence.size()];
            for (i = 0; i < asn1sequence.size(); i++)
            {
                nameRegistrationAuthorities[i] = GeneralName.getInstance(asn1sequence.getObjectAt(i));
            }

        }
    }

    public SemanticsInformation(GeneralName ageneralname[])
    {
        semanticsIdentifier = null;
        nameRegistrationAuthorities = ageneralname;
    }

    public static SemanticsInformation getInstance(Object obj)
    {
        if (obj instanceof SemanticsInformation)
        {
            return (SemanticsInformation)obj;
        }
        if (obj != null)
        {
            return new SemanticsInformation(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GeneralName[] getNameRegistrationAuthorities()
    {
        return nameRegistrationAuthorities;
    }

    public ASN1ObjectIdentifier getSemanticsIdentifier()
    {
        return semanticsIdentifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (semanticsIdentifier != null)
        {
            asn1encodablevector.add(semanticsIdentifier);
        }
        if (nameRegistrationAuthorities != null)
        {
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            for (int i = 0; i < nameRegistrationAuthorities.length; i++)
            {
                asn1encodablevector1.add(nameRegistrationAuthorities[i]);
            }

            asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        }
        return new DERSequence(asn1encodablevector);
    }
}
