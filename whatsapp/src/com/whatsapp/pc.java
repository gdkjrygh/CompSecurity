// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App, aoz, ra, w9

class pc
    implements Runnable
{

    final DialogToastFragmentActivity.ProgressDialogFragment a;
    final w9 b;

    pc(w9 w9, DialogToastFragmentActivity.ProgressDialogFragment progressdialogfragment)
    {
        b = w9;
        a = progressdialogfragment;
        super();
    }

    public void run()
    {
        long l = System.currentTimeMillis();
        App.ah.s();
        l = System.currentTimeMillis() - l;
        if (l < 3000L)
        {
            try
            {
                Thread.sleep(3000L - l);
            }
            catch (InterruptedException interruptedexception)
            {
                Log.a(interruptedexception);
            }
        }
        App.au.ab().post(new ra(this));
    }
}
