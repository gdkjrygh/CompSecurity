// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.whatsapp:
//            aoz, ed, App, k

class lu
    implements Runnable
{

    private static final String z[];
    final String a;
    final aoz b;
    final String c;

    lu(aoz aoz1, String s, String s1)
    {
        b = aoz1;
        a = s;
        c = s1;
        super();
    }

    public void run()
    {
        ed ed1 = aoz.f(b);
        ed1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        String s1;
        sqlitedatabase = aoz.f(b).getWritableDatabase();
        s1 = a;
        if (!App.az.d(c)) goto _L2; else goto _L1
_L1:
        String s = "";
_L4:
        sqlitedatabase.delete(z[1], z[0], new String[] {
            s1, s
        });
        ed1;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = c;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
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
        obj = "&\f\024\023\023~F\034\031Ja\f\024\023\023~";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "&\024\022\002^\036\026\034\005Z(\005\024\007O/\022\016";
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
        char c1 = obj[j];
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
        byte byte0 = 46;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 65;
          goto _L9
_L5:
        byte0 = 102;
          goto _L9
_L6:
        byte0 = 125;
          goto _L9
        byte0 = 119;
          goto _L9
    }
}
