// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.controller.CallbackFragment;
import com.walmartlabs.payment.view.OnSingleClickListener;

public class ValuePropositionFragment extends CallbackFragment
{
    public static interface Callback
    {

        public abstract void onHowTo();

        public abstract void onSetup();
    }


    public ValuePropositionFragment()
    {
        super(com/walmartlabs/payment/controller/mpay/ValuePropositionFragment$Callback);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_value_prop, viewgroup, false);
        MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "why mobile pay").putString("section", "mobile pay"));
        viewgroup = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (viewgroup != null)
        {
            viewgroup.setTitle(com.walmartlabs.android.payment.R.string.mpay_value_page_title);
        }
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_value_link_info).setOnClickListener(new OnSingleClickListener() {

            final ValuePropositionFragment this$0;

            public void onSingleClick(View view)
            {
                ((Callback)access$000).onHowTo();
            }

            
            {
                this$0 = ValuePropositionFragment.this;
                super();
            }
        });
        ViewUtil.findViewById(layoutinflater, com.walmartlabs.android.payment.R.id.mpay_value_button).setOnClickListener(new OnSingleClickListener() {

            final ValuePropositionFragment this$0;

            public void onSingleClick(View view)
            {
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayGetStarted"));
                ((Callback)
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = ValuePropositionFragment.this;
                super();
            }
        });
        return layoutinflater;
    }


}
