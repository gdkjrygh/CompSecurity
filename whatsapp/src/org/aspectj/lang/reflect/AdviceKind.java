// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


public final class AdviceKind extends Enum
{

    private static final AdviceKind $VALUES[];
    public static final AdviceKind AFTER;
    public static final AdviceKind AFTER_RETURNING;
    public static final AdviceKind AFTER_THROWING;
    public static final AdviceKind AROUND;
    public static final AdviceKind BEFORE;

    private AdviceKind(String s, int i)
    {
        super(s, i);
    }

    public static AdviceKind valueOf(String s)
    {
        return (AdviceKind)Enum.valueOf(org/aspectj/lang/reflect/AdviceKind, s);
    }

    public static AdviceKind[] values()
    {
        return (AdviceKind[])$VALUES.clone();
    }

    static 
    {
        BEFORE = new AdviceKind("BEFORE", 0);
        AFTER = new AdviceKind("AFTER", 1);
        AFTER_RETURNING = new AdviceKind("AFTER_RETURNING", 2);
        AFTER_THROWING = new AdviceKind("AFTER_THROWING", 3);
        AROUND = new AdviceKind("AROUND", 4);
        $VALUES = (new AdviceKind[] {
            BEFORE, AFTER, AFTER_RETURNING, AFTER_THROWING, AROUND
        });
    }
}
