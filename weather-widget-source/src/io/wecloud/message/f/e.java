// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.f;

import android.database.Cursor;
import io.wecloud.message.h.c;

public class e
{

    private String a;
    private long b;
    private int c;
    private long d;
    private String e;
    private String f;
    private String g;

    public e()
    {
    }

    public e(Cursor cursor)
    {
        if (cursor != null)
        {
            a = io.wecloud.message.h.c.b(cursor, "pkg_name");
            b = io.wecloud.message.h.c.c(cursor, "usage_time");
            c = io.wecloud.message.h.c.a(cursor, "open_count");
            d = io.wecloud.message.h.c.c(cursor, "last_modified");
            e = io.wecloud.message.h.c.b(cursor, "b_1");
            f = io.wecloud.message.h.c.b(cursor, "b_2");
            g = io.wecloud.message.h.c.b(cursor, "b_3");
        }
    }

    public long a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public long c()
    {
        return d;
    }
}
