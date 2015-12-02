// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import java.util.List;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            p

class m extends DataSetObserver
{

    final p a;

    m(p p1)
    {
        a = p1;
        super();
    }

    public void onChanged()
    {
        a.a();
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        p.b(a).clear();
        a.notifyDataSetInvalidated();
    }
}
