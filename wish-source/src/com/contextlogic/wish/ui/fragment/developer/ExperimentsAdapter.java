// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            ExperimentItem

public class ExperimentsAdapter extends ArrayAdapter
{
    static class ItemRowHolder
    {

        Spinner rowSpinner;
        TextView rowText;

        ItemRowHolder()
        {
        }
    }


    public ExperimentsAdapter(Context context, ArrayList arraylist)
    {
        super(context, 0x7f03004f, arraylist);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        final Object experiment = view;
        final String bucket;
        if (experiment == null)
        {
            viewgroup = ((Activity)getContext()).getLayoutInflater().inflate(0x7f03004f, viewgroup, false);
            view = new ItemRowHolder();
            view.rowText = (TextView)viewgroup.findViewById(0x7f0d01c4);
            view.rowSpinner = (Spinner)viewgroup.findViewById(0x7f0d01c5);
            viewgroup.setTag(view);
        } else
        {
            view = (ItemRowHolder)((View) (experiment)).getTag();
            viewgroup = ((ViewGroup) (experiment));
        }
        experiment = (ExperimentItem)getItem(i);
        ((ItemRowHolder) (view)).rowText.setText(((ExperimentItem) (experiment)).name);
        bucket = new ArrayAdapter(getContext(), 0x1090008, ((ExperimentItem) (experiment)).options);
        bucket.setDropDownViewResource(0x1090009);
        ((ItemRowHolder) (view)).rowSpinner.setAdapter(bucket);
        bucket = UserStatusManager.getInstance().getBucketForExperiment(((ExperimentItem) (experiment)).name);
        i = 0;
        do
        {
label0:
            {
                if (i < ((ExperimentItem) (experiment)).options.length)
                {
                    if (!((ExperimentItem) (experiment)).options[i].equals(bucket))
                    {
                        break label0;
                    }
                    ((ItemRowHolder) (view)).rowSpinner.setSelection(i);
                }
                ((ItemRowHolder) (view)).rowSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                    final ExperimentsAdapter this$0;
                    final String val$bucket;
                    final ExperimentItem val$experiment;

                    public void onItemSelected(AdapterView adapterview, View view1, int j, long l)
                    {
                        if (j == 0)
                        {
                            UserPreferences.setExperimentOverride(experiment.name, null);
                        } else
                        {
                            adapterview = experiment.options[j];
                            if (bucket == null || !adapterview.equals(bucket))
                            {
                                UserPreferences.setExperimentOverride(experiment.name, adapterview);
                                return;
                            }
                        }
                    }

                    public void onNothingSelected(AdapterView adapterview)
                    {
                    }

            
            {
                this$0 = ExperimentsAdapter.this;
                experiment = experimentitem;
                bucket = s;
                super();
            }
                });
                return viewgroup;
            }
            i++;
        } while (true);
    }
}
