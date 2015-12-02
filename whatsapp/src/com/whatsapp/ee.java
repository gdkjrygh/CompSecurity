// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            zv, aof, iz, al5, 
//            App, k, og, _x

public class ee extends Dialog
{

    private int a;
    private _x b;
    private String c;
    EditText d;
    private String e;
    final InputMethodManager f;

    static _x a(ee ee1)
    {
        return ee1.b;
    }

    private void a()
    {
        if (!f.isFullscreenMode())
        {
            f.toggleSoftInput(2, 0);
        }
    }

    static void b(ee ee1)
    {
        ee1.a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(0x7f030060);
        ((TextView)findViewById(0x7f0b01bb)).setText(a);
        ((Button)findViewById(0x7f0b01bd)).setOnClickListener(new zv(this, null));
        ((Button)findViewById(0x7f0b01be)).setOnClickListener(new aof(this));
        d = (EditText)findViewById(0x7f0b01bc);
        d.setText(c);
        iz.a(d);
        d.addTextChangedListener(new al5(this));
        bundle = getWindow().getAttributes();
        bundle.width = -1;
        bundle.gravity = 48;
        getWindow().setAttributes(bundle);
    }

    public void onStart()
    {
        super.onStart();
        a();
        d.setText(App.az.c(e).a(getContext()));
    }
}
