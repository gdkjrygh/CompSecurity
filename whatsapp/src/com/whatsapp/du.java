// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            iz, App

public class du extends Dialog
{

    private final Activity a;
    private final int b;

    public du(Activity activity, int i)
    {
        super(activity, 0x7f0f0018);
        a = activity;
        b = i;
    }

    public void a()
    {
        onCreate(onSaveInstanceState());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(iz.a(getWindow().getLayoutInflater(), b, null, false));
        getWindow().setLayout(-1, -1);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (App.u != 3) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup = (ViewGroup)findViewById(0x1020002);
        i;
        JVM INSTR lookupswitch 3: default 52
    //                   24: 59
    //                   25: 72
    //                   84: 61;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.onKeyDown(i, keyevent);
_L3:
        return true;
_L5:
        a5.a(viewgroup, a, false);
        return true;
_L4:
        a5.c();
        return true;
    }
}
