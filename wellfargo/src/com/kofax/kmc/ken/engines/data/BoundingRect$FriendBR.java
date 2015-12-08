// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Rect;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BoundingRect

public class SUPPORTED_OPERATION
{

    final BoundingRect this$0;

    public boolean isValid()
    {
        while (BoundingRect.access$000(BoundingRect.this).left > BoundingRect.access$000(BoundingRect.this).right || BoundingRect.access$000(BoundingRect.this).top > BoundingRect.access$000(BoundingRect.this).bottom) 
        {
            return false;
        }
        return true;
    }

    public (String s)
    {
        this$0 = BoundingRect.this;
        super();
        if (!b.c(s, "com.kofax"))
        {
            throw new KmcException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        } else
        {
            return;
        }
    }
}
