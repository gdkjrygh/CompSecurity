// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.gau.go.launcherex.goweather.goplay.q;

// Referenced classes of package com.go.weatherex.themestore:
//            ac

class ai extends AsyncTask
{

    final ac a;

    ai(ac ac1)
    {
        a = ac1;
        super();
    }

    protected transient SparseArray a(Void avoid[])
    {
        avoid = new SparseArray(3);
        avoid.put(1, ac.m(a).a(ac.l(a), 1));
        avoid.put(2, ac.m(a).a(ac.l(a), 2));
        avoid.put(3, ac.m(a).a(ac.l(a), 3));
        avoid.put(4, ac.m(a).a(ac.l(a), 4));
        return avoid;
    }

    protected void a(SparseArray sparsearray)
    {
        ac.n(a).clear();
        int j = sparsearray.size();
        for (int i = 0; i < j; i++)
        {
            ac.n(a).put(sparsearray.keyAt(i), sparsearray.valueAt(i));
        }

        ac.a(a, ac.n(a));
        ac.c(a, false);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((SparseArray)obj);
    }
}
