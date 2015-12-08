// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.e;

import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import com.wf.wellsfargomobile.ai;

// Referenced classes of package com.wf.wellsfargomobile.e:
//            d

public class a extends ai
{

    private boolean a;

    public a()
    {
        a = false;
    }

    protected void a()
    {
        d.a(getActivity(), b);
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
