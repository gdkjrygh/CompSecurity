// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.user.UserPreferences;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            ExperimentsAdapter, ExperimentItem

class val.bucket
    implements android.widget.ectedListener
{

    final ExperimentsAdapter this$0;
    final String val$bucket;
    final ExperimentItem val$experiment;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 0)
        {
            UserPreferences.setExperimentOverride(val$experiment.name, null);
        } else
        {
            adapterview = val$experiment.options[i];
            if (val$bucket == null || !adapterview.equals(val$bucket))
            {
                UserPreferences.setExperimentOverride(val$experiment.name, adapterview);
                return;
            }
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = final_experimentsadapter;
        val$experiment = experimentitem;
        val$bucket = String.this;
        super();
    }
}
