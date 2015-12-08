// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.e;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.wf.wellsfargomobile.ai;

// Referenced classes of package com.wf.wellsfargomobile.e:
//            d, c

public class b extends ai
{

    private boolean a;

    public b()
    {
        a = false;
    }

    protected void a()
    {
        d.a(getActivity(), b);
    }

    protected void b()
    {
        Button button = (Button)b.findViewById(0x7f0f0079);
        button.setText(0x7f08003d);
        button.setOnClickListener(new c(this));
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a = false;
        super.onDismiss(dialoginterface);
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        if (a)
        {
            return;
        } else
        {
            super.show(fragmentmanager, s);
            a = true;
            return;
        }
    }
}
