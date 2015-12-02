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
//            Shape_ExperimentDefinitions

public abstract class ExperimentDefinitions extends hnx
    implements Parcelable
{

    public ExperimentDefinitions()
    {
    }

    public static ExperimentDefinitions create()
    {
        return new Shape_ExperimentDefinitions();
    }

    public static ExperimentDefinitions create(List list)
    {
        return (new Shape_ExperimentDefinitions()).setExperiments(list);
    }

    public abstract List getExperiments();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        switch (_cls1..SwitchMap.com.ubercab.experiment.model.Shape_ExperimentDefinitions.Property[((Shape_ExperimentDefinitions.Property)hny).ordinal()])
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

    abstract ExperimentDefinitions setExperiments(List list);

    /* member class not found */
    class _cls1 {}

}
