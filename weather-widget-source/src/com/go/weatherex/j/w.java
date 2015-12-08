// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j;

import android.os.AsyncTask;

// Referenced classes of package com.go.weatherex.j:
//            p, x

class w extends AsyncTask
{

    final p a;

    w(p p1)
    {
        a = p1;
        super();
    }

    protected transient Object a(Void avoid[])
    {
        return ((Object) (new Object[] {
            Boolean.valueOf(a.i())
        }));
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a.g.a = true;
        obj = ((Object) ((Object[])(Object[])obj));
        a.g.b = ((Boolean)obj[0]).booleanValue();
        p.a(a, a.g.b);
    }
}
