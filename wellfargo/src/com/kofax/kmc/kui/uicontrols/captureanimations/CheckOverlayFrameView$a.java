// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;

class  extends CheckDetectionResult
{

    public HorizontalGuidance getHorizontalMovementGuidance()
    {
        return HorizontalGuidance.HORIZONTAL_MOVE_OK;
    }

    public TurnGuidance getTurnGuidance()
    {
        return TurnGuidance.TURN_OK;
    }

    public VerticalGuidance getVerticalMovementGuidance()
    {
        return VerticalGuidance.VERTICAL_MOVE_OK;
    }

    public ZoomGuidance getZoomGuidance()
    {
        return ZoomGuidance.ZOOM_OK;
    }

    protected ()
    {
        super(null, null, null, CheckSide.FRONT);
    }
}
