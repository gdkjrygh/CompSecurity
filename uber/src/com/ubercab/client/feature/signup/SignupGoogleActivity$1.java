// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup;

import android.os.AsyncTask;
import dkn;
import dpg;
import fme;
import hkp;
import ica;
import ico;

// Referenced classes of package com.ubercab.client.feature.signup:
//            SignupGoogleActivity

public final class b extends AsyncTask
{

    final String a;
    final String b;
    final SignupGoogleActivity c;
    private Exception d;

    private transient String a()
    {
        String s;
        try
        {
            s = c.a(a, b);
        }
        catch (Exception exception)
        {
            d = exception;
            return null;
        }
        return s;
    }

    private void a(String s)
    {
        if (c.isFinishing())
        {
            return;
        }
        if (d != null)
        {
            c.a_(d.getMessage());
            c.setResult(0);
            c.finish();
            return;
        }
        SignupGoogleActivity.a(c, a);
        SignupGoogleActivity.b(c, s);
        if (!c.i.d())
        {
            c.j.i(SignupGoogleActivity.a(c), SignupGoogleActivity.b(c));
            return;
        } else
        {
            SignupGoogleActivity.a(c, c.m.a(SignupGoogleActivity.a(c), SignupGoogleActivity.b(c)).a(ico.a()).a(new fme(c, (byte)0)));
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
        c.b(c.getString(0x7f070296), null);
    }

    (SignupGoogleActivity signupgoogleactivity, String s, String s1)
    {
        c = signupgoogleactivity;
        a = s;
        b = s1;
        super();
    }
}
