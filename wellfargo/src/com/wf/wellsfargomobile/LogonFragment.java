// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.o;
import com.wf.wellsfargomobile.util.q;
import com.wf.wellsfargomobile.util.r;
import java.util.UUID;

// Referenced classes of package com.wf.wellsfargomobile:
//            v, w, x, WFApp, 
//            WebViewActivity, s, t, u

public class LogonFragment extends Fragment
{

    private Button a;
    private EditText b;
    private EditText c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ToggleButton h;
    private x i;
    private String j;
    private String k;
    private Activity l;
    private WebView m;
    private final android.view.View.OnClickListener n = new v(this);
    private final BroadcastReceiver o = new w(this);

    public LogonFragment()
    {
        k = "login_request";
    }

    static EditText a(LogonFragment logonfragment)
    {
        return logonfragment.b;
    }

    static ToggleButton b(LogonFragment logonfragment)
    {
        return logonfragment.h;
    }

    static void c(LogonFragment logonfragment)
    {
        logonfragment.d();
    }

    static Button d(LogonFragment logonfragment)
    {
        return logonfragment.a;
    }

    private void d()
    {
        android.text.Editable editable = b.getText();
        android.text.Editable editable1 = c.getText();
        q q1 = new q(editable.toString(), editable1.toString());
        if (q1.b(getActivity()))
        {
            a.setEnabled(true);
            i.a(null, q1.a(getActivity()));
        } else
        {
            x x1 = i;
            Object obj;
            if (c.isFocused())
            {
                obj = c;
            } else
            {
                obj = b;
            }
            x1.hideKeyboard(((View) (obj)));
            WFApp.d(UUID.randomUUID().toString());
            obj = new Intent(getActivity(), com/wf/wellsfargomobile/WebViewActivity);
            if (j != null)
            {
                ((Intent) (obj)).putExtra("cvid", j);
            }
            ((Intent) (obj)).putExtra(k, true);
            com.wf.wellsfargomobile.util.o.a("username", editable);
            com.wf.wellsfargomobile.util.o.a("password", editable1);
            com.wf.wellsfargomobile.util.o.a("saveUsername", Boolean.valueOf(h.isChecked()));
            b.setText("");
            c.setText("");
            startActivityForResult(((Intent) (obj)), 5);
        }
        c.setText("");
    }

    static TextView e(LogonFragment logonfragment)
    {
        return logonfragment.g;
    }

    static EditText f(LogonFragment logonfragment)
    {
        return logonfragment.c;
    }

    public void a()
    {
        b.setFocusableInTouchMode(false);
        c.setFocusableInTouchMode(false);
        g.setFocusableInTouchMode(false);
        g.setFocusable(false);
        h.setFocusableInTouchMode(false);
        a.setFocusableInTouchMode(false);
        d.setFocusableInTouchMode(false);
        e.setFocusableInTouchMode(false);
        f.setFocusableInTouchMode(false);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b.setImportantForAccessibility(2);
            c.setImportantForAccessibility(2);
            g.setImportantForAccessibility(2);
            h.setImportantForAccessibility(2);
            a.setImportantForAccessibility(2);
            d.setImportantForAccessibility(2);
            e.setImportantForAccessibility(2);
            f.setImportantForAccessibility(2);
        }
    }

    public void a(String s1)
    {
        j = s1;
    }

    public void b()
    {
        b.setFocusableInTouchMode(true);
        c.setFocusableInTouchMode(true);
        g.setFocusableInTouchMode(true);
        g.setFocusable(true);
        h.setFocusableInTouchMode(true);
        a.setFocusableInTouchMode(true);
        d.setFocusableInTouchMode(true);
        e.setFocusableInTouchMode(true);
        f.setFocusableInTouchMode(true);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b.setImportantForAccessibility(1);
            c.setImportantForAccessibility(1);
            g.setImportantForAccessibility(1);
            h.setImportantForAccessibility(1);
            a.setImportantForAccessibility(1);
            d.setImportantForAccessibility(1);
            e.setImportantForAccessibility(1);
            f.setImportantForAccessibility(1);
        }
    }

    public void b(String s1)
    {
        k = s1;
    }

    public Button c()
    {
        return a;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        i1;
        JVM INSTR tableswitch 5 5: default 28
    //                   5 29;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (j1 == 1)
        {
            a.setEnabled(true);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        l = activity;
        try
        {
            i = (x)activity;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(o, new IntentFilter("update_logon"));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04003b, viewgroup, false);
        h = (ToggleButton)layoutinflater.findViewById(0x7f0f00cb);
        b = (EditText)layoutinflater.findViewById(0x7f0f00c6);
        c = (EditText)layoutinflater.findViewById(0x7f0f00c8);
        c.setTransformationMethod(new PasswordTransformationMethod());
        c.setRawInputType(129);
        a = (Button)layoutinflater.findViewById(0x7f0f00cd);
        a.setOnClickListener(n);
        g = (TextView)layoutinflater.findViewById(0x7f0f00c3);
        g.setOnClickListener(n);
        d = (TextView)layoutinflater.findViewById(0x7f0f00c4);
        e = (TextView)layoutinflater.findViewById(0x7f0f00cc);
        f = (TextView)layoutinflater.findViewById(0x7f0f00c9);
        if (WFApp.G())
        {
            b.setText(WFApp.M());
            h.setChecked(true);
        } else
        {
            h.setChecked(false);
        }
        b.addTextChangedListener(new s(this));
        h.setOnCheckedChangeListener(new t(this));
        c.setOnEditorActionListener(new u(this));
        m = r.a(l, (ViewGroup)layoutinflater);
        if (m != null)
        {
            m.loadUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append(getString(0x7f080174)).toString());
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(o);
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (m != null)
        {
            m.stopLoading();
            m.destroy();
            m = null;
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
        l = null;
    }

    public void onPause()
    {
        b.setText(WFApp.P());
        c.setText("");
        super.onPause();
    }

    public void onResume()
    {
        b.setText(WFApp.P());
        h.setChecked(WFApp.G());
        c.setText("");
        a.setEnabled(true);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        b.setText(WFApp.P());
        c.setText("");
        super.onSaveInstanceState(bundle);
    }
}
