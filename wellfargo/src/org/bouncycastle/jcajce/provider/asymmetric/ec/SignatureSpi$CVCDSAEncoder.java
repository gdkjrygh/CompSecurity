// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSAEncoder;

class <init>
    implements DSAEncoder
{

    private byte[] makeUnsigned(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    public BigInteger[] decode(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length / 2];
        byte abyte2[] = new byte[abyte0.length / 2];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
        System.arraycopy(abyte0, abyte1.length, abyte2, 0, abyte2.length);
        return (new BigInteger[] {
            new BigInteger(1, abyte1), new BigInteger(1, abyte2)
        });
    }

    public byte[] encode(BigInteger biginteger, BigInteger biginteger1)
    {
        byte abyte0[] = makeUnsigned(biginteger);
        biginteger1 = makeUnsigned(biginteger1);
        if (abyte0.length > biginteger1.length)
        {
            biginteger = new byte[abyte0.length * 2];
        } else
        {
            biginteger = new byte[biginteger1.length * 2];
        }
        System.arraycopy(abyte0, 0, biginteger, biginteger.length / 2 - abyte0.length, abyte0.length);
        System.arraycopy(biginteger1, 0, biginteger, biginteger.length - biginteger1.length, biginteger1.length);
        return biginteger;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
