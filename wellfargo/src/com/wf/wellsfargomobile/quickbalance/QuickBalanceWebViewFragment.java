// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.quickbalance;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.wf.wellsfargomobile.MainActivity;
import com.wf.wellsfargomobile.util.v;
import com.wf.wellsfargomobile.webview.a;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class QuickBalanceWebViewFragment extends Fragment
{

    private MainActivity a;
    private RelativeLayout b;
    private WebView c;

    public QuickBalanceWebViewFragment()
    {
    }

    public void a()
    {
        b.removeView(c);
        b.setVisibility(8);
    }

    public void a(String s)
    {
        try
        {
            Object obj = a.getApplicationContext().getSharedPreferences("native_bridge_prefs", 0);
            String s1 = ((SharedPreferences) (obj)).getString("prefToken", "");
            obj = ((SharedPreferences) (obj)).getString("pactToken", "");
            ArrayList arraylist = new ArrayList();
            arraylist.add(new BasicNameValuePair("nonce", s));
            arraylist.add(new BasicNameValuePair("prefToken", s1));
            arraylist.add(new BasicNameValuePair("pact", ((String) (obj))));
            s = new UrlEncodedFormEntity(arraylist);
            b.setVisibility(0);
            c = com.wf.wellsfargomobile.webview.a.a(a);
            b.addView(c);
            c.postUrl((new StringBuilder()).append(com.wf.wellsfargomobile.a.a.b()).append("/begin.action").toString(), EntityUtils.toByteArray(s));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void b(String s)
    {
        if (s != null && !s.trim().isEmpty())
        {
            String s1 = v.c("pactToken");
            s1 = (new StringBuilder()).append("{\"key\":\"").append("pact").append("\",").append("\"value\":\"").append(s1).append("\"}").toString();
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(s);
            stringbuilder.append("(");
            stringbuilder.append(s1);
            stringbuilder.append(");");
            if (c != null)
            {
                c.loadUrl((new StringBuilder()).append("javascript:").append(stringbuilder.toString()).toString());
            }
        }
    }

    public boolean b()
    {
        return b.getVisibility() == 0;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = (MainActivity)activity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040029, viewgroup, false);
        b = (RelativeLayout)layoutinflater.findViewById(0x7f0f0081);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (c != null)
        {
            c.stopLoading();
            c.destroy();
        }
    }

    public void onDetach()
    {
        super.onDetach();
        a = null;
    }

    public void onStop()
    {
        super.onStop();
        if (c != null)
        {
            c.stopLoading();
        }
    }
}
