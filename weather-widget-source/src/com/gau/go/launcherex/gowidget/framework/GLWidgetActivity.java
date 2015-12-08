// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.go.gl.GLActivity;
import com.go.gl.view.GLLayoutInflater;
import com.go.gowidget.core.IGoWidget3D;

public class GLWidgetActivity extends GLActivity
{

    public GLWidgetActivity()
    {
    }

    public static IGoWidget3D create3DWidget(Context context, GLLayoutInflater gllayoutinflater, Bundle bundle)
    {
        int j;
        j = bundle.getInt("gowidget_type");
        bundle = context.getResources().getIntArray(0x7f0d0005);
        int i = 0;
_L6:
        if (i >= bundle.length)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        if (bundle[i] != j) goto _L2; else goto _L1
_L1:
        if (i == -1) goto _L4; else goto _L3
_L3:
        bundle = context.getResources().getStringArray(0x7f0d0008);
        if (i >= bundle.length) goto _L4; else goto _L5
_L5:
        context = (IGoWidget3D)gllayoutinflater.inflate(context.getResources().getIdentifier((new StringBuilder()).append(bundle[i]).append("_3d").toString(), "layout", context.getPackageName()), null);
        return context;
_L2:
        i++;
          goto _L6
        context;
        context.printStackTrace();
_L4:
        return null;
        i = -1;
          goto _L1
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        finish();
    }
}
