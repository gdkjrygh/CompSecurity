// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.os.AsyncTask;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            g

class l extends AsyncTask
{

    int a;
    final g b;

    l(g g1)
    {
        b = g1;
        super();
        a = g.b(b).getDefaultDisplay().getWidth();
    }

    protected transient Void a(Void avoid[])
    {
        while (g.c(b) != null && g.c(b).x < a) 
        {
            g.c(b).x = g.c(b).x + 10;
            publishProgress(new Void[0]);
            try
            {
                Thread.sleep(8L);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
            }
        }
        return null;
    }

    protected void a(Void void1)
    {
        if (g.d(b) != null && g.c(b) != null)
        {
            g.b(b).updateViewLayout(g.d(b), g.c(b));
        }
    }

    protected transient void b(Void avoid[])
    {
        if (g.d(b) != null && g.c(b) != null)
        {
            g.b(b).updateViewLayout(g.d(b), g.c(b));
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        b((Void[])aobj);
    }
}
