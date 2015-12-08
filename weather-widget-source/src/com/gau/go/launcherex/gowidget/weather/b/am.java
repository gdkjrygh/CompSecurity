// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.b;

import android.os.AsyncTask;
import com.gtp.a.a.b.c;
import com.jiubang.goweather.a.a;
import com.jiubang.goweather.a.f;
import com.jiubang.goweather.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.b:
//            an, ak, al

class am extends AsyncTask
{

    final ak a;

    private am(ak ak1)
    {
        a = ak1;
        super();
    }

    am(ak ak1, al al)
    {
        this(ak1);
    }

    protected transient ArrayList a(an aan[])
    {
        Object obj = aan[0];
        aan = new ArrayList();
        obj = com.gau.go.launcherex.gowidget.weather.b.an.a(((an) (obj)));
label0:
        for (int i = 0; i < ((ArrayList) (obj)).size(); i++)
        {
            Object obj1 = ((a)((ArrayList) (obj)).get(i)).o;
            if (obj1 == null)
            {
                continue;
            }
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    continue label0;
                }
                f f1 = (f)((Iterator) (obj1)).next();
                int k = f1.a();
                int j = 0;
                while (j < k) 
                {
                    g g1 = f1.a(j);
                    String s = com.jiubang.core.c.a.g.a(g1.c);
                    File file = new File(com.gtp.a.a.b.a.c);
                    c.a("WeatherHandler", file.getPath());
                    if (!(new File((new StringBuilder()).append(file.getPath()).append(File.separator).append(s).append(".png").toString())).exists())
                    {
                        aan.add(new com.jiubang.core.c.a.a(g1.c, file.getPath(), (new StringBuilder()).append(s).append(".png").toString()));
                    }
                    j++;
                }
            } while (true);
        }

        return aan;
    }

    protected void a(ArrayList arraylist)
    {
        super.onPostExecute(arraylist);
        if (arraylist.size() > 0)
        {
            com.jiubang.core.c.a.g g1 = com.jiubang.core.c.a.g.a(com.gau.go.launcherex.gowidget.weather.b.ak.a(a));
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); g1.a((com.jiubang.core.c.a.a)arraylist.next())) { }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((an[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((ArrayList)obj);
    }
}
