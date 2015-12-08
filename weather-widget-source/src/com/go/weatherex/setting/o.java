// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.setting:
//            k, p

public class o extends a
    implements android.view.View.OnClickListener
{

    private TextView a;
    private View b;
    private ViewGroup c;
    private k d;
    private p e;

    public o()
    {
    }

    private void b()
    {
        a.setText(0x7f0804e3);
    }

    private void c()
    {
        a(a, 4, true);
    }

    protected boolean a()
    {
        return super.a();
    }

    protected void f()
    {
        super.f();
        if (isDetached())
        {
            return;
        } else
        {
            d.c();
            e.c();
            b();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d.a(bundle);
        e.a(bundle);
        b();
        c();
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            h();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new k(this);
        e = new p(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030082, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        d.b();
        e.b();
    }

    public void onResume()
    {
        super.onResume();
        d.a();
        e.a();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = (TextView)c(0x7f090202);
        b = c(0x7f090226);
        c = (ViewGroup)c(0x7f0901e1);
        d.a(c);
        e.a(c);
        b.setOnClickListener(this);
    }
}
