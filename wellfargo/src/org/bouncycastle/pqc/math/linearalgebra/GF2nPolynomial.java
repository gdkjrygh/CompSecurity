// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GF2nElement, GF2nField, GF2nONBField, GF2Polynomial, 
//            GF2nONBElement, GF2nPolynomialField, GF2nPolynomialElement

public class GF2nPolynomial
{

    private GF2nElement coeff[];
    private int size;

    private GF2nPolynomial(int i)
    {
        size = i;
        coeff = new GF2nElement[size];
    }

    public GF2nPolynomial(int i, GF2nElement gf2nelement)
    {
        size = i;
        coeff = new GF2nElement[size];
        for (i = 0; i < size; i++)
        {
            coeff[i] = (GF2nElement)gf2nelement.clone();
        }

    }

    public GF2nPolynomial(GF2Polynomial gf2polynomial, GF2nField gf2nfield)
    {
        size = gf2nfield.getDegree() + 1;
        coeff = new GF2nElement[size];
        if (gf2nfield instanceof GF2nONBField)
        {
            int i = 0;
            while (i < size) 
            {
                if (gf2polynomial.testBit(i))
                {
                    coeff[i] = GF2nONBElement.ONE((GF2nONBField)gf2nfield);
                } else
                {
                    coeff[i] = GF2nONBElement.ZERO((GF2nONBField)gf2nfield);
                }
                i++;
            }
        } else
        if (gf2nfield instanceof GF2nPolynomialField)
        {
            int j = 0;
            while (j < size) 
            {
                if (gf2polynomial.testBit(j))
                {
                    coeff[j] = GF2nPolynomialElement.ONE((GF2nPolynomialField)gf2nfield);
                } else
                {
                    coeff[j] = GF2nPolynomialElement.ZERO((GF2nPolynomialField)gf2nfield);
                }
                j++;
            }
        } else
        {
            throw new IllegalArgumentException("PolynomialGF2n(Bitstring, GF2nField): B1 must be an instance of GF2nONBField or GF2nPolynomialField!");
        }
    }

    public GF2nPolynomial(GF2nPolynomial gf2npolynomial)
    {
        coeff = new GF2nElement[gf2npolynomial.size];
        size = gf2npolynomial.size;
        for (int i = 0; i < size; i++)
        {
            coeff[i] = (GF2nElement)gf2npolynomial.coeff[i].clone();
        }

    }

    public final GF2nPolynomial add(GF2nPolynomial gf2npolynomial)
    {
        if (size() >= gf2npolynomial.size())
        {
            GF2nPolynomial gf2npolynomial1 = new GF2nPolynomial(size());
            int i = 0;
            int k;
            do
            {
                k = i;
                if (i >= gf2npolynomial.size())
                {
                    break;
                }
                gf2npolynomial1.coeff[i] = (GF2nElement)coeff[i].add(gf2npolynomial.coeff[i]);
                i++;
            } while (true);
            for (; k < size(); k++)
            {
                gf2npolynomial1.coeff[k] = coeff[k];
            }

            return gf2npolynomial1;
        }
        GF2nPolynomial gf2npolynomial2 = new GF2nPolynomial(gf2npolynomial.size());
        int j = 0;
        int l;
        do
        {
            l = j;
            if (j >= size())
            {
                break;
            }
            gf2npolynomial2.coeff[j] = (GF2nElement)coeff[j].add(gf2npolynomial.coeff[j]);
            j++;
        } while (true);
        for (; l < gf2npolynomial.size(); l++)
        {
            gf2npolynomial2.coeff[l] = gf2npolynomial.coeff[l];
        }

        return gf2npolynomial2;
    }

    public final void assignZeroToElements()
    {
        for (int i = 0; i < size; i++)
        {
            coeff[i].assignZero();
        }

    }

    public final GF2nElement at(int i)
    {
        return coeff[i];
    }

    public final GF2nPolynomial[] divide(GF2nPolynomial gf2npolynomial)
    {
        GF2nPolynomial agf2npolynomial[] = new GF2nPolynomial[2];
        GF2nPolynomial gf2npolynomial1 = new GF2nPolynomial(this);
        gf2npolynomial1.shrink();
        int j = gf2npolynomial.getDegree();
        GF2nElement gf2nelement = (GF2nElement)gf2npolynomial.coeff[j].invert();
        if (gf2npolynomial1.getDegree() < j)
        {
            agf2npolynomial[0] = new GF2nPolynomial(this);
            agf2npolynomial[0].assignZeroToElements();
            agf2npolynomial[0].shrink();
            agf2npolynomial[1] = new GF2nPolynomial(this);
            agf2npolynomial[1].shrink();
            return agf2npolynomial;
        }
        agf2npolynomial[0] = new GF2nPolynomial(this);
        agf2npolynomial[0].assignZeroToElements();
        int i = gf2npolynomial1.getDegree();
        for (i -= j; i >= 0; i = gf2npolynomial1.getDegree() - j)
        {
            GF2nElement gf2nelement1 = (GF2nElement)gf2npolynomial1.coeff[gf2npolynomial1.getDegree()].multiply(gf2nelement);
            GF2nPolynomial gf2npolynomial2 = gf2npolynomial.scalarMultiply(gf2nelement1);
            gf2npolynomial2.shiftThisLeft(i);
            gf2npolynomial1 = gf2npolynomial1.add(gf2npolynomial2);
            gf2npolynomial1.shrink();
            agf2npolynomial[0].coeff[i] = (GF2nElement)gf2nelement1.clone();
        }

        agf2npolynomial[1] = gf2npolynomial1;
        agf2npolynomial[0].shrink();
        return agf2npolynomial;
    }

    public final void enlarge(int i)
    {
        if (i <= size)
        {
            return;
        }
        GF2nElement agf2nelement[] = new GF2nElement[i];
        System.arraycopy(coeff, 0, agf2nelement, 0, size);
        GF2nField gf2nfield = coeff[0].getField();
        if (coeff[0] instanceof GF2nPolynomialElement)
        {
            for (int j = size; j < i; j++)
            {
                agf2nelement[j] = GF2nPolynomialElement.ZERO((GF2nPolynomialField)gf2nfield);
            }

        } else
        if (coeff[0] instanceof GF2nONBElement)
        {
            for (int k = size; k < i; k++)
            {
                agf2nelement[k] = GF2nONBElement.ZERO((GF2nONBField)gf2nfield);
            }

        }
        size = i;
        coeff = agf2nelement;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof GF2nPolynomial)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (getDegree() == ((GF2nPolynomial) (obj = (GF2nPolynomial)obj)).getDegree())
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= size)
                    {
                        break label1;
                    }
                    if (!coeff[i].equals(((GF2nPolynomial) (obj)).coeff[i]))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public final GF2nPolynomial gcd(GF2nPolynomial gf2npolynomial)
    {
        GF2nPolynomial gf2npolynomial1 = new GF2nPolynomial(this);
        gf2npolynomial = new GF2nPolynomial(gf2npolynomial);
        gf2npolynomial1.shrink();
        gf2npolynomial.shrink();
        GF2nPolynomial gf2npolynomial2;
        for (; !gf2npolynomial.isZero(); gf2npolynomial = gf2npolynomial2)
        {
            gf2npolynomial2 = gf2npolynomial1.remainder(gf2npolynomial);
            gf2npolynomial1 = gf2npolynomial;
        }

        return gf2npolynomial1.scalarMultiply((GF2nElement)gf2npolynomial1.coeff[gf2npolynomial1.getDegree()].invert());
    }

    public final int getDegree()
    {
        for (int i = size - 1; i >= 0; i--)
        {
            if (!coeff[i].isZero())
            {
                return i;
            }
        }

        return -1;
    }

    public int hashCode()
    {
        return getDegree() + coeff.hashCode();
    }

    public final boolean isZero()
    {
        for (int i = 0; i < size; i++)
        {
            if (coeff[i] != null && !coeff[i].isZero())
            {
                return false;
            }
        }

        return true;
    }

    public final GF2nPolynomial multiply(GF2nPolynomial gf2npolynomial)
    {
        int i = size();
        if (i != gf2npolynomial.size())
        {
            throw new IllegalArgumentException("PolynomialGF2n.multiply: this and b must have the same size!");
        }
        GF2nPolynomial gf2npolynomial1 = new GF2nPolynomial((i << 1) - 1);
        for (int j = 0; j < size(); j++)
        {
            int k = 0;
            while (k < gf2npolynomial.size()) 
            {
                if (gf2npolynomial1.coeff[j + k] == null)
                {
                    gf2npolynomial1.coeff[j + k] = (GF2nElement)coeff[j].multiply(gf2npolynomial.coeff[k]);
                } else
                {
                    gf2npolynomial1.coeff[j + k] = (GF2nElement)gf2npolynomial1.coeff[j + k].add(coeff[j].multiply(gf2npolynomial.coeff[k]));
                }
                k++;
            }
        }

        return gf2npolynomial1;
    }

    public final GF2nPolynomial multiplyAndReduce(GF2nPolynomial gf2npolynomial, GF2nPolynomial gf2npolynomial1)
    {
        return multiply(gf2npolynomial).reduce(gf2npolynomial1);
    }

    public final GF2nPolynomial quotient(GF2nPolynomial gf2npolynomial)
    {
        GF2nPolynomial agf2npolynomial[] = new GF2nPolynomial[2];
        return divide(gf2npolynomial)[0];
    }

    public final GF2nPolynomial reduce(GF2nPolynomial gf2npolynomial)
    {
        return remainder(gf2npolynomial);
    }

    public final GF2nPolynomial remainder(GF2nPolynomial gf2npolynomial)
    {
        GF2nPolynomial agf2npolynomial[] = new GF2nPolynomial[2];
        return divide(gf2npolynomial)[1];
    }

    public final GF2nPolynomial scalarMultiply(GF2nElement gf2nelement)
    {
        GF2nPolynomial gf2npolynomial = new GF2nPolynomial(size());
        for (int i = 0; i < size(); i++)
        {
            gf2npolynomial.coeff[i] = (GF2nElement)coeff[i].multiply(gf2nelement);
        }

        return gf2npolynomial;
    }

    public final void set(int i, GF2nElement gf2nelement)
    {
        if (!(gf2nelement instanceof GF2nPolynomialElement) && !(gf2nelement instanceof GF2nONBElement))
        {
            throw new IllegalArgumentException("PolynomialGF2n.set f must be an instance of either GF2nPolynomialElement or GF2nONBElement!");
        } else
        {
            coeff[i] = (GF2nElement)gf2nelement.clone();
            return;
        }
    }

    public final GF2nPolynomial shiftLeft(int i)
    {
        int j = 0;
        if (i <= 0)
        {
            return new GF2nPolynomial(this);
        }
        GF2nPolynomial gf2npolynomial = new GF2nPolynomial(size + i, coeff[0]);
        gf2npolynomial.assignZeroToElements();
        for (; j < size; j++)
        {
            gf2npolynomial.coeff[j + i] = coeff[j];
        }

        return gf2npolynomial;
    }

    public final void shiftThisLeft(int i)
    {
        if (i > 0)
        {
            int j = size;
            GF2nField gf2nfield = coeff[0].getField();
            enlarge(size + i);
            for (j--; j >= 0; j--)
            {
                coeff[j + i] = coeff[j];
            }

            if (coeff[0] instanceof GF2nPolynomialElement)
            {
                for (i--; i >= 0; i--)
                {
                    coeff[i] = GF2nPolynomialElement.ZERO((GF2nPolynomialField)gf2nfield);
                }

            } else
            if (coeff[0] instanceof GF2nONBElement)
            {
                for (i--; i >= 0; i--)
                {
                    coeff[i] = GF2nONBElement.ZERO((GF2nONBField)gf2nfield);
                }

            }
        }
    }

    public final void shrink()
    {
        int i;
        for (i = size - 1; coeff[i].isZero() && i > 0; i--) { }
        i++;
        if (i < size)
        {
            GF2nElement agf2nelement[] = new GF2nElement[i];
            System.arraycopy(coeff, 0, agf2nelement, 0, i);
            coeff = agf2nelement;
            size = i;
        }
    }

    public final int size()
    {
        return size;
    }
}
