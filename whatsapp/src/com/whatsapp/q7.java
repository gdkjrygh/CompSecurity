// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Observable;
import com.whatsapp.protocol.c4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.whatsapp:
//            ov, adk, a39

final class q7 extends Observable
{

    private q7()
    {
    }

    q7(a39 a39)
    {
        this();
    }

    public void a()
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a();
        } while (!flag);
    }

    public void a(c4 c4)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).c(c4);
        } while (!flag);
    }

    public void a(c4 c4, int i)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a(c4, i);
        } while (!flag);
    }

    public void a(c4 c4, boolean flag)
    {
        boolean flag1 = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a(c4, flag);
        } while (!flag1);
    }

    public void a(String s)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a(s);
        } while (!flag);
    }

    public void a(Collection collection, Map map)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a(collection, map);
        } while (!flag);
    }

    public void b(c4 c4)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).b(c4);
        } while (!flag);
    }

    public void b(c4 c4, int i)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).b(c4, i);
        } while (!flag);
    }

    public void c(c4 c4)
    {
        boolean flag = ov.e;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((adk)iterator.next()).a(c4);
        } while (!flag);
    }
}
