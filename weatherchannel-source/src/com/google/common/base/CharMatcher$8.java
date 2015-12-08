// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

static final class stMatcher extends stMatcher
{

    public CharMatcher and(CharMatcher charmatcher)
    {
        Preconditions.checkNotNull(charmatcher);
        return this;
    }

    public String collapseFrom(CharSequence charsequence, char c)
    {
        return charsequence.toString();
    }

    public int countIn(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return 0;
    }

    public int indexIn(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return -1;
    }

    public int indexIn(CharSequence charsequence, int i)
    {
        Preconditions.checkPositionIndex(i, charsequence.length());
        return -1;
    }

    public int lastIndexIn(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return -1;
    }

    public boolean matches(char c)
    {
        return false;
    }

    public boolean matchesAllOf(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public boolean matchesNoneOf(CharSequence charsequence)
    {
        Preconditions.checkNotNull(charsequence);
        return true;
    }

    public CharMatcher negate()
    {
        return ANY;
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        return (CharMatcher)Preconditions.checkNotNull(charmatcher);
    }

    public String removeFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    public String replaceFrom(CharSequence charsequence, char c)
    {
        return charsequence.toString();
    }

    public String replaceFrom(CharSequence charsequence, CharSequence charsequence1)
    {
        Preconditions.checkNotNull(charsequence1);
        return charsequence.toString();
    }

    public String trimFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    public String trimLeadingFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    public String trimTrailingFrom(CharSequence charsequence)
    {
        return charsequence.toString();
    }

    stMatcher(String s)
    {
        super(s);
    }
}
