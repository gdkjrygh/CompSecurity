// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.SearchManager;
import android.os.Bundle;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import com.ubercab.experiment.model.Experiment;
import com.ubercab.experiment.model.ExperimentDefinition;
import com.ubercab.experiment.model.ExperimentDefinitions;
import com.ubercab.experiment.model.Experiments;
import com.ubercab.experiment.ui.ExperimentPreference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gmw extends PreferenceFragment
{

    private final bjw a = (new bjy()).a(new hnz()).c();
    private PreferenceCategory b;
    private PreferenceCategory c;
    private List d;
    private List e;

    public gmw()
    {
    }

    static PreferenceCategory a(gmw gmw1)
    {
        return gmw1.b;
    }

    public static gmw a(Experiments experiments, ExperimentDefinitions experimentdefinitions, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("current_treatments", experiments);
        bundle.putParcelable("experiment_definitions", experimentdefinitions);
        bundle.putString("preference_file", s);
        experiments = new gmw();
        experiments.setArguments(bundle);
        return experiments;
    }

    static List b(gmw gmw1)
    {
        return gmw1.d;
    }

    static PreferenceCategory c(gmw gmw1)
    {
        return gmw1.c;
    }

    static List d(gmw gmw1)
    {
        return gmw1.e;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = ((ExperimentDefinitions)getArguments().getParcelable("experiment_definitions")).getExperiments();
        Collections.sort(((List) (obj)), new _cls1());
        Object obj1 = ((Experiments)getArguments().getParcelable("current_treatments")).getExperiments();
        bundle = new HashMap(((List) (obj1)).size());
        Experiment experiment;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); bundle.put(experiment.getName(), experiment))
        {
            experiment = (Experiment)((Iterator) (obj1)).next();
        }

        obj1 = getActivity();
        setHasOptionsMenu(true);
        getPreferenceManager().setSharedPreferencesName(getArguments().getString("preference_file"));
        getPreferenceManager().setSharedPreferencesMode(0);
        PreferenceScreen preferencescreen = getPreferenceManager().createPreferenceScreen(((android.content.Context) (obj1)));
        setPreferenceScreen(preferencescreen);
        e = new ArrayList();
        c = new PreferenceCategory(((android.content.Context) (obj1)));
        c.setTitle(gms.category_feature_flags);
        preferencescreen.addPreference(c);
        d = new ArrayList();
        b = new PreferenceCategory(((android.content.Context) (obj1)));
        b.setTitle(gms.category_experiments);
        preferencescreen.addPreference(b);
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ExperimentDefinition experimentdefinition = (ExperimentDefinition)((Iterator) (obj)).next();
            ExperimentPreference experimentpreference = new ExperimentPreference(((android.content.Context) (obj1)), a, experimentdefinition, (Experiment)bundle.get(experimentdefinition.getName()));
            if (experimentdefinition.isFeatureFlag())
            {
                c.addPreference(experimentpreference);
                e.add(experimentpreference);
            } else
            {
                b.addPreference(experimentpreference);
                d.add(experimentpreference);
            }
        }

    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        menuinflater.inflate(gmr.search, menu);
        menuinflater = (SearchManager)getActivity().getSystemService("search");
        menu = (SearchView)menu.findItem(gmq.search).getActionView();
        menu.setSearchableInfo(menuinflater.getSearchableInfo(getActivity().getComponentName()));
        menu.setOnQueryTextListener(new _cls2());
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
