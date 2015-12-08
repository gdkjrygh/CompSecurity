// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.graphics.Rect;
import com.go.gl.view.GLView;
import java.util.ArrayList;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            PanelMain, CityView

class h
    implements com.go.gl.view.GLView.OnClickListener
{

    final PanelMain a;

    h(PanelMain panelmain)
    {
        a = panelmain;
        super();
    }

    public void onClick(GLView glview)
    {
        PanelMain.access$000(a);
        if (PanelMain.access$300(a).contains((int)PanelMain.access$100(a), (int)PanelMain.access$200(a)))
        {
            PanelMain.access$400(a, false);
            return;
        }
        if (PanelMain.access$500(a).contains((int)PanelMain.access$100(a), (int)PanelMain.access$200(a)))
        {
            PanelMain.access$400(a, true);
            return;
        }
        if (PanelMain.access$600(a).contains((int)PanelMain.access$100(a), (int)PanelMain.access$200(a)))
        {
            PanelMain.access$700(a);
            return;
        }
        if (PanelMain.access$800(a) != null && PanelMain.access$800(a).size() > 0)
        {
            ((CityView)PanelMain.access$800(a).get(PanelMain.access$900(a))).startWeatherAnimation();
            return;
        } else
        {
            PanelMain.access$1000(a);
            return;
        }
    }
}
