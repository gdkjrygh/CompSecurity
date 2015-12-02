// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.PendingIntent;
import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, nr, k5, j0

class aus extends Observable
{

    private aus()
    {
    }

    aus(k5 k5)
    {
        this();
    }

    public void a()
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((nr)iterator.next()).a();
        } while (i == 0);
    }

    public void a(int i)
    {
        int j = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((nr)iterator.next()).a(i);
        } while (j == 0);
    }

    public void a(PendingIntent pendingintent)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((nr)iterator.next()).a(pendingintent);
        } while (i == 0);
    }

    public void a(j0 j0)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((nr)iterator.next()).a(j0);
        } while (i == 0);
    }

    public void a(Integer integer, String as[])
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((nr)iterator.next()).a(integer, as);
        } while (i == 0);
    }
}
