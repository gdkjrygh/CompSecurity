// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.database.Observable;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            App, as, adx, a3d

class _h extends Observable
{

    private _h()
    {
    }

    _h(adx adx)
    {
        this();
    }

    public void a(a3d a3d, long l, long l1)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((as)iterator.next()).a(a3d, l, l1);
        } while (i == 0);
    }

    public void a(a3d a3d, long l, long l1, ArrayList arraylist)
    {
        int i = App.am;
        Iterator iterator = mObservers.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((as)iterator.next()).a(a3d, l, l1, arraylist);
        } while (i == 0);
    }
}
