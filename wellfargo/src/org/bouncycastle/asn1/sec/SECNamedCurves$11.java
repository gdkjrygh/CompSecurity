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
        Object obj = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001");
        BigInteger biginteger2 = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE");
        BigInteger biginteger3 = SECNamedCurves.access$000("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4");
        byte abyte0[] = Hex.decode("BD71344799D5C7FCDC45B59FA3B9AB8F6A948BC5");
        BigInteger biginteger = SECNamedCurves.access$000("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D");
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        obj = new org.bouncycastle.math.ec.cess._cls000(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).decodePoint(Hex.decode("04B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34")), biginteger, biginteger1, abyte0);
    }

    r()
    {
    }
}
