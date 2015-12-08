// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.util;

import java.util.AbstractList;

final class a extends AbstractList
{

    final Object a[];
    final Object b;

    public final Object get(int i)
    {
        if (i == 0)
        {
            return b;
        } else
        {
            return a[i - 1];
        }
    }

    public final int size()
    {
        return a.length + 1;
    }
}
