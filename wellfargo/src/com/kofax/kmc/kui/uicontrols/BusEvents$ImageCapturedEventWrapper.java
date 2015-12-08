// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.kut.utilities.error.KmcException;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            ImageCapturedListener, ImageCapturedEvent, j

public final class a extends a
{

    j a;

    public void onImageCaptured(a a1)
    {
        boolean flag;
        ((ImageCapturedListener)_listener).onImageCaptured(new ImageCapturedEvent(this, a1.e));
        flag = a.d;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        a1 = a1.e;
        a1.getClass();
        a1 = new com.kofax.kmc.ken.engines.data.istener(a1, "com.kofax.kmc.kui.uicontrols");
        a1.istener(Float.valueOf((float)a.a()));
        a1.istener(Float.valueOf((float)a.b()));
        return;
        a1;
        try
        {
            a1.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            logException(a1);
        }
        return;
    }

    public (ImageCapturedListener imagecapturedlistener, j j1)
    {
        super(imagecapturedlistener, com/kofax/kmc/kui/uicontrols/ImageCapturedListener);
        a = j1;
    }
}
