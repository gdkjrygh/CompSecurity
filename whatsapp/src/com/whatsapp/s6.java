// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.os.AsyncTask;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, DeleteAccountConfirmation, aoz, EULA

final class s6 extends AsyncTask
{

    private static final String z;

    s6()
    {
    }

    protected Void a(Void avoid[])
    {
        try
        {
            Thread.sleep(1500L);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[]) { }
        return null;
    }

    protected void a(Void void1)
    {
        App.aF();
        DeleteAccountConfirmation.b();
        App.ah.m();
        App.b(App.au, 0x7f0e0110, 1);
        if (DeleteAccountConfirmation.c() != null)
        {
            DeleteAccountConfirmation.c().removeDialog(1);
            void1 = new Intent(DeleteAccountConfirmation.c(), com/whatsapp/EULA);
            void1.addFlags(32768);
            DeleteAccountConfirmation.c().startActivity(void1);
            DeleteAccountConfirmation.c().finish();
        }
        Log.i(z);
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
        ac = "|:y0<}>v6<{0{3!j2:1-t:a<'vrv:%h3p!-".toCharArray();
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
        byte byte0 = 72;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 24;
          goto _L8
_L3:
        byte0 = 95;
          goto _L8
_L4:
        byte0 = 21;
          goto _L8
        byte0 = 85;
          goto _L8
    }
}
