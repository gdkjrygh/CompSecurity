// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.p2pimport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.p2pimport:
//            P2PContact

public class b extends Fragment
    implements android.view.View.OnClickListener
{

    private TextView a;
    private TextView b;
    private TextView c;
    private P2PContact d;

    public b()
    {
    }

    public void onClick(View view)
    {
        String as[];
        int i;
        view = ((TextView)view).getText().toString();
        as = d.c();
        i = 0;
_L8:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!view.equals(as[i])) goto _L2; else goto _L1
_L1:
        d.a(Boolean.valueOf(true));
        d.c(i);
        i = 1;
_L10:
        if (i != 0) goto _L4; else goto _L3
_L3:
        as = d.d();
        i = 0;
_L9:
        if (i >= as.length) goto _L4; else goto _L5
_L5:
        if (!view.equals(as[i])) goto _L7; else goto _L6
_L6:
        d.a(Boolean.valueOf(false));
        d.c(i);
_L4:
        WFApp.a(d);
        getActivity().setResult(-1);
        getActivity().finish();
        return;
_L2:
        i++;
          goto _L8
_L7:
        i++;
          goto _L9
        i = 0;
          goto _L10
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = (P2PContact)getActivity().getIntent().getExtras().getParcelable("com.wf.wellsfargomobile.p2pimport.contact");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag = false;
        layoutinflater = layoutinflater.inflate(0x7f040028, viewgroup, false);
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0f007d);
        bundle = d.c();
        if (bundle.length != 0)
        {
            int i = 0;
            while (i < bundle.length) 
            {
                TextView textview = new TextView(getActivity());
                textview.setText(bundle[i]);
                textview.setPadding(10, 15, 5, 15);
                textview.setTextAppearance(getActivity(), 0x7f0a0170);
                if (bundle.length == 1)
                {
                    textview.setBackgroundResource(0x7f020146);
                } else
                if (i == 0)
                {
                    textview.setBackgroundResource(0x7f020147);
                } else
                if (i == bundle.length - 1)
                {
                    textview.setBackgroundResource(0x7f020145);
                } else
                {
                    textview.setBackgroundResource(0x7f020144);
                }
                textview.setOnClickListener(this);
                viewgroup.addView(textview, i);
                i++;
            }
        } else
        {
            a = (TextView)layoutinflater.findViewById(0x7f0f007c);
            a.setVisibility(8);
        }
        viewgroup = (LinearLayout)layoutinflater.findViewById(0x7f0f0080);
        bundle = d.d();
        if (bundle.length != 0)
        {
            int j = ((flag) ? 1 : 0);
            while (j < bundle.length) 
            {
                TextView textview1 = new TextView(getActivity());
                textview1.setText(bundle[j]);
                textview1.setBackgroundResource(0x7f020144);
                textview1.setPadding(10, 15, 5, 15);
                textview1.setTextAppearance(getActivity(), 0x7f0a0170);
                if (bundle.length == 1)
                {
                    textview1.setBackgroundResource(0x7f020146);
                } else
                if (j == 0)
                {
                    textview1.setBackgroundResource(0x7f020147);
                } else
                if (j == bundle.length - 1)
                {
                    textview1.setBackgroundResource(0x7f020145);
                } else
                {
                    textview1.setBackgroundResource(0x7f020144);
                }
                textview1.setOnClickListener(this);
                viewgroup.addView(textview1, j);
                j++;
            }
        } else
        {
            b = (TextView)layoutinflater.findViewById(0x7f0f007e);
            b.setVisibility(8);
            c = (TextView)layoutinflater.findViewById(0x7f0f007f);
            c.setVisibility(8);
        }
        return layoutinflater;
    }
}
