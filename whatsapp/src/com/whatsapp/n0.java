// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.whatsapp:
//            aoz, ed

class n0
    implements Runnable
{

    private static final String z[];
    final boolean a;
    final aoz b;

    n0(aoz aoz1, boolean flag)
    {
        b = aoz1;
        a = flag;
        super();
    }

    public void run()
    {
        synchronized (aoz.f(b))
        {
            SQLiteDatabase sqlitedatabase = aoz.f(b).getWritableDatabase();
            ContentValues contentvalues = new ContentValues(1);
            contentvalues.put(z[1], Boolean.valueOf(a));
            sqlitedatabase.update(z[0], contentvalues, null, null);
        }
        return;
        exception;
        ed1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ";F-Iy4G?I";
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
                i = 1;
                obj = "9\\/UO.K(";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 38;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 88;
          goto _L9
_L5:
        byte0 = 46;
          goto _L9
_L6:
        byte0 = 76;
          goto _L9
        byte0 = 61;
          goto _L9
    }
}
