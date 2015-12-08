// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.templates;


// Referenced classes of package com.samsung.android.sdk.richnotification.templates:
//            SrnStandardTemplate

public static final class mTemplateName extends Enum
{

    private static final SMALL ENUM$VALUES[];
    public static final SMALL FULL_SCREEN;
    public static final SMALL MEDIUM;
    public static final SMALL SMALL;
    private final String mTemplateName;

    private String getTemplateName()
    {
        return mTemplateName;
    }

    public static mTemplateName valueOf(String s)
    {
        return (mTemplateName)Enum.valueOf(com/samsung/android/sdk/richnotification/templates/SrnStandardTemplate$HeaderSizeType, s);
    }

    public static mTemplateName[] values()
    {
        mTemplateName amtemplatename[] = ENUM$VALUES;
        int i = amtemplatename.length;
        mTemplateName amtemplatename1[] = new ENUM.VALUES[i];
        System.arraycopy(amtemplatename, 0, amtemplatename1, 0, i);
        return amtemplatename1;
    }

    static 
    {
        FULL_SCREEN = new <init>("FULL_SCREEN", 0, "full_screen_template");
        MEDIUM = new <init>("MEDIUM", 1, "medium_header_template");
        SMALL = new <init>("SMALL", 2, "small_header_template");
        ENUM$VALUES = (new ENUM.VALUES[] {
            FULL_SCREEN, MEDIUM, SMALL
        });
    }


    private (String s, int i, String s1)
    {
        super(s, i);
        mTemplateName = s1;
    }
}
