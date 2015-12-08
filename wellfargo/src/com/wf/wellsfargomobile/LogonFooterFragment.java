// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.wf.wellsfargomobile.util.d;

// Referenced classes of package com.wf.wellsfargomobile:
//            r, WFApp

public class LogonFooterFragment extends Fragment
{

    private Button a;
    private ImageView b;
    private Activity c;
    private Button d;
    private final android.view.View.OnClickListener e = new r(this);

    public LogonFooterFragment()
    {
    }

    static Button a(LogonFooterFragment logonfooterfragment)
    {
        return logonfooterfragment.a;
    }

    static Activity b(LogonFooterFragment logonfooterfragment)
    {
        return logonfooterfragment.c;
    }

    static ImageView c(LogonFooterFragment logonfooterfragment)
    {
        return logonfooterfragment.b;
    }

    static Button d(LogonFooterFragment logonfooterfragment)
    {
        return logonfooterfragment.d;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c = activity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04003a, viewgroup, false);
        a = (Button)layoutinflater.findViewById(0x7f0f00be);
        a.setOnClickListener(e);
        b = (ImageView)layoutinflater.findViewById(0x7f0f00c1);
        b.setOnClickListener(e);
        d = (Button)layoutinflater.findViewById(0x7f0f00c0);
        d.setOnClickListener(e);
        if (d.c.equals(WFApp.R()) || d.e.equals(WFApp.R()) || d.d.equals(WFApp.R()))
        {
            if (d != null)
            {
                d.setVisibility(8);
            }
            viewgroup = (TextView)layoutinflater.findViewById(0x7f0f00bf);
            if (viewgroup != null)
            {
                viewgroup.setVisibility(8);
            }
        }
        return layoutinflater;
    }

    public void onDetach()
    {
        super.onDetach();
        c = null;
    }
}
