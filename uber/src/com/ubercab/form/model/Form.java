// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.form.model;

import android.os.Parcelable;
import hnx;
import hny;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.form.model:
//            Shape_Form

public abstract class Form extends hnx
    implements Parcelable
{

    public Form()
    {
    }

    public static Form create()
    {
        return new Shape_Form();
    }

    public abstract List getComponents();

    public abstract String getDescription();

    public abstract String getIcon();

    public abstract String getId();

    public abstract Map getOptions();

    public abstract String getTitle();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.form.model.Shape_Form.Property[((Shape_Form.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 30;
           goto _L1 _L2
_L1:
        return obj;
_L2:
        if (obj == null)
        {
            hny = new ArrayList();
            setComponents(hny);
            return hny;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public abstract void setComponents(List list);

    protected abstract void setDescription(String s);

    protected abstract void setIcon(String s);

    protected abstract void setId(String s);

    public abstract void setOptions(Map map);

    protected abstract void setTitle(String s);

    /* member class not found */
    class _cls1 {}

}
