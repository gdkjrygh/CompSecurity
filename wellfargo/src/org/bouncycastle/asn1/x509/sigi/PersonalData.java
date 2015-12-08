// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.sigi;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.DirectoryString;

// Referenced classes of package org.bouncycastle.asn1.x509.sigi:
//            NameOrPseudonym

public class PersonalData extends ASN1Object
{

    private ASN1GeneralizedTime dateOfBirth;
    private String gender;
    private BigInteger nameDistinguisher;
    private NameOrPseudonym nameOrPseudonym;
    private DirectoryString placeOfBirth;
    private DirectoryString postalAddress;

    private PersonalData(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() < 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        asn1sequence = asn1sequence.getObjects();
        nameOrPseudonym = NameOrPseudonym.getInstance(asn1sequence.nextElement());
        do
        {
            if (!asn1sequence.hasMoreElements())
            {
                break;
            }
            ASN1TaggedObject asn1taggedobject = ASN1TaggedObject.getInstance(asn1sequence.nextElement());
            switch (asn1taggedobject.getTagNo())
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(asn1taggedobject.getTagNo()).toString());

            case 0: // '\0'
                nameDistinguisher = ASN1Integer.getInstance(asn1taggedobject, false).getValue();
                break;

            case 1: // '\001'
                dateOfBirth = ASN1GeneralizedTime.getInstance(asn1taggedobject, false);
                break;

            case 2: // '\002'
                placeOfBirth = DirectoryString.getInstance(asn1taggedobject, true);
                break;

            case 3: // '\003'
                gender = DERPrintableString.getInstance(asn1taggedobject, false).getString();
                break;

            case 4: // '\004'
                postalAddress = DirectoryString.getInstance(asn1taggedobject, true);
                break;
            }
        } while (true);
    }

    public PersonalData(NameOrPseudonym nameorpseudonym, BigInteger biginteger, ASN1GeneralizedTime asn1generalizedtime, DirectoryString directorystring, String s, DirectoryString directorystring1)
    {
        nameOrPseudonym = nameorpseudonym;
        dateOfBirth = asn1generalizedtime;
        gender = s;
        nameDistinguisher = biginteger;
        postalAddress = directorystring1;
        placeOfBirth = directorystring;
    }

    public static PersonalData getInstance(Object obj)
    {
        if (obj == null || (obj instanceof PersonalData))
        {
            return (PersonalData)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new PersonalData((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1GeneralizedTime getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getGender()
    {
        return gender;
    }

    public BigInteger getNameDistinguisher()
    {
        return nameDistinguisher;
    }

    public NameOrPseudonym getNameOrPseudonym()
    {
        return nameOrPseudonym;
    }

    public DirectoryString getPlaceOfBirth()
    {
        return placeOfBirth;
    }

    public DirectoryString getPostalAddress()
    {
        return postalAddress;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(nameOrPseudonym);
        if (nameDistinguisher != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 0, new ASN1Integer(nameDistinguisher)));
        }
        if (dateOfBirth != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 1, dateOfBirth));
        }
        if (placeOfBirth != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 2, placeOfBirth));
        }
        if (gender != null)
        {
            asn1encodablevector.add(new DERTaggedObject(false, 3, new DERPrintableString(gender, true)));
        }
        if (postalAddress != null)
        {
            asn1encodablevector.add(new DERTaggedObject(true, 4, postalAddress));
        }
        return new DERSequence(asn1encodablevector);
    }
}
