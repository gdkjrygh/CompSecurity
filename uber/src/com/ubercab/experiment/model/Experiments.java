// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment.model;

import android.os.Parcelable;
import hnx;
import hny;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.experiment.model:
//            Shape_Experiments

public abstract class Experiments extends hnx
    implements Parcelable
{

    public Experiments()
    {
    }

    public static Experiments create()
    {
        return new Shape_Experiments();
    }

    public abstract List getExperiments();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        switch (_cls1..SwitchMap.com.ubercab.experiment.model.Shape_Experiments.Property[((Shape_Experiments.Property)hny).ordinal()])
        {
        default:
            return super.onGet(hny, obj);

        case 1: // '\001'
            hny = new ArrayList();
            break;
        }
        setExperiments(hny);
        return hny;
    }

    public abstract Experiments setExperiments(List list);

    /* member class not found */
    class _cls1 {}

}
