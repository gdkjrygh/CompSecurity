// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.wf.wellsfargomobile.a.a;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp

public class InfoFragment extends Fragment
{

    public InfoFragment()
    {
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040034, viewgroup, false);
        ((TextView)layoutinflater.findViewById(0x7f0f0098)).setText(WFApp.X());
        ((TextView)layoutinflater.findViewById(0x7f0f0096)).setText(a.j());
        ((TextView)layoutinflater.findViewById(0x7f0f0097)).setText(a.k());
        return layoutinflater;
    }
}
