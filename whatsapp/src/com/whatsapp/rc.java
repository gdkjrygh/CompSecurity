// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, aoz, un

final class rc extends AsyncTask
{

    private static final String z;

    rc()
    {
    }

    protected ArrayList a(Void avoid[])
    {
        avoid = App.ah.D();
        un.a(App.ah.x());
        Log.i((new StringBuilder()).append(z).append(avoid.size()).toString());
        return avoid;
    }

    protected void a(ArrayList arraylist)
    {
        int i = App.am;
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)arraylist.next();
            if (c4_1.M == 9)
            {
                App.m(c4_1);
                if (i == 0)
                {
                    continue;
                }
            }
            if (c4_1.M == 11)
            {
                App.o(c4_1);
            }
        } while (i == 0);
        App.aZ();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "^IQPqQJD\021pR\\R\feX\\R\013eKLR\032w\020ZN\njK\031".toCharArray();
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
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 4;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 63;
          goto _L8
_L3:
        byte0 = 57;
          goto _L8
_L4:
        byte0 = 33;
          goto _L8
        byte0 = 127;
          goto _L8
    }
}
