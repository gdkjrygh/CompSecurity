// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.util.Vector;

// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nElement, GF2Polynomial, GF2nONBElement, GF2nPolynomialField, 
//            GF2nPolynomialElement, GF2nONBField

public abstract class GF2nField
{

    protected GF2Polynomial fieldPolynomial;
    protected Vector fields;
    protected int mDegree;
    protected Vector matrices;

    public GF2nField()
    {
    }

    protected abstract void computeCOBMatrix(GF2nField gf2nfield);

    protected abstract void computeFieldPolynomial();

    public final GF2nElement convert(GF2nElement gf2nelement, GF2nField gf2nfield)
    {
        if (gf2nfield == this)
        {
            return (GF2nElement)gf2nelement.clone();
        }
        if (fieldPolynomial.equals(gf2nfield.fieldPolynomial))
        {
            return (GF2nElement)gf2nelement.clone();
        }
        if (mDegree != gf2nfield.mDegree)
        {
            throw new RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
        }
        int k = fields.indexOf(gf2nfield);
        int i = k;
        if (k == -1)
        {
            computeCOBMatrix(gf2nfield);
            i = fields.indexOf(gf2nfield);
        }
        GF2Polynomial agf2polynomial[] = (GF2Polynomial[])(GF2Polynomial[])matrices.elementAt(i);
        gf2nelement = (GF2nElement)gf2nelement.clone();
        if (gf2nelement instanceof GF2nONBElement)
        {
            ((GF2nONBElement)gf2nelement).reverseOrder();
        }
        gf2nelement = new GF2Polynomial(mDegree, gf2nelement.toFlexiBigInt());
        gf2nelement.expandN(mDegree);
        GF2Polynomial gf2polynomial = new GF2Polynomial(mDegree);
        for (int j = 0; j < mDegree; j++)
        {
            if (gf2nelement.vectorMult(agf2polynomial[j]))
            {
                gf2polynomial.setBit(mDegree - 1 - j);
            }
        }

        if (gf2nfield instanceof GF2nPolynomialField)
        {
            return new GF2nPolynomialElement((GF2nPolynomialField)gf2nfield, gf2polynomial);
        }
        if (gf2nfield instanceof GF2nONBField)
        {
            gf2nelement = new GF2nONBElement((GF2nONBField)gf2nfield, gf2polynomial.toFlexiBigInt());
            gf2nelement.reverseOrder();
            return gf2nelement;
        } else
        {
            throw new RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2nField))
        {
            if (((GF2nField) (obj = (GF2nField)obj)).mDegree == mDegree && fieldPolynomial.equals(((GF2nField) (obj)).fieldPolynomial) && (!(this instanceof GF2nPolynomialField) || (obj instanceof GF2nPolynomialField)) && (!(this instanceof GF2nONBField) || (obj instanceof GF2nONBField)))
            {
                return true;
            }
        }
        return false;
    }

    public final int getDegree()
    {
        return mDegree;
    }

    public final GF2Polynomial getFieldPolynomial()
    {
        if (fieldPolynomial == null)
        {
            computeFieldPolynomial();
        }
        return new GF2Polynomial(fieldPolynomial);
    }

    protected abstract GF2nElement getRandomRoot(GF2Polynomial gf2polynomial);

    public int hashCode()
    {
        return mDegree + fieldPolynomial.hashCode();
    }

    protected final GF2Polynomial[] invertMatrix(GF2Polynomial agf2polynomial[])
    {
        GF2Polynomial agf2polynomial1[];
        GF2Polynomial agf2polynomial2[];
        int i;
        boolean flag = false;
        agf2polynomial1 = new GF2Polynomial[agf2polynomial.length];
        agf2polynomial2 = new GF2Polynomial[agf2polynomial.length];
        int k = 0;
        do
        {
            i = ((flag) ? 1 : 0);
            if (k >= mDegree)
            {
                break;
            }
            try
            {
                agf2polynomial1[k] = new GF2Polynomial(agf2polynomial[k]);
                agf2polynomial2[k] = new GF2Polynomial(mDegree);
                agf2polynomial2[k].setBit(mDegree - 1 - k);
            }
            catch (RuntimeException runtimeexception)
            {
                runtimeexception.printStackTrace();
            }
            k++;
        } while (true);
_L4:
        if (i >= mDegree - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        int l;
        for (l = i; l < mDegree && !agf2polynomial1[l].testBit(mDegree - 1 - i); l++) { }
        if (l >= mDegree)
        {
            throw new RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
        }
        if (i != l)
        {
            agf2polynomial = agf2polynomial1[i];
            agf2polynomial1[i] = agf2polynomial1[l];
            agf2polynomial1[l] = agf2polynomial;
            agf2polynomial = agf2polynomial2[i];
            agf2polynomial2[i] = agf2polynomial2[l];
            agf2polynomial2[l] = agf2polynomial;
        }
        l = i + 1;
        while (l < mDegree) 
        {
            if (agf2polynomial1[l].testBit(mDegree - 1 - i))
            {
                agf2polynomial1[l].addToThis(agf2polynomial1[i]);
                agf2polynomial2[l].addToThis(agf2polynomial2[i]);
            }
            l++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        for (int j = mDegree - 1; j > 0; j--)
        {
            for (int i1 = j - 1; i1 >= 0; i1--)
            {
                if (agf2polynomial1[i1].testBit(mDegree - 1 - j))
                {
                    agf2polynomial1[i1].addToThis(agf2polynomial1[j]);
                    agf2polynomial2[i1].addToThis(agf2polynomial2[j]);
                }
            }

        }

        return agf2polynomial2;
    }
}
