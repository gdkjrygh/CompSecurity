// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.ua;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public abstract class DSTU4145PointEncoder
{

    private static X9IntegerConverter converter = new X9IntegerConverter();

    public DSTU4145PointEncoder()
    {
    }

    public static ECPoint decodePoint(ECCurve eccurve, byte abyte0[])
    {
        BigInteger biginteger = BigInteger.valueOf(abyte0[abyte0.length - 1] & 1);
        byte abyte1[] = abyte0;
        if (!trace(eccurve.fromBigInteger(new BigInteger(1, abyte0))).equals(eccurve.getA().toBigInteger()))
        {
            abyte1 = Arrays.clone(abyte0);
            int i = abyte1.length - 1;
            abyte1[i] = (byte)(abyte1[i] ^ 1);
        }
        org.bouncycastle.math.ec.ECCurve.F2m f2m = (org.bouncycastle.math.ec.ECCurve.F2m)eccurve;
        ECFieldElement ecfieldelement = eccurve.fromBigInteger(new BigInteger(1, abyte1));
        Object obj;
        if (ecfieldelement.toBigInteger().equals(ECConstants.ZERO))
        {
            abyte0 = (org.bouncycastle.math.ec.ECFieldElement.F2m)eccurve.getB();
            int j = 0;
            do
            {
                obj = abyte0;
                if (j >= f2m.getM() - 1)
                {
                    break;
                }
                abyte0 = abyte0.square();
                j++;
            } while (true);
        } else
        {
            obj = solveQuadradicEquation(ecfieldelement.add(eccurve.getA()).add(eccurve.getB().multiply(ecfieldelement.square().invert())));
            if (obj == null)
            {
                throw new RuntimeException("Invalid point compression");
            }
            abyte0 = ((byte []) (obj));
            if (!trace(((ECFieldElement) (obj))).equals(biginteger))
            {
                abyte0 = ((ECFieldElement) (obj)).add(eccurve.fromBigInteger(ECConstants.ONE));
            }
            obj = ecfieldelement.multiply(abyte0);
        }
        return new org.bouncycastle.math.ec.ECPoint.F2m(eccurve, ecfieldelement, ((ECFieldElement) (obj)));
    }

    public static byte[] encodePoint(ECPoint ecpoint)
    {
        byte abyte0[];
label0:
        {
            int i = converter.getByteLength(ecpoint.getX());
            abyte0 = converter.integerToBytes(ecpoint.getX().toBigInteger(), i);
            if (!ecpoint.getX().toBigInteger().equals(ECConstants.ZERO))
            {
                if (!trace(ecpoint.getY().multiply(ecpoint.getX().invert())).equals(ECConstants.ONE))
                {
                    break label0;
                }
                int j = abyte0.length - 1;
                abyte0[j] = (byte)(abyte0[j] | 1);
            }
            return abyte0;
        }
        int k = abyte0.length - 1;
        abyte0[k] = (byte)(abyte0[k] & 0xfe);
        return abyte0;
    }

    private static ECFieldElement solveQuadradicEquation(ECFieldElement ecfieldelement)
    {
        org.bouncycastle.math.ec.ECFieldElement.F2m f2m1 = (org.bouncycastle.math.ec.ECFieldElement.F2m)ecfieldelement;
        org.bouncycastle.math.ec.ECFieldElement.F2m f2m = new org.bouncycastle.math.ec.ECFieldElement.F2m(f2m1.getM(), f2m1.getK1(), f2m1.getK2(), f2m1.getK3(), ECConstants.ZERO);
        if (ecfieldelement.toBigInteger().equals(ECConstants.ZERO))
        {
            return f2m;
        }
        Random random = new Random();
        int j = f2m1.getM();
        Object obj;
        do
        {
            org.bouncycastle.math.ec.ECFieldElement.F2m f2m2 = new org.bouncycastle.math.ec.ECFieldElement.F2m(f2m1.getM(), f2m1.getK1(), f2m1.getK2(), f2m1.getK3(), new BigInteger(j, random));
            int i = 1;
            ECFieldElement ecfieldelement1 = ecfieldelement;
            obj = f2m;
            for (; i <= j - 1; i++)
            {
                ecfieldelement1 = ecfieldelement1.square();
                obj = ((ECFieldElement) (obj)).square().add(ecfieldelement1.multiply(f2m2));
                ecfieldelement1 = ecfieldelement1.add(ecfieldelement);
            }

            if (!ecfieldelement1.toBigInteger().equals(ECConstants.ZERO))
            {
                return null;
            }
        } while (((ECFieldElement) (obj)).square().add(((ECFieldElement) (obj))).toBigInteger().equals(ECConstants.ZERO));
        return ((ECFieldElement) (obj));
    }

    private static BigInteger trace(ECFieldElement ecfieldelement)
    {
        int i = 0;
        ECFieldElement ecfieldelement1 = ecfieldelement;
        for (; i < ecfieldelement.getFieldSize() - 1; i++)
        {
            ecfieldelement1 = ecfieldelement1.square().add(ecfieldelement);
        }

        return ecfieldelement1.toBigInteger();
    }

}
