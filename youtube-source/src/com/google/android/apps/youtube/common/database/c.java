// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.youtube.common.L;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.common.database:
//            f

public final class c extends SQLiteOpenHelper
{

    private final Context a;
    private final List b;

    public c(Context context, List list)
    {
        super((Context)com.google.android.apps.youtube.common.fromguava.c.a(context), "keyValueByteStores", null, list.size());
        a = context;
        b = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
    }

    public final File a()
    {
        return a.getDatabasePath("keyValueByteStores");
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((f)iterator.next()).a(sqlitedatabase)) { }
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        L.e((new StringBuilder("Upgrading db from version ")).append(i).append(" to version ").append(j).toString());
        do
        {
            if (i >= j)
            {
                break;
            }
            f f1 = (f)b.get(i);
            L.e((new StringBuilder("Upgrading to Schema to version: ")).append(i).toString());
            try
            {
                f1.a(sqlitedatabase);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                L.a(String.format(Locale.US, "Error upgrading from %d to %d", new Object[] {
                    Integer.valueOf(i - 1), Integer.valueOf(i)
                }), sqlitedatabase);
                throw sqlitedatabase;
            }
            i++;
        } while (true);
    }
}
