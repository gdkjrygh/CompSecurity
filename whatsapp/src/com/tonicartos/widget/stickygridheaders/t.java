// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

// Referenced classes of package com.tonicartos.widget.stickygridheaders:
//            StickyGridHeadersGridView

class t extends DataSetObserver
{

    final StickyGridHeadersGridView a;

    t(StickyGridHeadersGridView stickygridheadersgridview)
    {
        a = stickygridheadersgridview;
        super();
    }

    public void onChanged()
    {
        StickyGridHeadersGridView.b(a);
    }

    public void onInvalidated()
    {
        StickyGridHeadersGridView.b(a);
    }
}
