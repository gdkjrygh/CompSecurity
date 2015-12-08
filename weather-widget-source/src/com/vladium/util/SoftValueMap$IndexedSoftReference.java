// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

// Referenced classes of package com.vladium.util:
//            SoftValueMap

static class m_bucketIndex extends SoftReference
{

    int m_bucketIndex;

    (Object obj, ReferenceQueue referencequeue, int i)
    {
        super(obj, referencequeue);
        m_bucketIndex = i;
    }
}
