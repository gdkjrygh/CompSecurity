// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import com.google.c.a.b;

// Referenced classes of package com.google.c.b:
//            d

public final class e
{

    static final b a = b.a(", ").b("null");

    static StringBuilder a(int i)
    {
        d.a(i, "size");
        return new StringBuilder((int)Math.min((long)i * 8L, 0x40000000L));
    }

}
