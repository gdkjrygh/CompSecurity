// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.fieldstats.as;
import com.whatsapp.fieldstats.ax;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            SearchFAQ, as6

public class tw extends AsyncTask
{

    final SearchFAQ a;

    protected tw(SearchFAQ searchfaq)
    {
        a = searchfaq;
        super();
    }

    protected Void a(Void avoid[])
    {
        Log.i(as6.a(a, SearchFAQ.a(a), SearchFAQ.d(a), true));
        Log.a();
        Log.i();
        return null;
    }

    protected void a(Void void1)
    {
        a.removeDialog(1);
        SearchFAQ.b(a).n = Double.valueOf(as.EMAIL_SEND.getCode());
        as6.a(a, SearchFAQ.a(a), SearchFAQ.c(a), SearchFAQ.e(a), SearchFAQ.d(a));
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(1);
    }
}
