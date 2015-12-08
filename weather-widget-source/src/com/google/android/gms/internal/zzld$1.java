// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzlg, zzld

class nit> extends zzlg
{

    final zzld zzaew;

    protected void colClear()
    {
        zzaew.clear();
    }

    protected Object colGetEntry(int i, int j)
    {
        return zzaew.mArray[(i << 1) + j];
    }

    protected Map colGetMap()
    {
        return zzaew;
    }

    protected int colGetSize()
    {
        return zzaew.mSize;
    }

    protected int colIndexOfKey(Object obj)
    {
        if (obj == null)
        {
            return zzaew.indexOfNull();
        } else
        {
            return zzaew.indexOf(obj, obj.hashCode());
        }
    }

    protected int colIndexOfValue(Object obj)
    {
        return zzaew.indexOfValue(obj);
    }

    protected void colPut(Object obj, Object obj1)
    {
        zzaew.put(obj, obj1);
    }

    protected void colRemoveAt(int i)
    {
        zzaew.removeAt(i);
    }

    protected Object colSetValue(int i, Object obj)
    {
        return zzaew.setValueAt(i, obj);
    }

    (zzld zzld1)
    {
        zzaew = zzld1;
        super();
    }
}
