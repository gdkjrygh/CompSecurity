// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment.model;

import android.os.Parcelable;
import hnx;
import hny;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.ubercab.experiment.model:
//            Shape_TreatmentGroupDefinition

public abstract class TreatmentGroupDefinition extends hnx
    implements Parcelable
{

    public TreatmentGroupDefinition()
    {
    }

    public static TreatmentGroupDefinition create(String s, String s1)
    {
        return (new Shape_TreatmentGroupDefinition()).setName(s).setDescription(s1);
    }

    public static TreatmentGroupDefinition create(String s, String s1, Map map)
    {
        return (new Shape_TreatmentGroupDefinition()).setName(s).setDescription(s1).setParameters(map);
    }

    public abstract String getDescription();

    public abstract String getId();

    public abstract String getName();

    public abstract Map getParameters();

    public abstract String getSegmentUuid();

    protected Object onGet(hny hny, Object obj)
    {
        if (obj != null)
        {
            return obj;
        }
        switch (_cls1..SwitchMap.com.ubercab.experiment.model.Shape_TreatmentGroupDefinition.Property[((Shape_TreatmentGroupDefinition.Property)hny).ordinal()])
        {
        default:
            return super.onGet(hny, obj);

        case 1: // '\001'
            hny = new HashMap();
            break;
        }
        setParameters(hny);
        return hny;
    }

    abstract TreatmentGroupDefinition setDescription(String s);

    abstract TreatmentGroupDefinition setId(String s);

    abstract TreatmentGroupDefinition setName(String s);

    abstract TreatmentGroupDefinition setParameters(Map map);

    abstract TreatmentGroupDefinition setSegmentUuid(String s);

    /* member class not found */
    class _cls1 {}

}
