// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


public abstract class SrnTemplate
{
    protected static final class Priority extends Enum
    {

        private static final Priority ENUM$VALUES[];
        public static final Priority PRIMARY;
        public static final Priority SECONDARY;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnTemplate$Priority, s);
        }

        public static Priority[] values()
        {
            Priority apriority[] = ENUM$VALUES;
            int i = apriority.length;
            Priority apriority1[] = new Priority[i];
            System.arraycopy(apriority, 0, apriority1, 0, i);
            return apriority1;
        }

        public String toString()
        {
            return super.toString().toLowerCase();
        }

        static 
        {
            PRIMARY = new Priority("PRIMARY", 0);
            SECONDARY = new Priority("SECONDARY", 1);
            ENUM$VALUES = (new Priority[] {
                PRIMARY, SECONDARY
            });
        }

        private Priority(String s, int i)
        {
            super(s, i);
        }
    }


    protected static final String TEMPLATE_TYPE_ADDITIONAL = "additional_template";
    protected static final String TEMPLATE_TYPE_DEFAULT = "default";
    private String mName;
    private final String mPriority;
    private final String mType;

    protected SrnTemplate(Priority priority, String s, String s1)
    {
        mName = s;
        mPriority = priority.toString();
        mType = s1;
    }

    protected SrnTemplate(SrnTemplate srntemplate)
    {
        mName = srntemplate.mName;
        mPriority = srntemplate.mPriority;
        mType = srntemplate.mType;
    }

    protected abstract Object cloneSelf();

    protected final void setName(String s)
    {
        mName = s;
    }
}
