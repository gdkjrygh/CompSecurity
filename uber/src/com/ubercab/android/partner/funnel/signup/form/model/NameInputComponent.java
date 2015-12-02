// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.signup.form.model;

import android.os.Parcelable;
import bkd;
import com.ubercab.form.model.FieldComponent;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.android.partner.funnel.signup.form.model:
//            Shape_NameInputComponent

public abstract class NameInputComponent extends FieldComponent
    implements Parcelable
{

    private static final String IS_CJK_NAME_KEY = "use_cjk_name_input";
    public static final String TYPE = "name";
    private Boolean mUseCjkNameInput;

    public NameInputComponent()
    {
    }

    public static NameInputComponent create()
    {
        return new Shape_NameInputComponent();
    }

    public abstract List getSubmitIds();

    public Boolean getUseCjkNameInput()
    {
        if (mUseCjkNameInput == null)
        {
            if (getOptions() != null)
            {
                bkd bkd1 = (bkd)getOptions().get("use_cjk_name_input");
                if (bkd1 != null)
                {
                    mUseCjkNameInput = Boolean.valueOf(bkd1.f());
                    return mUseCjkNameInput;
                }
            }
        } else
        {
            return mUseCjkNameInput;
        }
        return Boolean.valueOf(false);
    }

    abstract NameInputComponent setSubmitIds(List list);
}
