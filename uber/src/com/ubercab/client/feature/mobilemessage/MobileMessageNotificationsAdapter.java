// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import cev;
import com.ubercab.rider.realtime.model.MobileMessage;
import hb;
import hw;
import java.util.List;

public final class MobileMessageNotificationsAdapter extends hb
{

    private final cev a;
    private final LayoutInflater b;
    private List c;

    public MobileMessageNotificationsAdapter(Context context, cev cev, List list)
    {
        a = cev;
        b = LayoutInflater.from(context);
        c = list;
    }

    static cev a(MobileMessageNotificationsAdapter mobilemessagenotificationsadapter)
    {
        return mobilemessagenotificationsadapter.a;
    }

    private static boolean c(int i)
    {
        return i == 0;
    }

    public final int a()
    {
        return c.size() + 1;
    }

    public final int a(int i)
    {
        return i != 0 ? 2 : 1;
    }

    public final hw a(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return new HeaderViewHolder(b.inflate(0x7f0300a8, viewgroup, false));

        case 2: // '\002'
            return new MobileMessagesViewHolder(b.inflate(0x7f0300a7, viewgroup, false));
        }
    }

    public final void a(RecyclerView recyclerview)
    {
        super.a(recyclerview);
    }

    public final void a(hw hw, int i)
    {
        if (c(i) || hw == null)
        {
            return;
        } else
        {
            hw = (MobileMessagesViewHolder)hw;
            MobileMessagesViewHolder.a(hw, (MobileMessage)c.get(i - 1));
            hw.w();
            return;
        }
    }

    private class HeaderViewHolder extends hw
    {

        final MobileMessageNotificationsAdapter l;
        TextView mMobileMessageTitle;

        HeaderViewHolder(View view)
        {
            l = MobileMessageNotificationsAdapter.this;
            super(view);
            ButterKnife.inject(this, view);
        }
    }


    private class MobileMessagesViewHolder extends hw
    {

        final MobileMessageNotificationsAdapter l;
        private MobileMessage m;
        FrameLayout mFrameLayoutMessageHolder;
        MobileMessageModuleContentView mWebViewMobileMessage;

        static MobileMessage a(MobileMessagesViewHolder mobilemessagesviewholder, MobileMessage mobilemessage)
        {
            mobilemessagesviewholder.m = mobilemessage;
            return mobilemessage;
        }

        private void a(View view)
        {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), 0x7f040011));
            mFrameLayoutMessageHolder.setVisibility(0);
        }

        static void a(MobileMessagesViewHolder mobilemessagesviewholder, View view)
        {
            mobilemessagesviewholder.a(view);
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

                        final MobileMessagesViewHolder a;

                        public final void onPageFinished(WebView webview, String s)
                        {
                            MobileMessagesViewHolder.a(a, a.mFrameLayoutMessageHolder);
                        }

                
                {
                    a = MobileMessagesViewHolder.this;
                    super();
                }
                    });
                    mWebViewMobileMessage.loadDataWithBaseURL(null, ((String) (obj)), "text/html", "utf-8", null);
                }
            }
        }

        public MobileMessagesViewHolder(View view)
        {
            l = MobileMessageNotificationsAdapter.this;
            super(view);
            ButterKnife.inject(this, view);
        }
    }

}
