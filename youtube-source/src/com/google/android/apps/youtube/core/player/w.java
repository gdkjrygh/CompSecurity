// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import com.google.android.apps.youtube.core.player.event.PlaybackServiceException;
import com.google.android.apps.youtube.datalib.innertube.ak;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            y, x, z

public class w
{

    protected boolean a;
    protected boolean b;
    protected z c;

    public w()
    {
    }

    public static PlaybackServiceException b(com.google.android.apps.youtube.datalib.innertube.model.w w1)
    {
        com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason errorreason;
        int i;
        i = w1.a();
        errorreason = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN;
        if (i != 1) goto _L2; else goto _L1
_L1:
        errorreason = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.VIDEO_ERROR;
_L4:
        return new PlaybackServiceException(errorreason, false, w1.b());
_L2:
        if (i == 2)
        {
            errorreason = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNPLAYABLE;
        } else
        if (w1.d())
        {
            errorreason = com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.USER_CHECK_FAILED;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a()
    {
        c = null;
    }

    public final void a(z z1)
    {
        c = z1;
    }

    public final void a(ak ak1)
    {
        ak1.a(a);
        ak1.b(b);
    }

    protected void a(com.google.android.apps.youtube.datalib.innertube.model.w w1)
    {
    }

    protected void a(com.google.android.apps.youtube.datalib.innertube.model.w w1, y y1)
    {
        y1.a(b(w1));
    }

    public final void a(com.google.android.apps.youtube.datalib.innertube.model.w w1, y y1, boolean flag)
    {
        if (w1 == null)
        {
            y1.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNKNOWN, false, null));
            return;
        }
        if (w1.c())
        {
            if (flag && !w1.h())
            {
                y1.a(new PlaybackServiceException(com.google.android.apps.youtube.core.player.event.PlaybackServiceException.ErrorReason.UNPLAYABLE_IN_BACKGROUND, false, null));
                return;
            } else
            {
                y1.a();
                return;
            }
        }
        if (w1.d())
        {
            if (c == null)
            {
                y1.a(b(w1));
                return;
            } else
            {
                c.a(w1.b(), new x(this, w1, y1));
                return;
            }
        } else
        {
            y1.a(b(w1));
            return;
        }
    }
}
