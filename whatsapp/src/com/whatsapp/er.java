// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, aoz, jo, an

class er extends AsyncTask
{

    final jo a;
    final an b;

    er(an an, jo jo1)
    {
        b = an;
        a = jo1;
        super();
    }

    protected ArrayList a(Void avoid[])
    {
        return App.ah.a(System.currentTimeMillis() - 0x5265c00L, 32);
    }

    protected void a(ArrayList arraylist)
    {
        int i = App.am;
        int j = App.G();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)arraylist.next();
            if (App.a(c4_1) && App.a(j, c4_1))
            {
                a.a(c4_1);
            }
        } while (i == 0);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
