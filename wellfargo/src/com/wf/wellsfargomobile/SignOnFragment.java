// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.d;
import com.wf.wellsfargomobile.util.n;
import com.wf.wellsfargomobile.util.r;
import java.util.UUID;

// Referenced classes of package com.wf.wellsfargomobile:
//            ai, WFApp, MainActivity, av, 
//            au, ar, as, at

public class SignOnFragment extends Fragment
    implements TextWatcher
{

    CheckBox a;
    private Button b;
    private EditText c;
    private EditText d;
    private MainActivity e;
    private LinearLayout f;
    private ImageView g;
    private TextView h;
    private String i;
    private int j;
    private WebView k;

    public SignOnFragment()
    {
        j = -1;
    }

    static void a(SignOnFragment signonfragment)
    {
        signonfragment.b();
    }

    static void a(SignOnFragment signonfragment, String s, String s1, int l)
    {
        signonfragment.a(s, s1, l);
    }

    private void a(String s, String s1, int l)
    {
        if (s1 != null)
        {
            ai ai1 = new ai();
            Bundle bundle = new Bundle();
            bundle.putInt("DIALOG_ICON", l);
            bundle.putString("DIALOG_TITLE", s);
            bundle.putString("DIALOG_MESSAGE", s1);
            ai1.setArguments(bundle);
            ai1.show(getFragmentManager(), "MessageDialogFragment");
        }
        d();
        c.setText(WFApp.Q());
    }

    static EditText b(SignOnFragment signonfragment)
    {
        return signonfragment.c;
    }

    private void b()
    {
        Editable editable = c.getText();
        Editable editable1 = d.getText();
        if (editable.length() == 0)
        {
            d();
            e.a(null, getString(0x7f080111));
            return;
        }
        if (editable.length() < 6)
        {
            d();
            e.a(null, getString(0x7f080112));
            return;
        }
        if (editable1.length() == 0)
        {
            d();
            e.a(null, getString(0x7f0800b7));
            return;
        }
        com.wf.wellsfargomobile.WFApp.d(UUID.randomUUID().toString());
        c();
        if (c != null)
        {
            c.setText("");
        }
        if (d != null)
        {
            d.setText("");
        }
        (new av(this, e, editable.toString(), editable1.toString())).a();
    }

    static MainActivity c(SignOnFragment signonfragment)
    {
        return signonfragment.e;
    }

    private void c()
    {
        j = -1;
        g.setVisibility(8);
        i = "";
        h.setText(i);
        h.setVisibility(8);
        f.setVisibility(8);
    }

    static Button d(SignOnFragment signonfragment)
    {
        return signonfragment.b;
    }

    private void d()
    {
        int l;
        int i1;
        l = c.getText().length();
        i1 = d.getText().length();
        if (l < 6 || i1 <= 0) goto _L2; else goto _L1
_L1:
        b.setEnabled(true);
        if (!com.wf.wellsfargomobile.WFApp.d()) goto _L4; else goto _L3
_L3:
        com.wf.wellsfargomobile.au.a[WFApp.R().ordinal()];
        JVM INSTR tableswitch 1 1: default 80
    //                   1 97;
           goto _L5 _L6
_L5:
        b.setTextColor(getResources().getColor(0x7f0e007a));
_L4:
        return;
_L6:
        b.setTextColor(getResources().getColor(0x7f0e006b));
        return;
_L2:
        b.setEnabled(false);
        if (com.wf.wellsfargomobile.WFApp.d())
        {
            switch (com.wf.wellsfargomobile.au.a[WFApp.R().ordinal()])
            {
            default:
                b.setTextColor(getResources().getColor(0x7f0e007a));
                return;

            case 1: // '\001'
                b.setTextColor(getResources().getColor(0x7f0e0065));
                break;
            }
            return;
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    static String e(SignOnFragment signonfragment)
    {
        return signonfragment.f();
    }

    private void e()
    {
        n n1 = WFApp.L();
        if (!n1.a())
        {
            c.setText(n1.e());
            a.setChecked(true);
            return;
        } else
        {
            a.setChecked(false);
            c.setText("");
            return;
        }
    }

    private String f()
    {
        switch (getResources().getConfiguration().orientation)
        {
        default:
            return WFApp.b;

        case 1: // '\001'
            return WFApp.c;
        }
    }

    static void f(SignOnFragment signonfragment)
    {
        signonfragment.e();
    }

    static EditText g(SignOnFragment signonfragment)
    {
        return signonfragment.d;
    }

    public Button a()
    {
        return b;
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        l;
        JVM INSTR tableswitch 5 6: default 32
    //                   5 60
    //                   6 60;
           goto _L1 _L2 _L2
_L1:
        if (i1 == 14)
        {
            a(getString(0x7f080059), getString(0x7f080058), 0x7f0200fe);
        }
_L4:
        return;
_L2:
        if (i1 == 1)
        {
            d();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        e = (MainActivity)activity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040063, viewgroup, false);
        c = (EditText)layoutinflater.findViewById(0x7f0f00c6);
        c.addTextChangedListener(this);
        a = (CheckBox)layoutinflater.findViewById(0x7f0f00cb);
        d = (EditText)layoutinflater.findViewById(0x7f0f00c8);
        d.addTextChangedListener(this);
        b = (Button)layoutinflater.findViewById(0x7f0f00cd);
        d();
        d.setOnEditorActionListener(new ar(this));
        g = (ImageView)layoutinflater.findViewById(0x7f0f010c);
        h = (TextView)layoutinflater.findViewById(0x7f0f010d);
        f = (LinearLayout)layoutinflater.findViewById(0x7f0f010b);
        if (bundle != null)
        {
            viewgroup = bundle.getString("DIALOG_MESSAGE");
            if (viewgroup != null)
            {
                i = viewgroup;
                h.setText(viewgroup);
                h.setVisibility(0);
            }
            int l = bundle.getInt("DIALOG_ICON", -1);
            if (l != -1)
            {
                j = l;
                g.setImageResource(l);
                g.setVisibility(0);
            }
        }
        viewgroup = Typeface.createFromAsset(e.getAssets(), "fonts/02520_Arial2.ttf");
        ((TextView)layoutinflater.findViewById(0x7f0f010a)).setTypeface(viewgroup);
        c.setTypeface(viewgroup);
        d.setTypeface(viewgroup);
        h.setTypeface(viewgroup);
        viewgroup = Typeface.createFromAsset(e.getAssets(), "fonts/02534_ArialFett2.ttf");
        b.setTypeface(viewgroup);
        WFApp.J();
        e();
        c.addTextChangedListener(new as(this));
        a.setOnClickListener(new at(this));
        k = r.a(e, (ViewGroup)layoutinflater);
        if (k != null)
        {
            k.loadUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.c()).append(getString(0x7f080163)).toString());
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        if (k != null)
        {
            k.stopLoading();
        }
        super.onDestroy();
    }

    public void onDetach()
    {
        super.onDetach();
        e = null;
    }

    public void onPause()
    {
        c.setText(WFApp.Q());
        d.setText("");
        super.onPause();
    }

    public void onResume()
    {
        c.setText(WFApp.Q());
        d.setText("");
        c.requestFocus();
        d();
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        c.setText(WFApp.Q());
        d.setText("");
        if (i != null)
        {
            bundle.putString("DIALOG_MESSAGE", i);
        }
        if (j != -1)
        {
            bundle.putInt("DIALOG_ICON", j);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStop()
    {
        if (k != null)
        {
            k.stopLoading();
        }
        super.onStop();
    }

    public void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
        d();
    }

    public void signOn(View view)
    {
        b.setEnabled(false);
        b();
        d.setText("");
    }
}
