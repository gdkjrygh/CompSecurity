// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ProductGroup;

final class fxl
{

    private final ProductGroup a;

    public fxl(ProductGroup productgroup)
    {
        a = productgroup;
    }

    public final ProductGroup a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (fxl)obj;
            if (a == null || a.getGroupType() == null || ((fxl) (obj)).a == null || ((fxl) (obj)).a.getGroupType() == null || !a.getGroupType().equals(((fxl) (obj)).a.getGroupType()))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        if (a != null && a.getGroupType() != null)
        {
            return a.getGroupType().hashCode();
        } else
        {
            return 0;
        }
    }
}
