// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            MediaData, App, aoz, sz, 
//            an

class rk extends AsyncTask
{

    final c4 a;
    final an b;

    rk(an an, c4 c4_1)
    {
        b = an;
        a = c4_1;
        super();
    }

    protected void a(byte abyte0[])
    {
        ((MediaData)a.B).transferring = false;
        a.f = 1;
        a.a(abyte0);
        aoz aoz1 = App.ah;
        c4 c4_1 = a;
        boolean flag;
        if (abyte0 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aoz1.a(c4_1, flag, -1);
    }

    protected byte[] a(Void avoid[])
    {
        return sz.a(a.o, a.v);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((byte[])obj);
    }
}
