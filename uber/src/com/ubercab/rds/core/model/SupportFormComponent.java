// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.Map;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_SupportFormComponent

public abstract class SupportFormComponent
    implements Parcelable
{

    public SupportFormComponent()
    {
    }

    public static SupportFormComponent create()
    {
        return new Shape_SupportFormComponent();
    }

    public abstract boolean getDefaultValue();

    public abstract boolean getEnablePhotoUpload();

    public abstract String getFormKey();

    public abstract String getFormKeyId();

    public abstract String getId();

    public abstract boolean getIsHalfWidth();

    public abstract boolean getIsHidden();

    public abstract boolean getIsRequired();

    public abstract Map getLocalizedContent();

    public abstract String getType();

    public abstract String getValue();

    public abstract SupportFormComponent setDefaultValue(boolean flag);

    public abstract SupportFormComponent setEnablePhotoUpload(boolean flag);

    public abstract SupportFormComponent setFormKey(String s);

    public abstract SupportFormComponent setFormKeyId(String s);

    public abstract SupportFormComponent setId(String s);

    public abstract SupportFormComponent setIsHalfWidth(boolean flag);

    public abstract SupportFormComponent setIsHidden(boolean flag);

    public abstract SupportFormComponent setIsRequired(boolean flag);

    public abstract SupportFormComponent setLocalizedContent(Map map);

    public abstract SupportFormComponent setType(String s);

    public abstract SupportFormComponent setValue(String s);
}
