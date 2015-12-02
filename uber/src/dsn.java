// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListAdapter;

final class dsn
{

    private final int a;
    private final ListAdapter b;

    dsn(ListAdapter listadapter, int i)
    {
        b = listadapter;
        a = i;
    }

    static int a(dsn dsn1)
    {
        return dsn1.a;
    }

    static ListAdapter b(dsn dsn1)
    {
        return dsn1.b;
    }
}
