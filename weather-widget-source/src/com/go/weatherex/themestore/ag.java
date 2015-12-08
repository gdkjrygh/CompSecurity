// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.os.AsyncTask;
import com.jiubang.playsdk.a.v;
import com.jiubang.playsdk.a.y;

// Referenced classes of package com.go.weatherex.themestore:
//            ac

class ag extends AsyncTask
{

    final String a;
    final ac b;

    ag(ac ac1, String s)
    {
        b = ac1;
        a = s;
        super();
    }

    protected transient v a(Void avoid[])
    {
        return ac.i(b).b(a);
    }

    protected void a(v v1)
    {
        ac.a(b);
        ac.a(b, v1);
        if (ac.b(b))
        {
            ac.b(b, true);
        }
        if (!ac.j(b))
        {
            ac.b(b, ac.f(b));
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((v)obj);
    }
}
