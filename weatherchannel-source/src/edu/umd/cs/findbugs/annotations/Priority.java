// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package edu.umd.cs.findbugs.annotations;


public final class Priority extends Enum
{

    private static final Priority $VALUES[];
    public static final Priority HIGH;
    public static final Priority IGNORE;
    public static final Priority LOW;
    public static final Priority MEDIUM;
    private final int priorityValue;

    private Priority(String s, int i, int j)
    {
        super(s, i);
        priorityValue = j;
    }

    public static Priority valueOf(String s)
    {
        return (Priority)Enum.valueOf(edu/umd/cs/findbugs/annotations/Priority, s);
    }

    public static Priority[] values()
    {
        return (Priority[])$VALUES.clone();
    }

    public int getPriorityValue()
    {
        return priorityValue;
    }

    static 
    {
        HIGH = new Priority("HIGH", 0, 1);
        MEDIUM = new Priority("MEDIUM", 1, 2);
        LOW = new Priority("LOW", 2, 3);
        IGNORE = new Priority("IGNORE", 3, 5);
        $VALUES = (new Priority[] {
            HIGH, MEDIUM, LOW, IGNORE
        });
    }
}
