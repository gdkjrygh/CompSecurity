// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.bg;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, aoz, MediaData

final class tf extends AsyncTask
{

    private static final String z;

    tf()
    {
    }

    protected ArrayList a(Void avoid[])
    {
        boolean flag = true;
        avoid = App.ah;
        if (App.G() != 1)
        {
            flag = false;
        }
        avoid = avoid.c(flag);
        Log.i((new StringBuilder()).append(z).append(avoid.size()).toString());
        return avoid;
    }

    protected void a(ArrayList arraylist)
    {
        int i = App.am;
        arraylist = arraylist.iterator();
label0:
        do
        {
            c4 c4_1;
label1:
            {
label2:
                {
                    if (!arraylist.hasNext())
                    {
                        break label0;
                    }
                    c4_1 = (c4)arraylist.next();
                    if (c4_1.w != 1 && c4_1.w != 2 && c4_1.w != 3)
                    {
                        break label1;
                    }
                    MediaData mediadata = (MediaData)c4_1.B;
                    if (c4_1.l != null && (mediadata == null || mediadata.file == null))
                    {
                        App.p(c4_1);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    if (bg.a(c4_1.M, 2) < 0)
                    {
                        App.n(c4_1);
                        if (i == 0)
                        {
                            break label2;
                        }
                    }
                    App.p(c4_1);
                }
                if (i == 0)
                {
                    continue;
                }
            }
            App.p(c4_1);
        } while (i == 0);
        App.a7();
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
        ac = "AlOU\035NoZ\024\034MyL\t\tGyLU\013OiQ\016H".toCharArray();
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
        byte byte0 = 104;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 32;
          goto _L8
_L3:
        byte0 = 28;
          goto _L8
_L4:
        byte0 = 63;
          goto _L8
        byte0 = 122;
          goto _L8
    }
}
