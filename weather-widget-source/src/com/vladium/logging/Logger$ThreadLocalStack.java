// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.logging;

import java.util.LinkedList;

// Referenced classes of package com.vladium.logging:
//            Logger

private static final class <init> extends InheritableThreadLocal
{

    protected Object initialValue()
    {
        return new LinkedList();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
