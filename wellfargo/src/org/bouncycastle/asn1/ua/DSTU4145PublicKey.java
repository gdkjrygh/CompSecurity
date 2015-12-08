// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.asn1.ua:
//            DSTU4145PointEncoder

public class DSTU4145PublicKey extends ASN1Object
{

    private ASN1OctetString pubKey;

    private DSTU4145PublicKey(ASN1OctetString asn1octetstring)
    {
        pubKey = asn1octetstring;
    }

    public DSTU4145PublicKey(ECPoint ecpoint)
    {
        pubKey = new DEROctetString(DSTU4145PointEncoder.encodePoint(ecpoint));
    }

    public static DSTU4145PublicKey getInstance(Object obj)
    {
        if (obj instanceof DSTU4145PublicKey)
        {
            return (DSTU4145PublicKey)obj;
        }
        if (obj != null)
        {
            return new DSTU4145PublicKey(ASN1OctetString.getInstance(obj));
        } else
        {
            return null;
        }
    }

    public ASN1Primitive toASN1Primitive()
    {
        return pubKey;
    }
}
