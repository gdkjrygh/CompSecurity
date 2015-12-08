// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.gtp.go.weather.sharephoto.b.a.d;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.b.p;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            ak, ad, aj

class am extends AsyncTask
{

    final ad a;
    private ak b;
    private aj c;

    public am(ad ad1, aj aj1)
    {
        a = ad1;
        super();
        b = new ak(ad1);
        c = aj1;
    }

    private void a(aj aj1)
    {
        c = aj1;
    }

    static void a(am am1, aj aj1)
    {
        am1.a(aj1);
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        if (!arraylist.isEmpty())
        {
            ArrayList arraylist2 = new ArrayList();
            arraylist = arraylist.iterator();
label0:
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                e e1 = (e)arraylist.next();
                Iterator iterator = arraylist1.iterator();
                g g1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    g1 = (g)iterator.next();
                } while (e1.f() != g1.a());
                arraylist2.add(e1);
            } while (true);
            d.a(ad.b(a), arraylist2);
        }
    }

    protected transient ArrayList a(Integer ainteger[])
    {
        b.b = ainteger[0].intValue();
        ainteger = new ArrayList();
        if (b.b == 0)
        {
            ArrayList arraylist = new ArrayList();
            ainteger = (ArrayList)com.gtp.go.weather.sharephoto.photo.ad.g(a);
            if (!ainteger.isEmpty())
            {
                arraylist.addAll(p.a(ainteger));
            }
            for (Iterator iterator = ad.a(a, 0).iterator(); iterator.hasNext(); arraylist.add(new p((g)iterator.next()))) { }
            publishProgress(new ArrayList[] {
                arraylist
            });
        }
        ArrayList arraylist1 = new ArrayList();
        if (com.gau.go.launcherex.gowidget.c.g.a(ad.b(a)) && ad.a(a, b))
        {
            ArrayList arraylist2 = ad.a(a, b.b);
            a(((ArrayList) (ainteger)), arraylist2);
            if (arraylist2 != null)
            {
                if (arraylist2.isEmpty())
                {
                    b.c = 1;
                } else
                {
                    a.a(arraylist2);
                    if (b.a == 0 || b.a == 1)
                    {
                        b.c = 1;
                    } else
                    {
                        b.c = ad.c(a, arraylist2);
                    }
                    ainteger = arraylist2.iterator();
                    while (ainteger.hasNext()) 
                    {
                        arraylist1.add(new p((g)ainteger.next()));
                    }
                }
            }
        }
        return arraylist1;
    }

    protected void a(ArrayList arraylist)
    {
        ad.a().remove(b.b);
        c.a(b.c, arraylist);
    }

    protected transient void a(ArrayList aarraylist[])
    {
        c.a(aarraylist[0]);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
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
