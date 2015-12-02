// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.model;

import android.os.Parcelable;
import bjw;
import bkd;
import bkm;
import com.ubercab.form.model.Component;
import com.ubercab.form.model.Form;
import hnx;
import hny;
import ijg;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.model:
//            Shape_OnboardingForm, Shape_OfficeHours, OfficeHours

public abstract class OnboardingForm extends hnx
    implements Parcelable
{

    private static final String KEY_OPTION_OFFICE_HOURS = "office_hours";
    private static final String KEY_OPTION_OFFICE_HOURS_POIS = "pois";
    private static final String KEY_STEP_CONTINUE_LABEL = "step_continue_label";
    private static final String KEY_STEP_LEGAL_CONSENT = "step_legal_consent";
    private static final String KEY_STEP_TITLE = "step_title";
    private OfficeHours mOfficeHours;

    public OnboardingForm()
    {
    }

    public static OnboardingForm create()
    {
        return new Shape_OnboardingForm();
    }

    public abstract Form getForm();

    public OfficeHours getOfficeHours(bjw bjw1)
    {
        if (mOfficeHours == null)
        {
            Object obj = getForm();
            if (obj != null && ((Form) (obj)).getOptions() != null)
            {
                obj = (bkd)((Form) (obj)).getOptions().get("office_hours");
                if (obj != null)
                {
                    try
                    {
                        mOfficeHours = (OfficeHours)bjw1.a(((bkd) (obj)), com/ubercab/android/partner/funnel/onboarding/model/Shape_OfficeHours);
                    }
                    // Misplaced declaration of an exception variable
                    catch (bjw bjw1)
                    {
                        ijg.c("Malformed office hours payload.", new Object[0]);
                    }
                }
            }
            if (mOfficeHours == null)
            {
                mOfficeHours = OfficeHours.create();
            }
        }
        return mOfficeHours;
    }

    public abstract int getStatusCode();

    public abstract String getStepContinueLabel();

    public abstract String getStepLegalConsent();

    public abstract String getStepTitle();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.android.partner.funnel.onboarding.model.Shape_OnboardingForm.Property[((Shape_OnboardingForm.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 38
    //                   2 92
    //                   3 147;
           goto _L1 _L2 _L3 _L4
_L1:
        return obj;
_L2:
        if (obj != null || ((hny = getForm()) == null || hny.getOptions() == null) || (hny = (bkd)hny.getOptions().get("step_legal_consent")) == null) goto _L1; else goto _L5
_L5:
        hny = hny.b();
        setStepLegalConsent((String)hny);
_L9:
        return hny;
_L3:
        if (obj != null) goto _L1; else goto _L6
_L6:
        hny = getForm();
        if (hny == null || hny.getOptions() == null) goto _L1; else goto _L7
_L7:
        hny = (bkd)hny.getOptions().get("step_continue_label");
        if (hny == null) goto _L1; else goto _L8
_L8:
        hny = hny.b();
        setStepContinueLabel((String)hny);
          goto _L9
_L4:
        if (obj != null) goto _L1; else goto _L10
_L10:
        hny = getForm();
        if (hny == null || hny.getOptions() == null) goto _L1; else goto _L11
_L11:
        hny = (bkd)hny.getOptions().get("step_title");
        if (hny == null) goto _L1; else goto _L12
_L12:
        hny = hny.b();
        setStepTitle((String)hny);
          goto _L9
    }

    public abstract void setForm(Form form);

    abstract void setStatusCode(int i);

    abstract void setStepContinueLabel(String s);

    abstract void setStepLegalConsent(String s);

    abstract OnboardingForm setStepTitle(String s);

    public boolean shouldDisplaySubmitButton()
    {
        if (getForm() != null && getForm().getComponents() != null && !getForm().getComponents().isEmpty())
        {
            String s = ((Component)getForm().getComponents().get(0)).getType();
            if (s.equals("pageselect") || s.equals("photo"))
            {
                return false;
            }
        }
        return true;
    }

    /* member class not found */
    class _cls1 {}

}
