// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.math.linearalgebra;

import java.math.BigInteger;

public interface GFElement
{

    public abstract GFElement add(GFElement gfelement);

    public abstract void addToThis(GFElement gfelement);

    public abstract Object clone();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract GFElement invert();

    public abstract boolean isOne();

    public abstract boolean isZero();

    public abstract GFElement multiply(GFElement gfelement);

    public abstract void multiplyThisBy(GFElement gfelement);

    public abstract GFElement subtract(GFElement gfelement);

    public abstract void subtractFromThis(GFElement gfelement);

    public abstract byte[] toByteArray();

    public abstract BigInteger toFlexiBigInt();

    public abstract String toString();

    public abstract String toString(int i);
}
