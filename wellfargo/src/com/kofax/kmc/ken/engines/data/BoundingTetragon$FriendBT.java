// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.ken.engines.data;

import android.graphics.Point;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import org.a.a.a.b;

// Referenced classes of package com.kofax.kmc.ken.engines.data:
//            BoundingTetragon

public class ORTED_OPERATION
{

    final BoundingTetragon this$0;

    public boolean isAllZero()
    {
        while (BoundingTetragon.access$000(BoundingTetragon.this).x != 0 || BoundingTetragon.access$000(BoundingTetragon.this).y != 0 || BoundingTetragon.access$200(BoundingTetragon.this).x != 0 || BoundingTetragon.access$200(BoundingTetragon.this).y != 0 || BoundingTetragon.access$100(BoundingTetragon.this).x != 0 || BoundingTetragon.access$100(BoundingTetragon.this).y != 0 || BoundingTetragon.access$300(BoundingTetragon.this).x != 0 || BoundingTetragon.access$300(BoundingTetragon.this).y != 0) 
        {
            return false;
        }
        return true;
    }

    public boolean isValid()
    {
        while (BoundingTetragon.access$000(BoundingTetragon.this).x > BoundingTetragon.access$100(BoundingTetragon.this).x || BoundingTetragon.access$000(BoundingTetragon.this).y > BoundingTetragon.access$200(BoundingTetragon.this).y || BoundingTetragon.access$100(BoundingTetragon.this).y > BoundingTetragon.access$300(BoundingTetragon.this).y || BoundingTetragon.access$200(BoundingTetragon.this).x > BoundingTetragon.access$300(BoundingTetragon.this).x) 
        {
            return false;
        }
        return true;
    }

    public String toExtCornersOpString(String s)
    {
        String s1 = (new StringBuilder()).append(s).append("<PropertyName=\"CSkewDetect.use_external_page_corners.Bool\" Value=\"1\" Comment=\"DEFAULT   0\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_tl_x.double\" Value=\"").append(BoundingTetragon.access$000(BoundingTetragon.this).x).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_tl_y.double\" Value=\"").append(BoundingTetragon.access$000(BoundingTetragon.this).y).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_tr_x.double\" Value=\"").append(BoundingTetragon.access$100(BoundingTetragon.this).x).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_tr_y.double\" Value=\"").append(BoundingTetragon.access$100(BoundingTetragon.this).y).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_bl_x.double\" Value=\"").append(BoundingTetragon.access$200(BoundingTetragon.this).x).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_bl_y.double\" Value=\"").append(BoundingTetragon.access$200(BoundingTetragon.this).y).append("\" />").toString();
        s1 = (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_br_x.double\" Value=\"").append(BoundingTetragon.access$300(BoundingTetragon.this).x).append("\" />").toString();
        return (new StringBuilder()).append(s1).append(s).append("<PropertyName=\"CSkewDetect.external_page_corner_br_y.double\" Value=\"").append(BoundingTetragon.access$300(BoundingTetragon.this).y).append("\" />").toString();
    }

    public (String s)
    {
        this$0 = BoundingTetragon.this;
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
