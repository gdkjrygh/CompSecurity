// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a.a;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.a.a:
//            p

class q extends p
{

    q(Drawable drawable)
    {
        super(drawable);
    }

    public void applyTheme(android.content.res.Resources.Theme theme)
    {
        b.applyTheme(theme);
    }

    public boolean canApplyTheme()
    {
        return b.canApplyTheme();
    }

    public Rect getDirtyBounds()
    {
        return b.getDirtyBounds();
    }

    public void getOutline(Outline outline)
    {
        b.getOutline(outline);
    }

    public void setHotspot(float f, float f1)
    {
        b.setHotspot(f, f1);
    }

    public void setHotspotBounds(int i, int j, int k, int l)
    {
        b.setHotspotBounds(i, j, k, l);
    }
}
