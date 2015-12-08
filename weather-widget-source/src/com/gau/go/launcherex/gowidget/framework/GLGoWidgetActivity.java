// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.go.gl.GLActivity;
import com.go.gl.view.GLLayoutInflater;
import com.go.gowidget.core.IGoWidget3D;
import com.gtp.nextlauncher.widget.weatherwidget.Base;

public class GLGoWidgetActivity extends GLActivity
{

    public GLGoWidgetActivity()
    {
    }

    public static IGoWidget3D create3DWidget(Context context, GLLayoutInflater gllayoutinflater, Bundle bundle)
    {
        if (bundle.getInt("gowidget_type") >= 100)
        {
            return new Base(context);
        }
        if (bundle.getInt("NEXT_LAUNCHER_SUPPORT_WIDGET_VERSION") < 1)
        {
            Toast.makeText(context, 0x7f080592, 1).show();
        } else
        {
            Toast.makeText(context, 0x7f080593, 1).show();
        }
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        finish();
    }
}
