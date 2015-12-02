// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            j

class b extends DataSetObserver
{

    final j a;

    b(j j1)
    {
        a = j1;
        super();
    }

    public void onChanged()
    {
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        a.notifyDataSetInvalidated();
    }
}
