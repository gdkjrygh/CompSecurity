// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            ShareButtonBase, MessageDialog

public final class SendButton extends ShareButtonBase
{

    public SendButton(Context context)
    {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, "fb_send_button_create", "fb_send_button_did_tap");
    }

    protected int getDefaultRequestCode()
    {
        return com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
    }

    protected int getDefaultStyleResource()
    {
        return com.facebook.R.style.com_facebook_button_send;
    }

    protected android.view.View.OnClickListener getShareOnClickListener()
    {
        return new android.view.View.OnClickListener() {

            final SendButton this$0;

            public void onClick(View view)
            {
                callExternalOnClickListener(view);
                if (getFragment() != null)
                {
                    view = new MessageDialog(getFragment(), getRequestCode());
                } else
                {
                    view = new MessageDialog(getActivity(), getRequestCode());
                }
                view.show(getShareContent());
            }

            
            {
                this$0 = SendButton.this;
                super();
            }
        };
    }


}
