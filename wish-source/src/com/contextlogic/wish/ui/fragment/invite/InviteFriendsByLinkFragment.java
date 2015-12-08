// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.invite;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishInviteLinkSpec;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.util.BitmapUtil;

public class InviteFriendsByLinkFragment extends BaseContentFragment
{

    public static final String ARG_FROM_PROMPT = "ArgFromPrompt";
    public static final String ARG_INVITE_LINK_SPEC = "ArgInviteLinkSpec";
    private boolean fromPrompt;
    private WishInviteLinkSpec inviteLinkSpec;

    public InviteFriendsByLinkFragment()
    {
    }

    private void handleDone()
    {
        if (fromPrompt)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_PROMPT_DONE);
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_DONE);
        }
        dismissModal();
    }

    private void handleEmailShare()
    {
        if (fromPrompt)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_PROMPT_EMAIL);
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_EMAIL);
        }
        try
        {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setType("text/plain");
            intent.setData(Uri.parse((new StringBuilder()).append("mailto:?subject=").append(Uri.encode(inviteLinkSpec.getShareSubject())).append("&body=").append(Uri.encode(inviteLinkSpec.getShareMessage())).toString()));
            startActivity(intent);
            return;
        }
        catch (Throwable throwable)
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0602db));
        }
    }

    private void handleGeneralShare()
    {
        if (fromPrompt)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_PROMPT_SHARE);
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_SHARE);
        }
        try
        {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", inviteLinkSpec.getShareSubject());
            intent.putExtra("android.intent.extra.TEXT", inviteLinkSpec.getShareMessage());
            startActivity(intent);
            return;
        }
        catch (Throwable throwable)
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0602e8));
        }
    }

    private void handleSmsShare()
    {
        if (fromPrompt)
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_PROMPT_SMS);
        } else
        {
            trackClick(WishAnalyticsEvent.CLICK_MOBILE_INVITE_BY_LINK_SMS);
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("sms:"));
            intent.putExtra("sms_body", inviteLinkSpec.getShareShortMessage());
            startActivity(intent);
            return;
        }
        catch (Throwable throwable)
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0602e9));
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.InviteFriendsByLink;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030065;
    }

    protected WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        if (fromPrompt)
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_INVITE_FRIENDS_BY_LINK_PROMPT;
        } else
        {
            return WishAnalyticsEvent.IMPRESSION_MOBILE_INVITE_FRIENDS_BY_LINK;
        }
    }

    protected void initializeUi(View view)
    {
        BitmapUtil.safeSetBackgroundResource(view, 0x7f020148);
        getNavigationBar().setResizedTitle(inviteLinkSpec.getMenuText());
        getNavigationBar().setMenuItem(getResources().getString(0x7f060130), 0, new NavigationBarButtonCallback() {

            final InviteFriendsByLinkFragment this$0;

            public void onMenuItemClicked()
            {
                handleDone();
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d020f), 0x7f02013c);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0213), 0x7f020107);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0215), 0x7f020109);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d0217), 0x7f020108);
        ((TextView)view.findViewById(0x7f0d0210)).setText(inviteLinkSpec.getDetailText());
        final TextView linkEditText = (TextView)view.findViewById(0x7f0d0211);
        linkEditText.setText(inviteLinkSpec.getShareLink());
        linkEditText.setOnClickListener(new android.view.View.OnClickListener() {

            final InviteFriendsByLinkFragment this$0;
            final TextView val$linkEditText;

            public void onClick(View view1)
            {
                ((ClipboardManager)getActivity().getSystemService("clipboard")).setText(linkEditText.getText());
                PopupAlertDialog.showSuccess(getActivity(), getActivity().getString(0x7f060279), null);
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                linkEditText = textview;
                super();
            }
        });
        view.findViewById(0x7f0d0212).setOnClickListener(new android.view.View.OnClickListener() {

            final InviteFriendsByLinkFragment this$0;

            public void onClick(View view1)
            {
                handleEmailShare();
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d0214).setOnClickListener(new android.view.View.OnClickListener() {

            final InviteFriendsByLinkFragment this$0;

            public void onClick(View view1)
            {
                handleSmsShare();
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d0216).setOnClickListener(new android.view.View.OnClickListener() {

            final InviteFriendsByLinkFragment this$0;

            public void onClick(View view1)
            {
                handleGeneralShare();
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                super();
            }
        });
        view.findViewById(0x7f0d0218).setOnClickListener(new android.view.View.OnClickListener() {

            final InviteFriendsByLinkFragment this$0;

            public void onClick(View view1)
            {
                handleDone();
            }

            
            {
                this$0 = InviteFriendsByLinkFragment.this;
                super();
            }
        });
    }

    public boolean onBackPressed()
    {
        handleDone();
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        inviteLinkSpec = (WishInviteLinkSpec)getArguments().getSerializable("ArgInviteLinkSpec");
        fromPrompt = getArguments().getBoolean("ArgFromPrompt", false);
    }

    public boolean useCanvasBackground()
    {
        return true;
    }




}
