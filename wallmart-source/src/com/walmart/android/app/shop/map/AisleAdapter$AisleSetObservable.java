// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.database.Observable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleAdapter

private static class <init> extends Observable
{

    public void notifyChanged(List list)
    {
        ArrayList arraylist = mObservers;
        arraylist;
        JVM INSTR monitorenter ;
        int i = mObservers.size() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((r)mObservers.get(i)).onVisualChanged(list);
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return;
        list;
        arraylist;
        JVM INSTR monitorexit ;
        throw list;
    }

    private r()
    {
    }

    r(r r)
    {
        this();
    }
}
