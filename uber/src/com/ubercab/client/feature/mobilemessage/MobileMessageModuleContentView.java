// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.mobilemessage;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.ubercab.rider.realtime.model.MobileMessageModule;
import duy;
import efc;
import efd;
import ijg;
import java.util.List;

public class MobileMessageModuleContentView extends WebView
{

    private int a;
    private efc b;

    public MobileMessageModuleContentView(Context context)
    {
        this(context, null);
    }

    public MobileMessageModuleContentView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MobileMessageModuleContentView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        setLayerType(1, null);
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }

    public static MobileMessageModuleContentView a(Context context, efc efc, String s, MobileMessageModule mobilemessagemodule, Object obj, int i)
    {
        context = new MobileMessageModuleContentView(context);
        context.a(s, mobilemessagemodule, i, obj);
        context.a(efc);
        return context;
    }

    public static efc a(MobileMessageModuleContentView mobilemessagemodulecontentview)
    {
        return mobilemessagemodulecontentview.b;
    }

    private static String a(MobileMessageModule mobilemessagemodule, int i)
    {
        mobilemessagemodule = mobilemessagemodule.getContent();
        if (mobilemessagemodule == null || i < 0 || i >= mobilemessagemodule.size())
        {
            mobilemessagemodule = "";
        } else
        {
            String s = (String)mobilemessagemodule.get(i);
            mobilemessagemodule = s;
            if (s == null)
            {
                return "";
            }
        }
        return mobilemessagemodule;
    }

    private void a(efc efc)
    {
        b = efc;
    }

    private void a(String s, MobileMessageModule mobilemessagemodule, int i, Object obj)
    {
        a = i;
        obj = new duy(obj);
        setWebViewClient(new efd(this, (byte)0));
        obj = ((duy) (obj)).a(a(mobilemessagemodule, i));
        s = ((String) (obj));
_L2:
        loadDataWithBaseURL(null, s, "text/html", "utf-8", null);
        return;
        obj;
        ijg.d(((Throwable) (obj)), "Exception parsing text in mobile message id = %s", new Object[] {
            s
        });
        s = a(mobilemessagemodule, i);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int b(MobileMessageModuleContentView mobilemessagemodulecontentview)
    {
        return mobilemessagemodulecontentview.a;
    }
}
