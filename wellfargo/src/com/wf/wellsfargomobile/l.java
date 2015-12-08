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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.FrontPorchDownloadService;

// Referenced classes of package com.wf.wellsfargomobile:
//            o, FrontPorchTilesWebViewFragment, MainActivity, p, 
//            i, m, n, WFApp

public abstract class l extends Fragment
{

    public RelativeLayout a;
    private MainActivity b;
    private WebView c;
    private boolean d;
    private i e;
    private final BroadcastReceiver f = new o(this);

    public l()
    {
        d = false;
    }

    static MainActivity a(l l1)
    {
        return l1.b;
    }

    public abstract String a();

    public void a(String s)
    {
        if (c != null)
        {
            Intent intent = new Intent(b, com/wf/wellsfargomobile/util/FrontPorchDownloadService);
            intent.putExtra("url_path", s);
            if (this instanceof FrontPorchTilesWebViewFragment)
            {
                s = "tiles";
            } else
            {
                s = "menu";
            }
            intent.putExtra("url_type", s);
            b.startService(intent);
            a.setVisibility(0);
        }
    }

    public void b(String s)
    {
        a(s);
    }

    public boolean b()
    {
        return d;
    }

    public i c()
    {
        return e;
    }

    public void c(String s)
    {
        if (!b())
        {
            a(s);
        }
    }

    public void d(String s)
    {
        if (s != null)
        {
            try
            {
                c.loadDataWithBaseURL(com.wf.wellsfargomobile.a.a.a(), s, "text/html", "utf-8", null);
                c.requestLayout();
                d = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                d = false;
            }
        } else
        {
            d = false;
        }
        a.setVisibility(8);
    }

    public void e(String s)
    {
        (new p(this)).b(new String[] {
            s
        });
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = (MainActivity)activity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        e = new i();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04002a, viewgroup, false);
        viewgroup = (FrameLayout)layoutinflater.findViewById(0x7f0f0083);
        if (c == null)
        {
            c = com.wf.wellsfargomobile.webview.a.a(b, this);
            bundle = new android.widget.FrameLayout.LayoutParams(-1, -1);
            c.setLayoutParams(bundle);
        } else
        {
            ((ViewGroup)c.getParent()).removeView(c);
        }
        viewgroup.addView(c, 0);
        c.setOnTouchListener(new m(this));
        a = (RelativeLayout)layoutinflater.findViewById(0x7f0f0084);
        a.setVisibility(8);
        a.setOnTouchListener(new n(this));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        if (c != null)
        {
            c.stopLoading();
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        super.onDetach();
        b = null;
    }

    public void onPause()
    {
        super.onPause();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            c.onPause();
        }
        LocalBroadcastManager.getInstance(b.getApplicationContext()).unregisterReceiver(f);
    }

    public void onResume()
    {
        super.onResume();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            c.onResume();
        }
        LocalBroadcastManager.getInstance(b.getApplicationContext()).registerReceiver(f, new IntentFilter("com.wf.wellsfargomobile.frontPorchDownload.receiver"));
        if (!WFApp.d())
        {
            c(a());
        }
    }
}
