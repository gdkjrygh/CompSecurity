// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.go.gl.view.GLLayoutInflater;
import com.go.gowidget.core.IFullScreenNextWidget;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            a, PanelMain

public class MainActivity extends Activity
{

    public MainActivity()
    {
    }

    public static IFullScreenNextWidget create3DWidget(Context context, GLLayoutInflater gllayoutinflater, Bundle bundle)
    {
        a.a = bundle.getString("next_launcher_package");
        return new PanelMain(context);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        finish();
    }
}
