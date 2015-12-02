// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.fieldstats.z;

// Referenced classes of package com.whatsapp:
//            App

class a3x
    implements Runnable
{

    final App a;
    final Context b;

    a3x(App app, Context context)
    {
        a = app;
        b = context;
        super();
    }

    public void run()
    {
        z.a(b);
    }
}
