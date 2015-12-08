// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.VelocityTracker;

// Referenced classes of package android.support.v4.view:
//            au, at, av

public final class as
{

    static final av a;

    public static float a(VelocityTracker velocitytracker, int i)
    {
        return a.a(velocitytracker, i);
    }

    public static float b(VelocityTracker velocitytracker, int i)
    {
        return a.b(velocitytracker, i);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new au();
        } else
        {
            a = new at();
        }
    }
}
