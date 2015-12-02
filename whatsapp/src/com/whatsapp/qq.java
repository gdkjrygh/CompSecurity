// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;

// Referenced classes of package com.whatsapp:
//            sf, Conversations, a_

class qq extends AsyncTask
{

    final Conversations a;

    private qq(Conversations conversations)
    {
        a = conversations;
        super();
    }

    qq(Conversations conversations, a_ a_)
    {
        this(conversations);
    }

    protected Boolean a(Void avoid[])
    {
        boolean flag;
        try
        {
            flag = sf.i();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            Thread.currentThread().interrupt();
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    protected void a(Boolean boolean1)
    {
        a.removeDialog(1);
        Conversations.a(a, boolean1.booleanValue());
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Boolean)obj);
    }

    protected void onPreExecute()
    {
        a.showDialog(1);
    }
}
