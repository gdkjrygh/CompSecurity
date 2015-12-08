// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.base.Preconditions;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter
{

    private static final Pattern DEFAULT_PATTERN = Pattern.compile("\\s+");
    private final boolean keepDelimiters;
    private final Pattern pattern;

    public Splitter(String s, boolean flag)
    {
        this(Pattern.compile(s), flag);
    }

    public Splitter(Pattern pattern1, boolean flag)
    {
        Preconditions.checkNotNull(pattern1);
        pattern = pattern1;
        keepDelimiters = flag;
    }

    public Splitter(boolean flag)
    {
        this(DEFAULT_PATTERN, flag);
    }

    public String[] split(String s)
    {
        Preconditions.checkNotNull(s);
        int i = 0;
        LinkedList linkedlist = new LinkedList();
        for (Matcher matcher = pattern.matcher(s); matcher.find();)
        {
            linkedlist.add(s.substring(i, matcher.start()));
            if (keepDelimiters)
            {
                linkedlist.add(matcher.group());
            }
            i = matcher.end();
        }

        linkedlist.add(s.substring(i));
        return (String[])linkedlist.toArray(new String[linkedlist.size()]);
    }

}
