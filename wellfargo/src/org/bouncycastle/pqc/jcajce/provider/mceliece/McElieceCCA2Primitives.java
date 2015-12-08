// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.Vector;

// Referenced classes of package org.bouncycastle.pqc.jcajce.provider.mceliece:
//            BCMcElieceCCA2PrivateKey, BCMcElieceCCA2PublicKey

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

    public static GF2Vector[] decryptionPrimitive(BCMcElieceCCA2PrivateKey bcmceliececca2privatekey, GF2Vector gf2vector)
    {
        int i = bcmceliececca2privatekey.getK();
        Permutation permutation = bcmceliececca2privatekey.getP();
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gf2mfield = bcmceliececca2privatekey.getField();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialgf2msmallm = bcmceliececca2privatekey.getGoppaPoly();
        GF2Matrix gf2matrix = bcmceliececca2privatekey.getH();
        bcmceliececca2privatekey = bcmceliececca2privatekey.getQInv();
        gf2vector = (GF2Vector)gf2vector.multiply(permutation.computeInverse());
        bcmceliececca2privatekey = GoppaCode.syndromeDecode((GF2Vector)gf2matrix.rightMultiply(gf2vector), gf2mfield, polynomialgf2msmallm, bcmceliececca2privatekey);
        gf2vector = (GF2Vector)((GF2Vector)gf2vector.add(bcmceliececca2privatekey)).multiply(permutation);
        bcmceliececca2privatekey = (GF2Vector)bcmceliececca2privatekey.multiply(permutation);
        return (new GF2Vector[] {
            gf2vector.extractRightVector(i), bcmceliececca2privatekey
        });
    }

    public static GF2Vector encryptionPrimitive(McElieceCCA2PublicKeyParameters mceliececca2publickeyparameters, GF2Vector gf2vector, GF2Vector gf2vector1)
    {
        return (GF2Vector)mceliececca2publickeyparameters.getMatrixG().leftMultiplyLeftCompactForm(gf2vector).add(gf2vector1);
    }

    public static GF2Vector encryptionPrimitive(BCMcElieceCCA2PublicKey bcmceliececca2publickey, GF2Vector gf2vector, GF2Vector gf2vector1)
    {
        return (GF2Vector)bcmceliececca2publickey.getG().leftMultiplyLeftCompactForm(gf2vector).add(gf2vector1);
    }
}
