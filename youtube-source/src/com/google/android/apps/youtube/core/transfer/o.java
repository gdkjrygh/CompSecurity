// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.i;
import com.google.android.apps.youtube.datalib.model.gdata.Video;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            ConvertibleSerializable

final class o extends SQLiteOpenHelper
{

    public o(Context context, String s)
    {
        super(context, s, null, 7);
    }

    private static a a(Bundle bundle)
    {
        a a1 = new a();
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            if (obj instanceof String)
            {
                a1.a(s, (String)obj);
            } else
            if (obj instanceof Integer)
            {
                a1.a(s, ((Integer)obj).intValue());
            } else
            if (obj instanceof Long)
            {
                a1.a(s, ((Long)obj).longValue());
            } else
            if (obj instanceof Boolean)
            {
                a1.a(s, ((Boolean)obj).booleanValue());
            } else
            if (obj instanceof byte[])
            {
                a1.a(s, (byte[])obj);
            } else
            if (obj instanceof Bitmap)
            {
                a1.a(s, Util.a((Bitmap)obj, android.graphics.Bitmap.CompressFormat.JPEG, 80));
            } else
            if (obj instanceof Video)
            {
                a1.a("video_id", ((Video)obj).id);
            } else
            if (obj instanceof Enum)
            {
                a1.a(s, ((Enum)obj).name());
            } else
            if (obj instanceof ConvertibleSerializable)
            {
                ((ConvertibleSerializable)obj).convertToPrimitives(a1);
            } else
            {
                L.b((new StringBuilder("Couldn't convert bundle entry of type ")).append(obj.getClass()).append(" to primitives").toString());
            }
        }

        return a1;
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("DROP TABLE IF EXISTS transfers");
        sqlitedatabase.execSQL("CREATE TABLE transfers (file_path TEXT PRIMARY KEY,network_uri TEXT,status INTEGER,status_reason INTEGER,bytes_transferred BIGINT,bytes_total BIGINT,extras BLOB,output_extras BLOB, accountname TEXT)");
        sqlitedatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(s, (new a()).a());
        sqlitedatabase.update("transfers", contentvalues, null, null);
    }

    private void b(SQLiteDatabase sqlitedatabase, String s)
    {
        Cursor cursor;
        Object obj;
        new ArrayList();
        obj = new HashMap();
        cursor = sqlitedatabase.query("transfers", new String[] {
            "file_path", s
        }, null, null, null, null, null);
        int j;
        int k;
        j = cursor.getColumnIndex("file_path");
        k = cursor.getColumnIndex(s);
_L2:
        String s1;
        Bundle bundle;
        byte abyte0[];
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = cursor.getString(j);
        abyte0 = cursor.getBlob(k);
        bundle = new Bundle();
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        bundle.readFromParcel(parcel);
        parcel.recycle();
_L3:
        ((Map) (obj)).put(s1, bundle);
        if (true) goto _L2; else goto _L1
        sqlitedatabase;
        cursor.close();
        throw sqlitedatabase;
        Exception exception1;
        exception1;
        L.b((new StringBuilder("Failed to unmarshall parcel for ")).append(s1).toString());
          goto _L3
_L1:
        cursor.close();
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            a a1;
            ContentValues contentvalues;
            try
            {
                a1 = a((Bundle)entry.getValue());
            }
            catch (Exception exception)
            {
                L.a((new StringBuilder("Error unpacking bundle in column: ")).append(s).toString(), exception);
                exception = new a();
            }
            contentvalues = new ContentValues();
            contentvalues.put(s, a1.a());
            sqlitedatabase.update("transfers", contentvalues, "file_path = ?", new String[] {
                (String)entry.getKey()
            });
        } while (true);
        return;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase);
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
        i.a(sqlitedatabase);
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int k)
    {
        L.e((new StringBuilder("Upgrading database from version ")).append(j).append(" to ").append(k).toString());
        boolean flag;
        if (k == 7)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, (new StringBuilder("newVersion should be 7 but is ")).append(k).toString());
        if (j >= 3) goto _L2; else goto _L1
_L1:
        a(sqlitedatabase);
        sqlitedatabase.execSQL("INSERT INTO transfers SELECT file_path, network_uri, status, 0, bytes_downloaded, bytes_total, NULL, NULL, NULL FROM downloads");
        sqlitedatabase.execSQL("DROP TABLE downloads");
        a(sqlitedatabase, "extras");
        a(sqlitedatabase, "output_extras");
_L4:
        return;
_L2:
        int l;
        int i1;
        if (j == 3)
        {
            try
            {
                sqlitedatabase.execSQL("ALTER TABLE transfers ADD COLUMN output_extras BLOB");
                sqlitedatabase.execSQL("ALTER TABLE transfers ADD COLUMN status_reason INTEGER");
                sqlitedatabase.execSQL("ALTER TABLE transfers ADD COLUMN accountname TEXT");
                sqlitedatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
                a(sqlitedatabase, "output_extras");
                b(sqlitedatabase, "extras");
                return;
            }
            catch (SQLiteException sqliteexception)
            {
                L.a(String.format("Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                }), sqliteexception);
            }
            a(sqlitedatabase);
            return;
        }
        l = j;
        if (j != 4)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        i1 = j;
        sqlitedatabase.execSQL("ALTER TABLE transfers ADD COLUMN status_reason INTEGER");
        l = 5;
        j = l;
        if (l != 5)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = l;
        b(sqlitedatabase, "output_extras");
        i1 = l;
        b(sqlitedatabase, "extras");
        j = 6;
        if (j != 6) goto _L4; else goto _L3
_L3:
        i1 = j;
        sqlitedatabase.execSQL("ALTER TABLE transfers ADD COLUMN accountname TEXT");
        i1 = j;
        try
        {
            sqlitedatabase.execSQL("CREATE INDEX idx_transfers_accountname ON transfers (accountname)");
            return;
        }
        catch (SQLiteException sqliteexception1)
        {
            L.a(String.format("Error trying to upgrade from %d to %d. Wiping data and create database from scratch.", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(k)
            }), sqliteexception1);
        }
        a(sqlitedatabase);
        return;
    }
}
