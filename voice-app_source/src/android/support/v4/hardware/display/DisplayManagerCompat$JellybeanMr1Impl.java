// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.display;

import android.content.Context;
import android.view.Display;

// Referenced classes of package android.support.v4.hardware.display:
//            DisplayManagerCompat, DisplayManagerJellybeanMr1

private static class anager extends DisplayManagerCompat
{

    private final Object mDisplayManagerObj;

    public Display getDisplay(int i)
    {
        return DisplayManagerJellybeanMr1.getDisplay(mDisplayManagerObj, i);
    }

    public Display[] getDisplays()
    {
        return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj);
    }

    public Display[] getDisplays(String s)
    {
        return DisplayManagerJellybeanMr1.getDisplays(mDisplayManagerObj, s);
    }

    public (Context context)
    {
        mDisplayManagerObj = DisplayManagerJellybeanMr1.getDisplayManager(context);
    }
}
