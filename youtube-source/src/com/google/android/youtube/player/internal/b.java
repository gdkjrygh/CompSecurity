// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player.internal;

import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.internal.b.a;
import com.google.android.youtube.player.n;

public abstract class b
    implements YouTubeThumbnailLoader
{

    private n a;
    private boolean b;

    private boolean b()
    {
        return !b;
    }

    public final void a()
    {
        if (b())
        {
            com.google.android.youtube.player.internal.b.a.a("The finalize() method for a YouTubeThumbnailLoader has work to do. You should have called release().", new Object[0]);
            if (b())
            {
                b = true;
                a = null;
            }
        }
    }
}
