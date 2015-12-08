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

class er extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        Object obj = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD208B");
        BigInteger biginteger2 = SECNamedCurves.access$000("DB7C2ABF62E35E668076BEAD2088");
        BigInteger biginteger3 = SECNamedCurves.access$000("659EF8BA043916EEDE8911702B22");
        byte abyte0[] = Hex.decode("00F50B028E4D696E676875615175290472783FB1");
        BigInteger biginteger = SECNamedCurves.access$000("DB7C2ABF62E35E7628DFAC6561C5");
        BigInteger biginteger1 = BigInteger.valueOf(1L);
        obj = new org.bouncycastle.math.ec.(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).decodePoint(Hex.decode("0409487239995A5EE76B55F9C2F098A89CE5AF8724C0A23E0E0FF77500")), biginteger, biginteger1, abyte0);
    }

    er()
    {
    }
}
