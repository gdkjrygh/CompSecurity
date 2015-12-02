// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            aur, App, fz

public class oy
{

    private static final Object a;
    private static oy c;
    private static final String z[];
    private aur b;

    private oy(Context context)
    {
        b = new aur(context);
    }

    public static oy a(Context context)
    {
        if (c == null)
        {
            synchronized (a)
            {
                if (c == null)
                {
                    c = new oy(context);
                }
            }
        }
        return c;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a()
    {
        b.getWritableDatabase().delete(z[22], null, null);
    }

    public void a(String s)
    {
        b.getWritableDatabase().delete(z[23], z[24], new String[] {
            s
        });
    }

    public void a(String s, double d, double d1, double d2, 
            String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[3], Double.valueOf(d));
        contentvalues.put(z[0], Double.valueOf(d1));
        contentvalues.put(z[4], Double.valueOf(d2));
        contentvalues.put(z[2], s1);
        b.getWritableDatabase().update(z[1], contentvalues, z[5], new String[] {
            s
        });
    }

    public void a(String s, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[33], Long.valueOf(l));
        b.getWritableDatabase().update(z[35], contentvalues, z[34], new String[] {
            s
        });
    }

    public void a(String s, String s1, String s2, String s3, String s4, boolean flag)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[29], s);
        contentvalues.put(z[25], s1);
        contentvalues.put(z[31], s2);
        contentvalues.put(z[28], s3);
        contentvalues.put(z[32], s4);
        contentvalues.put(z[26], Long.valueOf(System.currentTimeMillis()));
        contentvalues.put(z[30], Boolean.valueOf(flag));
        b.getWritableDatabase().replaceOrThrow(z[27], null, contentvalues);
    }

    public List b()
    {
        int i = App.am;
        ArrayList arraylist = new ArrayList();
        Cursor cursor = b.getReadableDatabase().query(z[14], new String[] {
            z[9], z[16], z[11], z[12], z[20], z[18], z[19], z[10], z[17], z[13], 
            z[15], z[21]
        }, null, null, null, null, null);
        do
        {
            if (cursor == null || !cursor.moveToNext())
            {
                break;
            }
            fz fz1 = new fz();
            fz1.f = cursor.getString(0);
            fz1.g = cursor.getString(1);
            fz1.j = cursor.getString(2);
            fz1.b = cursor.getString(3);
            fz1.a = cursor.getString(4);
            fz1.e = cursor.getDouble(5);
            fz1.d = cursor.getDouble(6);
            fz1.i = cursor.getDouble(7);
            fz1.l = cursor.getString(8);
            fz1.k = cursor.getLong(9);
            boolean flag;
            if (cursor.getInt(10) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fz1.h = flag;
            fz1.c = cursor.getLong(11);
            arraylist.add(fz1);
        } while (i == 0);
        return arraylist;
    }

    public void b(String s, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[8], Long.valueOf(l));
        b.getWritableDatabase().update(z[6], contentvalues, z[7], new String[] {
            s
        });
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[36];
        obj = "\005\031\"";
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
                obj = "\032\023?\013\005\006\030?";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031\032-\033\t6\030-\025\t";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\005\0278";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\b\025/\r\036\b\0255";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\013\004#\017\037\f\004\023\021\bIKlG";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\013\004#\017\037\f\004\023\021\bIKlG";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\005\027?\f3\b\0258\021\032\f";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\013\004#\017\037\f\004\023\021\b";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\b\025/\r\036\b\0255";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\035\031'\035\002";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\006\005";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\005\027?\f3\b\0258\021\032\f";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "\035\037!\035\003\034\002";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "\032\023/\n\t\035";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "\031\032-\033\t6\030-\025\t";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "\005\0278";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "\005\031\"";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\013\004#\017\037\f\004\023\f\025\031\023";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "\f\016<\021\036\b\002%\027\002";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "\013\004#\017\037\f\004\023\021\bIKlG";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "\032\023/\n\t\035";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "\005\027?\f3\b\0258\021\032\f";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "\006\005";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "\013\004#\017\037\f\004\023\021\b";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "\035\037!\035\003\034\002";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "\035\031'\035\002";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "\013\004#\017\037\f\004\023\f\025\031\023";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "\f\016<\021\036\b\002%\027\002";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "\013\004#\017\037\f\004\023\021\bIKlG";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "\032\023?\013\005\006\030?";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                z = as;
                a = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 884
    //                   0 907
    //                   1 914
    //                   2 921
    //                   3 928;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_928;
_L3:
        byte byte1 = 108;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 105;
          goto _L9
_L5:
        byte1 = 118;
          goto _L9
_L6:
        byte1 = 76;
          goto _L9
        byte1 = 120;
          goto _L9
    }
}
