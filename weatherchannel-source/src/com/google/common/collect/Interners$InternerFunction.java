// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.collect:
//            Interners, Interner

private static class interner
    implements Function
{

    private final Interner interner;

    public Object apply(Object obj)
    {
        return interner.intern(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof interner)
        {
            obj = (interner)obj;
            return interner.equals(((interner) (obj)).interner);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return interner.hashCode();
    }

    public (Interner interner1)
    {
        interner = interner1;
    }
}
