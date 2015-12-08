// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;

import android.os.AsyncTask;
import com.go.weatherex.j.j;

// Referenced classes of package com.go.weatherex.j.c:
//            e

class i extends AsyncTask
{

    final e a;

    i(e e1)
    {
        a = e1;
        super();
    }

    protected transient j a(Integer ainteger[])
    {
        int k = ainteger[0].intValue();
        try
        {
            ainteger = e.a(a, k);
        }
        // Misplaced declaration of an exception variable
        catch (Integer ainteger[])
        {
            ainteger.printStackTrace();
            ainteger = new j();
            ainteger.a(k);
            return ainteger;
        }
        return ainteger;
    }

    protected void a(j j1)
    {
        e.a(a, j1);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((j)obj);
    }
}
