// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import java.util.Arrays;

// Referenced classes of package com.whatsapp:
//            App, k, an, og

class ala extends AsyncTask
{

    final an a;

    ala(an an)
    {
        a = an;
        super();
    }

    protected Void a(og aog[])
    {
        App.az.c(Arrays.asList(aog));
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((og[])aobj);
    }
}
