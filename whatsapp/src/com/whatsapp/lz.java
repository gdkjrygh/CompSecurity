// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.whatsapp:
//            aoz, ed, as_

class lz
    implements Runnable
{

    private static final String z[];
    final String a;
    final aoz b;
    final as_ c;

    lz(aoz aoz1, String s, as_ as_1)
    {
        b = aoz1;
        a = s;
        c = as_1;
        super();
    }

    public void run()
    {
        boolean flag = true;
        ed ed1 = aoz.f(b);
        ed1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        ContentValues contentvalues;
        String s1;
        sqlitedatabase = aoz.f(b).getWritableDatabase();
        contentvalues = new ContentValues(4);
        contentvalues.put(z[0], a);
        s1 = z[4];
        if (!c.a()) goto _L2; else goto _L1
_L1:
        String s = "";
_L4:
        contentvalues.put(s1, s);
        s = z[2];
        Exception exception;
        int i;
        if (c.d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = z[5];
        if (c.a)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put(s, Integer.valueOf(i));
        s = a;
        s1 = c.b;
        if (sqlitedatabase.update(z[3], contentvalues, z[6], new String[] {
    s, s1
}) == 0)
        {
            sqlitedatabase.insert(z[1], null, contentvalues);
        }
        ed1;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = c.b;
        if (true) goto _L4; else goto _L3
_L3:
        exception;
        ed1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "CH$y";
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
                obj = "CP\"hi{R,omMA$mxJV>";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "EF tw";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "CP\"hi{R,omMA$mxJV>";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "NK)";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "TG#ypJE";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "CH$y$\033\002,s}\004H$y$\033";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 25;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 34;
          goto _L9
_L6:
        byte1 = 77;
          goto _L9
        byte1 = 29;
          goto _L9
    }
}
