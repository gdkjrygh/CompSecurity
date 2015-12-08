// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.regex.Pattern;

// Referenced classes of package com.google.common.base:
//            Predicates

private static class  extends 
{

    private static final long serialVersionUID = 0L;

    public String toString()
    {
        String s = String.valueOf(String.valueOf(pattern.pattern()));
        return (new StringBuilder(s.length() + 28)).append("Predicates.containsPattern(").append(s).append(")").toString();
    }

    (String s)
    {
        super(Pattern.compile(s));
    }
}
