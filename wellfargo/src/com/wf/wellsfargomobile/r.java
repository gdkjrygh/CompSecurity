// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

// Referenced classes of package com.wf.wellsfargomobile:
//            LogonFooterFragment, WebViewActivity, InfoActivity, ModalDialogWebViewActivity

class r
    implements android.view.View.OnClickListener
{

    final LogonFooterFragment a;

    r(LogonFooterFragment logonfooterfragment)
    {
        a = logonfooterfragment;
        super();
    }

    public void onClick(View view)
    {
        if (view == LogonFooterFragment.a(a))
        {
            LogonFooterFragment.a(a).requestFocusFromTouch();
            view = new Intent(LogonFooterFragment.b(a), com/wf/wellsfargomobile/WebViewActivity);
            view.putExtra("privacy_policy_request", true);
            LogonFooterFragment.b(a).startActivityForResult(view, 5);
        } else
        {
            if (view == LogonFooterFragment.c(a))
            {
                LogonFooterFragment.b(a).startActivity(new Intent(LogonFooterFragment.b(a), com/wf/wellsfargomobile/InfoActivity));
                return;
            }
            if (view == LogonFooterFragment.d(a))
            {
                view = new Intent(LogonFooterFragment.b(a), com/wf/wellsfargomobile/ModalDialogWebViewActivity);
                view.putExtra("whats_new", true);
                view.putExtra("USE_AS_DIALOG", true);
                a.startActivityForResult(view, 10);
                LogonFooterFragment.b(a).overridePendingTransition(0x7f050010, 0x7f05000d);
                return;
            }
        }
    }
}
