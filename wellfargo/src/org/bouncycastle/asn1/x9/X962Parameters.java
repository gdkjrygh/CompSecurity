// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParameters

public class X962Parameters extends ASN1Object
    implements ASN1Choice
{

    private ASN1Primitive params;

    public X962Parameters(ASN1ObjectIdentifier asn1objectidentifier)
    {
        params = null;
        params = asn1objectidentifier;
    }

    public X962Parameters(ASN1Primitive asn1primitive)
    {
        params = null;
        params = asn1primitive;
    }

    public X962Parameters(X9ECParameters x9ecparameters)
    {
        params = null;
        params = x9ecparameters.toASN1Primitive();
    }

    public static X962Parameters getInstance(Object obj)
    {
        if (obj == null || (obj instanceof X962Parameters))
        {
            return (X962Parameters)obj;
        }
        if (obj instanceof ASN1Primitive)
        {
            return new X962Parameters((ASN1Primitive)obj);
        } else
        {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public static X962Parameters getInstance(ASN1TaggedObject asn1taggedobject, boolean flag)
    {
        return getInstance(asn1taggedobject.getObject());
    }

    public ASN1Primitive getParameters()
    {
        return params;
    }

    public boolean isImplicitlyCA()
    {
        return params instanceof ASN1Null;
    }

    public boolean isNamedCurve()
    {
        return params instanceof ASN1ObjectIdentifier;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return params;
    }
}
