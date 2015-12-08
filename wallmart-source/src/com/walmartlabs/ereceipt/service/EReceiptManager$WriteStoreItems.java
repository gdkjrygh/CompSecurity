// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt.service;

import android.os.AsyncTask;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.walmartlabs.ereceipt.service:
//            EReceiptManager, EReceiptProvider

private class mUpcs extends AsyncTask
{

    private final Set mUpcs;
    final EReceiptManager this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((doInBackground[])aobj);
    }

    protected transient Void doInBackground(doInBackground adoinbackground[])
    {
        int j = adoinbackground.length;
        for (int i = 0; i < j; i++)
        {
            doInBackground doinbackground = adoinbackground[i];
            mUpcs.remove(doinbackground.lizedUpc);
        }

        EReceiptManager.access$300(EReceiptManager.this).updateStoreLookup(adoinbackground);
        if (!mUpcs.isEmpty())
        {
            adoinbackground = new HashSet();
            for (Iterator iterator = mUpcs.iterator(); iterator.hasNext(); adoinbackground.add(new >((String)iterator.next(), null, null, null))) { }
            EReceiptManager.access$300(EReceiptManager.this).updateStoreLookup((up[])adoinbackground.toArray(new up[adoinbackground.size()]));
        }
        return null;
    }

    public (Set set)
    {
        this$0 = EReceiptManager.this;
        super();
        mUpcs = new HashSet(set);
    }
}
