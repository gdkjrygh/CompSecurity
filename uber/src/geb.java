// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.accessibility.AccessibilityEvent;
import com.ubercab.client.feature.trip.slider.VehicleSeekBar;
import java.util.List;

public final class geb extends ExploreByTouchHelper
{

    private final VehicleSeekBar a;

    public geb(VehicleSeekBar vehicleseekbar)
    {
        super(vehicleseekbar);
        a = vehicleseekbar;
    }

    private static Rect a(int i, int j, int k)
    {
        return new Rect(i * j, 0, i * j + j, k);
    }

    private static String a(String s)
    {
        return s.toLowerCase().replace("uber", "Oober ");
    }

    protected final int getVirtualViewAt(float f, float f1)
    {
        return a.a(f);
    }

    protected final void getVisibleVirtualViews(List list)
    {
        for (int i = 0; i < a.a(); i++)
        {
            list.add(Integer.valueOf(i));
        }

    }

    protected final boolean onPerformActionForVirtualView(int i, int j, Bundle bundle)
    {
        return true;
    }

    protected final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent)
    {
        accessibilityevent.setContentDescription(a(a.a(i)));
    }

    protected final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int j = Math.round((float)a.getMeasuredWidth() / (float)a.a());
        int k = a.getMeasuredHeight();
        accessibilitynodeinfocompat.setViewIdResourceName(a.a(i));
        accessibilitynodeinfocompat.setContentDescription(a(a.a(i)));
        accessibilitynodeinfocompat.setBoundsInParent(a(i, j, k));
        accessibilitynodeinfocompat.addAction(16);
    }
}
