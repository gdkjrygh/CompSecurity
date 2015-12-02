// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Toast;
import com.whatsapp.fieldstats.j;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            Conversation, App, og, aoz, 
//            ln, r3, s

class _k extends AsyncTask
{

    private c4 a;
    private String b;
    final Conversation c;
    private boolean d;
    private ProgressDialog e;

    public _k(Conversation conversation, String s1, boolean flag, c4 c4)
    {
        c = conversation;
        super();
        b = s1;
        d = flag;
        a = c4;
        e = ProgressDialog.show(conversation, "", conversation.getString(0x7f0e036f), true, false);
        e.setCancelable(true);
        z.a(App.au, j.CONTENT_SEARCH_C, Integer.valueOf(1));
    }

    public ln a(Void avoid[])
    {
        avoid = App.ah.a(c.aD.a, a, d, b, 100, Conversation.W(c));
        if (avoid != null && ((ln) (avoid)).a != null)
        {
            int i = ((ln) (avoid)).a.getCount();
            int k = ((ln) (avoid)).b;
            ((ln) (avoid)).a.moveToPosition(Math.max(0, i - k - 50));
        }
        return avoid;
    }

    public void a(ln ln1)
    {
label0:
        {
            e.dismiss();
            if (isCancelled())
            {
                break label0;
            }
            if (ln1 != null)
            {
                if (ln1.a != null)
                {
                    Conversation.a(c, ln1.a);
                    Conversation.W(c).b();
                    c.U.changeCursor(ln1.a);
                }
                c.aK.setTranscriptMode(0);
                c.aK.setSelection(ln1.b);
                Conversation.a(c, null);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Toast.makeText(c.getApplicationContext(), c.getString(0x7f0e02b7), 0).show();
        }
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((ln)obj);
    }
}
