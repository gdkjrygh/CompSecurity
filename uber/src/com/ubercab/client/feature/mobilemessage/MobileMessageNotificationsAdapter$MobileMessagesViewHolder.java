// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import cev;
import com.ubercab.rider.realtime.model.MobileMessage;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import efm;
import hw;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.mobilemessage:
//            MobileMessageNotificationsAdapter, MobileMessageModuleContentView

public class l extends hw
{

    final MobileMessageNotificationsAdapter l;
    private MobileMessage m;
    FrameLayout mFrameLayoutMessageHolder;
    MobileMessageModuleContentView mWebViewMobileMessage;

    static MobileMessage a(l l1, MobileMessage mobilemessage)
    {
        l1.m = mobilemessage;
        return mobilemessage;
    }

    private void a(View view)
    {
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), 0x7f040011));
        mFrameLayoutMessageHolder.setVisibility(0);
    }

    static void a(mFrameLayoutMessageHolder mframelayoutmessageholder, View view)
    {
        mframelayoutmessageholder.a(view);
    }

    private static boolean a(List list)
    {
        return list != null && list.size() > 0 && ((MobileMessageModule)list.get(0)).getContent() != null;
    }

    public void onClickMobileMessage()
    {
        if (m == null)
        {
            return;
        } else
        {
            MobileMessageNotificationsAdapter.a(l).c(new efm(m));
            return;
        }
    }

    final void w()
    {
        Object obj;
        if (m != null)
        {
            obj = m.getModules();
        } else
        {
            obj = null;
        }
        if (a(((List) (obj))) && ((MobileMessageModule)((List) (obj)).get(0)).getContent().size() > 0)
        {
            mFrameLayoutMessageHolder.setVisibility(8);
            obj = (String)((MobileMessageModule)((List) (obj)).get(0)).getContent().get(0);
            if (obj != null)
            {
                mWebViewMobileMessage.setWebViewClient(new WebViewClient() {

                    final MobileMessageNotificationsAdapter.MobileMessagesViewHolder a;

                    public final void onPageFinished(WebView webview, String s)
                    {
                        MobileMessageNotificationsAdapter.MobileMessagesViewHolder.a(a, a.mFrameLayoutMessageHolder);
                    }

            
            {
                a = MobileMessageNotificationsAdapter.MobileMessagesViewHolder.this;
                super();
            }
                });
                mWebViewMobileMessage.loadDataWithBaseURL(null, ((String) (obj)), "text/html", "utf-8", null);
            }
        }
    }

    public _cls1.a(MobileMessageNotificationsAdapter mobilemessagenotificationsadapter, View view)
    {
        l = mobilemessagenotificationsadapter;
        super(view);
        ButterKnife.inject(this, view);
    }
}
