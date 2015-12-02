// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.AsyncTask;
import android.widget.Filter;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, o9, aoz, yj, 
//            Voip, CallsFragment, e7, a9b

class iu extends AsyncTask
{

    final CallsFragment a;

    private iu(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    iu(CallsFragment callsfragment, a9b a9b)
    {
        this(callsfragment);
    }

    protected ArrayList a(Void avoid[])
    {
        Object obj;
        ArrayList arraylist;
        o9 o9_1;
        ArrayList arraylist1;
        int i;
        i = App.am;
        o9_1 = new o9(this);
        arraylist1 = App.ah.a(0, 100, o9_1);
        if (isCancelled())
        {
            return null;
        }
        arraylist = new ArrayList();
        avoid = new yj(a);
        obj = Voip.g();
        Iterator iterator = arraylist1.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_2 = (c4)iterator.next();
            if (!c4_2.y.equals(obj) && !avoid.a(c4_2))
            {
                arraylist.add(avoid);
                avoid = new yj(a, c4_2);
            }
        } while (i == 0);
        obj = avoid;
        if (arraylist1.size() < 100) goto _L2; else goto _L1
_L1:
        publishProgress(new ArrayList[] {
            arraylist
        });
        obj = App.ah.a(100, 1000, o9_1);
        if (isCancelled())
        {
            return null;
        }
        obj = ((ArrayList) (obj)).iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        c4 c4_1 = (c4)((Iterator) (obj)).next();
        if (!avoid.a(c4_1))
        {
            arraylist.add(avoid);
            avoid = new yj(a, c4_1);
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        obj = avoid;
_L2:
        if (!((yj) (obj)).b())
        {
            arraylist.add(obj);
        }
        return arraylist;
_L4:
        obj = avoid;
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            synchronized (CallsFragment.g(a))
            {
                CallsFragment.g(a).clear();
                CallsFragment.g(a).addAll(arraylist);
            }
            CallsFragment.f(a).getFilter().filter(CallsFragment.c(a));
        }
        CallsFragment.d(a);
        CallsFragment.e(a);
        return;
        arraylist;
        arraylist1;
        JVM INSTR monitorexit ;
        throw arraylist;
    }

    protected void a(ArrayList aarraylist[])
    {
        ArrayList arraylist = aarraylist[0];
        if (arraylist != null)
        {
            synchronized (CallsFragment.g(a))
            {
                CallsFragment.g(a).clear();
                CallsFragment.g(a).addAll(arraylist);
            }
            CallsFragment.f(a).notifyDataSetChanged();
        }
        return;
        exception;
        aarraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((ArrayList[])aobj);
    }
}
