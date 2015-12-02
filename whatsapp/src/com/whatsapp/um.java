// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            aoz, ed

class um
    implements Runnable
{

    private static final String z[];
    final aoz a;
    final boolean b;
    final String c;

    um(aoz aoz1, boolean flag, String s)
    {
        a = aoz1;
        b = flag;
        c = s;
        super();
    }

    public void run()
    {
        ed ed1 = aoz.f(a);
        ed1;
        JVM INSTR monitorenter ;
        int i;
        SQLiteDatabase sqlitedatabase = aoz.f(a).getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(z[2], Boolean.valueOf(b));
        String s = c;
        i = sqlitedatabase.update(z[0], contentvalues, z[3], new String[] {
            s
        });
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Log.e((new StringBuilder()).append(z[1]).append(c).toString());
        ed1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        Log.a(((Throwable) (obj)));
        a.r();
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
        byte byte1;
        int i;
        as = new String[4];
        obj = "e7o0yj6}0";
        byte1 = -1;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "k,i7Ri-kkGt<f-Pcpj-B&1a0\006s/j%Rc\177";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "g-m,Op:j";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "m:w\033Tc2a0CY5g \0339";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 38;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 6;
          goto _L9
_L5:
        byte0 = 95;
          goto _L9
_L6:
        byte0 = 14;
          goto _L9
        byte0 = 68;
          goto _L9
    }
}
