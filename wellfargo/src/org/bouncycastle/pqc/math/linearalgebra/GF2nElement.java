// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;


// Referenced classes of package org.bouncycastle.pqc.math.linearalgebra:
//            GFElement, GF2nField

public abstract class GF2nElement
    implements GFElement
{

    protected int mDegree;
    protected GF2nField mField;

    public GF2nElement()
    {
    }

    abstract void assignOne();

    abstract void assignZero();

    public abstract Object clone();

    public final GF2nElement convert(GF2nField gf2nfield)
    {
        return mField.convert(this, gf2nfield);
    }

    public final GF2nField getField()
    {
        return mField;
    }

    public abstract GF2nElement increase();

    public abstract void increaseThis();

    public abstract GF2nElement solveQuadraticEquation();

    public abstract GF2nElement square();

    public abstract GF2nElement squareRoot();

    public abstract void squareRootThis();

    public abstract void squareThis();

    public final GFElement subtract(GFElement gfelement)
    {
        return add(gfelement);
    }

    public final void subtractFromThis(GFElement gfelement)
    {
        addToThis(gfelement);
    }

    abstract boolean testBit(int i);

    public abstract boolean testRightmostBit();

    public abstract int trace();
}
