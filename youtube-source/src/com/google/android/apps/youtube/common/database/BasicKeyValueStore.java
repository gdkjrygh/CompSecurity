// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.youtube.common.fromguava.c;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.common.database:
//            d, a, c, e

public abstract class BasicKeyValueStore
    implements d
{

    private final SQLiteOpenHelper a;
    private final String b;

    public BasicKeyValueStore(SQLiteOpenHelper sqliteopenhelper, String s)
    {
        a = (SQLiteOpenHelper)com.google.android.apps.youtube.common.fromguava.c.a(sqliteopenhelper);
        b = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public final int a(String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        return a.getWritableDatabase().delete(b, "key = ?", new String[] {
            s
        });
    }

    protected abstract Object a(byte abyte0[]);

    public final void a()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        a.getWritableDatabase().beginTransaction();
    }

    public final void a(String s, Object obj)
    {
        ContentValues contentvalues;
        com.google.android.apps.youtube.common.fromguava.c.b();
        a();
        contentvalues = new ContentValues();
        contentvalues.put("key", s);
        contentvalues.put("value", a(obj));
        contentvalues.put("sortingValue", Long.valueOf(b(obj)));
        if (b(s) != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        a.getWritableDatabase().insert(b, null, contentvalues);
_L1:
        c();
        b();
        return;
        a.getWritableDatabase().update(b, contentvalues, "key = ?", new String[] {
            s
        });
          goto _L1
        s;
        b();
        throw s;
    }

    protected abstract byte[] a(Object obj);

    protected abstract long b(Object obj);

    public final Object b(String s)
    {
        Object obj = null;
        com.google.android.apps.youtube.common.fromguava.c.b();
        Cursor cursor = a.getReadableDatabase().query(b, new String[] {
            "value"
        }, "key=?", new String[] {
            s
        }, null, null, null, null);
        s = obj;
        if (cursor.moveToNext())
        {
            s = ((String) (a(cursor.getBlob(0))));
            cursor.close();
        }
        return s;
    }

    public final void b()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        a.getWritableDatabase().endTransaction();
    }

    public final void c()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        a.getWritableDatabase().setTransactionSuccessful();
    }

    public final e d()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        Cursor cursor = a.getReadableDatabase().query(b, new String[] {
            "value"
        }, null, null, null, null, "sortingValue ASC, insertionOrder ASC");
        try
        {
            cursor.getCount();
        }
        catch (SQLException sqlexception)
        {
            Object obj = "";
            if (a instanceof com.google.android.apps.youtube.common.database.c)
            {
                obj = ((com.google.android.apps.youtube.common.database.c)a).a();
                if (obj == null)
                {
                    obj = " is null";
                } else
                if (!((File) (obj)).exists())
                {
                    obj = String.format("%s doesn't exist", new Object[] {
                        ((File) (obj)).getAbsolutePath()
                    });
                } else
                if (!((File) (obj)).canRead())
                {
                    obj = String.format("%s is not readable", new Object[] {
                        ((File) (obj)).getAbsolutePath()
                    });
                } else
                {
                    obj = String.format("%s is readable", new Object[] {
                        ((File) (obj)).getAbsolutePath()
                    });
                }
            }
            throw new Bug13171861Exception(String.format(Locale.US, "%s trying to access db %s: %s", new Object[] {
                sqlexception.toString(), a.getDatabaseName(), obj
            }), null);
        }
        return new a(this, cursor);
    }

    private class Bug13171861Exception extends RuntimeException
    {

        private Bug13171861Exception(String s)
        {
            super(s);
        }

        Bug13171861Exception(String s, a a1)
        {
            this(s);
        }
    }

}
