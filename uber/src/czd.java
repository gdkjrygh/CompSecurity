// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import android.widget.PopupWindow;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderActivity;

public abstract class czd extends PopupWindow
{

    private final cev a;
    private final RiderActivity b;
    private boolean c;

    public czd(Activity activity, cev cev1)
    {
        b = (RiderActivity)activity;
        a = cev1;
    }

    private void b()
    {
        if (!c)
        {
            c = true;
            a.a(this);
        }
    }

    private void c()
    {
        if (c)
        {
            c = false;
            a.b(this);
            ButterKnife.reset(this);
        }
    }

    public final Activity a()
    {
        return b;
    }

    public void dismiss()
    {
        super.dismiss();
        c();
    }

    public void showAsDropDown(View view)
    {
        super.showAsDropDown(view);
        b();
    }

    public void showAtLocation(View view, int i, int j, int k)
    {
        super.showAtLocation(view, i, j, k);
        b();
    }
}
