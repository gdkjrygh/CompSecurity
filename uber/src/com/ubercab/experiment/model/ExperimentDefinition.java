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
//            Shape_ExperimentDefinition

public abstract class ExperimentDefinition extends hnx
    implements Parcelable
{

    public ExperimentDefinition()
    {
    }

    public static ExperimentDefinition create(String s, String s1, boolean flag, List list)
    {
        return (new Shape_ExperimentDefinition()).setName(s).setDescription(s1).setIsFeatureFlag(flag).setTreatmentGroups(list);
    }

    public static ExperimentDefinition create(String s, boolean flag)
    {
        return (new Shape_ExperimentDefinition()).setName(s).setIsFeatureFlag(flag);
    }

    public abstract String getDescription();

    abstract String getId();

    abstract boolean getIsFeatureFlag();

    public abstract String getName();

    public abstract List getTreatmentGroups();

    public boolean isFeatureFlag()
    {
        return getIsFeatureFlag();
    }

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        switch (_cls1..SwitchMap.com.ubercab.experiment.model.Shape_ExperimentDefinition.Property[((Shape_ExperimentDefinition.Property)hny).ordinal()])
        {
        default:
            return super.onGet(hny, obj);

        case 1: // '\001'
            hny = new ArrayList();
            break;
        }
        setTreatmentGroups(hny);
        return hny;
    }

    abstract ExperimentDefinition setDescription(String s);

    abstract ExperimentDefinition setId(String s);

    abstract ExperimentDefinition setIsFeatureFlag(boolean flag);

    abstract ExperimentDefinition setName(String s);

    abstract ExperimentDefinition setTreatmentGroups(List list);

    /* member class not found */
    class _cls1 {}

}
