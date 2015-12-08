// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERUTF8String;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            GeneralNames

public class IetfAttrSyntax extends ASN1Object
{

    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    GeneralNames policyAuthority;
    int valueChoice;
    Vector values;

    private IetfAttrSyntax(ASN1Sequence asn1sequence)
    {
        policyAuthority = null;
        values = new Vector();
        valueChoice = -1;
        int i;
        if (asn1sequence.getObjectAt(0) instanceof ASN1TaggedObject)
        {
            policyAuthority = GeneralNames.getInstance((ASN1TaggedObject)asn1sequence.getObjectAt(0), false);
            i = 1;
        } else
        if (asn1sequence.size() == 2)
        {
            policyAuthority = GeneralNames.getInstance(asn1sequence.getObjectAt(0));
            i = 1;
        } else
        {
            i = 0;
        }
        if (!(asn1sequence.getObjectAt(i) instanceof ASN1Sequence))
        {
            throw new IllegalArgumentException("Non-IetfAttrSyntax encoding");
        }
        ASN1Primitive asn1primitive;
        for (asn1sequence = ((ASN1Sequence)asn1sequence.getObjectAt(i)).getObjects(); asn1sequence.hasMoreElements(); values.addElement(asn1primitive))
        {
            asn1primitive = (ASN1Primitive)asn1sequence.nextElement();
            if (asn1primitive instanceof ASN1ObjectIdentifier)
            {
                i = 2;
            } else
            if (asn1primitive instanceof DERUTF8String)
            {
                i = 3;
            } else
            if (asn1primitive instanceof DEROctetString)
            {
                i = 1;
            } else
            {
                throw new IllegalArgumentException("Bad value type encoding IetfAttrSyntax");
            }
            if (valueChoice < 0)
            {
                valueChoice = i;
            }
            if (i != valueChoice)
            {
                throw new IllegalArgumentException("Mix of value types in IetfAttrSyntax");
            }
        }

    }

    public static IetfAttrSyntax getInstance(Object obj)
    {
        if (obj instanceof IetfAttrSyntax)
        {
            return (IetfAttrSyntax)obj;
        }
        if (obj != null)
        {
            return new IetfAttrSyntax(ASN1Sequence.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public GeneralNames getPolicyAuthority()
    {
        return policyAuthority;
    }

    public int getValueType()
    {
        return valueChoice;
    }

    public Object[] getValues()
    {
        if (getValueType() == 1)
        {
            ASN1OctetString aasn1octetstring[] = new ASN1OctetString[values.size()];
            for (int i = 0; i != aasn1octetstring.length; i++)
            {
                aasn1octetstring[i] = (ASN1OctetString)values.elementAt(i);
            }

            return aasn1octetstring;
        }
        if (getValueType() == 2)
        {
            ASN1ObjectIdentifier aasn1objectidentifier[] = new ASN1ObjectIdentifier[values.size()];
            for (int j = 0; j != aasn1objectidentifier.length; j++)
            {
                aasn1objectidentifier[j] = (ASN1ObjectIdentifier)values.elementAt(j);
            }

            return aasn1objectidentifier;
        }
        DERUTF8String aderutf8string[] = new DERUTF8String[values.size()];
        for (int k = 0; k != aderutf8string.length; k++)
        {
            aderutf8string[k] = (DERUTF8String)values.elementAt(k);
        }

        return aderutf8string;
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (policyAuthority != null)
        {
            asn1encodablevector.add(new DERTaggedObject(0, policyAuthority));
        }
        ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
        for (Enumeration enumeration = values.elements(); enumeration.hasMoreElements(); asn1encodablevector1.add((ASN1Encodable)enumeration.nextElement())) { }
        asn1encodablevector.add(new DERSequence(asn1encodablevector1));
        return new DERSequence(asn1encodablevector);
    }
}
