// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            SearchView

class this._cls0
    implements android.view.istener
{

    final SearchView this$0;

    public void onClick(View view)
    {
        if (view != SearchView.access$400(SearchView.this)) goto _L2; else goto _L1
_L1:
        SearchView.access$500(SearchView.this);
_L4:
        return;
_L2:
        if (view == SearchView.access$600(SearchView.this))
        {
            SearchView.access$700(SearchView.this);
            return;
        }
        if (view == SearchView.access$800(SearchView.this))
        {
            SearchView.access$900(SearchView.this);
            return;
        }
        if (view != SearchView.access$1000(SearchView.this))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!SearchView.access$1100()) goto _L4; else goto _L3
_L3:
        SearchView.access$1200(SearchView.this);
        return;
        if (view != SearchView.access$1300(SearchView.this)) goto _L4; else goto _L5
_L5:
        SearchView.access$1400(SearchView.this);
        return;
    }

    ()
    {
        this$0 = SearchView.this;
        super();
    }
}
