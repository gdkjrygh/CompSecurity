// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment.model;

import android.os.Parcelable;
import android.text.TextUtils;
import hnx;
import hny;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.ubercab.experiment.model:
//            Shape_Experiment, TreatmentGroupDefinition

public abstract class Experiment extends hnx
    implements Parcelable
{

    public static final String TREATMENT_GROUP_CONTROL = "control";

    public Experiment()
    {
    }

    public static Experiment create()
    {
        return new Shape_Experiment();
    }

    public static Experiment create(String s, TreatmentGroupDefinition treatmentgroupdefinition)
    {
        Shape_Experiment shape_experiment = new Shape_Experiment();
        shape_experiment.setName(s);
        shape_experiment.setTreatmentGroupId(treatmentgroupdefinition.getId());
        shape_experiment.setTreatmentGroupName(treatmentgroupdefinition.getName());
        shape_experiment.setParameters(treatmentgroupdefinition.getParameters());
        shape_experiment.setSegmentUuid(treatmentgroupdefinition.getSegmentUuid());
        return shape_experiment;
    }

    public static Experiment create(String s, String s1)
    {
        return create(s, TreatmentGroupDefinition.create(s1, null));
    }

    public abstract String getId();

    public abstract String getName();

    public abstract Map getParameters();

    public abstract String getSegmentUuid();

    public abstract String getTreatmentGroupId();

    public abstract String getTreatmentGroupName();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.experiment.model.Shape_Experiment.Property[((Shape_Experiment.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 39
    //                   2 59;
           goto _L1 _L2 _L3
_L1:
        return super.onGet(hny, obj);
_L2:
        if (TextUtils.isEmpty((CharSequence)obj))
        {
            setTreatmentGroupName("control");
            return "control";
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (obj == null)
        {
            hny = new HashMap();
            setParameters(hny);
            return hny;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public abstract Experiment setId(String s);

    public abstract Experiment setName(String s);

    public abstract Experiment setParameters(Map map);

    public abstract Experiment setSegmentUuid(String s);

    public abstract Experiment setTreatmentGroupId(String s);

    public abstract Experiment setTreatmentGroupName(String s);

    /* member class not found */
    class _cls1 {}

}
