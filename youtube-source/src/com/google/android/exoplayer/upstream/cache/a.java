// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.cache;

import java.io.File;
import java.util.Set;
import java.util.SortedSet;

// Referenced classes of package com.google.android.exoplayer.upstream.cache:
//            d

public interface a
{

    public abstract d a(String s, long l);

    public abstract File a(String s, long l, long l1);

    public abstract Set a();

    public abstract SortedSet a(String s);

    public abstract void a(d d);

    public abstract void a(File file);

    public abstract long b();

    public abstract d b(String s, long l);

    public abstract void b(d d);
}
