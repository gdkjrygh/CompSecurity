// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class When extends Enum
{

    private static final When $VALUES[];
    public static final When ANYTIME;
    public static final When FIRST;
    public static final When LAST;

    private When(String s, int i)
    {
        super(s, i);
    }

    public static When valueOf(String s)
    {
        return (When)Enum.valueOf(edu/umd/cs/findbugs/annotations/When, s);
    }

    public static When[] values()
    {
        return (When[])$VALUES.clone();
    }

    static 
    {
        FIRST = new When("FIRST", 0);
        ANYTIME = new When("ANYTIME", 1);
        LAST = new When("LAST", 2);
        $VALUES = (new When[] {
            FIRST, ANYTIME, LAST
        });
    }
}
