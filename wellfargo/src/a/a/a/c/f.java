// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.c;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

// Referenced classes of package a.a.a.c:
//            e

public class f
{

    private final SQLiteDatabase a;
    private final String b;
    private final String c[];
    private final String d[];
    private SQLiteStatement e;
    private SQLiteStatement f;
    private SQLiteStatement g;
    private SQLiteStatement h;
    private volatile String i;
    private volatile String j;
    private volatile String k;

    public f(SQLiteDatabase sqlitedatabase, String s, String as[], String as1[])
    {
        a = sqlitedatabase;
        b = s;
        c = as;
        d = as1;
    }

    public SQLiteStatement a()
    {
        if (e == null)
        {
            String s = a.a.a.c.e.a("INSERT INTO ", b, c);
            e = a.compileStatement(s);
        }
        return e;
    }

    public SQLiteStatement b()
    {
        if (f == null)
        {
            String s = a.a.a.c.e.a("INSERT OR REPLACE INTO ", b, c);
            f = a.compileStatement(s);
        }
        return f;
    }

    public SQLiteStatement c()
    {
        if (h == null)
        {
            String s = a.a.a.c.e.a(b, d);
            h = a.compileStatement(s);
        }
        return h;
    }

    public SQLiteStatement d()
    {
        if (g == null)
        {
            String s = a.a.a.c.e.a(b, c, d);
            g = a.compileStatement(s);
        }
        return g;
    }

    public String e()
    {
        if (i == null)
        {
            i = a.a.a.c.e.b(b, "T", c);
        }
        return i;
    }

    public String f()
    {
        if (j == null)
        {
            StringBuilder stringbuilder = new StringBuilder(e());
            stringbuilder.append("WHERE ");
            a.a.a.c.e.b(stringbuilder, "T", d);
            j = stringbuilder.toString();
        }
        return j;
    }

    public String g()
    {
        if (k == null)
        {
            k = (new StringBuilder(String.valueOf(e()))).append("WHERE ROWID=?").toString();
        }
        return k;
    }
}
