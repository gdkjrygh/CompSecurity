// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            TintManager

class TintResources extends Resources
{

    private final TintManager mTintManager;

    public TintResources(Resources resources, TintManager tintmanager)
    {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        mTintManager = tintmanager;
    }

    public Drawable getDrawable(int i)
        throws android.content.res.Resources.NotFoundException
    {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null)
        {
            mTintManager.tintDrawable(i, drawable);
        }
        return drawable;
    }
}
