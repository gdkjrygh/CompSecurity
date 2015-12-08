// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.sec:
//            SECNamedCurves

class r extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        Object obj = SECNamedCurves.access$000("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01");
        BigInteger biginteger2 = SECNamedCurves.access$000("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814");
        byte abyte0[] = Hex.decode("103FAEC74D696E676875615175777FC5B191EF30");
        BigInteger biginteger = SECNamedCurves.access$000("01000000000000000000000000C7F34A778F443ACC920EBA49");
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        obj = new org.bouncycastle.math.ec.(193, 15, ((BigInteger) (obj)), biginteger2, biginteger, biginteger1);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).decodePoint(Hex.decode("0401F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E10025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
