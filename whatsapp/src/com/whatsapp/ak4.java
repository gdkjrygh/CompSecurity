// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.AsyncTask;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            ov, aoz, ed

class ak4 extends AsyncTask
{

    private static final String z[];
    final ArrayList a;
    final aoz b;

    ak4(aoz aoz1, ArrayList arraylist)
    {
        b = aoz1;
        a = arraylist;
        super();
    }

    protected Void a(Void avoid[])
    {
        boolean flag = ov.e;
        ed ed1 = aoz.f(b);
        ed1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = aoz.f(b).getWritableDatabase();
        avoid = sqlitedatabase;
        sqlitedatabase.beginTransaction();
        avoid = sqlitedatabase;
        Iterator iterator = a.iterator();
_L2:
        avoid = sqlitedatabase;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        avoid = sqlitedatabase;
        Object obj = (c4)iterator.next();
        avoid = sqlitedatabase;
        ContentValues contentvalues = new ContentValues(1);
        avoid = sqlitedatabase;
        contentvalues.put(z[2], Long.valueOf(((c4) (obj)).I));
        avoid = sqlitedatabase;
        obj = ((c4) (obj)).y.a;
        avoid = sqlitedatabase;
        sqlitedatabase.update(z[3], contentvalues, z[1], new String[] {
            obj
        });
        if (!flag) goto _L2; else goto _L1
_L1:
        avoid = sqlitedatabase;
        sqlitedatabase.setTransactionSuccessful();
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (sqlitedatabase.inTransaction())
        {
            sqlitedatabase.endTransaction();
        }
_L4:
        Log.i(z[0]);
        ed1;
        JVM INSTR monitorexit ;
        return null;
        avoid;
        throw avoid;
        ed1;
        JVM INSTR monitorexit ;
        throw avoid;
        SQLiteException sqliteexception;
        sqliteexception;
        sqlitedatabase = null;
_L8:
        avoid = sqlitedatabase;
        Log.a(sqliteexception);
        if (sqlitedatabase == null) goto _L4; else goto _L3
_L3:
        if (!sqlitedatabase.inTransaction()) goto _L4; else goto _L5
_L5:
        sqlitedatabase.endTransaction();
          goto _L4
        avoid;
        throw avoid;
        Exception exception;
        exception;
        avoid = null;
_L7:
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag = avoid.inTransaction();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        avoid.endTransaction();
        throw exception;
        avoid;
        try
        {
            throw avoid;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[]) { }
        finally { }
        throw avoid;
        exception;
        if (true) goto _L7; else goto _L6
_L6:
        sqliteexception;
          goto _L8
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "P4\016O\016R5\f\023\024X\"\rI\nY&\035Y\tR5\035H\023P\"\032H\033P7\004Y\tN&\016Y\t\022#\006R\037";
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
                obj = "V\"\020c\bX*\006H\037b-\000XG\002";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "N(\033H%I.\004Y\tI&\004L";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "^/\bH%Q.\032H";
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
        char c = obj[j];
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
        byte byte0 = 122;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 61;
          goto _L9
_L5:
        byte0 = 71;
          goto _L9
_L6:
        byte0 = 105;
          goto _L9
        byte0 = 60;
          goto _L9
    }
}
