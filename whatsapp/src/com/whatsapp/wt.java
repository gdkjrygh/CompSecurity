// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            aoz, ed, hu

class wt
    implements Runnable
{

    private static final String z[];
    final long a;
    final hu b;
    final aoz c;
    final String d;

    wt(aoz aoz1, long l, String s, hu hu1)
    {
        c = aoz1;
        a = l;
        d = s;
        b = hu1;
        super();
    }

    public void run()
    {
        ed ed1 = aoz.f(c);
        ed1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        int i;
        sqlitedatabase = aoz.f(c).getWritableDatabase();
        contentvalues = new ContentValues();
        contentvalues.put(z[4], Long.valueOf(a));
        String s = d;
        i = sqlitedatabase.update(z[0], contentvalues, z[2], new String[] {
            s
        });
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        contentvalues.put(z[1], d);
        sqlitedatabase.insert(z[3], null, contentvalues);
        hu.a(b, a);
        ed1;
        JVM INSTR monitorexit ;
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
        obj = "$C,\n)+B>\n";
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
                obj = ",N4!\004\"F\"\n\023\030A$\032";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",N4!\004\"F\"\n\023\030A$\032Kx";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "$C,\n)+B>\n";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "+J>\n)5N,\032)5N.\033\0377_\022\r\023)_\022\023\0234X,\031\023\030_,\034\032\"t$\032";
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
        byte byte1 = 118;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 71;
          goto _L9
_L5:
        byte1 = 43;
          goto _L9
_L6:
        byte1 = 77;
          goto _L9
        byte1 = 126;
          goto _L9
    }
}
