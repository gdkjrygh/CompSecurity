// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.appwidget;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.k;
import com.whatsapp.notification.l;
import com.whatsapp.og;
import com.whatsapp.u5;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.whatsapp.appwidget:
//            WidgetProvider, g

class d
    implements Runnable
{

    private static final String b[];
    private static long c;
    private static final String z[];
    private final String a;

    private d(String s)
    {
        a = s;
    }

    d(String s, g g)
    {
        this(s);
    }

    private void a(int i)
    {
        int j = WidgetProvider.d;
        Uri uri = Uri.parse(z[3]);
        if (c != -1L) goto _L2; else goto _L1
_L1:
        Object obj = App.d.query(uri, b, z[10], new String[] {
            a
        }, null);
        if (obj != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        if (((Cursor) (obj)).getCount() <= 1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        Log.i((new StringBuilder()).append(z[8]).append(((Cursor) (obj)).getCount()).toString());
        App.d.delete(uri, z[9], new String[] {
            a
        });
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        boolean flag = ((Cursor) (obj)).moveToNext();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        c = ((Cursor) (obj)).getLong(0);
        Log.i((new StringBuilder()).append(z[5]).append(c).toString());
        ((Cursor) (obj)).close();
_L2:
        obj = new ContentValues();
        ((ContentValues) (obj)).put(z[11], a);
        ((ContentValues) (obj)).put(z[12], z[2]);
        ((ContentValues) (obj)).put(z[7], Integer.valueOf(i));
        if (c != -1L)
        {
            break; /* Loop/switch isn't completed */
        }
        c = Long.parseLong((String)App.d.insert(uri, ((ContentValues) (obj))).getPathSegments().get(1));
        Log.i((new StringBuilder()).append(z[0]).append(c).append(z[6]).append(i).toString());
        if (j == 0) goto _L3; else goto _L5
_L5:
        try
        {
            uri = ContentUris.withAppendedId(uri, c);
            App.d.update(uri, ((ContentValues) (obj)), null, null);
            Log.i((new StringBuilder()).append(z[1]).append(c).append(z[13]).append(i).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a(z[4], ((Throwable) (obj)));
        }
        return;
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        throw obj1;
        obj1;
        ((Cursor) (obj)).close();
        throw obj1;
    }

    public void run()
    {
        int i1 = WidgetProvider.d;
        Iterator iterator = u5.d().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = App.az.e(((String) (obj)));
            if (((og) (obj)).c > 0)
            {
                i = ((og) (obj)).c + i;
            }
        } while (i1 == 0);
        int j = i;
        if (App.aq())
        {
            j = i + l.d().a().size();
        }
        a(j);
        if (DialogToastActivity.g != 0)
        {
            WidgetProvider.d = i1 + 1;
        }
    }

    static 
    {
        String as[];
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as = new String[14];
        obj = "k'Gm)h>Qe:u*Fxci>Gk8y,Bn+ynJd?y<Wo(<'G0";
        byte0 = -1;
        as1 = as;
        i = 0;
_L10:
        int j;
        int i1;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        j = 0;
_L7:
        if (i1 <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            byte byte1;
            char c1;
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "k'Gm)h>Qe:u*Fxci>Gk8y,Bn+ynJnv";
                i = 1;
                as1 = as;
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\177!N$;t/Wy-l>\rG-u ";
                i = 2;
                as1 = as;
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\177!M~)r:\031%c\177!N$?y-\rh-x)F%-l>P";
                i = 3;
                as1 = as;
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "k'Gm)h>Qe:u*Fxci>Gk8y,Bn+y";
                i = 4;
                as1 = as;
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                as1 = as;
                obj = "k'Gm)h>Qe:u*Fxci>Gk8y,Bn+ynJnv";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "<-L\177\"ht";
                byte0 = 5;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "~/Gm)\177!Vd8";
                byte0 = 6;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "k'Gm)h>Qe:u*Fxch!L*!} Z*.}*Do?&n";
                byte0 = 7;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "l/@a-{+\0365";
                byte0 = 8;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "l/@a-{+\0365";
                byte0 = 9;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "l/@a-{+";
                byte0 = 10;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\177\"By?";
                byte0 = 11;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "<-L\177\"ht";
                byte0 = 12;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                z = as;
                c = -1L;
                as = new String[5];
                obj = "C'G";
                byte0 = 13;
                as1 = as;
                i = 0;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                obj = "l/@a-{+";
                byte0 = 14;
                i = 1;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                obj = "\177\"By?";
                byte0 = 15;
                i = 2;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                obj = "~/Gm)\177!Vd8";
                byte0 = 16;
                i = 3;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                obj = "u-Ld";
                byte0 = 17;
                i = 4;
                as1 = as;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                break;
            }
            break; /* Loop/switch isn't completed */
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 460
    //                   0 483
    //                   1 490
    //                   2 497
    //                   3 504;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_504;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 76;
_L8:
        obj[j] = (char)(byte1 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 28;
          goto _L8
_L3:
        byte1 = 78;
          goto _L8
_L4:
        byte1 = 35;
          goto _L8
        byte1 = 10;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
        b = as;
    }
}
