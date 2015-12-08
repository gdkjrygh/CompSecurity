// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            AbstractIterator, Splitter, CharMatcher

private static abstract class toSplit extends AbstractIterator
{

    int limit;
    int offset;
    final boolean omitEmptyStrings;
    final CharSequence toSplit;
    final CharMatcher trimmer;

    protected volatile Object computeNext()
    {
        return computeNext();
    }

    protected String computeNext()
    {
        int i = offset;
        do
        {
            if (offset == -1)
            {
                break;
            }
            int l = i;
            int i1 = separatorStart(offset);
            int j;
            if (i1 == -1)
            {
                j = toSplit.length();
                offset = -1;
            } else
            {
                j = i1;
                offset = separatorEnd(i1);
            }
            if (offset == i)
            {
                offset = offset + 1;
                if (offset >= toSplit.length())
                {
                    offset = -1;
                }
            } else
            {
                do
                {
                    i = j;
                    if (l >= j)
                    {
                        break;
                    }
                    i = j;
                    if (!trimmer.matches(toSplit.charAt(l)))
                    {
                        break;
                    }
                    l++;
                } while (true);
                for (; i > l && trimmer.matches(toSplit.charAt(i - 1)); i--) { }
                if (omitEmptyStrings && l == i)
                {
                    i = offset;
                } else
                {
                    int k;
                    if (limit == 1)
                    {
                        i = toSplit.length();
                        offset = -1;
                        do
                        {
                            k = i;
                            if (i <= l)
                            {
                                break;
                            }
                            k = i;
                            if (!trimmer.matches(toSplit.charAt(i - 1)))
                            {
                                break;
                            }
                            i--;
                        } while (true);
                    } else
                    {
                        limit = limit - 1;
                        k = i;
                    }
                    return toSplit.subSequence(l, k).toString();
                }
            }
        } while (true);
        return (String)endOfData();
    }

    abstract int separatorEnd(int i);

    abstract int separatorStart(int i);

    protected (Splitter splitter, CharSequence charsequence)
    {
        offset = 0;
        trimmer = Splitter.access$200(splitter);
        omitEmptyStrings = Splitter.access$300(splitter);
        limit = Splitter.access$400(splitter);
        toSplit = charsequence;
    }
}
