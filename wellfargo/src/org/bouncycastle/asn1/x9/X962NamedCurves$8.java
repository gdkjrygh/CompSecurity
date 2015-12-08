// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParametersHolder, X9ECParameters

class er extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        BigInteger biginteger = new BigInteger("0400000000000000000001E60FC8821CC74DAEAFC1", 16);
        BigInteger biginteger1 = BigInteger.valueOf(2L);
        org.bouncycastle.math.ec.er er = new org.bouncycastle.math.ec.(163, 1, 2, 8, new BigInteger("072546B5435234A422E0789675F432C89435DE5242", 16), new BigInteger("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9", 16), biginteger, biginteger1);
        return new X9ECParameters(er, er.decodePoint(Hex.decode("0307AF69989546103D79329FCC3D74880F33BBE803CB")), biginteger, biginteger1, Hex.decode("D2C0FB15760860DEF1EEF4D696E6768756151754"));
    }

    er()
    {
    }
}
