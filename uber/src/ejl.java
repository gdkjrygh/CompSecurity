// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import butterknife.ButterKnife;

public abstract class ejl extends czb
{

    public View e;
    public cev f;
    public cgh g;

    public ejl()
    {
    }

    public final boolean a()
    {
        View view = null;
        Object obj = getFragmentManager().findFragmentById(0x7f0e01ca);
        if (obj != null)
        {
            obj = ((Fragment) (obj)).getView();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            view = ((View) (obj)).findViewById(0x7f0e01d0);
        }
        return view != null && view.getVisibility() == 0;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }
}
