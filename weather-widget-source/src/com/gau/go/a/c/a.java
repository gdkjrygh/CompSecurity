// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.c;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.gau.go.a.f.e;
import java.util.ArrayList;

// Referenced classes of package com.gau.go.a.c:
//            e, g, f, d, 
//            c, b

public class a extends SQLiteOpenHelper
{

    public static String A = "intervaltime";
    public static String B = "bn";
    public static String C = "updatetime";
    public static String D = "network";
    public static String E = "priority";
    private static String F;
    private static String G;
    public static String a;
    public static String b;
    public static String c = "statistics";
    public static String d = "funid";
    public static String e = "id";
    public static String f = "channel";
    public static String g = "ispay";
    public static String h = "productid";
    public static String i = "data";
    public static String j = "functionid";
    public static String k = "sender";
    public static String l = "optioncode";
    public static String m = "optionresult";
    public static String n = "entrance";
    public static String o = "typeid";
    public static String p = "position";
    public static String q = "url";
    public static String r = "opcode";
    public static String s = "nrootinfo";
    public static String t = "isnew";
    public static String u = "key";
    public static String v = "time";
    public static String w = "isold";
    public static String x = "funid";
    public static String y = "startime";
    public static String z = "duration";
    private boolean H;
    private Context I;

    public a(Context context)
    {
        super(context, "gostatistics_sdk.db", null, 6);
        H = true;
        I = context;
    }

    private void a(SQLiteDatabase sqlitedatabase, String s1, String s2, String s3, String s4)
    {
        if (a(sqlitedatabase, s1, s2))
        {
            break MISSING_BLOCK_LABEL_162;
        }
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL((new StringBuilder()).append("ALTER TABLE ").append(s1).append(" ADD COLUMN ").append(s2).append(" ").append(s3).append(";").toString());
        String s5;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        s5 = s4;
        if (s3.equals("text"))
        {
            s5 = (new StringBuilder()).append("'").append(s4).append("'").toString();
        }
        sqlitedatabase.execSQL((new StringBuilder()).append("update ").append(s1).append(" set ").append(s2).append(" = ").append(s5).toString());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s1;
        s1.printStackTrace();
        sqlitedatabase.endTransaction();
        return;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
    }

    private boolean a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        a(sqlitedatabase, c, q, "text", null);
        a(sqlitedatabase, c, r, "numeric", String.valueOf(3));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return false;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    private boolean a(SQLiteDatabase sqlitedatabase, String s1, String s2)
    {
        Object obj = null;
        sqlitedatabase = sqlitedatabase.query(s1, new String[] {
            s2
        }, null, null, null, null, null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        int i1 = sqlitedatabase.getColumnIndex(s2);
        if (i1 < 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L8:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
        sqlitedatabase;
        sqlitedatabase = null;
_L6:
        com.gau.go.a.f.e.a("StatisticsManager", "isExistColumnInTable has exception");
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
            return false;
        } else
        {
            return false;
        }
        sqlitedatabase;
        s1 = obj;
_L5:
        if (s1 != null)
        {
            s1.close();
        }
        throw sqlitedatabase;
        s2;
        s1 = sqlitedatabase;
        sqlitedatabase = s2;
        continue; /* Loop/switch isn't completed */
        s2;
        s1 = sqlitedatabase;
        sqlitedatabase = s2;
        if (true) goto _L5; else goto _L4
_L4:
        s1;
        if (true) goto _L6; else goto _L2
_L2:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static boolean a(a a1, SQLiteDatabase sqlitedatabase)
    {
        return a1.a(sqlitedatabase);
    }

    private boolean b(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        a(sqlitedatabase, c, s, "numeric", String.valueOf(0));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return false;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    static boolean b(a a1, SQLiteDatabase sqlitedatabase)
    {
        return a1.b(sqlitedatabase);
    }

    private boolean c(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        a(sqlitedatabase, c, t, "numeric", String.valueOf(0));
        a(sqlitedatabase, c, u, "text", String.valueOf(-1));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return false;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    static boolean c(a a1, SQLiteDatabase sqlitedatabase)
    {
        return a1.c(sqlitedatabase);
    }

    private boolean d(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL(F);
        sqlitedatabase.execSQL(G);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return false;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    static boolean d(a a1, SQLiteDatabase sqlitedatabase)
    {
        return a1.d(sqlitedatabase);
    }

    private boolean e(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        a(sqlitedatabase, b, E, "numeric", String.valueOf(0));
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return true;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return false;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    static boolean e(a a1, SQLiteDatabase sqlitedatabase)
    {
        return a1.e(sqlitedatabase);
    }

    public int a(String s1, ContentValues contentvalues, String s2, String as[])
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        int i1;
        try
        {
            i1 = sqlitedatabase.update(s1, contentvalues, s2, as);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0;
        }
        return i1;
    }

    public int a(String s1, String s2, String as[])
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        int i1;
        try
        {
            i1 = sqlitedatabase.delete(s1, s2, as);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0;
        }
        return i1;
    }

    public long a(String s1, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        long l1;
        try
        {
            l1 = sqlitedatabase.insert(s1, null, contentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return 0L;
        }
        return l1;
    }

    public Cursor a(String s1, String as[], String s2, String as1[], String s3)
    {
        getReadableDatabase();
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
_L2:
        SQLiteException sqliteexception;
        try
        {
            s1 = sqlitedatabase.query(s1, as, s2, as1, null, null, s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return s1;
        sqliteexception;
        sqliteexception = getWritableDatabase();
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        getWritableDatabase();
        throw s1;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        sqlitedatabase.execSQL(F);
        sqlitedatabase.execSQL(G);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Object obj;
        obj;
        ((SQLException) (obj)).printStackTrace();
        sqlitedatabase.endTransaction();
        return;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
    {
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
    {
        if (i1 < 1 || i1 > j1 || j1 > 6)
        {
            com.gau.go.a.f.e.a("StatisticsManager", (new StringBuilder()).append("onUpgrade() false oldVersion = ").append(i1).append(", newVersion = ").append(j1).toString());
            return;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(new com.gau.go.a.c.e(this));
        arraylist.add(new g(this));
        arraylist.add(new f(this));
        arraylist.add(new d(this));
        arraylist.add(new c(this));
        i1--;
        do
        {
label0:
            {
                if (i1 < j1 - 1)
                {
                    H = ((b)arraylist.get(i1)).a(sqlitedatabase);
                    if (H)
                    {
                        break label0;
                    }
                    if (sqlitedatabase != null)
                    {
                        sqlitedatabase.close();
                    }
                    I.deleteDatabase("gostatistics_sdk.db");
                    getWritableDatabase();
                }
                arraylist.clear();
                return;
            }
            i1++;
        } while (true);
    }

    static 
    {
        a = "statistics_new";
        b = "ctrl_info";
        F = (new StringBuilder()).append("create table IF NOT EXISTS ").append(a).append("(").append("id text, ").append("funid numeric, ").append("data text, ").append("time text, ").append("opcode numeric,").append("isold boolean, ").append("network numeric").append(")").toString();
        G = (new StringBuilder()).append("create table IF NOT EXISTS ").append(b).append("(").append("funid numeric, ").append("startime long, ").append("duration long, ").append("intervaltime long, ").append("bn text, ").append("updatetime text, ").append("network numeric, ").append("priority numeric").append(")").toString();
    }
}
