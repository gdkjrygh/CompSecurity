// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Equivalence

static final class  extends Equivalence
    implements Serializable
{

    static final INSTANCE INSTANCE = new <init>();
    private static final long serialVersionUID = 1L;

    private Object readResolve()
    {
        return INSTANCE;
    }

    protected boolean doEquivalent(Object obj, Object obj1)
    {
        return false;
    }

    protected int doHash(Object obj)
    {
        return System.identityHashCode(obj);
    }


    ()
    {
    }
}
