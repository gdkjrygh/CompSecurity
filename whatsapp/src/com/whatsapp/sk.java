// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, aoz, k4

final class sk extends AsyncTask
{

    private static final String z[];
    final ArrayList a;
    final SharedPreferences b;

    sk(ArrayList arraylist, SharedPreferences sharedpreferences)
    {
        a = arraylist;
        b = sharedpreferences;
        super();
    }

    protected Void a(Void avoid[])
    {
        int i = App.am;
        App.ah.b(a);
        avoid = b.edit();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            k4 k4_1 = (k4)iterator.next();
            avoid.remove((new StringBuilder()).append(z[5]).append(k4.a(k4_1)).toString());
            avoid.remove((new StringBuilder()).append(z[1]).append(k4.a(k4_1)).toString());
        } while (i == 0);
        iterator = b.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s.startsWith(z[3]) && s.contains("@"))
            {
                Log.i((new StringBuilder()).append(z[4]).append(s).toString());
                avoid.remove(s);
            }
            if (s.startsWith(z[2]) && s.contains("@"))
            {
                Log.i((new StringBuilder()).append(z[0]).append(s).toString());
                avoid.remove(s);
            }
        } while (i == 0);
        avoid.commit();
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = "S\034u%\tY\th\177\024]\th1\rQ\bh?\024D\034\1776\n\033\034\177=\026B\013:";
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
                obj = "R\036{}";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "R\036{}";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "D\0177";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "S\034u%\tY\th\177\024]\th1\rQ\bh?\024D\034\1776\n\033\034\177=\026B\013:";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "D\0177";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 121;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 52;
          goto _L9
_L5:
        byte1 = 110;
          goto _L9
_L6:
        byte1 = 26;
          goto _L9
        byte1 = 80;
          goto _L9
    }
}
