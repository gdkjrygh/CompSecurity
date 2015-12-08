// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Equivalence, Preconditions

public static final class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Equivalence equivalence;
    private final Object reference;

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof <init>)
        {
            obj = (<init>)obj;
            if (equivalence.equals(((equivalence) (obj)).equivalence))
            {
                return equivalence.equivalent(reference, ((reference) (obj)).reference);
            }
        }
        return false;
    }

    public Object get()
    {
        return reference;
    }

    public int hashCode()
    {
        return equivalence.hash(reference);
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(equivalence));
        String s1 = String.valueOf(String.valueOf(reference));
        return (new StringBuilder(s.length() + 7 + s1.length())).append(s).append(".wrap(").append(s1).append(")").toString();
    }

    private (Equivalence equivalence1, Object obj)
    {
        equivalence = (Equivalence)Preconditions.checkNotNull(equivalence1);
        reference = obj;
    }

    reference(Equivalence equivalence1, Object obj, reference reference1)
    {
        this(equivalence1, obj);
    }
}
