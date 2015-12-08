// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.teletrust;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.encoders.Hex;

class  extends X9ECParametersHolder
{

    protected X9ECParameters createParameters()
    {
        org.bouncycastle.math.ec.rves._cls1 _lcls1 = new org.bouncycastle.math.ec.rves._cls1(new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620F", 16), new BigInteger("340E7BE2A280EB74E2BE61BADA745D97E8F7C300", 16), new BigInteger("1E589A8595423412134FAA2DBDEC95C8D8675E58", 16));
        return new X9ECParameters(_lcls1, _lcls1.decodePoint(Hex.decode("04BED5AF16EA3F6A4F62938C4631EB5AF7BDBCDBC31667CB477A1A8EC338F94741669C976316DA6321")), new BigInteger("E95E4A5F737059DC60DF5991D45029409E60FC09", 16), new BigInteger("01", 16));
    }

    ()
    {
    }
}
