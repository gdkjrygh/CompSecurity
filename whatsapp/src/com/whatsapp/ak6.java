// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, lm, ContactInfo, z_, 
//            l3, App, aoz, x0

class ak6 extends AsyncTask
{

    private static final String z;
    final GroupChatInfo a;

    ak6(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    private void a()
    {
        int i = ContactInfo.a(a, GroupChatInfo.g(a), new lm(this));
        if (i != 0 && !isCancelled())
        {
            a.runOnUiThread(new z_(this, i));
        }
    }

    static void a(ak6 ak6_1, ArrayList arraylist)
    {
        ak6_1.a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        if (!isCancelled())
        {
            a.runOnUiThread(new l3(this, arraylist));
        }
    }

    private void b()
    {
        ArrayList arraylist = App.ah.j(GroupChatInfo.g(a));
        if (!isCancelled())
        {
            a.runOnUiThread(new x0(this, arraylist));
        }
    }

    public Void a(Void avoid[])
    {
        if (!isCancelled())
        {
            a();
        }
        if (!isCancelled() && !App.aS())
        {
            b();
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
        ac = "El-SI}w,@V\rk2BXV{&".toCharArray();
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
        byte byte0 = 57;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 34;
          goto _L8
_L3:
        byte0 = 30;
          goto _L8
_L4:
        byte0 = 66;
          goto _L8
        byte0 = 38;
          goto _L8
    }
}
