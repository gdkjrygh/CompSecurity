// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.isismtt.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Choice;
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

public class DeclarationOfMajority extends ASN1Object
    implements ASN1Choice
{

    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;
    private ASN1TaggedObject declaration;

    public DeclarationOfMajority(int i)
    {
        declaration = new DERTaggedObject(false, 0, new ASN1Integer(i));
    }

    public DeclarationOfMajority(ASN1GeneralizedTime asn1generalizedtime)
    {
        declaration = new DERTaggedObject(false, 2, asn1generalizedtime);
    }

    private DeclarationOfMajority(ASN1TaggedObject asn1taggedobject)
    {
        if (asn1taggedobject.getTagNo() > 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad tag number: ").append(asn1taggedobject.getTagNo()).toString());
        } else
        {
            declaration = asn1taggedobject;
            return;
        }
    }

    public DeclarationOfMajority(boolean flag, String s)
    {
        if (s.length() > 2)
        {
            throw new IllegalArgumentException("country can only be 2 characters");
        }
        if (flag)
        {
            declaration = new DERTaggedObject(false, 1, new DERSequence(new DERPrintableString(s, true)));
            return;
        } else
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.add(ASN1Boolean.FALSE);
            asn1encodablevector.add(new DERPrintableString(s, true));
            declaration = new DERTaggedObject(false, 1, new DERSequence(asn1encodablevector));
            return;
        }
    }

    public static DeclarationOfMajority getInstance(Object obj)
    {
        if (obj == null || (obj instanceof DeclarationOfMajority))
        {
            return (DeclarationOfMajority)obj;
        }
        if (obj instanceof ASN1TaggedObject)
        {
            return new DeclarationOfMajority((ASN1TaggedObject)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public ASN1Sequence fullAgeAtCountry()
    {
        if (declaration.getTagNo() != 1)
        {
            return null;
        } else
        {
            return ASN1Sequence.getInstance(declaration, false);
        }
    }

    public ASN1GeneralizedTime getDateOfBirth()
    {
        if (declaration.getTagNo() != 2)
        {
            return null;
        } else
        {
            return ASN1GeneralizedTime.getInstance(declaration, false);
        }
    }

    public int getType()
    {
        return declaration.getTagNo();
    }

    public int notYoungerThan()
    {
        if (declaration.getTagNo() != 0)
        {
            return -1;
        } else
        {
            return ASN1Integer.getInstance(declaration, false).getValue().intValue();
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return declaration;
    }
}
