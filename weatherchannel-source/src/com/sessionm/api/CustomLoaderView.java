// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.sessionm.ui.LoaderView;

public class CustomLoaderView extends LoaderView
{

    protected ViewGroup customLayout;

    public CustomLoaderView()
    {
    }

    public void dismissPortal()
    {
        super.dismissPortal();
    }

    public final void present(com.sessionm.ui.LoaderView.LoaderViewStatus loaderviewstatus)
    {
        super.present(loaderviewstatus);
        if (customLayout != null)
        {
            ViewGroup viewgroup = (ViewGroup)customLayout.getParent();
            if (viewgroup != null)
            {
                viewgroup.removeView(customLayout);
            }
            containerLayout.addView(customLayout);
        }
        if (viewParent != null)
        {
            viewParent.addView(containerLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else
        {
            activity.addContentView(containerLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        setLoaderViewStatus(loaderviewstatus);
    }

    public void reloadPortalContent()
    {
        super.reloadPortalContent();
    }

    public void removeCustomLoader()
    {
        super.removeCustomLoader();
    }

    public void setCustomLoader(ViewGroup viewgroup)
    {
        customLayout = viewgroup;
    }

    public void updateLoaderViewOnStatusChanged(com.sessionm.ui.LoaderView.LoaderViewStatus loaderviewstatus)
    {
        super.updateLoaderViewOnStatusChanged(loaderviewstatus);
    }
}
