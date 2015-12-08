// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Predicate, Equivalence, Preconditions, Objects

private static final class target
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Equivalence equivalence;
    private final Object target;

    public boolean apply(Object obj)
    {
        return equivalence.equivalent(obj, target);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof target)
            {
                if (!equivalence.equals(((equivalence) (obj = (equivalence)obj)).equivalence) || !Objects.equal(target, ((target) (obj)).target))
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
            equivalence, target
        });
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(equivalence));
        String s1 = String.valueOf(String.valueOf(target));
        return (new StringBuilder(s.length() + 15 + s1.length())).append(s).append(".equivalentTo(").append(s1).append(")").toString();
    }

    (Equivalence equivalence1, Object obj)
    {
        equivalence = (Equivalence)Preconditions.checkNotNull(equivalence1);
        target = obj;
    }
}
