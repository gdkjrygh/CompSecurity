// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import butterknife.ButterKnife;
import cev;
import chp;
import czd;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetActivity

public class SafetyNetPopupWindow extends czd
{

    private final chp a;

    public SafetyNetPopupWindow(Activity activity, chp chp1, cev cev)
    {
        super(activity, cev);
        a = chp1;
        activity = LayoutInflater.from(activity).inflate(0x7f03016c, null, false);
        ButterKnife.inject(this, activity);
        setContentView(activity);
        activity.setOnClickListener(new android.view.View.OnClickListener() {

            final SafetyNetPopupWindow a;

            public final void onClick(View view)
            {
                a.dismiss();
            }

            
            {
                a = SafetyNetPopupWindow.this;
                super();
            }
        });
        setAnimationStyle(0x7f0900d2);
        setWidth(-1);
        setHeight(-1);
    }

    public final void b()
    {
        showAtLocation(a().getWindow().getDecorView(), 48, 0, 0);
        a.a(l.gl);
    }

    public void onClickAddContacts()
    {
        Intent intent = new Intent(a(), com/ubercab/client/feature/safetynet/SafetyNetActivity);
        intent.putExtra("start_fragment", 2);
        a().startActivity(intent);
        dismiss();
        a.a(n.eA);
    }

    public void onClickSkip()
    {
        dismiss();
        a.a(n.eB);
    }
}
