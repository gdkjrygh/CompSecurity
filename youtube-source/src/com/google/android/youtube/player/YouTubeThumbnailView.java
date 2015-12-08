// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.player.internal.b;

public final class YouTubeThumbnailView extends ImageView
{

    private b a;

    public YouTubeThumbnailView(Context context)
    {
        this(context, null);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public YouTubeThumbnailView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final void finalize()
    {
        if (a != null)
        {
            a.a();
            a = null;
        }
        super.finalize();
    }
}
