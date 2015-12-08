// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.registry;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.GooglePlay;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.FeatureDisabledView;

// Referenced classes of package com.walmart.android.app.registry:
//            RegistryStatus

public class RegistryDisabledPresenter extends Presenter
{

    private Activity mActivity;
    private RegistryStatus mStatus;
    private FeatureDisabledView mView;

    public RegistryDisabledPresenter(Activity activity, RegistryStatus registrystatus)
    {
        mActivity = activity;
        mStatus = registrystatus;
    }

    private void updateView()
    {
        static class _cls4
        {

            static final int $SwitchMap$com$walmart$android$app$registry$RegistryStatus[];

            static 
            {
                $SwitchMap$com$walmart$android$app$registry$RegistryStatus = new int[RegistryStatus.values().length];
                try
                {
                    $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_NEEDS_APP_UPDATE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$walmart$android$app$registry$RegistryStatus[RegistryStatus.DISABLED_MAINTENANCE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.walmart.android.app.registry.RegistryStatus[mStatus.ordinal()])
        {
        default:
            mView.setTitle(0x7f09046e);
            mView.setText(0x7f09046d);
            mView.setButtonTextAndAction(0x7f090292, new OnSingleClickListener(this) {

                final RegistryDisabledPresenter this$0;

                public void onSingleClick(View view)
                {
                    MessageBus.getBus().post(new CloseFragmentEvent());
                }

            
            {
                this$0 = RegistryDisabledPresenter.this;
                super(presenter);
            }
            });
            return;

        case 1: // '\001'
            mView.setTitle(0x7f090471);
            break;
        }
        mView.setText(0x7f090470);
        if (GooglePlay.isAvailable(mActivity))
        {
            mView.setButtonTextAndAction(0x7f09046f, new OnSingleClickListener(this) {

                final RegistryDisabledPresenter this$0;

                public void onSingleClick(View view)
                {
                    GooglePlay.launch(mActivity);
                }

            
            {
                this$0 = RegistryDisabledPresenter.this;
                super(presenter);
            }
            });
            return;
        } else
        {
            mView.setButtonTextAndAction(0x7f090292, new OnSingleClickListener(this) {

                final RegistryDisabledPresenter this$0;

                public void onSingleClick(View view)
                {
                    MessageBus.getBus().post(new CloseFragmentEvent());
                }

            
            {
                this$0 = RegistryDisabledPresenter.this;
                super(presenter);
            }
            });
            return;
        }
    }

    public String getTitleText()
    {
        return mActivity.getString(0x7f090473);
    }

    public View getView()
    {
        return mView;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mView == null)
        {
            mView = (FeatureDisabledView)ViewUtil.inflate(viewgroup.getContext(), 0x7f040060, viewgroup);
            updateView();
        }
    }

}
