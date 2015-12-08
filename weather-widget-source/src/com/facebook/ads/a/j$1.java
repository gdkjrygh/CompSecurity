// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.os.AsyncTask;
import com.facebook.ads.AdError;

// Referenced classes of package com.facebook.ads.a:
//            j, l

class nit> extends AsyncTask
{

    final j a;

    protected transient nit> a(Void avoid[])
    {
        return a.b();
    }

    protected void a(a a1)
    {
        if (a1 == null)
        {
            j.a(a).a(AdError.INTERNAL_ERROR);
            return;
        }
        if (a1.b != null)
        {
            j.a(a).a(a1.b);
            return;
        } else
        {
            a1 = l.a(j.b(a), a1.a);
            j.a(a).a(a1);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }

    r(j j1)
    {
        a = j1;
        super();
    }
}
