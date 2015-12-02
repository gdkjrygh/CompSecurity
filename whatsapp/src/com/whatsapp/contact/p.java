// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.whatsapp.App;
import com.whatsapp.k;
import com.whatsapp.og;

// Referenced classes of package com.whatsapp.contact:
//            ContactProvider, h

class p extends AsyncTask
{

    private static final String z;
    final SQLiteDatabase a;
    final h b;

    p(h h, SQLiteDatabase sqlitedatabase)
    {
        b = h;
        a = sqlitedatabase;
        super();
    }

    protected Void a(Void avoid[])
    {
        boolean flag;
        flag = ContactProvider.f;
        avoid = a.query(z, og.s, null, null, null, null, null);
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        do
        {
            if (!avoid.moveToNext())
            {
                break;
            }
            og og1 = og.a(avoid);
            if (!og1.k() && !og1.p() && og1.z != null)
            {
                og1.m();
                App.az.c(og1);
            }
        } while (!flag);
        avoid.close();
        return null;
        Exception exception;
        exception;
        avoid.close();
        throw exception;
    }

    protected void a(Void void1)
    {
        App.al();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "=]1?\032$H\017?\0019".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 117;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 74;
          goto _L8
_L3:
        byte0 = 60;
          goto _L8
_L4:
        byte0 = 110;
          goto _L8
        byte0 = 92;
          goto _L8
    }
}
