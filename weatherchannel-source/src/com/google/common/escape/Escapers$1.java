// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.escape:
//            CharEscaper, Escapers

static final class  extends CharEscaper
{

    public String escape(String s)
    {
        return (String)Preconditions.checkNotNull(s);
    }

    protected char[] escape(char c)
    {
        return null;
    }

    ()
    {
    }
}
