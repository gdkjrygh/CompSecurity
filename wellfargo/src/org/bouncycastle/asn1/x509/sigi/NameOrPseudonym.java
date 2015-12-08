// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.sigi;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.DirectoryString;

public class NameOrPseudonym extends ASN1Object
    implements ASN1Choice
{

    private ASN1Sequence givenName;
    private DirectoryString pseudonym;
    private DirectoryString surname;

    public NameOrPseudonym(String s)
    {
        this(new DirectoryString(s));
    }

    private NameOrPseudonym(ASN1Sequence asn1sequence)
    {
        if (asn1sequence.size() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad sequence size: ").append(asn1sequence.size()).toString());
        }
        if (!(asn1sequence.getObjectAt(0) instanceof ASN1String))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad object encountered: ").append(asn1sequence.getObjectAt(0).getClass()).toString());
        } else
        {
            surname = DirectoryString.getInstance(asn1sequence.getObjectAt(0));
            givenName = ASN1Sequence.getInstance(asn1sequence.getObjectAt(1));
            return;
        }
    }

    public NameOrPseudonym(DirectoryString directorystring)
    {
        pseudonym = directorystring;
    }

    public NameOrPseudonym(DirectoryString directorystring, ASN1Sequence asn1sequence)
    {
        surname = directorystring;
        givenName = asn1sequence;
    }

    public static NameOrPseudonym getInstance(Object obj)
    {
        if (obj == null || (obj instanceof NameOrPseudonym))
        {
            return (NameOrPseudonym)obj;
        }
        if (obj instanceof ASN1String)
        {
            return new NameOrPseudonym(DirectoryString.getInstance(obj));
        }
        if (obj instanceof ASN1Sequence)
        {
            return new NameOrPseudonym((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("illegal object in getInstance: ").append(obj.getClass().getName()).toString());
        }
    }

    public DirectoryString[] getGivenName()
    {
        DirectoryString adirectorystring[] = new DirectoryString[givenName.size()];
        int i = 0;
        for (Enumeration enumeration = givenName.getObjects(); enumeration.hasMoreElements();)
        {
            adirectorystring[i] = DirectoryString.getInstance(enumeration.nextElement());
            i++;
        }

        return adirectorystring;
    }

    public DirectoryString getPseudonym()
    {
        return pseudonym;
    }

    public DirectoryString getSurname()
    {
        return surname;
    }

    public ASN1Primitive toASN1Primitive()
    {
        if (pseudonym != null)
        {
            return pseudonym.toASN1Primitive();
        } else
        {
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            asn1encodablevector.add(surname);
            asn1encodablevector.add(givenName);
            return new DERSequence(asn1encodablevector);
        }
    }
}
