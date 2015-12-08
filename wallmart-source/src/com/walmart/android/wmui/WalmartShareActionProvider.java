// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.support.v4.view.ActionProvider;
import android.support.v7.internal.widget.ActivityChooserModel;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.wmui:
//            WalmartActivityChooserView

public class WalmartShareActionProvider extends ActionProvider
{
    public static interface OnShareTargetSelectedListener
    {

        public abstract boolean onShareTargetSelected(WalmartShareActionProvider walmartshareactionprovider, Intent intent);
    }

    private class ShareActivityChooserModelPolicy
        implements android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener
    {

        final WalmartShareActionProvider this$0;

        public boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent)
        {
            if (mOnShareTargetSelectedListener != null)
            {
                mOnShareTargetSelectedListener.onShareTargetSelected(WalmartShareActionProvider.this, intent);
            }
            return false;
        }

        private ShareActivityChooserModelPolicy()
        {
            this$0 = WalmartShareActionProvider.this;
            super();
        }

    }

    private class ShareMenuItemOnMenuItemClickListener
        implements android.view.MenuItem.OnMenuItemClickListener
    {

        final WalmartShareActionProvider this$0;

        public boolean onMenuItemClick(MenuItem menuitem)
        {
            menuitem = ActivityChooserModel.get(mContext, mShareHistoryFileName).chooseActivity(menuitem.getItemId());
            if (menuitem == null) goto _L2; else goto _L1
_L1:
            if (!menuitem.hasExtra("walmart_extra_share_flag")) goto _L4; else goto _L3
_L3:
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listShareTap");
            MessageBus.getBus().post(builder);
            menuitem.removeExtra("walmart_extra_share_flag");
_L6:
            menuitem.addFlags(0x80000);
            mContext.startActivity(menuitem);
_L2:
            return true;
_L4:
            com.walmartlabs.anivia.AniviaEventAsJson.Builder builder1;
            builder1 = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("shareItem");
            if (menuitem.getComponent() == null)
            {
                break; /* Loop/switch isn't completed */
            }
            builder1.putString("shareType", menuitem.getComponent().getPackageName());
_L8:
            builder1.putString("itemId", menuitem.getStringExtra("walmart_extra_itemid"));
            menuitem.removeExtra("walmart_extra_itemid");
            MessageBus.getBus().post(builder1);
            if (true) goto _L6; else goto _L5
_L5:
            if (menuitem.getPackage() == null) goto _L8; else goto _L7
_L7:
            builder1.putString("shareType", menuitem.getPackage());
              goto _L8
        }

        private ShareMenuItemOnMenuItemClickListener()
        {
            this$0 = WalmartShareActionProvider.this;
            super();
        }

    }


    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    public static final String EXTRA_ITEMID = "walmart_extra_itemid";
    public static final String EXTRA_LIST_SHARE_FLAG = "walmart_extra_share_flag";
    private final Context mContext;
    private int mMaxShownActivityCount;
    private android.support.v7.internal.widget.ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener = new ShareMenuItemOnMenuItemClickListener();
    private OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    private String mShareHistoryFileName;

    public WalmartShareActionProvider(Context context)
    {
        super(context);
        mMaxShownActivityCount = 4;
        mShareHistoryFileName = "share_history.xml";
        mContext = context;
    }

    private void setActivityChooserPolicyIfNeeded()
    {
        if (mOnShareTargetSelectedListener == null)
        {
            return;
        }
        if (mOnChooseActivityListener == null)
        {
            mOnChooseActivityListener = new ShareActivityChooserModelPolicy();
        }
        ActivityChooserModel.get(mContext, mShareHistoryFileName).setOnChooseActivityListener(mOnChooseActivityListener);
    }

    public Intent getShareIntent()
    {
        return ActivityChooserModel.get(mContext, mShareHistoryFileName).getIntent();
    }

    public boolean hasSubMenu()
    {
        return true;
    }

    public View onCreateActionView()
    {
        Object obj = ActivityChooserModel.get(mContext, mShareHistoryFileName);
        WalmartActivityChooserView walmartactivitychooserview = (WalmartActivityChooserView)LayoutInflater.from(getContext()).inflate(0x7f040008, null);
        walmartactivitychooserview.setActivityChooserModel(((ActivityChooserModel) (obj)));
        obj = new TypedValue();
        mContext.getTheme().resolveAttribute(0x7f01010f, ((TypedValue) (obj)), true);
        walmartactivitychooserview.setExpandActivityOverflowButtonDrawable(mContext.getResources().getDrawable(((TypedValue) (obj)).resourceId));
        walmartactivitychooserview.setProvider(this);
        walmartactivitychooserview.setExpandActivityOverflowButtonContentDescription(0x7f09000c);
        return walmartactivitychooserview;
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        submenu.clear();
        ActivityChooserModel activitychoosermodel = ActivityChooserModel.get(mContext, mShareHistoryFileName);
        android.content.pm.PackageManager packagemanager = mContext.getPackageManager();
        int k = activitychoosermodel.getActivityCount();
        int l = Math.min(k, mMaxShownActivityCount);
        for (int i = 0; i < l; i++)
        {
            ResolveInfo resolveinfo = activitychoosermodel.getActivity(i);
            submenu.add(0, i, i, resolveinfo.loadLabel(packagemanager)).setIcon(resolveinfo.loadIcon(packagemanager)).setOnMenuItemClickListener(mOnMenuItemClickListener);
        }

        if (l < k)
        {
            submenu = submenu.addSubMenu(0, l, l, mContext.getString(0x7f090005));
            for (int j = 0; j < k; j++)
            {
                ResolveInfo resolveinfo1 = activitychoosermodel.getActivity(j);
                submenu.add(0, j, j, resolveinfo1.loadLabel(packagemanager)).setIcon(resolveinfo1.loadIcon(packagemanager)).setOnMenuItemClickListener(mOnMenuItemClickListener);
            }

        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onsharetargetselectedlistener)
    {
        mOnShareTargetSelectedListener = onsharetargetselectedlistener;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareHistoryFileName(String s)
    {
        mShareHistoryFileName = s;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent)
    {
        ActivityChooserModel.get(mContext, mShareHistoryFileName).setIntent(intent);
    }



}
