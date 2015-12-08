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
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

// Referenced classes of package org.bouncycastle.pqc.crypto.mceliece:
//            McElieceCCA2KeyGenerationParameters, McElieceCCA2Parameters, McElieceCCA2PublicKeyParameters, McElieceCCA2PrivateKeyParameters

public class McElieceCCA2KeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int fieldPoly;
    private boolean initialized;
    private int m;
    private McElieceCCA2KeyGenerationParameters mcElieceCCA2Params;
    private int n;
    private SecureRandom random;
    private int t;

    public McElieceCCA2KeyPairGenerator()
    {
        initialized = false;
    }

    private void initializeDefault()
    {
        init(new McElieceCCA2KeyGenerationParameters(new SecureRandom(), new McElieceCCA2Parameters()));
    }

    public AsymmetricCipherKeyPair generateKeyPair()
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
        gf2matrix1 = (GF2Matrix)gf2matrix1.computeTranspose();
        int i = gf2matrix1.getNumRows();
        return new AsymmetricCipherKeyPair(new McElieceCCA2PublicKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.2", n, t, gf2matrix1, mcElieceCCA2Params.getParameters()), new McElieceCCA2PrivateKeyParameters("1.3.6.1.4.1.8301.3.1.3.4.2", n, i, gf2mfield, polynomialgf2msmallm, ((org.bouncycastle.pqc.math.linearalgebra.Permutation) (obj)), gf2matrix, apolynomialgf2msmallm, mcElieceCCA2Params.getParameters()));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        mcElieceCCA2Params = (McElieceCCA2KeyGenerationParameters)keygenerationparameters;
        random = new SecureRandom();
        m = mcElieceCCA2Params.getParameters().getM();
        n = mcElieceCCA2Params.getParameters().getN();
        t = mcElieceCCA2Params.getParameters().getT();
        fieldPoly = mcElieceCCA2Params.getParameters().getFieldPoly();
        initialized = true;
    }
}
