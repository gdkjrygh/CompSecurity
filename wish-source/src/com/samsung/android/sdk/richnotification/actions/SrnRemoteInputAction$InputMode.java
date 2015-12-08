// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.samsung.android.sdk.richnotification.SrnValidationException;

// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

private static abstract class mInputType
{
    static final class InputType extends Enum
    {

        private static final InputType ENUM$VALUES[];
        public static final InputType KEYBOARD;
        public static final InputType MULTI_SELECT;
        public static final InputType SINGLE_SELECT;
        public static final InputType VOICE;

        public static InputType valueOf(String s)
        {
            return (InputType)Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$InputMode$InputType, s);
        }

        public static InputType[] values()
        {
            InputType ainputtype[] = ENUM$VALUES;
            int i = ainputtype.length;
            InputType ainputtype1[] = new InputType[i];
            System.arraycopy(ainputtype, 0, ainputtype1, 0, i);
            return ainputtype1;
        }

        static 
        {
            SINGLE_SELECT = new InputType("SINGLE_SELECT", 0);
            MULTI_SELECT = new InputType("MULTI_SELECT", 1);
            VOICE = new InputType("VOICE", 2);
            KEYBOARD = new InputType("KEYBOARD", 3);
            ENUM$VALUES = (new InputType[] {
                SINGLE_SELECT, MULTI_SELECT, VOICE, KEYBOARD
            });
        }

        private InputType(String s, int i)
        {
            super(s, i);
        }
    }


    private final InputType mInputType;

    protected abstract InputType copySelf();

    protected abstract void validateSelf(SrnRemoteInputAction srnremoteinputaction)
        throws SrnValidationException;

    protected InputType(InputType inputtype)
    {
        mInputType = inputtype;
    }

    protected mInputType(mInputType minputtype)
    {
        mInputType = minputtype.mInputType;
    }
}
