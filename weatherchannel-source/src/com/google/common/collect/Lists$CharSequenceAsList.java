// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;

// Referenced classes of package com.google.common.collect:
//            Lists

private static final class sequence extends AbstractList
{

    private final CharSequence sequence;

    public Character get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Character.valueOf(sequence.charAt(i));
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        return sequence.length();
    }

    (CharSequence charsequence)
    {
        sequence = charsequence;
    }
}
