// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signin;

import android.content.Intent;
import android.os.AsyncTask;
import java.io.IOException;
import rp;
import rs;

// Referenced classes of package com.ubercab.client.feature.signin:
//            SignInFragment

final class b extends AsyncTask
{

    final String a;
    final String b;
    final SignInFragment c;
    private String d;
    private Intent e;

    private transient String a()
    {
        String s = c.a(a, b);
        return s;
        Object obj;
        obj;
        d = c.getString(0x7f07025f);
_L2:
        return null;
        obj;
        e = ((rs) (obj)).a();
        continue; /* Loop/switch isn't completed */
        obj;
        d = c.getString(0x7f070260);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void a(String s)
    {
        if (!c.isAdded())
        {
            return;
        }
        if (e != null)
        {
            c.startActivityForResult(e, 5020);
            return;
        }
        if (d != null)
        {
            c.e();
            c.c(d);
            return;
        } else
        {
            SignInFragment.a(c, a, s);
            return;
        }
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    protected final void onPreExecute()
    {
        c.b(c.getString(0x7f070434));
    }

    (SignInFragment signinfragment, String s, String s1)
    {
        c = signinfragment;
        a = s;
        b = s1;
        super();
    }
}
