// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a;

import a.a.a.b.d;
import a.a.a.c.a;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package a.a.a:
//            c

public abstract class b
{

    protected final Map daoConfigMap = new HashMap();
    protected final SQLiteDatabase db;
    protected final int schemaVersion;

    public b(SQLiteDatabase sqlitedatabase, int i)
    {
        db = sqlitedatabase;
        schemaVersion = i;
    }

    public SQLiteDatabase getDatabase()
    {
        return db;
    }

    public int getSchemaVersion()
    {
        return schemaVersion;
    }

    public abstract c newSession();

    public abstract c newSession(d d);

    protected void registerDaoClass(Class class1)
    {
        a a1 = new a(db, class1);
        daoConfigMap.put(class1, a1);
    }
}
