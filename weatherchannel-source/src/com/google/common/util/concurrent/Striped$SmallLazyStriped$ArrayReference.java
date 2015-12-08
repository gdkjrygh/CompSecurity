// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.common.util.concurrent:
//            Striped

private static final class index extends WeakReference
{

    final int index;

    (Object obj, int i, ReferenceQueue referencequeue)
    {
        super(obj, referencequeue);
        index = i;
    }
}
