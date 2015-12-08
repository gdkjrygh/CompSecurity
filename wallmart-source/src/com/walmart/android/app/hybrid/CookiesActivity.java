// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CookiesActivity extends Activity
{

    public static String mCookies = null;

    public CookiesActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040036);
        if (mCookies != null && !mCookies.isEmpty())
        {
            bundle = mCookies.split(";");
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("\n");
            stringbuilder.append("\n");
            int j = bundle.length;
            for (int i = 0; i < j; i++)
            {
                String s = bundle[i];
                stringbuilder.append("\n");
                stringbuilder.append(s);
            }

            ((TextView)findViewById(0x7f1000c1)).setText(stringbuilder.toString());
        }
    }

}
