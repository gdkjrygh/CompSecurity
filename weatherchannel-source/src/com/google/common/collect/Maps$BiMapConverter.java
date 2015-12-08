// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Maps, BiMap

private static final class ull extends Converter
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final BiMap bimap;

    private static Object convert(BiMap bimap1, Object obj)
    {
        bimap1 = ((BiMap) (bimap1.get(obj)));
        boolean flag;
        if (bimap1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "No non-null mapping present for input: %s", new Object[] {
            obj
        });
        return bimap1;
    }

    protected Object doBackward(Object obj)
    {
        return convert(bimap.inverse(), obj);
    }

    protected Object doForward(Object obj)
    {
        return convert(bimap, obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof bimap)
        {
            obj = (bimap)obj;
            return bimap.equals(((bimap) (obj)).bimap);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return bimap.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(bimap));
        return (new StringBuilder(s.length() + 18)).append("Maps.asConverter(").append(s).append(")").toString();
    }

    (BiMap bimap1)
    {
        bimap = (BiMap)Preconditions.checkNotNull(bimap1);
    }
}
