// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.model;

import android.os.Parcelable;
import bkd;
import com.ubercab.form.model.Form;
import hnx;
import hny;
import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.model:
//            Shape_RegistrationForm

public abstract class RegistrationForm extends hnx
    implements Parcelable
{

    private static final String KEY_IS_POLYMORPHISM_ALLOWED = "allow_polymorphism";
    private static final String KEY_STEP_LEGAL_CONSENT = "step_legal_consent";

    public RegistrationForm()
    {
    }

    public static RegistrationForm create()
    {
        return new Shape_RegistrationForm();
    }

    public abstract Form getForm();

    public abstract Boolean getIsPolymorphismAllowed();

    public abstract String getLegalConsent();

    protected Object onGet(hny hny, Object obj)
    {
        _cls1..SwitchMap.com.ubercab.android.partner.funnel.signup.model.Shape_RegistrationForm.Property[((Shape_RegistrationForm.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 34
    //                   2 102;
           goto _L1 _L2 _L3
_L1:
        return obj;
_L2:
        if (obj == null)
        {
            obj = Boolean.valueOf(false);
            Object obj1 = getForm();
            hny = ((hny) (obj));
            if (obj1 != null)
            {
                hny = ((hny) (obj));
                if (((Form) (obj1)).getOptions() != null)
                {
                    obj1 = (bkd)((Form) (obj1)).getOptions().get("allow_polymorphism");
                    hny = ((hny) (obj));
                    if (obj1 != null)
                    {
                        hny = Boolean.valueOf(((bkd) (obj1)).f());
                        setIsPolymorphismAllowed((Boolean)hny);
                    }
                }
            }
            return hny;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (obj == null)
        {
            hny = getForm();
            if (hny != null && hny.getOptions() != null)
            {
                hny = (bkd)hny.getOptions().get("step_legal_consent");
                if (hny != null)
                {
                    hny = hny.b();
                    setLegalConsent((String)hny);
                    return hny;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public abstract void setForm(Form form);

    abstract void setIsPolymorphismAllowed(Boolean boolean1);

    abstract void setLegalConsent(String s);

    /* member class not found */
    class _cls1 {}

}
