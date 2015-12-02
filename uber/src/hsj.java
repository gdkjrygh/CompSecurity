// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class hsj
{

    private final List a = new ArrayList();

    public hsj()
    {
    }

    public final hrr a(Object obj)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hsg hsg1 = (hsg)iterator.next();
            if (hsg1.b().equals(obj))
            {
                return hsg1.a();
            }
        }

        return null;
    }

    public final hsj a(View view, hrt hrt)
    {
        a.add(new hsg((hse)view, hrt));
        return this;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hrr hrr1 = ((hsg)iterator.next()).a();
            if (hrr1 != null)
            {
                arraylist.add(hrr1);
                if (flag && ((View)hrr1.a()).isFocusable())
                {
                    ((View)hrr1.a()).requestFocus();
                    flag = false;
                }
            }
        } while (true);
        return arraylist;
    }

    public final hsj b(View view, hrt hrt)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hsg hsg1 = (hsg)iterator.next();
            if (!hsg1.b().equals(view) || !hsg1.c().equals(hrt))
            {
                continue;
            }
            a.remove(hsg1);
            break;
        } while (true);
        return this;
    }

    public final List b()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hrr hrr1 = ((hsh)iterator.next()).d();
            if (hrr1 != null)
            {
                arraylist.add(hrr1);
            }
        } while (true);
        return arraylist;
    }
}
