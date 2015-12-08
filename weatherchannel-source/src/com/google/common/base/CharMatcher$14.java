// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions, Predicate

static final class it> extends CharMatcher
{

    final Predicate val$predicate;

    public boolean apply(Character character)
    {
        return val$predicate.apply(Preconditions.checkNotNull(character));
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return val$predicate.apply(Character.valueOf(c));
    }

    (String s, Predicate predicate1)
    {
        val$predicate = predicate1;
        super(s);
    }
}
