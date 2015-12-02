// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.experiment.ui;

import android.content.Context;
import android.preference.ListPreference;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bjw;
import bkm;
import com.ubercab.experiment.model.Experiment;
import com.ubercab.experiment.model.ExperimentDefinition;
import com.ubercab.experiment.model.TreatmentGroupDefinition;
import gms;
import java.util.Iterator;
import java.util.List;

public class ExperimentPreference extends ListPreference
{

    private final Experiment a;
    private final ExperimentDefinition b;
    private final bjw c;
    private ForegroundColorSpan d;
    private ForegroundColorSpan e;
    private CharSequence f;

    public ExperimentPreference(Context context, bjw bjw1, ExperimentDefinition experimentdefinition, Experiment experiment)
    {
        super(context);
        a = experiment;
        b = experimentdefinition;
        c = bjw1;
        setPersistent(true);
        setKey(experimentdefinition.getName());
        setSummary(experimentdefinition.getDescription());
        String s = context.getString(gms.value_server);
        bjw1 = context.getString(gms.value_off);
        experiment = context.getString(gms.value_on);
        TextAppearanceSpan textappearancespan = new TextAppearanceSpan(context, 0x10301b3);
        d = new ForegroundColorSpan(0xff0000ff);
        e = new ForegroundColorSpan(0xffcccccc);
        List list = experimentdefinition.getTreatmentGroups();
        int j = list.size();
        CharSequence acharsequence[] = new CharSequence[j + 1];
        CharSequence acharsequence1[] = new CharSequence[j + 1];
        acharsequence[0] = s;
        acharsequence1[0] = "server_value";
        int i = 0;
        while (i < j) 
        {
            context = (TreatmentGroupDefinition)list.get(i);
            acharsequence1[i + 1] = context.getName();
            if (experimentdefinition.isFeatureFlag())
            {
                if (context.getName().equals("control"))
                {
                    context = bjw1;
                } else
                {
                    context = experiment;
                }
                acharsequence[i + 1] = context;
            } else
            {
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                spannablestringbuilder.append(context.getName());
                if (!TextUtils.isEmpty(context.getDescription()))
                {
                    spannablestringbuilder.append('\n');
                    int k = spannablestringbuilder.length();
                    spannablestringbuilder.append(context.getDescription());
                    spannablestringbuilder.setSpan(textappearancespan, k, spannablestringbuilder.length(), 33);
                }
                acharsequence[i + 1] = spannablestringbuilder;
            }
            i++;
        }
        setEntries(acharsequence);
        setEntryValues(acharsequence1);
        setDefaultValue("server_value");
    }

    private void a()
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getKey());
        spannablestringbuilder.append('\n');
        spannablestringbuilder.append(b());
        super.setTitle(spannablestringbuilder.toString());
    }

    private CharSequence b()
    {
        if (getValue() == null || "server_value".equalsIgnoreCase(getValue()))
        {
            Object obj;
            if (a == null)
            {
                obj = new SpannableString("untreated");
            } else
            if (b.isFeatureFlag())
            {
                obj = getContext();
                int i;
                if ("control".equalsIgnoreCase(a.getTreatmentGroupName()))
                {
                    i = gms.value_off;
                } else
                {
                    i = gms.value_on;
                }
                obj = new SpannableString(((Context) (obj)).getString(i));
            } else
            {
                obj = new SpannableString(a.getTreatmentGroupName());
            }
            ((SpannableString) (obj)).setSpan(e, 0, ((SpannableString) (obj)).length(), 33);
            return ((CharSequence) (obj));
        }
        Object obj1;
        if (b.isFeatureFlag())
        {
            obj1 = getContext();
            int j;
            if ("control".equalsIgnoreCase(getValue()))
            {
                j = gms.value_off;
            } else
            {
                j = gms.value_on;
            }
            obj1 = new SpannableString(((Context) (obj1)).getString(j));
        } else
        {
            obj1 = new SpannableString(getValue());
        }
        ((SpannableString) (obj1)).setSpan(d, 0, ((SpannableString) (obj1)).length(), 33);
        return ((CharSequence) (obj1));
    }

    protected String getPersistedString(String s)
    {
        String s1;
        s1 = super.getPersistedString(s);
        if (TextUtils.equals(s1, s))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        s = ((TreatmentGroupDefinition)c.a(s1, com/ubercab/experiment/model/TreatmentGroupDefinition)).getName();
        return s;
        s;
_L2:
        return s1;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public CharSequence getSummary()
    {
        return f;
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = super.onCreateView(viewgroup);
        TextView textview = (TextView)viewgroup.findViewById(0x1020016);
        if (textview != null)
        {
            textview.setSingleLine(false);
        }
        return viewgroup;
    }

    protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
    {
        super.onPrepareDialogBuilder(builder);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(getKey());
        if (!TextUtils.isEmpty(getSummary()))
        {
            spannablestringbuilder.append('\n');
            int i = spannablestringbuilder.length();
            spannablestringbuilder.append(getSummary());
            spannablestringbuilder.setSpan(new TextAppearanceSpan(getContext(), 0x10301b3), i, spannablestringbuilder.length(), 33);
        }
        builder.setTitle(spannablestringbuilder);
    }

    protected boolean persistString(String s)
    {
        if (!shouldPersist()) goto _L2; else goto _L1
_L1:
        if (s == null || "server_value".equals(s))
        {
            s = null;
            break MISSING_BLOCK_LABEL_22;
        }
        obj = b.getTreatmentGroups().iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        treatmentgroupdefinition = (TreatmentGroupDefinition)((Iterator) (obj)).next();
        if (!TextUtils.equals(s, treatmentgroupdefinition.getName())) goto _L6; else goto _L5
_L5:
        s = c.a(treatmentgroupdefinition);
        continue; /* Loop/switch isn't completed */
_L8:
        Object obj;
        TreatmentGroupDefinition treatmentgroupdefinition;
        if (TextUtils.equals(s, super.getPersistedString(null)))
        {
            return true;
        }
        obj = getEditor();
        ((android.content.SharedPreferences.Editor) (obj)).putString(getKey(), s);
        if (shouldCommit())
        {
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
        return true;
_L2:
        return false;
_L4:
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setKey(String s)
    {
        super.setKey(s);
        a();
    }

    public void setSummary(CharSequence charsequence)
    {
        if (charsequence == null && f != null || charsequence != null && !charsequence.equals(f))
        {
            f = charsequence;
            notifyChanged();
        }
    }

    public void setTitle(CharSequence charsequence)
    {
        setKey(charsequence.toString());
    }

    public void setValue(String s)
    {
        super.setValue(s);
        a();
    }
}
