// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import com.wf.wellsfargomobile.ai;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            f, g, h

public class e extends ai
{

    private h a;
    private String c;

    public e()
    {
    }

    static h a(e e1)
    {
        return e1.a;
    }

    static String b(e e1)
    {
        return e1.c;
    }

    public void a()
    {
        c = getArguments().getString("callBackFunctionName");
        Button button = (Button)b.findViewById(0x7f0f0078);
        button.setText(0x7f0800dc);
        button.setOnClickListener(new f(this));
    }

    public void b()
    {
        Button button = (Button)b.findViewById(0x7f0f0079);
        button.setText(0x7f0800da);
        button.setOnClickListener(new g(this));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = (h)activity;
    }

    public void onDetach()
    {
        super.onDetach();
        a = null;
    }
}
