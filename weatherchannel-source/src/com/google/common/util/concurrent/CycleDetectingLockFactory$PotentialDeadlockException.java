// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            CycleDetectingLockFactory

public static final class <init> extends <init>
{

    private final conflictingStackTrace conflictingStackTrace;

    public <init> getConflictingStackTrace()
    {
        return conflictingStackTrace;
    }

    public String getMessage()
    {
        StringBuilder stringbuilder = new StringBuilder(super.e());
        for (Object obj = conflictingStackTrace; obj != null; obj = ((Throwable) (obj)).getCause())
        {
            stringbuilder.append(", ").append(((Throwable) (obj)).getMessage());
        }

        return stringbuilder.toString();
    }

    private ( ,  1,  2)
    {
        super(, 1);
        conflictingStackTrace = 2;
        initCause(2);
    }

    initCause(initCause initcause, initCause initcause1, initCause initcause2, initCause initcause3)
    {
        this(initcause, initcause1, initcause2);
    }
}
