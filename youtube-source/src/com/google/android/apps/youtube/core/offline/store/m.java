// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.offline.store;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.database.f;
import com.google.android.apps.youtube.core.utils.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.core.offline.store:
//            n, o, p, j

final class m extends SQLiteOpenHelper
{

    static final List a;
    private final j b;

    m(Context context, String s, j j1)
    {
        super(context, s, null, a.size());
        b = j1;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((f)iterator.next()).a(sqlitedatabase)) { }
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int k, int l)
    {
        i.a(sqlitedatabase);
        b.b();
        onUpgrade(sqlitedatabase, 0, l);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
    {
        L.e((new StringBuilder("Upgrading database from version ")).append(k).append(" to ").append(l).toString());
        do
        {
            if (k >= l)
            {
                break;
            }
            f f1 = (f)a.get(k);
            L.e((new StringBuilder("Upgrading to Schema to version: ")).append(k).toString());
            try
            {
                f1.a(sqlitedatabase);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                L.a(String.format(Locale.US, "Error upgrading from %d to %d", new Object[] {
                    Integer.valueOf(k - 1), Integer.valueOf(k)
                }), sqlitedatabase);
                throw sqlitedatabase;
            }
            k++;
        } while (true);
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new n());
        arraylist.add(new o());
        arraylist.add(new p());
        a = Collections.unmodifiableList(arraylist);
    }
}
