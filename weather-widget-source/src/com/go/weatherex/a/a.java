// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.a;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gtp.go.weather.sharephoto.a.g;
import com.gtp.go.weather.sharephoto.b.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.go.weatherex.a:
//            e, d, c, b

public class a extends com.go.weatherex.framework.fragment.a
    implements TextWatcher, android.view.View.OnClickListener, e
{

    private View a;
    private EditText b;
    private TextView c;
    private Button d;
    private View e;
    private TextView f;
    private View g;
    private View h;
    private o i;
    private d j;
    private f k;
    private boolean l;

    public a()
    {
        l = false;
    }

    public static String a(String s)
    {
        return Pattern.compile("[^a-zA-Z0-9]").matcher(s).replaceAll("").trim();
    }

    static void a(a a1)
    {
        a1.b();
    }

    private void b()
    {
        String s = b.getText().toString();
        if (!TextUtils.isEmpty(s))
        {
            if (s.length() == 8)
            {
                a.setVisibility(8);
                c.setVisibility(8);
                h.setVisibility(0);
                d.setVisibility(8);
                j.a(getActivity().getApplicationContext(), s, i.b());
                return;
            } else
            {
                c.setText(b(0x7f080346));
                c.setVisibility(0);
                return;
            }
        } else
        {
            c.setText(b(0x7f080345));
            c.setVisibility(0);
            return;
        }
    }

    public void a(int i1)
    {
        if (getActivity() == null)
        {
            return;
        }
        h.setVisibility(8);
        a.setVisibility(0);
        d.setVisibility(0);
        switch (i1)
        {
        default:
            return;

        case 0: // '\0'
            c.setText(b(0x7f08034e));
            c.setVisibility(0);
            return;

        case 1: // '\001'
            l = true;
            f.setText(b(0x7f08034d));
            g.setVisibility(8);
            k.a("go_weather_ex_premium_activation", true);
            k.b("go_weather_ex_premium_activation");
            d.postDelayed(new com.go.weatherex.a.c(this), 1000L);
            return;

        case 2: // '\002'
            c.setText(b(0x7f08034f));
            c.setVisibility(0);
            return;

        case 3: // '\003'
            c.setText(b(0x7f080350));
            c.setVisibility(0);
            return;

        case 4: // '\004'
            c.setText(b(0x7f080351));
            c.setVisibility(0);
            return;

        case 5: // '\005'
            c.setText(b(0x7f080352));
            break;
        }
        c.setVisibility(0);
    }

    protected boolean a()
    {
        if (l)
        {
            return true;
        } else
        {
            return super.a();
        }
    }

    public void afterTextChanged(Editable editable)
    {
        editable = b.getText().toString();
        String s = a(editable.toString());
        if (TextUtils.isEmpty(s))
        {
            b.setTypeface(Typeface.defaultFromStyle(0));
        } else
        {
            b.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (!editable.equals(s))
        {
            b.setText(s);
            b.setSelection(s.length());
        }
        if (editable.length() < 8 && c.getVisibility() == 0)
        {
            c.setVisibility(8);
        }
    }

    public String b(int i1)
    {
        if (getActivity() != null)
        {
            return getActivity().getResources().getString(i1);
        } else
        {
            return "";
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        c = (TextView)c(0x7f09005c);
        c.setVisibility(8);
        d = (Button)c(0x7f09005e);
        e = c(0x7f09005f);
        f = (TextView)c(0x7f090058);
        g = c(0x7f090059);
        h = c(0x7f09005d);
        h.setVisibility(8);
        b = (EditText)c(0x7f09005b);
        a = c(0x7f09005a);
        b.addTextChangedListener(this);
        b.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(8)
        });
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        j = new d();
        j.a(this);
        k = com.gau.go.launcherex.gowidget.weather.c.c.a(getActivity().getApplicationContext()).e();
        i = new o(com.gtp.go.weather.sharephoto.a.g.a(getActivity().getApplicationContext()).b());
        if (TextUtils.isEmpty(i.b()))
        {
            boolean flag;
            if (!TextUtils.isEmpty(""))
            {
                i.b("");
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && !TextUtils.isEmpty(""))
            {
                i.b("");
            }
        }
        b.setOnEditorActionListener(new b(this));
        a(f, 4, 0);
    }

    public void onClick(View view)
    {
        if (view.equals(d))
        {
            b();
        } else
        if (view.equals(e))
        {
            view = new Intent(getActivity(), com/gau/go/launcherex/gowidget/billing/BillingActivity);
            view.addFlags(0x10000000);
            getActivity().startActivity(view);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030001, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        j.a();
    }

    public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }
}
