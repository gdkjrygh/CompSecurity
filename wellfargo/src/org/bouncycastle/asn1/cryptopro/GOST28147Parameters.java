// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.cryptopro;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class GOST28147Parameters extends ASN1Object
{

    ASN1OctetString iv;
    ASN1ObjectIdentifier paramSet;

    public GOST28147Parameters(ASN1Sequence asn1sequence)
    {
        asn1sequence = asn1sequence.getObjects();
        iv = (ASN1OctetString)asn1sequence.nextElement();
        paramSet = (ASN1ObjectIdentifier)asn1sequence.nextElement();
    }

    public static GOST28147Parameters getInstance(Object obj)
    {
        if (obj == null || (obj instanceof GOST28147Parameters))
        {
            return (GOST28147Parameters)obj;
        }
        if (obj instanceof ASN1Sequence)
        {
            return new GOST28147Parameters((ASN1Sequence)obj);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid GOST3410Parameter: ").append(obj.getClass().getName()).toString());
        }
    }

    public static GOST28147Parameters getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(ASN1Sequence.getInstance(asn1taggedobject, flag));
    }

    public ASN1Primitive toASN1Primitive()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.add(iv);
        asn1encodablevector.add(paramSet);
        return new DERSequence(asn1encodablevector);
    }
}
