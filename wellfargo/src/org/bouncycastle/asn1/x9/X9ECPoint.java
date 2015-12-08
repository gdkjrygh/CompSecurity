// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class X9ECPoint extends ASN1Object
{

    ECPoint p;

    public X9ECPoint(ECCurve eccurve, ASN1OctetString asn1octetstring)
    {
        p = eccurve.decodePoint(asn1octetstring.getOctets());
    }

    public X9ECPoint(ECPoint ecpoint)
    {
        p = ecpoint;
    }

    public ECPoint getPoint()
    {
        return p;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return new DEROctetString(p.getEncoded());
    }
}
