// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import org.whispersystems.K;
import org.whispersystems.aV;
import org.whispersystems.aW;
import org.whispersystems.ae;
import org.whispersystems.b;
import org.whispersystems.b8;
import org.whispersystems.b9;
import org.whispersystems.bD;

// Referenced classes of package com.whatsapp:
//            tt, DialogToastActivity

final class a3k extends SQLiteOpenHelper
{

    private static final String z[];

    public a3k(Context context)
    {
        super(context, z[0], null, 4);
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(z[27]);
    }

    private void a(SQLiteDatabase sqlitedatabase, long l)
    {
        sqlitedatabase.execSQL(z[24]);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[26], Long.valueOf(l));
        sqlitedatabase.update(z[25], contentvalues, null, null);
    }

    private void c(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(z[49]);
        sqlitedatabase.execSQL(z[50]);
    }

    public void b(SQLiteDatabase sqlitedatabase)
    {
        int i;
        i = tt.e;
        sqlitedatabase.beginTransaction();
        Object obj;
        obj = z[45];
        String s = z[48];
        String s1 = z[42];
        obj = sqlitedatabase.query(((String) (obj)), new String[] {
            s
        }, s1, new String[] {
            String.valueOf(-1)
        }, null, null, null);
        try
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                ((Cursor) (obj)).close();
                throw new SQLiteException(z[46]);
            }
            break MISSING_BLOCK_LABEL_100;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        int j;
        j = ((Cursor) (obj)).getInt(0);
        Log.i((new StringBuilder()).append(z[37]).append(j).toString());
        ((Cursor) (obj)).close();
        obj = new ContentValues();
        ((ContentValues) (obj)).put(z[39], Integer.valueOf((j + 200) % (K.a - 1) + 1));
        sqlitedatabase.update(z[36], ((ContentValues) (obj)), z[38], new String[] {
            String.valueOf(-1)
        });
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        Log.i(z[41]);
        Object obj1 = org.whispersystems.b.a(j, 200);
        ContentValues contentvalues = new ContentValues();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            aW aw = (aW)((Iterator) (obj1)).next();
            contentvalues.clear();
            contentvalues.put(z[44], Integer.valueOf(aw.a()));
            contentvalues.put(z[35], aw.b());
            contentvalues.put(z[47], Boolean.valueOf(false));
            sqlitedatabase.insertOrThrow(z[43], null, contentvalues);
        } while (i == 0);
        try
        {
            Log.i(z[40]);
            if (DialogToastActivity.g != 0)
            {
                tt.e = i + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        int i = tt.e;
        Log.i(z[21]);
        sqlitedatabase.execSQL(z[15]);
        sqlitedatabase.execSQL(z[11]);
        sqlitedatabase.execSQL(z[19]);
        sqlitedatabase.execSQL(z[12]);
        sqlitedatabase.execSQL(z[20]);
        sqlitedatabase.execSQL(z[17]);
        sqlitedatabase.execSQL(z[10]);
        Log.i(z[7]);
        Object obj = org.whispersystems.b.a();
        ContentValues contentvalues = new ContentValues();
        long l = System.currentTimeMillis() / 1000L;
        contentvalues.put(z[3], Integer.valueOf(-1));
        contentvalues.put(z[4], Integer.valueOf(org.whispersystems.b.a(true)));
        contentvalues.put(z[13], ((aV) (obj)).a().b());
        contentvalues.put(z[6], ((aV) (obj)).b().a());
        contentvalues.put(z[18], Integer.valueOf(org.whispersystems.b.a(K.a - 1) + 1));
        contentvalues.put(z[9], Long.valueOf(l));
        sqlitedatabase.insertOrThrow(z[23], null, contentvalues);
        Log.i(z[14]);
        try
        {
            obj = org.whispersystems.b.a(((aV) (obj)), 0);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw new RuntimeException(sqlitedatabase);
        }
        contentvalues = new ContentValues();
        contentvalues.put(z[8], Integer.valueOf(0));
        contentvalues.put(z[22], Long.valueOf(l));
        contentvalues.put(z[5], ((bD) (obj)).d());
        sqlitedatabase.insertOrThrow(z[1], null, contentvalues);
        Log.i(z[16]);
        b(sqlitedatabase);
        Log.i(z[2]);
        if (i != 0)
        {
            DialogToastActivity.g++;
        }
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            super.onOpen(sqlitedatabase);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                sqlitedatabase.enableWriteAheadLogging();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        try
        {
            Log.i((new StringBuilder()).append(z[33]).append(i).append(z[34]).append(j).toString());
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
        if (j == 4)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        throw new SQLiteException((new StringBuilder()).append(z[29]).append(i).append(z[32]).append(j).toString());
        long l = System.currentTimeMillis() / 1000L;
        i;
        JVM INSTR tableswitch 1 3: default 128
    //                   1 175
    //                   2 182
    //                   3 187;
           goto _L1 _L2 _L3 _L4
_L1:
        try
        {
            throw new SQLiteException((new StringBuilder()).append(z[30]).append(i).append(z[28]).append(j).toString());
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
_L2:
        int k;
        try
        {
            a(sqlitedatabase, l);
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw sqlitedatabase;
        }
_L3:
        c(sqlitedatabase);
_L4:
        a(sqlitedatabase);
        k = tt.e;
        if (k == 0)
        {
            Log.i(z[31]);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[51];
        obj = "N#\02761[7V><";
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
                obj = "\\2\0374;K\004\b(;D>\001)";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "N#\02761[7X=;A>\n;*J?Xhn\037{\b(;\0170\035#-";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "]>\0333.F>\026.\001F?";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "]>\0373-[)\031.7@5'3:";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "]>\0335,K";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "_)\021,?[>'1;V";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "L)\035;*J?X;&@7\027.2\017?\031.?M:\013?~Y>\n)7@5Xn";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "_)\0351;V\004\021>";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "[2\025?-[:\025*";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "l\t=\033\nj{,\033\034c\036X);A?\035(\001D>\001)~\007\004\021>~f\025,\037\031j\tX\n\ff\0269\b\007\017\020=\003~n\016,\025\027a\030*\037\023j\025,v~\\>\026>;]\004\023?'p2\034z\nj\003,z\013a\022)\017\033\017\0257\016~a\0164\026r\017(\0354:J)'1;V\004\n?=@)\034z\034c\024:z\020`\017X\024\013c\027Q";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "l\t=\033\nj{,\033\034c\036X*,J0\035#-\017s'3:\017\0226\016\033h\036*z\016}\0225\033\fv{3\037\007\017\032-\016\021f\025;\b\033b\0366\016r\017+\n?5J\"'3:\017\0226\016\033h\036*z\013a\022)\017\033\003{\013?0[\004\f5\001\\>\n,;]{:\025\021c\0369\024r\017)\03591]?X\030\022`\031Q";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "l\t=\033\nj{,\033\034c\036X)7H5\035>\001_)\0351;V(Xr\001F?X\023\020{\036?\037\f\017\013*\023\023n\t!z\025j\002X\033\013{\0241\024\035}\0365\037\020{wX*,J0\035#\001F?X\023\020{\036?\037\f\017\0166\023\017z\036Tz*F6\035)*N6\bz\027a\017=\035\033}wX(;L4\n>~m\0277\030w";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "_.\03267L\004\023?'";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "N#\02761[7X30\\>\n.;K{\021>;A/\021.'\0170\035#~_:\021(";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "l\t=\033\nj{,\033\034c\036X3:J5\f3*F>\013zvp2\034z\027a\017=\035\033}{(\b\027b\032*\003~d\036!z\037z\0177\023\020l\t=\027\033a\017Tz,J8\021*7J5\f\0057K{1\024\nj\034=\b~z\0251\013\013jwX(;H2\013.,N/\02150p2\034z\027a\017=\035\033}wX*+M7\0219\001D>\001z\034c\024:v~_)\021,?[>'1;V{:\026\021mwX4;W/'*,J0\035#\001F?X\023\020{\036?\037\f\003{\f33J(\f;3_{1\024\nj\034=\bw";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "N#\02761[7X30\\>\n.;K{\01339A>\034z.]>\023?'";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "l\t=\033\nj{-\024\027~\016=z\027a\037=\002~B>\013)?H>'8?\\>'1;V\004\021>&\017\0246z3J(\013;9J\004\032;-J\004\023?'\017s\025)9p0\035#\001]>\0255*J\004\0223:\003{\025)9p0\035#\001I)\0277\001B>Tz3\\<'1;V\004\021>w";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "A>\000.\001_)\0351;V\004\021>";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "l\t=\033\nj{,\033\034c\036X);\\(\02150\\{P\0057K{1\024\nj\034=\b~\177\t1\027\037}\002X\021\033v{9\017\n`\0226\031\fj\026=\024\n\003{\n?=F+\021?0[\004\021>~f\025,\037\031j\tX\017\020f\n-\037r\017)\03591]?X\030\022`\031Tz*F6\035)*N6\bz\027a\017=\035\033}r";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "l\t=\033\nj{,\033\034c\036X7;\\(\031=;p9\031);p0\035#~\007\004\021>~f\025,\037\031j\tX\n\ff\0269\b\007\017\020=\003~n\016,\025\027a\030*\037\023j\025,v~B(\037\0055J\"'(;B4\f?\001E2\034z\nj\003,z\020`\017X\024\013c\027Tz3\\<'1;V\004\036(1B\004\025?~m\0247\026\033n\025X\024\021{{6\017\022cwX7-H\004\023?'p2\034z\nj\003,z\020`\017X\024\013c\027Tz2N(\f\005?C2\033?\001M:\013?\001D>\001z\034c\024:z\020`\017X\024\013c\027Tz*F6\035)*N6\bz\027a\017=\035\033}r";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "L)\035;*F5\037z?W4\0245*C{\034;*N9\031);\017-\035(-F4\026zj";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "[2\025?-[:\025*";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "F?\0354*F/\021?-";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "n\027,\037\f\017\0179\030\022j{\013?-\\2\0274-\017\032<\036~l\0244\017\023a{\f33J(\f;3_{1\024\nj\034=\b";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\\>\013)7@5\013";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "[2\025?-[:\025*";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "l\t=\033\nj{,\033\034c\036X);A?\035(\001D>\001)~\007\004\021>~f\025,\037\031j\tX\n\ff\0269\b\007\017\020=\003~n\016,\025\027a\030*\037\023j\025,v~\\>\026>;]\004\023?'p2\034z\nj\003,z\013a\022)\017\033\017\0257\016~a\0164\026r\017(\0354:J)'1;V\004\n?=@)\034z\034c\024:z\020`\017X\024\013c\027Q";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\017/\027z";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "z5\02341X5X/.H)\031>;\017?\035)*F5\031.7@5X,;](\02150\025{";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "z5\02341X5X/.H)\031>;\017=\n53\017";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "N#\02761[7X/.H)\031>;K{\013/=L>\013)8Z7\024#";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\017vFz";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "N#\02761[7X/.H)\031>7A<X><\017=\n53\017";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\017/\027z";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "]>\0335,K";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "F?\0354*F/\021?-";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "N#\02761[7X=;A>\n;*F5\037z.]>\023?'\0179\031.=G{\013.?]/\02149\017=\n53\017";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "]>\0333.F>\026.\001F?Xg~\020";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "A>\000.\001_)\0351;V\004\021>";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "N#\02761[7X=;A>\n;*J?Xhn\037{\026?)\017+\n?5J\"\013z?A?X(;L4\n>;K{\f2;B{\0214~[3\035z:M";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = "N#\02761[7X=;A>\n;*F5\037zl\037kX4;X{\b(;D>\001)~N5\034z,J8\027(:J?X.6J6X30\017/\020?~K9";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "]>\0333.F>\026.\001F?Xg~\020";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "_)\0351;V(";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "_)\0351;V\004\021>";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "F?\0354*F/\021?-";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "b2\013)7A<X?0[)\001z8@)X);C=X30\0172\034?0[2\f3;\\{\f;<C>";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                obj = "\\>\026.\001[4');]-\035(";
                byte0 = 46;
                i = 47;
                break;

            case 46: // '.'
                as1[i] = ((String) (obj));
                i = 48;
                obj = "A>\000.\001_)\0351;V\004\021>";
                byte0 = 47;
                break;

            case 47: // '/'
                as1[i] = ((String) (obj));
                i = 49;
                obj = "l\t=\033\nj{,\033\034c\036X7;\\(\031=;p9\031);p0\035#~\007\004\021>~f\025,\037\031j\tX\n\ff\0269\b\007\017\020=\003~n\016,\025\027a\030*\037\023j\025,v~B(\037\0055J\"'(;B4\f?\001E2\034z\nj\003,z\020`\017X\024\013c\027Tz3\\<'1;V\004\036(1B\004\025?~m\0247\026\033n\025X\024\021{{6\017\022cwX7-H\004\023?'p2\034z\nj\003,z\020`\017X\024\013c\027Tz2N(\f\005?C2\033?\001M:\013?\001D>\001z\034c\024:z\020`\017X\024\013c\027Tz*F6\035)*N6\bz\027a\017=\035\033}r";
                byte0 = 48;
                break;

            case 48: // '0'
                as1[i] = ((String) (obj));
                i = 50;
                obj = "l\t=\033\nj{-\024\027~\016=z\027a\037=\002~B>\013)?H>'8?\\>'1;V\004\021>&\017\0246z3J(\013;9J\004\032;-J\004\023?'\017s\025)9p0\035#\001]>\0255*J\004\0223:\003{\025)9p0\035#\001I)\0277\001B>Tz3\\<'1;V\004\021>w";
                byte0 = 49;
                break;

            case 49: // '1'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1204
    //                   0 1227
    //                   1 1234
    //                   2 1241
    //                   3 1248;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1248;
_L3:
        byte byte1 = 94;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 47;
          goto _L9
_L5:
        byte1 = 91;
          goto _L9
_L6:
        byte1 = 120;
          goto _L9
        byte1 = 90;
          goto _L9
    }
}
