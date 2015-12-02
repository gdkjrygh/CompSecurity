// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang.reflect;


public final class PerClauseKind extends Enum
{

    private static final PerClauseKind $VALUES[];
    public static final PerClauseKind PERCFLOW;
    public static final PerClauseKind PERCFLOWBELOW;
    public static final PerClauseKind PERTARGET;
    public static final PerClauseKind PERTHIS;
    public static final PerClauseKind PERTYPEWITHIN;
    public static final PerClauseKind SINGLETON;

    private PerClauseKind(String s, int i)
    {
        super(s, i);
    }

    public static PerClauseKind valueOf(String s)
    {
        return (PerClauseKind)Enum.valueOf(org/aspectj/lang/reflect/PerClauseKind, s);
    }

    public static PerClauseKind[] values()
    {
        return (PerClauseKind[])$VALUES.clone();
    }

    static 
    {
        SINGLETON = new PerClauseKind("SINGLETON", 0);
        PERTHIS = new PerClauseKind("PERTHIS", 1);
        PERTARGET = new PerClauseKind("PERTARGET", 2);
        PERCFLOW = new PerClauseKind("PERCFLOW", 3);
        PERCFLOWBELOW = new PerClauseKind("PERCFLOWBELOW", 4);
        PERTYPEWITHIN = new PerClauseKind("PERTYPEWITHIN", 5);
        $VALUES = (new PerClauseKind[] {
            SINGLETON, PERTHIS, PERTARGET, PERCFLOW, PERCFLOWBELOW, PERTYPEWITHIN
        });
    }
}
