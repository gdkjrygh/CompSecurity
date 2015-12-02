// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, mk, Main

public class _b extends AsyncTask
{

    private static final String z;
    final Main a;

    public _b(Main main)
    {
        a = main;
        super();
    }

    protected Void a(Void avoid[])
    {
        int i;
        int k;
        k = App.am;
        i = 0;
_L1:
        int j;
        boolean flag;
        try
        {
            flag = mk.f;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            throw avoid;
        }
        j = i;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i >= 45000)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i + 200;
        Thread.sleep(200L);
        i = j;
          goto _L1
        avoid;
        avoid.printStackTrace();
        i = j;
        if (k == 0) goto _L1; else goto _L2
_L2:
        if (j >= 45000)
        {
            try
            {
                if (mk.f)
                {
                    mk.h();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                throw avoid;
            }
        }
        return null;
    }

    protected void a(Void void1)
    {
        a.removeDialog(104);
        Log.e(z);
        Main.c(a);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        if (!a.isFinishing())
        {
            a.showDialog(104);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "|GlbmvIqc\003rRlz+e_".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 66;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 17;
          goto _L8
_L3:
        byte0 = 38;
          goto _L8
_L4:
        byte0 = 5;
          goto _L8
        byte0 = 12;
          goto _L8
    }
}
