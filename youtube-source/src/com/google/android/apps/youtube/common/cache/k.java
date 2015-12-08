// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

final class k extends SoftReference
{

    private final Object a;

    public k(Object obj, Object obj1, ReferenceQueue referencequeue)
    {
        super(obj1, referencequeue);
        a = obj;
    }

    static Object a(k k1)
    {
        return k1.a;
    }
}
