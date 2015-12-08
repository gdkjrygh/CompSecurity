// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class PortalButton extends com.sessionm.ui.PortalButton
{

    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 4;
    public static final int POSITION_CENTER = 5;
    public static final int POSITION_TOP_LEFT = 1;
    public static final int POSITION_TOP_RIGHT = 2;

    public PortalButton(Context context)
    {
        super(context);
    }

    public PortalButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public int getBadgePosition()
    {
        return super.getBadgePosition();
    }

    public ImageButton getButton()
    {
        return super.getButton();
    }

    public int getDisabledResourceId()
    {
        return -1;
    }

    public int getResourceId()
    {
        return super.getResourceId();
    }

    public void setBadgePosition(int i)
    {
        super.setBadgePosition(i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
    }

    public void setResourceId(int i)
    {
        super.setResourceId(i);
    }

    public void setShouldShowBadge(boolean flag)
    {
        super.setShouldShowBadge(flag);
    }

    public boolean shouldShowBadge()
    {
        return super.shouldShowBadge();
    }
}
