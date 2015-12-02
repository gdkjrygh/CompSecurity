// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.Toast;

// Referenced classes of package com.whatsapp:
//            App

final class zk
    implements Runnable
{

    final String a;

    zk(String s)
    {
        a = s;
        super();
    }

    public void run()
    {
        Toast toast = Toast.makeText(App.au.getApplicationContext(), a, 0);
        toast.setGravity(85, 0, 0);
        toast.show();
    }
}
