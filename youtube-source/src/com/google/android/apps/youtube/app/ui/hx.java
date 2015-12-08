// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioGroup;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hw, hj

final class hx
    implements android.content.DialogInterface.OnClickListener
{

    final hw a;

    hx(hw hw1)
    {
        a = hw1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            dialoginterface = (RadioGroup)com.google.android.apps.youtube.app.ui.hw.a(a).findViewById(j.bq);
            dialoginterface = (com.google.android.apps.youtube.core.async.GDataRequestFactory.ComplaintReason)dialoginterface.findViewById(dialoginterface.getCheckedRadioButtonId()).getTag();
            hj.e(a.a).a(hw.b(a), dialoginterface, "", com.google.android.apps.youtube.common.a.a.a(a.a.a, a));
        } else
        if (i == -2)
        {
            dialoginterface.dismiss();
            return;
        }
    }
}
