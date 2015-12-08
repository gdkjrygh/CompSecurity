// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.wf.wellsfargomobile.ai;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            k, j

public class i extends ai
{

    private boolean a;

    public i()
    {
        a = false;
    }

    protected void a()
    {
        Button button = (Button)b.findViewById(0x7f0f0078);
        button.setVisibility(0);
        button.setText(0x7f0800f5);
        button.setOnClickListener(new k(this));
    }

    protected void b()
    {
        Button button = (Button)b.findViewById(0x7f0f0079);
        button.setText(0x7f08003d);
        button.setOnClickListener(new j(this));
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
