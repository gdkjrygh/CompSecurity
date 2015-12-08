// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.view.View;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsPreviewListAdapter

private final class <init>
    implements android.view..ClickListener
{

    private final int position;
    final NewsPreviewListAdapter this$0;

    public void onClick(View view)
    {
        if (NewsPreviewListAdapter.access$200(NewsPreviewListAdapter.this) != null)
        {
            NewsPreviewListAdapter.access$200(NewsPreviewListAdapter.this).onSelected(position);
        }
    }

    private onListener(int i)
    {
        this$0 = NewsPreviewListAdapter.this;
        super();
        position = i;
    }

    position(int i, position position1)
    {
        this(i);
    }
}
