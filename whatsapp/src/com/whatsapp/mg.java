// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            aoz, hu, ed, t0

class mg
    implements Runnable
{

    private static final String z[];
    final String a;
    final long b;
    final aoz c;

    mg(aoz aoz1, String s, long l)
    {
        c = aoz1;
        a = s;
        b = l;
        super();
    }

    public void run()
    {
        ed ed1 = aoz.f(c);
        ed1;
        JVM INSTR monitorenter ;
        hu hu1 = (hu)aoz.j(c).get(a);
        if (hu1 == null)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        int i;
        sqlitedatabase = aoz.f(c).getWritableDatabase();
        contentvalues = new ContentValues();
        contentvalues.put(z[3], Long.valueOf(b));
        String s = a;
        i = sqlitedatabase.update(z[4], contentvalues, z[2], new String[] {
            s
        });
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        contentvalues.put(z[0], a);
        sqlitedatabase.insert(z[1], null, contentvalues);
        hu.e(hu1, b);
        ed1;
        JVM INSTR monitorexit ;
        aoz.b(c).b(a);
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        Log.a(((Throwable) (obj)));
        c.r();
        throw new AssertionError(obj);
        obj;
        ed1;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
_L2:
        Log.a(((Throwable) (obj)));
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[5];
        obj = ">LV##0D@\b4\nCF\030";
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
                obj = "6AN\b\0169@\\\b";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ">LV##0D@\b4\nCF\030lj";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "9H\\\b\016'LN\030\0168L\\\01702Lp\b07EJ#81";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "6AN\b\0169@\\\b";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 215
    //                   1 222
    //                   2 229
    //                   3 236;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_236;
_L3:
        byte byte1 = 81;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 85;
          goto _L9
_L5:
        byte1 = 41;
          goto _L9
_L6:
        byte1 = 47;
          goto _L9
        byte1 = 124;
          goto _L9
    }
}
