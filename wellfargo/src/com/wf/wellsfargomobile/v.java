// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile:
//            LogonFragment, WebViewActivity, InfoActivity

class v
    implements android.view.View.OnClickListener
{

    final LogonFragment a;

    v(LogonFragment logonfragment)
    {
        a = logonfragment;
        super();
    }

    public void onClick(View view)
    {
        if (view != LogonFragment.d(a)) goto _L2; else goto _L1
_L1:
        LogonFragment.d(a).setEnabled(false);
        LogonFragment.c(a);
_L4:
        LogonFragment.f(a).setText("");
        return;
_L2:
        if (view == LogonFragment.e(a))
        {
            LogonFragment.e(a).requestFocusFromTouch();
            view = new Intent(a.getActivity(), com/wf/wellsfargomobile/WebViewActivity);
            view.putExtra("security_request", true);
            a.startActivityForResult(view, 5);
        } else
        if (view == LogonFragment.b(a))
        {
            a.startActivity(new Intent(a.getActivity(), com/wf/wellsfargomobile/InfoActivity));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
