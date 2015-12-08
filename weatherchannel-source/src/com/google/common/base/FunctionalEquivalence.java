// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Equivalence, Preconditions, Function, Objects

final class FunctionalEquivalence extends Equivalence
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Function function;
    private final Equivalence resultEquivalence;

    FunctionalEquivalence(Function function1, Equivalence equivalence)
    {
        function = (Function)Preconditions.checkNotNull(function1);
        resultEquivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
    }

    protected boolean doEquivalent(Object obj, Object obj1)
    {
        return resultEquivalence.equivalent(function.apply(obj), function.apply(obj1));
    }

    protected int doHash(Object obj)
    {
        return resultEquivalence.hash(function.apply(obj));
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof FunctionalEquivalence)
            {
                if (!function.equals(((FunctionalEquivalence) (obj = (FunctionalEquivalence)obj)).function) || !resultEquivalence.equals(((FunctionalEquivalence) (obj)).resultEquivalence))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            function, resultEquivalence
        });
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(resultEquivalence));
        String s1 = String.valueOf(String.valueOf(function));
        return (new StringBuilder(s.length() + 13 + s1.length())).append(s).append(".onResultOf(").append(s1).append(")").toString();
    }
}
