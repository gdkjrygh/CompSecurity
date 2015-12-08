// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Bitmap;
import android.graphics.Rect;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BoundingTetragon, CheckSide, HorizontalGuidance, TurnGuidance, 
//            VerticalGuidance, ZoomGuidance

public abstract class CheckDetectionResult
{

    protected final BoundingTetragon bounds;
    protected final Bitmap originalImage;
    protected final CheckSide side;
    protected final Rect targetRect;

    protected CheckDetectionResult(Rect rect, BoundingTetragon boundingtetragon, Bitmap bitmap, CheckSide checkside)
    {
        targetRect = rect;
        bounds = boundingtetragon;
        originalImage = bitmap;
        side = checkside;
    }

    public final BoundingTetragon getBounds()
    {
        return bounds;
    }

    public final CheckSide getCheckSide()
    {
        return side;
    }

    public abstract HorizontalGuidance getHorizontalMovementGuidance();

    public final Bitmap getOriginalImage()
    {
        return originalImage;
    }

    protected final Rect getTargetRect()
    {
        return targetRect;
    }

    public abstract TurnGuidance getTurnGuidance();

    public abstract VerticalGuidance getVerticalMovementGuidance();

    public abstract ZoomGuidance getZoomGuidance();

    public String toString()
    {
        return String.format("GUIDANCE: %s %s %s %s", new Object[] {
            getZoomGuidance(), getHorizontalMovementGuidance(), getVerticalMovementGuidance(), getTurnGuidance()
        });
    }
}
