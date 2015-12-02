// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh, DataLayer

class v
    implements DataLayer.c
{

    private static final String ara = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
        "datalayer", "ID", "key", "value", "expires"
    });
    private final Executor arb;
    private a arc;
    private int ard;
    private final Context mContext;
    private ld wb;

    public v(Context context)
    {
        this(context, lf._mthif(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
    }

    v(Context context, ld ld1, String s, int k, Executor executor)
    {
        mContext = context;
        wb = ld1;
        ard = k;
        arb = executor;
        arc = new a(mContext, s);
    }

    static List a(v v1)
    {
        return v1.pz();
    }

    static void a(v v1, List list, long l)
    {
        v1.b(list, l);
    }

    private SQLiteDatabase al(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = arc.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            bh.W(s);
            return null;
        }
        return sqlitedatabase;
    }

    static Context b(v v1)
    {
        return v1.mContext;
    }

    private void b(List list, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = wb.currentTimeMillis();
        x(l1);
        fI(list.size());
        c(list, l1 + l);
        pC();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        pC();
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void c(List list, long l)
    {
        boolean flag = DataLayer.a;
        SQLiteDatabase sqlitedatabase = al("Error opening database for writeEntryToDatabase.");
        if (sqlitedatabase != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    continue;
                }
                b b1 = (b)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("expires", Long.valueOf(l));
                contentvalues.put("key", b1.KP);
                contentvalues.put("value", b1.arj);
                sqlitedatabase.insert("datalayer", null, contentvalues);
            } while (!flag);
        }
        break MISSING_BLOCK_LABEL_106;
        while (true) 
        {
            return;
        }
    }

    private void fI(int k)
    {
        k = (pB() - ard) + k;
        if (k > 0)
        {
            List list = fJ(k);
            bh.U((new StringBuilder()).append("DataLayer store full, deleting ").append(list.size()).append(" entries to make room.").toString());
            h((String[])list.toArray(new String[0]));
        }
    }

    private List fJ(int k)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (k <= 0)
        {
            try
            {
                bh.W("Invalid maxEntries specified. Skipping.");
            }
            catch (SQLiteException sqliteexception)
            {
                throw sqliteexception;
            }
            return arraylist;
        }
        obj = al("Error opening database for peekEntryIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "ID"
        });
        String s = Integer.toString(k);
        obj1 = ((SQLiteDatabase) (obj)).query("datalayer", new String[] {
            "ID"
        }, null, null, null, null, ((String) (obj1)), s);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(String.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        SQLiteException sqliteexception2;
        if (obj1 != null)
        {
            try
            {
                ((Cursor) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return arraylist;
        sqliteexception2;
        obj = obj1;
        throw sqliteexception2;
        sqliteexception2;
_L6:
        obj = obj1;
        bh.W((new StringBuilder()).append("Error in peekEntries fetching entryIds: ").append(sqliteexception2.getMessage()).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        break MISSING_BLOCK_LABEL_138;
        obj1;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            catch (SQLiteException sqliteexception1)
            {
                throw sqliteexception1;
            }
        }
        throw obj1;
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        sqliteexception2;
        obj1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void h(String as[])
    {
        if (as != null)
        {
            int k;
            try
            {
                k = as.length;
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                try
                {
                    throw as;
                }
                // Misplaced declaration of an exception variable
                catch (String as[])
                {
                    throw as;
                }
            }
            SQLiteDatabase sqlitedatabase;
            if (k != 0)
            {
                if ((sqlitedatabase = al("Error opening database for deleteEntries.")) != null)
                {
                    String s = String.format("%s in (%s)", new Object[] {
                        "ID", TextUtils.join(",", Collections.nCopies(as.length, "?"))
                    });
                    try
                    {
                        sqlitedatabase.delete("datalayer", s, as);
                        return;
                    }
                    catch (SQLiteException sqliteexception)
                    {
                        bh.W((new StringBuilder()).append("Error deleting entries ").append(Arrays.toString(as)).toString());
                    }
                    return;
                }
            }
        }
    }

    private List i(List list)
    {
        boolean flag = DataLayer.a;
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            b b1 = (b)list.next();
            arraylist.add(new DataLayer.a(b1.KP, j(b1.arj)));
        } while (!flag);
        return arraylist;
    }

    private Object j(byte abyte0[])
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        abyte0 = new ObjectInputStream(bytearrayinputstream);
        Object obj = abyte0.readObject();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        abyte0.close();
        try
        {
            bytearrayinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return obj;
        }
        return obj;
        abyte0;
        throw abyte0;
        abyte0;
        abyte0 = null;
_L6:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        abyte0.close();
        Object obj1;
        try
        {
            bytearrayinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return null;
        abyte0;
        throw abyte0;
        abyte0;
        abyte0 = null;
_L4:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        abyte0.close();
        try
        {
            bytearrayinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return null;
        abyte0;
        throw abyte0;
        obj1;
        abyte0 = null;
_L2:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        abyte0.close();
        try
        {
            bytearrayinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        throw obj1;
        abyte0;
        throw abyte0;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private List j(List list)
    {
        boolean flag = DataLayer.a;
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            DataLayer.a a1 = (DataLayer.a)list.next();
            arraylist.add(new b(a1.KP, m(a1.wF)));
        } while (!flag);
        return arraylist;
    }

    private byte[] m(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj1 = new ObjectOutputStream(bytearrayoutputstream);
        ((ObjectOutputStream) (obj1)).writeObject(obj);
        obj = bytearrayoutputstream.toByteArray();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        ((ObjectOutputStream) (obj1)).close();
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return ((byte []) (obj));
        }
        return ((byte []) (obj));
        obj1;
        throw obj1;
        obj;
        obj1 = null;
_L4:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((ObjectOutputStream) (obj1)).close();
        IOException ioexception;
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        return null;
        obj;
        throw obj;
        obj;
        obj1 = null;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ((ObjectOutputStream) (obj1)).close();
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception) { }
        throw obj;
        ioexception;
        throw ioexception;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List pA()
    {
        ArrayList arraylist;
        Object obj;
        boolean flag;
        flag = DataLayer.a;
        obj = al("Error opening database for loadSerialized.");
        arraylist = new ArrayList();
        if (obj == null)
        {
            return arraylist;
        }
        obj = ((SQLiteDatabase) (obj)).query("datalayer", new String[] {
            "key", "value"
        }, null, null, null, null, "ID", null);
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            arraylist.add(new b(((Cursor) (obj)).getString(0), ((Cursor) (obj)).getBlob(1)));
        } while (!flag);
        ((Cursor) (obj)).close();
        return arraylist;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }

    private int pB()
    {
        Object obj;
        Object obj1;
        Object obj2;
        int k;
        int l;
        obj1 = null;
        obj = null;
        k = 0;
        l = 0;
        obj2 = al("Error opening database for getNumStoredEntries.");
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        obj2 = ((SQLiteDatabase) (obj2)).rawQuery("SELECT COUNT(*) from datalayer", null);
        obj = obj2;
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = obj2;
        obj1 = obj2;
        long l1 = ((Cursor) (obj2)).getLong(0);
        k = (int)l1;
        l = k;
        if (obj2 != null)
        {
            try
            {
                ((Cursor) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return k;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj1;
        obj1 = obj;
        bh.W("Error getting numStoredEntries");
        if (obj == null) goto _L1; else goto _L4
_L4:
        ((Cursor) (obj)).close();
        return 0;
        Exception exception;
        exception;
        if (obj1 != null)
        {
            try
            {
                ((Cursor) (obj1)).close();
            }
            catch (SQLiteException sqliteexception)
            {
                throw sqliteexception;
            }
        }
        throw exception;
    }

    private void pC()
    {
        try
        {
            arc.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            return;
        }
    }

    static String pD()
    {
        return ara;
    }

    private List pz()
    {
        List list;
        x(wb.currentTimeMillis());
        list = i(pA());
        pC();
        return list;
        Exception exception;
        exception;
        pC();
        throw exception;
    }

    private void x(long l)
    {
        SQLiteDatabase sqlitedatabase = al("Error opening database for deleteOlderThan.");
        if (sqlitedatabase == null)
        {
            return;
        }
        try
        {
            int k = sqlitedatabase.delete("datalayer", "expires <= ?", new String[] {
                Long.toString(l)
            });
            bh.V((new StringBuilder()).append("Deleted ").append(k).append(" expired items").toString());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            bh.W("Error deleting old entries.");
        }
    }

    public void a(DataLayer.c.a a1)
    {
        arb.execute(new _cls2(a1));
    }

    public void a(List list, long l)
    {
        list = j(list);
        arb.execute(new _cls1(list, l));
    }


    private class a extends SQLiteOpenHelper
    {

        final v arg;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            Object obj;
            boolean flag;
            flag = DataLayer.a;
            sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            obj = new HashSet();
            String as[] = sqlitedatabase.getColumnNames();
            int k = 0;
_L2:
            if (k >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Set) (obj)).add(as[k]);
            k++;
            if (!flag) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            boolean flag1;
            try
            {
                flag1 = ((Set) (obj)).remove("key");
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                try
                {
                    throw sqlitedatabase;
                }
                // Misplaced declaration of an exception variable
                catch (SQLiteDatabase sqlitedatabase) { }
                try
                {
                    throw sqlitedatabase;
                }
                // Misplaced declaration of an exception variable
                catch (SQLiteDatabase sqlitedatabase) { }
                try
                {
                    throw sqlitedatabase;
                }
                // Misplaced declaration of an exception variable
                catch (SQLiteDatabase sqlitedatabase)
                {
                    throw sqlitedatabase;
                }
            }
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            flag1 = ((Set) (obj)).remove("value");
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            flag1 = ((Set) (obj)).remove("ID");
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_122;
            }
            if (((Set) (obj)).remove("expires"))
            {
                break MISSING_BLOCK_LABEL_153;
            }
            throw new SQLiteException("Database column missing");
            obj;
            sqlitedatabase.close();
            throw obj;
            try
            {
                if (!((Set) (obj)).isEmpty())
                {
                    throw new SQLiteException("Database has extra columns");
                }
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                throw sqlitedatabase;
            }
            return;
        }

        private boolean a(String s, SQLiteDatabase sqlitedatabase)
        {
            Object obj = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            boolean flag = sqlitedatabase.moveToFirst();
            if (sqlitedatabase != null)
            {
                try
                {
                    sqlitedatabase.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            return flag;
            sqlitedatabase;
            sqlitedatabase = null;
_L4:
            bh.W((new StringBuilder()).append("Error querying for table ").append(s).toString());
            if (sqlitedatabase != null)
            {
                try
                {
                    sqlitedatabase.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            return false;
            s;
            sqlitedatabase = obj;
_L2:
            if (sqlitedatabase != null)
            {
                try
                {
                    sqlitedatabase.close();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
            }
            throw s;
            s;
            continue; /* Loop/switch isn't completed */
            s;
            if (true) goto _L2; else goto _L1
_L1:
            SQLiteException sqliteexception;
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase = null;
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            v.b(arg).getDatabasePath("google_tagmanager.db").delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            ak.ag(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            boolean flag;
            try
            {
                flag = a("datalayer", sqlitedatabase);
            }
            // Misplaced declaration of an exception variable
            catch (SQLiteDatabase sqlitedatabase)
            {
                try
                {
                    throw sqlitedatabase;
                }
                // Misplaced declaration of an exception variable
                catch (SQLiteDatabase sqlitedatabase)
                {
                    throw sqlitedatabase;
                }
            }
            if (flag)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            sqlitedatabase.execSQL(v.pD());
            if (!DataLayer.a)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            a(sqlitedatabase);
            return;
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        a(Context context, String s)
        {
            arg = v.this;
            super(context, s, null, 1);
        }
    }


    private class b
    {

        final String KP;
        final byte arj[];

        public String toString()
        {
            return (new StringBuilder()).append("KeyAndSerialized: key = ").append(KP).append(" serialized hash = ").append(Arrays.hashCode(arj)).toString();
        }

        b(String s, byte abyte0[])
        {
            KP = s;
            arj = abyte0;
        }
    }


    private class _cls2
        implements Runnable
    {

        final v arg;
        final DataLayer.c.a arh;

        public void run()
        {
            arh.h(v.a(arg));
        }

        _cls2(DataLayer.c.a a1)
        {
            arg = v.this;
            arh = a1;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final List are;
        final long arf;
        final v arg;

        public void run()
        {
            v.a(arg, are, arf);
        }

        _cls1(List list, long l)
        {
            arg = v.this;
            are = list;
            arf = l;
            super();
        }
    }

}
