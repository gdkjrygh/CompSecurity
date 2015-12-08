// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.kui.uicontrols.BarCodeFoundEvent;
import com.kofax.kmc.kui.uicontrols.BarCodeFoundListener;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            a, c

class b
    implements BarCodeFoundListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void barCodeFound(BarCodeFoundEvent barcodefoundevent)
    {
        if (com.wf.wellsfargomobile.util.a.a(a) != null)
        {
            com.wf.wellsfargomobile.util.a.a(a).a(barcodefoundevent.getBarCode().getValue());
        }
    }
}
