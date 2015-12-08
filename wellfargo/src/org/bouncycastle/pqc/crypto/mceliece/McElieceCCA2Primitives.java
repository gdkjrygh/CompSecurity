// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.Vector;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2PrivateKeyParameters, McElieceCCA2PublicKeyParameters

public final class McElieceCCA2Primitives
{

    private McElieceCCA2Primitives()
    {
    }

    public static GF2Vector[] decryptionPrimitive(McElieceCCA2PrivateKeyParameters mceliececca2privatekeyparameters, GF2Vector gf2vector)
    {
        int i = mceliececca2privatekeyparameters.getK();
        Permutation permutation = mceliececca2privatekeyparameters.getP();
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gf2mfield = mceliececca2privatekeyparameters.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialgf2msmallm = mceliececca2privatekeyparameters.getGoppaPoly();
        GF2Matrix gf2matrix = mceliececca2privatekeyparameters.getH();
        mceliececca2privatekeyparameters = mceliececca2privatekeyparameters.getQInv();
        gf2vector = (GF2Vector)gf2vector.multiply(permutation.computeInverse());
        mceliececca2privatekeyparameters = GoppaCode.syndromeDecode((GF2Vector)gf2matrix.rightMultiply(gf2vector), gf2mfield, polynomialgf2msmallm, mceliececca2privatekeyparameters);
        gf2vector = (GF2Vector)((GF2Vector)gf2vector.add(mceliececca2privatekeyparameters)).multiply(permutation);
        mceliececca2privatekeyparameters = (GF2Vector)mceliececca2privatekeyparameters.multiply(permutation);
        return (new GF2Vector[] {
            gf2vector.extractRightVector(i), mceliececca2privatekeyparameters
        });
    }

    public static GF2Vector encryptionPrimitive(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters, GF2Vector gf2vector, GF2Vector gf2vector1)
    {
        return (GF2Vector)mceliececca2publickeyparameters.getMatrixG().leftMultiplyLeftCompactForm(gf2vector).add(gf2vector1);
    }
}
