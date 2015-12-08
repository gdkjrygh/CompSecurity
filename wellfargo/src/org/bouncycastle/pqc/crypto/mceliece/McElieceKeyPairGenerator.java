// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McEliecePublicKeyParameters, McElieceKeyGenerationParameters, McEliecePrivateKeyParameters, McElieceParameters

public class McElieceKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";
    private int fieldPoly;
    private boolean initialized;
    private int m;
    private McElieceKeyGenerationParameters mcElieceParams;
    private int n;
    private SecureRandom random;
    private int t;

    public McElieceKeyPairGenerator()
    {
        initialized = false;
    }

    private AsymmetricCipherKeyPair genKeyPair()
    {
        if (!initialized)
        {
            initializeDefault();
        }
        GF2mField gf2mfield = new GF2mField(m, fieldPoly);
        PolynomialGF2mSmallM polynomialgf2msmallm = new PolynomialGF2mSmallM(gf2mfield, t, 'I', random);
        PolynomialGF2mSmallM apolynomialgf2msmallm[] = (new PolynomialRingGF2m(gf2mfield, polynomialgf2msmallm)).getSquareRootMatrix();
        GF2Matrix gf2matrix = GoppaCode.createCanonicalCheckMatrix(gf2mfield, polynomialgf2msmallm);
        Object obj = GoppaCode.computeSystematicForm(gf2matrix, random);
        GF2Matrix gf2matrix1 = ((org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe) (obj)).getSecondMatrix();
        obj = ((org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe) (obj)).getPermutation();
        GF2Matrix gf2matrix2 = (GF2Matrix)gf2matrix1.computeTranspose();
        gf2matrix1 = gf2matrix2.extendLeftCompactForm();
        int i = gf2matrix2.getNumRows();
        GF2Matrix agf2matrix[] = GF2Matrix.createRandomRegularMatrixAndItsInverse(i, random);
        Permutation permutation = new Permutation(n, random);
        gf2matrix1 = (GF2Matrix)((GF2Matrix)agf2matrix[0].rightMultiply(gf2matrix1)).rightMultiply(permutation);
        return new AsymmetricCipherKeyPair(new McEliecePublicKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", n, t, gf2matrix1, mcElieceParams.getParameters()), new McEliecePrivateKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.1", n, i, gf2mfield, polynomialgf2msmallm, agf2matrix[1], ((Permutation) (obj)), permutation, gf2matrix, apolynomialgf2msmallm, mcElieceParams.getParameters()));
    }

    private void initialize(KeyGenerationParameters keygenerationparameters)
    {
        mcElieceParams = (McElieceKeyGenerationParameters)keygenerationparameters;
        random = new SecureRandom();
        m = mcElieceParams.getParameters().getM();
        n = mcElieceParams.getParameters().getN();
        t = mcElieceParams.getParameters().getT();
        fieldPoly = mcElieceParams.getParameters().getFieldPoly();
        initialized = true;
    }

    private void initializeDefault()
    {
        initialize(new McElieceKeyGenerationParameters(new SecureRandom(), new McElieceParameters()));
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        return genKeyPair();
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        initialize(keygenerationparameters);
    }
}
