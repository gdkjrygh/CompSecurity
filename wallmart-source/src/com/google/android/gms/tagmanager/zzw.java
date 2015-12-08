// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.gms.internal.zzlm;
import com.google.android.gms.internal.zzlo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzal

class zzw
    implements DataLayer.zzc
{
    class zza extends SQLiteOpenHelper
    {

        final zzw zzaPP;

        private boolean zza(String s, SQLiteDatabase sqlitedatabase)
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
                sqlitedatabase.close();
            }
            return flag;
            sqlitedatabase;
            sqlitedatabase = null;
_L4:
            zzbg.zzaE((new StringBuilder()).append("Error querying for table ").append(s).toString());
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return false;
            s;
            sqlitedatabase = obj;
_L2:
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
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

        private void zzc(SQLiteDatabase sqlitedatabase)
        {
            Object obj;
            sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            obj = new HashSet();
            String as[] = sqlitedatabase.getColumnNames();
            int i = 0;
_L2:
            if (i >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Set) (obj)).add(as[i]);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            if (!((Set) (obj)).remove("key") || !((Set) (obj)).remove("value") || !((Set) (obj)).remove("ID") || !((Set) (obj)).remove("expires"))
            {
                throw new SQLiteException("Database column missing");
            }
            break MISSING_BLOCK_LABEL_122;
            obj;
            sqlitedatabase.close();
            throw obj;
            if (!((Set) (obj)).isEmpty())
            {
                throw new SQLiteException("Database has extra columns");
            } else
            {
                return;
            }
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
            zzw.zzb(zzaPP).getDatabasePath("google_tagmanager.db").delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            zzal.zzbj(sqlitedatabase.getPath());
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
            if (!zza("datalayer", sqlitedatabase))
            {
                sqlitedatabase.execSQL(zzw.zzzW());
                return;
            } else
            {
                zzc(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        zza(Context context, String s)
        {
            zzaPP = zzw.this;
            super(context, s, null, 1);
        }
    }

    private static class zzb
    {

        final byte zzaPS[];
        final String zztP;

        public String toString()
        {
            return (new StringBuilder()).append("KeyAndSerialized: key = ").append(zztP).append(" serialized hash = ").append(Arrays.hashCode(zzaPS)).toString();
        }

        zzb(String s, byte abyte0[])
        {
            zztP = s;
            zzaPS = abyte0;
        }
    }


    private static final String zzaPJ = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
        "datalayer", "ID", "key", "value", "expires"
    });
    private final Context mContext;
    private final Executor zzaPK;
    private zza zzaPL;
    private int zzaPM;
    private zzlm zzpO;

    public zzw(Context context)
    {
        this(context, zzlo.zzpN(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
    }

    zzw(Context context, zzlm zzlm1, String s, int i, Executor executor)
    {
        mContext = context;
        zzpO = zzlm1;
        zzaPM = i;
        zzaPK = executor;
        zzaPL = new zza(mContext, s);
    }

    private byte[] zzC(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(obj);
        obj = bytearrayoutputstream.toByteArray();
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
        return ((byte []) (obj));
        obj;
        objectoutputstream = null;
_L6:
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
        return null;
        obj;
        return null;
        obj;
        objectoutputstream = null;
_L4:
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
_L2:
        throw obj;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        return ((byte []) (obj));
    }

    private void zzS(long l)
    {
        SQLiteDatabase sqlitedatabase = zzeG("Error opening database for deleteOlderThan.");
        if (sqlitedatabase == null)
        {
            return;
        }
        try
        {
            int i = sqlitedatabase.delete("datalayer", "expires <= ?", new String[] {
                Long.toString(l)
            });
            zzbg.v((new StringBuilder()).append("Deleted ").append(i).append(" expired items").toString());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            zzbg.zzaE("Error deleting old entries.");
        }
    }

    static List zza(zzw zzw1)
    {
        return zzw1.zzzS();
    }

    static void zza(zzw zzw1, String s)
    {
        zzw1.zzeF(s);
    }

    static void zza(zzw zzw1, List list, long l)
    {
        zzw1.zzb(list, l);
    }

    static Context zzb(zzw zzw1)
    {
        return zzw1.mContext;
    }

    private void zzb(List list, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = zzpO.currentTimeMillis();
        zzS(l1);
        zzjd(list.size());
        zzc(list, l1 + l);
        zzzV();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        zzzV();
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void zzc(List list, long l)
    {
        SQLiteDatabase sqlitedatabase = zzeG("Error opening database for writeEntryToDatabase.");
        if (sqlitedatabase != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                zzb zzb1 = (zzb)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("expires", Long.valueOf(l));
                contentvalues.put("key", zzb1.zztP);
                contentvalues.put("value", zzb1.zzaPS);
                sqlitedatabase.insert("datalayer", null, contentvalues);
            }
        }
    }

    private void zze(String as[])
    {
        SQLiteDatabase sqlitedatabase;
        if (as != null && as.length != 0)
        {
            if ((sqlitedatabase = zzeG("Error opening database for deleteEntries.")) != null)
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
                    zzbg.zzaE((new StringBuilder()).append("Error deleting entries ").append(Arrays.toString(as)).toString());
                }
                return;
            }
        }
    }

    private void zzeF(String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = zzeG("Error opening database for clearKeysWithPrefix.");
        if (sqlitedatabase == null)
        {
            return;
        }
        int i = sqlitedatabase.delete("datalayer", "key = ? OR key LIKE ?", new String[] {
            s, (new StringBuilder()).append(s).append(".%").toString()
        });
        zzbg.v((new StringBuilder()).append("Cleared ").append(i).append(" items").toString());
        zzzV();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        zzbg.zzaE((new StringBuilder()).append("Error deleting entries with key prefix: ").append(s).append(" (").append(sqliteexception).append(").").toString());
        zzzV();
        return;
        s;
        zzzV();
        throw s;
    }

    private SQLiteDatabase zzeG(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = zzaPL.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            zzbg.zzaE(s);
            return null;
        }
        return sqlitedatabase;
    }

    private void zzjd(int i)
    {
        i = (zzzU() - zzaPM) + i;
        if (i > 0)
        {
            List list = zzje(i);
            zzbg.zzaD((new StringBuilder()).append("DataLayer store full, deleting ").append(list.size()).append(" entries to make room.").toString());
            zze((String[])list.toArray(new String[0]));
        }
    }

    private List zzje(int i)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (i <= 0)
        {
            zzbg.zzaE("Invalid maxEntries specified. Skipping.");
            return arraylist;
        }
        obj = zzeG("Error opening database for peekEntryIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "ID"
        });
        String s = Integer.toString(i);
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
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L3:
        return arraylist;
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
_L6:
        obj = obj1;
        zzbg.zzaE((new StringBuilder()).append("Error in peekEntries fetching entryIds: ").append(sqliteexception.getMessage()).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
          goto _L3
        Exception exception;
        exception;
        obj = null;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        sqliteexception;
          goto _L6
    }

    private List zzp(List list)
    {
        ArrayList arraylist = new ArrayList();
        zzb zzb1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new DataLayer.zza(zzb1.zztP, zzq(zzb1.zzaPS))))
        {
            zzb1 = (zzb)list.next();
        }

        return arraylist;
    }

    private Object zzq(byte abyte0[])
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        abyte0 = new ObjectInputStream(bytearrayinputstream);
        Object obj = abyte0.readObject();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return obj;
        abyte0;
        abyte0 = null;
_L8:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return null;
        abyte0;
        return null;
        abyte0;
        abyte0 = null;
_L6:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return null;
        abyte0;
        return null;
        obj;
        abyte0 = null;
_L4:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        abyte0.close();
        bytearrayinputstream.close();
_L2:
        throw obj;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        abyte0;
        return obj;
    }

    private List zzq(List list)
    {
        ArrayList arraylist = new ArrayList();
        DataLayer.zza zza1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new zzb(zza1.zztP, zzC(zza1.zzID))))
        {
            zza1 = (DataLayer.zza)list.next();
        }

        return arraylist;
    }

    private List zzzS()
    {
        List list;
        zzS(zzpO.currentTimeMillis());
        list = zzp(zzzT());
        zzzV();
        return list;
        Exception exception;
        exception;
        zzzV();
        throw exception;
    }

    private List zzzT()
    {
        Object obj;
        Object obj1;
        obj1 = zzeG("Error opening database for loadSerialized.");
        obj = new ArrayList();
        if (obj1 == null)
        {
            return ((List) (obj));
        }
        obj1 = ((SQLiteDatabase) (obj1)).query("datalayer", new String[] {
            "key", "value"
        }, null, null, null, null, "ID", null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            ((List) (obj)).add(new zzb(((Cursor) (obj1)).getString(0), ((Cursor) (obj1)).getBlob(1)));
        }
        break MISSING_BLOCK_LABEL_99;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        ((Cursor) (obj1)).close();
        return ((List) (obj));
    }

    private int zzzU()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        int j;
        obj = null;
        cursor = null;
        i = 0;
        j = 0;
        obj1 = zzeG("Error opening database for getNumStoredEntries.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from datalayer", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        i = (int)l;
        j = i;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        zzbg.zzaE("Error getting numStoredEntries");
        if (cursor == null) goto _L1; else goto _L4
_L4:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    private void zzzV()
    {
        try
        {
            zzaPL.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            return;
        }
    }

    static String zzzW()
    {
        return zzaPJ;
    }

    public void zza(DataLayer.zzc.zza zza1)
    {
        zzaPK.execute(new Runnable(zza1) {

            final zzw zzaPP;
            final DataLayer.zzc.zza zzaPQ;

            public void run()
            {
                zzaPQ.zzo(zzw.zza(zzaPP));
            }

            
            {
                zzaPP = zzw.this;
                zzaPQ = zza1;
                super();
            }
        });
    }

    public void zza(List list, long l)
    {
        list = zzq(list);
        zzaPK.execute(new Runnable(list, l) {

            final List zzaPN;
            final long zzaPO;
            final zzw zzaPP;

            public void run()
            {
                zzw.zza(zzaPP, zzaPN, zzaPO);
            }

            
            {
                zzaPP = zzw.this;
                zzaPN = list;
                zzaPO = l;
                super();
            }
        });
    }

    public void zzeE(String s)
    {
        zzaPK.execute(new Runnable(s) {

            final zzw zzaPP;
            final String zzaPR;

            public void run()
            {
                zzw.zza(zzaPP, zzaPR);
            }

            
            {
                zzaPP = zzw.this;
                zzaPR = s;
                super();
            }
        });
    }

}
