// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.config;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.walmart.android.config:
//            WalmartStoreConfigurator

public class mWindowView
    implements com.google.android.gms.maps.WindowView
{

    private final View mWindowView;
    final WalmartStoreConfigurator this$0;

    public View getInfoContents(Marker marker)
    {
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        Object obj = marker.getTitle();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((TextView)mWindowView.findViewById(0x7f10004f)).setText(((CharSequence) (obj)));
            marker = marker.getSnippet();
            obj = (TextView)mWindowView.findViewById(0x7f1005c2);
            if (!TextUtils.isEmpty(marker))
            {
                ((TextView) (obj)).setText(marker);
            } else
            {
                ((TextView) (obj)).setText("");
            }
            return mWindowView;
        } else
        {
            return null;
        }
    }

    public (Context context)
    {
        this$0 = WalmartStoreConfigurator.this;
        super();
        mWindowView = LayoutInflater.from(context).inflate(0x7f0401aa, null);
    }
}
