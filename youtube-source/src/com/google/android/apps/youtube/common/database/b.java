// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.database;

import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.google.android.apps.youtube.common.database:
//            f

public final class b
    implements f
{

    private final String a;

    public b(String s)
    {
        a = s;
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE ")).append(a).append(" (insertionOrder").append(" INTEGER PRIMARY KEY AUTOINCREMENT,key").append(" TEXT KEY,value").append(" BLOB NOT NULL,sortingValue").append(" INTEGER NOT NULL)").toString());
    }
}
