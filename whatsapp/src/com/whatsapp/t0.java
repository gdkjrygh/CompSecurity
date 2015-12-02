// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, wv

public class t0 extends Observable
{

    public t0()
    {
    }

    public void a(String s)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((wv)iterator.next()).c(s);
        } while (i == 0);
    }

    public void a(String s, boolean flag)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((wv)iterator.next()).a(s, flag);
        } while (i == 0);
    }

    public void b(String s)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((wv)iterator.next()).d(s);
        } while (i == 0);
    }

    public void c(String s)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((wv)iterator.next()).a(s);
        } while (i == 0);
    }

    public void d(String s)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((wv)iterator.next()).b(s);
        } while (i == 0);
    }
}
