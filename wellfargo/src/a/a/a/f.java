// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import android.database.Cursor;
import java.util.List;

// Referenced classes of package a.a.a:
//            a

public final class f
{

    private final a a;

    public f(a a1)
    {
        a = a1;
    }

    public static a.a.a.c.f a(a a1)
    {
        return a1.getStatements();
    }

    public List a(Cursor cursor)
    {
        return a.loadAllAndCloseCursor(cursor);
    }

    public Object b(Cursor cursor)
    {
        return a.loadUniqueAndCloseCursor(cursor);
    }
}
