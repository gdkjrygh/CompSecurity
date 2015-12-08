// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509.qualified;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

public class TypeOfBiometricData extends ASN1Object
    implements ASN1Choice
{

    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;
    ASN1Encodable obj;

    public TypeOfBiometricData(int i)
    {
        if (i == 0 || i == 1)
        {
            obj = new ASN1Integer(i);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("unknow PredefinedBiometricType : ").append(i).toString());
        }
    }

    public TypeOfBiometricData(ASN1ObjectIdentifier asn1objectidentifier)
    {
        obj = asn1objectidentifier;
    }

    public static TypeOfBiometricData getInstance(Object obj1)
    {
        if (obj1 == null || (obj1 instanceof TypeOfBiometricData))
        {
            return (TypeOfBiometricData)obj1;
        }
        if (obj1 instanceof ASN1Integer)
        {
            return new TypeOfBiometricData(ASN1Integer.getInstance(obj1).getValue().intValue());
        }
        if (obj1 instanceof ASN1ObjectIdentifier)
        {
            return new TypeOfBiometricData(ASN1ObjectIdentifier.getInstance(obj1));
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
    }

    public ASN1ObjectIdentifier getBiometricDataOid()
    {
        return (ASN1ObjectIdentifier)obj;
    }

    public int getPredefinedBiometricType()
    {
        return ((ASN1Integer)obj).getValue().intValue();
    }

    public boolean isPredefined()
    {
        return obj instanceof ASN1Integer;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return obj.toASN1Primitive();
    }
}
