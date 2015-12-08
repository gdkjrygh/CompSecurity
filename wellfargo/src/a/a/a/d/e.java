// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.a;
import a.a.a.f;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

// Referenced classes of package a.a.a.d:
//            a, f

public class e extends a.a.a.d.a
{

    private final int f;
    private final int g;
    private final a.a.a.d.f h;

    private e(a.a.a.d.f f1, a a1, String s, String as[], int i, int j)
    {
        super(a1, s, as);
        h = f1;
        f = i;
        g = j;
    }

    e(a.a.a.d.f f1, a a1, String s, String as[], int i, int j, e e1)
    {
        this(f1, a1, s, as, i, j);
    }

    public static e a(a a1, String s, Object aobj[])
    {
        return a(a1, s, aobj, -1, -1);
    }

    static e a(a a1, String s, Object aobj[], int i, int j)
    {
        return (e)(new a.a.a.d.f(a1, s, a(aobj), i, j)).a();
    }

    public void a(int i)
    {
        a();
        if (f == -1)
        {
            throw new IllegalStateException("Limit must be set with QueryBuilder before it can be used here");
        } else
        {
            d[f] = Integer.toString(i);
            return;
        }
    }

    public void a(int i, Object obj)
    {
        if (i >= 0 && (i == f || i == g))
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal parameter index: ")).append(i).toString());
        } else
        {
            super.a(i, obj);
            return;
        }
    }

    public e b()
    {
        return (e)h.a(this);
    }

    public List c()
    {
        a();
        android.database.Cursor cursor = a.getDatabase().rawQuery(c, d);
        return b.a(cursor);
    }

    public Object d()
    {
        a();
        android.database.Cursor cursor = a.getDatabase().rawQuery(c, d);
        return b.b(cursor);
    }
}
