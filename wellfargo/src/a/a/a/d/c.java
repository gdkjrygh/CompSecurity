// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.d;

import a.a.a.a;
import a.a.a.d;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package a.a.a.d:
//            a, d

public class c extends a.a.a.d.a
{

    private final a.a.a.d.d f;

    private c(a.a.a.d.d d1, a a1, String s, String as[])
    {
        super(a1, s, as);
        f = d1;
    }

    c(a.a.a.d.d d1, a a1, String s, String as[], c c1)
    {
        this(d1, a1, s, as);
    }

    static c a(a a1, String s, Object aobj[])
    {
        return (c)(new a.a.a.d.d(a1, s, a(aobj), null)).a();
    }

    public volatile void a(int i, Object obj)
    {
        super.a(i, obj);
    }

    public c b()
    {
        return (c)f.a(this);
    }

    public long c()
    {
        Cursor cursor;
        a();
        cursor = a.getDatabase().rawQuery(c, d);
        if (!cursor.moveToNext())
        {
            throw new d("No result for count");
        }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
        long l;
        if (!cursor.isLast())
        {
            throw new d((new StringBuilder("Unexpected row count: ")).append(cursor.getCount()).toString());
        }
        if (cursor.getColumnCount() != 1)
        {
            throw new d((new StringBuilder("Unexpected column count: ")).append(cursor.getColumnCount()).toString());
        }
        l = cursor.getLong(0);
        cursor.close();
        return l;
    }
}
