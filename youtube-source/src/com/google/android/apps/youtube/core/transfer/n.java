// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            t, o

final class n
{

    private final Context a;
    private final String b;
    private SQLiteDatabase c;

    public n(Context context, String s)
    {
        a = context;
        b = s;
    }

    private static ContentValues d(t t1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("file_path", t1.a);
        contentvalues.put("network_uri", t1.b);
        contentvalues.put("status", Integer.valueOf(t1.c.ordinal()));
        contentvalues.put("status_reason", Integer.valueOf(t1.d));
        contentvalues.put("bytes_transferred", Long.valueOf(t1.e));
        contentvalues.put("bytes_total", Long.valueOf(t1.f));
        contentvalues.put("extras", t1.g.a());
        contentvalues.put("output_extras", t1.h.a());
        contentvalues.put("accountname", t1.i);
        return contentvalues;
    }

    public final List a(String s)
    {
        Object obj;
        obj = new ArrayList();
        com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status status;
        a a1;
        Object obj1;
        String s1;
        a a2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        long l2;
        long l3;
        if (s == null)
        {
            s = c.query("transfers", null, null, null, null, null, null);
        } else
        {
            s = c.query("transfers", null, "accountname=?", new String[] {
                s
            }, null, null, null);
        }
        i = s.getColumnIndex("file_path");
        j = s.getColumnIndex("network_uri");
        k = s.getColumnIndex("status");
        l = s.getColumnIndex("status_reason");
        i1 = s.getColumnIndex("bytes_transferred");
        j1 = s.getColumnIndex("bytes_total");
        k1 = s.getColumnIndex("extras");
        l1 = s.getColumnIndex("output_extras");
        i2 = s.getColumnIndex("accountname");
        for (; s.moveToNext(); ((ArrayList) (obj)).add(obj1))
        {
            obj1 = s.getString(i);
            s1 = s.getString(j);
            status = com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.values()[s.getInt(k)];
            j2 = s.getInt(l);
            l2 = s.getLong(i1);
            l3 = s.getLong(j1);
            a2 = new a(s.getBlob(k1));
            a1 = new a(s.getBlob(l1));
            obj1 = new t(s.getString(i2), ((String) (obj1)), s1, a2);
            obj1.c = status;
            obj1.d = j2;
            obj1.f = l3;
            obj1.e = l2;
            obj1.h = a1;
        }

        break MISSING_BLOCK_LABEL_327;
        obj;
        s.close();
        throw obj;
        s.close();
        return ((List) (obj));
    }

    public final void a()
    {
        if (c == null || !c.isOpen())
        {
            c = (new o(a, b)).getWritableDatabase();
        }
    }

    public final void a(t t1)
    {
        c.insert("transfers", null, d(t1));
    }

    public final void b()
    {
        c.delete("transfers", null, null);
    }

    public final void b(t t1)
    {
        c.update("transfers", d(t1), "file_path = ?", new String[] {
            t1.a
        });
    }

    public final void b(String s)
    {
        c.delete("transfers", "file_path = ?", new String[] {
            s
        });
    }

    public final void c()
    {
        c.close();
        c = null;
    }

    public final void c(t t1)
    {
        b(t1.a);
    }
}
