// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            App

class aur extends SQLiteOpenHelper
{

    private static final String z[];
    private final Context a;

    aur(Context context)
    {
        super(context, z[28], null, 2);
        a = context;
    }

    private File b()
    {
        File file = c();
        return new File(file.getPath(), (new StringBuilder()).append(file.getName()).append(z[14]).toString());
    }

    private File c()
    {
        return a.getDatabasePath(z[5]);
    }

    boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        close();
        Log.i(z[4]);
        flag = c().delete();
        b().delete();
        Log.b(z[3], null, new Object[] {
            Boolean.valueOf(flag)
        });
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public SQLiteDatabase getReadableDatabase()
    {
        int j = App.am;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = super.getReadableDatabase();
        }
        catch (SQLiteDatabaseCorruptException sqlitedatabasecorruptexception)
        {
            Log.w(z[8]);
            a();
            return super.getReadableDatabase();
        }
        catch (Object obj)
        {
            String s;
label0:
            {
                s = ((SQLiteException) (obj)).toString();
                try
                {
                    if (!s.contains(z[12]))
                    {
                        break label0;
                    }
                    Log.w(z[10]);
                    a();
                    obj = super.getReadableDatabase();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                return ((SQLiteDatabase) (obj));
            }
label1:
            {
                try
                {
                    if (!s.contains(z[11]))
                    {
                        break label1;
                    }
                    Log.w(z[6]);
                    obj = getWritableDatabase();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                return ((SQLiteDatabase) (obj));
            }
            throw obj;
        }
        catch (Object obj1)
        {
            Log.w(z[7]);
            StackTraceElement astacktraceelement[] = ((StackOverflowError) (obj1)).getStackTrace();
            int k = astacktraceelement.length;
            int i = 0;
label2:
            do
            {
label3:
                {
                    if (i >= k)
                    {
                        break label2;
                    }
                    StackTraceElement stacktraceelement = astacktraceelement[i];
                    try
                    {
                        if (!stacktraceelement.getMethodName().equals(z[9]))
                        {
                            break label3;
                        }
                        Log.w(z[13]);
                        a();
                        obj1 = super.getReadableDatabase();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        throw obj1;
                    }
                    return ((SQLiteDatabase) (obj1));
                }
                i++;
            } while (j == 0);
            throw obj1;
        }
        return sqlitedatabase;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        int j = App.am;
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = super.getWritableDatabase();
        }
        catch (SQLiteDatabaseCorruptException sqlitedatabasecorruptexception)
        {
            Log.w(z[26]);
            a();
            return super.getWritableDatabase();
        }
        catch (Object obj)
        {
label0:
            {
                try
                {
                    if (!((SQLiteException) (obj)).toString().contains(z[23]))
                    {
                        break label0;
                    }
                    Log.w(z[24]);
                    a();
                    obj = super.getWritableDatabase();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
                return ((SQLiteDatabase) (obj));
            }
            throw obj;
        }
        catch (Object obj1)
        {
            Log.w(z[22]);
            StackTraceElement astacktraceelement[] = ((StackOverflowError) (obj1)).getStackTrace();
            int k = astacktraceelement.length;
            int i = 0;
label1:
            do
            {
label2:
                {
                    if (i >= k)
                    {
                        break label1;
                    }
                    StackTraceElement stacktraceelement = astacktraceelement[i];
                    try
                    {
                        if (!stacktraceelement.getMethodName().equals(z[25]))
                        {
                            break label2;
                        }
                        Log.w(z[27]);
                        a();
                        obj1 = super.getWritableDatabase();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        throw obj1;
                    }
                    return ((SQLiteDatabase) (obj1));
                }
                i++;
            } while (j == 0);
            throw obj1;
        }
        return sqlitedatabase;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(z[1]);
        sqlitedatabase.execSQL(z[2]);
        sqlitedatabase.execSQL(z[0]);
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.i((new StringBuilder()).append(z[16]).append(i).append(z[15]).append(j).toString());
        onCreate(sqlitedatabase);
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Log.i((new StringBuilder()).append(z[17]).append(i).append(z[18]).append(j).toString());
        i;
        JVM INSTR tableswitch 1 1: default 60
    //                   1 75;
           goto _L1 _L2
_L1:
        try
        {
            Log.e(z[20]);
            onCreate(sqlitedatabase);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
_L2:
        sqlitedatabase.execSQL(z[21]);
        sqlitedatabase.execSQL(z[19]);
        if (App.am == 0) goto _L3; else goto _L1
        sqlitedatabase;
        throw sqlitedatabase;
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[29];
        obj = "jN`:Rl<p5OxI`[OgX`#&KnJ\fuLnz\022bvuK\037cQ<j5&ZyV\boFrVSd[sR\bc[CL\037/\022";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "mNj+&}]g7C\tUc[CqUv/U\to@\bu@sK\b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "jN`:Rl<q:DeY\005\bcZoL\024hZ<\r$oM<l5Rl[`)&yNl6G{E\0050Cp<d.RfUk8TlQ`5R\005~W\024qZyW$oM<q>^}0V\036e[yQ[RlDqWrFw@\025&}Y}/*Fo\005/CqH\t\031tFkV\036tvh\\\013c\tH`#R\005pD\017&{Yd7*EsK[Tl]iWgJ\177P\tgJe\005)ChP\t\013jH\177@$hHq@[RlDqWjHoQ$gJhL\rc\tUk/CnYwWr@q@\024s]<g4IeYd5*LdU\022tHhL\024h\tUk/CnYwR=";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "^yG\bcZoL\024hZhJ\tc\006x@\027c]y\b\037g]}G\032uL3W\036u\\pQF#K";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "^yG\bcZoL\024hZhJ\tc\006x@\027c]y\b\037g]}G\032uL";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "^yG$uLoV\022iGo\013\037d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "^yG\bcZoL\024hZhJ\tc\006oR\022rJtL\025a\004hJVq[uQ\032dEy";
                byte0 = 5;
                i = 6;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "^yG\bcZoL\024hZhJ\tc\006oQ\032eBsS\036tOpJ\fc[nJ\t";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "^yG\bcZoL\024hZhJ\tc\006\177J\tt\\lQTtLqJ\roG{";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "Frf\024t[iU\017oFr";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "^yG\bcZoL\024hZhJ\tc\006yK\030tPlQ\036b\006n@\026i_uK\034";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\\lB\tgMy\005\tcHx\b\024hEe\005\037g]}G\032uL";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "OuI\036&@o\005\036hJn\\\013rLx";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "^yG\bcZoL\024hZhJ\tc\006oQ\032eBsS\036tOpJ\fc[nJ\t)JsW\tsYh\n\tcDsS\022hN";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\004vJ\016tG}I";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\thJ[";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "^yG\bcZoL\024hZhJ\tc\006xJ\fhNnD\037c\tzW\024k\t";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "^yG\bcZoL\024hZhJ\tc\006iU\034tHx@[`[sH[";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\thJ[";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "hPq>T\tHd9Jl<V\036uZuJ\025u\t]a?&LdU\022tHhL\024h\tUk/CnYw";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "^yG\bcZoL\024hZhJ\tc\006iU\034tHx@[sGwK\024qG<J\027b\tj@\tu@sK";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "hPq>T\tHd9Jl<V\036uZuJ\025u\t]a?&]uH\036i\\h\0059IfP`:H";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "^yG\bcZoL\024hZhJ\tc\006oQ\032eBsS\036tOpJ\fc[nJ\t";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "OuI\036&@o\005\036hJn\\\013rLx";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "^yG\bcZoL\024hZhJ\tc\006yK\030tPlQ\036b\006n@\026i_uK\034";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "Frf\024t[iU\017oFr";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "^yG\bcZoL\024hZhJ\tc\006\177J\tt\\lQTtLqJ\roG{";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "^yG\bcZoL\024hZhJ\tc\006oQ\032eBsS\036tOpJ\fc[nJ\t)JsW\tsYh\n\tcDsS\022hN";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "^yG$uLoV\022iGo\013\037d";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 720
    //                   0 743
    //                   1 750
    //                   2 757
    //                   3 764;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_764;
_L3:
        byte byte1 = 6;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 41;
          goto _L9
_L5:
        byte1 = 28;
          goto _L9
_L6:
        byte1 = 37;
          goto _L9
        byte1 = 123;
          goto _L9
    }
}
