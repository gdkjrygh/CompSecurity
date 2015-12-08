// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Lists

private static final class string extends ImmutableList
{

    private final String string;

    public Character get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Character.valueOf(string.charAt(i));
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            return string.indexOf(((Character)obj).charValue());
        } else
        {
            return -1;
        }
    }

    boolean isPartialView()
    {
        return false;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            return string.lastIndexOf(((Character)obj).charValue());
        } else
        {
            return -1;
        }
    }

    public int size()
    {
        return string.length();
    }

    public ImmutableList subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        return Lists.charactersOf(string.substring(i, j));
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    (String s)
    {
        string = s;
    }
}
