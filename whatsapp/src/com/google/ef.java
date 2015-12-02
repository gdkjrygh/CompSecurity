// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;

// Referenced classes of package com.google:
//            a8, cf, af

class ef
    implements Iterable
{

    final CharSequence a;
    final String b;
    final cf c;
    final long d;
    final af e;

    public Iterator iterator()
    {
        return new a8(e, a, b, c, d);
    }
}
