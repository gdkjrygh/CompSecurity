// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.cache;

import java.io.File;
import java.util.Comparator;
import java.util.HashMap;

final class e
    implements Comparator
{

    final HashMap a;

    e(HashMap hashmap)
    {
        a = hashmap;
        super();
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        long l = ((Long)a.get(obj)).longValue();
        long l1 = ((Long)a.get(obj1)).longValue();
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }
}
