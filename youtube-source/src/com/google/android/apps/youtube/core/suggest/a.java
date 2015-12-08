// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.suggest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.suggest:
//            b

public final class a
{

    private SQLiteOpenHelper a;
    private String b[] = {
        "0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"
    };

    public a(Context context)
    {
        a = new b(context);
    }

    public final Cursor a()
    {
        Cursor cursor = a.getReadableDatabase().query("suggestions", b, null, null, null, null, "date DESC", null);
        L.e((new StringBuilder("History query returning ")).append(cursor.getCount()).append(" rows").toString());
        return cursor;
    }

    public final Cursor a(String s)
    {
        Object obj = a.getReadableDatabase();
        String s1 = (new StringBuilder("%")).append(s).append("%").toString();
        obj = ((SQLiteDatabase) (obj)).query("suggestions", b, "suggest_intent_query LIKE ?", new String[] {
            s1
        }, null, null, "date DESC");
        L.e((new StringBuilder("query ")).append(s).append(" returning ").append(((Cursor) (obj)).getCount()).append(" rows").toString());
        return ((Cursor) (obj));
    }

    public final void a(ContentValues contentvalues)
    {
        L.e((new StringBuilder("History insert ")).append(contentvalues).toString());
        a.getWritableDatabase().insert("suggestions", "query", contentvalues);
    }

    public final void b()
    {
        int i = a.getWritableDatabase().delete("suggestions", "1", null);
        L.e((new StringBuilder("Cleared search history ")).append(i).append(" rows").toString());
    }
}
