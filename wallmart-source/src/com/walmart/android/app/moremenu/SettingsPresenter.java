// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.moremenu;

import android.content.ContentResolver;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.main.SearchContentProvider;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.WalmartLocationService;

public class SettingsPresenter extends Presenter
{

    private ViewGroup mView;

    public SettingsPresenter()
    {
    }

    private void postNotificationChangedEvent(String s, boolean flag)
    {
        Bus bus = MessageBus.getBus();
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("notificationChanged")).putString("notification", s);
        if (flag)
        {
            s = "checked";
        } else
        {
            s = "unchecked";
        }
        bus.post(builder.putString("newStatus", s));
    }

    private void trackPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "Settings").putString("section", "Settings").putString("subCategory", "Settings");
        MessageBus.getBus().post(builder);
    }

    public String getTitleText()
    {
        return mView.getContext().getString(0x7f090550);
    }

    public View getView()
    {
        return mView;
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        trackPageView();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mView == null)
        {
            final Context context = viewgroup.getContext();
            mView = (ViewGroup)ViewUtil.inflate(context, 0x7f040184, viewgroup);
            viewgroup = new android.view.View.OnClickListener() {

                final SettingsPresenter this$0;

                public void onClick(View view)
                {
                    ((CheckBox)ViewUtil.findViewById(view, 0x7f10005b)).toggle();
                }

            
            {
                this$0 = SettingsPresenter.this;
                super();
            }
            };
            Object obj = mView.findViewById(0x7f10053a);
            ((View) (obj)).setOnClickListener(viewgroup);
            obj = (CheckBox)ViewUtil.findViewById(((View) (obj)), 0x7f10005b);
            ((CheckBox) (obj)).setChecked(SharedPreferencesUtil.isPromotionNotificationsEnabled(context));
            ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final SettingsPresenter this$0;
                final Context val$context;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    SharedPreferencesUtil.setPromotionNotificationsEnabled(context, flag);
                    if (flag)
                    {
                        compoundbutton = "Promotions Enabled";
                    } else
                    {
                        compoundbutton = "Promotions Disabled";
                    }
                    GoogleAnalytics.trackEvent("Notifications", compoundbutton, "");
                    postNotificationChangedEvent("promotion", flag);
                }

            
            {
                this$0 = SettingsPresenter.this;
                context = context1;
                super();
            }
            });
            obj = mView.findViewById(0x7f10053b);
            ((View) (obj)).setOnClickListener(viewgroup);
            obj = (CheckBox)ViewUtil.findViewById(((View) (obj)), 0x7f10005b);
            ((CheckBox) (obj)).setChecked(SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(context));
            ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final SettingsPresenter this$0;
                final Context val$context;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    SharedPreferencesUtil.setStoreFeatureNotificationsEnabled(context, flag);
                    if (flag)
                    {
                        compoundbutton = "Store Features Enabled";
                    } else
                    {
                        compoundbutton = "Store Features Disabled";
                    }
                    GoogleAnalytics.trackEvent("Notifications", compoundbutton, "");
                    postNotificationChangedEvent("events", flag);
                }

            
            {
                this$0 = SettingsPresenter.this;
                context = context1;
                super();
            }
            });
            obj = mView.findViewById(0x7f10053c);
            ((View) (obj)).setOnClickListener(viewgroup);
            obj = (CheckBox)ViewUtil.findViewById(((View) (obj)), 0x7f10005b);
            ((CheckBox) (obj)).setChecked(SharedPreferencesUtil.isEReceiptNotificationsEnabled(context));
            ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final SettingsPresenter this$0;
                final Context val$context;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    SharedPreferencesUtil.setEReceiptNotificationsEnabled(context, flag);
                    if (flag)
                    {
                        compoundbutton = "EReceipts Enabled";
                    } else
                    {
                        compoundbutton = "EReceipts Disabled";
                    }
                    GoogleAnalytics.trackEvent("Notifications", compoundbutton, "");
                    postNotificationChangedEvent("savingscatcher", flag);
                }

            
            {
                this$0 = SettingsPresenter.this;
                context = context1;
                super();
            }
            });
            obj = mView.findViewById(0x7f10016a);
            ((View) (obj)).setOnClickListener(viewgroup);
            obj = (CheckBox)ViewUtil.findViewById(((View) (obj)), 0x7f10005b);
            ((CheckBox) (obj)).setChecked(SharedPreferencesUtil.isSaverNotificationsEnabled(context));
            ((CheckBox) (obj)).setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final SettingsPresenter this$0;
                final Context val$context;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    SharedPreferencesUtil.setSaverNotificationsEnabled(context, flag);
                    postNotificationChangedEvent("completecomparison", flag);
                }

            
            {
                this$0 = SettingsPresenter.this;
                context = context1;
                super();
            }
            });
            obj = mView.findViewById(0x7f10053d);
            ((View) (obj)).setOnClickListener(viewgroup);
            viewgroup = (CheckBox)ViewUtil.findViewById(((View) (obj)), 0x7f10005b);
            viewgroup.setChecked(SharedPreferencesUtil.isVuduNotificationsEnabled(context));
            viewgroup.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final SettingsPresenter this$0;
                final Context val$context;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    SharedPreferencesUtil.setVuduNotificationsEnabled(context, flag);
                }

            
            {
                this$0 = SettingsPresenter.this;
                context = context1;
                super();
            }
            });
            ViewUtil.findViewById(mView, 0x7f10053e).setOnClickListener(new android.view.View.OnClickListener() {

                final SettingsPresenter this$0;

                public void onClick(View view)
                {
                    view.getContext().getContentResolver().delete(SearchContentProvider.CONTENT_URI, null, null);
                    GoogleAnalytics.trackEvent("Search", "Clear Search History", "");
                }

            
            {
                this$0 = SettingsPresenter.this;
                super();
            }
            });
        }
    }

    public void onPop()
    {
        super.onPop();
        if (SharedPreferencesUtil.isStoreFeatureNotificationsEnabled(mView.getContext()))
        {
            WalmartLocationService.start(mView.getContext());
        }
    }

    public void onPushed()
    {
        super.onPushed();
        trackPageView();
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        trackPageView();
    }

}
