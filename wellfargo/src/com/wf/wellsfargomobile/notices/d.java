// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.notices;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

// Referenced classes of package com.wf.wellsfargomobile.notices:
//            b, c

public class d extends Fragment
{

    private c a;

    public d()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (getArguments().containsKey("item_id"))
        {
            a = (c)b.c(getActivity()).get(getArguments().getString("item_id"));
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040027, viewgroup, false);
        if (a != null)
        {
            ((TextView)layoutinflater.findViewById(0x7f0f007a)).setText(a.b);
            ((TextView)layoutinflater.findViewById(0x7f0f007b)).setText(a.c);
        }
        return layoutinflater;
    }
}
