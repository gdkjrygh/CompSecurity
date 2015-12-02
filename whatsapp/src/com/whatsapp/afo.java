// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ListChatInfo, og, ng, ContactInfo, 
//            ih, abh

class afo extends AsyncTask
{

    private static final String z;
    final ListChatInfo a;

    private afo(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    afo(ListChatInfo listchatinfo, abh abh)
    {
        this(listchatinfo);
    }

    private void a()
    {
        int i = ContactInfo.a(a, ListChatInfo.d(a).a, new ng(this));
        if (i != 0 && !isCancelled())
        {
            a.runOnUiThread(new ih(this, i));
        }
    }

    public Void a(Void avoid[])
    {
        if (!isCancelled())
        {
            a();
        }
        return null;
    }

    public void a(Void void1)
    {
        a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(z);
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "6\024P'&9\025B'&3\023E<V/\rG2\r?\031".toCharArray();
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
        byte byte0 = 121;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 90;
          goto _L8
_L3:
        byte0 = 125;
          goto _L8
_L4:
        byte0 = 35;
          goto _L8
        byte0 = 83;
          goto _L8
    }
}
