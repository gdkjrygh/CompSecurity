// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import android.content.Context;
import android.graphics.Region;
import android.view.SurfaceView;
import android.widget.FrameLayout;

final class k extends SurfaceView
{

    k(Context context)
    {
        super(context);
    }

    public final boolean gatherTransparentRegion(Region region)
    {
        FrameLayout framelayout = (FrameLayout)getParent();
        int i = framelayout.getWidth();
        int j = framelayout.getHeight();
        if (i > 0 && j > 0)
        {
            int ai[] = new int[2];
            framelayout.getLocationInWindow(ai);
            int l = ai[0];
            int i1 = ai[1];
            region.op(l, i1, i + l, j + i1, android.graphics.Region.Op.UNION);
        }
        return true;
    }
}
