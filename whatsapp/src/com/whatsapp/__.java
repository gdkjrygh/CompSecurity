// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.Collection;

// Referenced classes of package com.whatsapp:
//            App, aoz

final class __ extends AsyncTask
{

    private static final String z;

    __()
    {
    }

    protected Collection a(Void avoid[])
    {
        avoid = App.ah.H();
        Log.i((new StringBuilder()).append(z).append(avoid.size()).toString());
        return avoid;
    }

    protected void a(Collection collection)
    {
        if (!collection.isEmpty())
        {
            App.b((String[])collection.toArray(new String[collection.size()]));
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Collection)obj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "a$x\b|\177&6\t'tae\tfb(y\0025r.c\002a1'y\0365c$e\t{u{6".toCharArray();
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
        byte byte0 = 21;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 17;
          goto _L8
_L3:
        byte0 = 65;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 108;
          goto _L8
    }
}
