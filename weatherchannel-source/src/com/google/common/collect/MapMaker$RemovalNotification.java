// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ImmutableEntry, MapMaker

static final class cause extends ImmutableEntry
{

    private static final long serialVersionUID = 0L;
    private final ted cause;

    public cause getCause()
    {
        return cause;
    }

    public boolean wasEvicted()
    {
        return cause.ted();
    }

    (Object obj, Object obj1,  )
    {
        super(obj, obj1);
        cause = ;
    }
}
