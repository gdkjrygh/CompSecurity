// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.whatsapp:
//            App, qg, Conversation, og, 
//            aoz

class a99 extends AsyncTask
{

    final qg a;

    a99(qg qg1)
    {
        a = qg1;
        super();
    }

    protected Boolean a(Void avoid[])
    {
        return Boolean.valueOf(App.ah.a(a.a.aD.a));
    }

    public void a(Boolean boolean1)
    {
        Conversation.a(a.a, boolean1);
        Conversation.f(a.a).setEnabled(boolean1.booleanValue());
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }
}
