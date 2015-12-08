// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.view.ViewGroup;
import com.kofax.kmc.kui.uicontrols.BarCodeCaptureView;
import com.kofax.kmc.kui.uicontrols.BarCodeFoundListener;
import com.kofax.kmc.kui.uicontrols.data.SearchDirection;
import com.kofax.kmc.kui.uicontrols.data.Symbology;
import com.kofax.kmc.kut.utilities.Licensing;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            b, c

public class a
{

    public BarCodeFoundListener a;
    private c b;
    private BarCodeCaptureView c;

    public a()
    {
        c = null;
        a = new b(this);
    }

    static c a(a a1)
    {
        return a1.b;
    }

    public void a()
    {
        if (c != null)
        {
            c.removeBarCodeFoundEventListener(a);
        }
    }

    public void a(ViewGroup viewgroup, c c1)
    {
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_9;
        }
        b = c1;
        if (viewgroup == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (c == null)
        {
            c = (BarCodeCaptureView)viewgroup.getChildAt(0);
        }
        if (c != null)
        {
            c.setSymbologies(new Symbology[] {
                Symbology.QR
            });
            c.setSearchDirection(new SearchDirection[] {
                SearchDirection.HORIZONTAL
            });
            c.addBarCodeFoundEventListener(a);
            c.readBarcode();
        }
_L1:
        return;
        viewgroup;
        if (c1 != null)
        {
            c1.f();
            return;
        }
          goto _L1
    }

    public void a(String s)
    {
        Licensing.setMobileSDKLicense(s);
    }
}
