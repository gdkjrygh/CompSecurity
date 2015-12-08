// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.samsung.android.sdk.richnotification.SrnValidationException;

// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

public static final class mPrefillText extends mPrefillText
{
    public static final class KeyboardType extends Enum
    {

        public static final KeyboardType EMOJI;
        private static final KeyboardType ENUM$VALUES[];
        public static final KeyboardType NORMAL;
        public static final KeyboardType NUMBER;

        public static KeyboardType valueOf(String s)
        {
            return (KeyboardType)Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$KeyboardInputMode$KeyboardType, s);
        }

        public static KeyboardType[] values()
        {
            KeyboardType akeyboardtype[] = ENUM$VALUES;
            int i = akeyboardtype.length;
            KeyboardType akeyboardtype1[] = new KeyboardType[i];
            System.arraycopy(akeyboardtype, 0, akeyboardtype1, 0, i);
            return akeyboardtype1;
        }

        static 
        {
            NORMAL = new KeyboardType("NORMAL", 0);
            NUMBER = new KeyboardType("NUMBER", 1);
            EMOJI = new KeyboardType("EMOJI", 2);
            ENUM$VALUES = (new KeyboardType[] {
                NORMAL, NUMBER, EMOJI
            });
        }

        private KeyboardType(String s, int i)
        {
            super(s, i);
        }
    }


    private KeyboardType mKeyboardType;
    private String mPrefillText;

    protected KeyboardType copySelf()
    {
        return new <init>(this);
    }

    public <init> setCharacterLimit(int i)
    {
        if (mPrefillText != null && i < mPrefillText.length())
        {
            throw new IllegalStateException("prefillString is less than the character limit.");
        } else
        {
            super.tCharacterLimit(i);
            return this;
        }
    }

    public volatile tCharacterLimit setCharacterLimit(int i)
    {
        return setCharacterLimit(i);
    }

    public KeyboardType setKeyboardType(KeyboardType keyboardtype)
    {
        KeyboardType keyboardtype1 = keyboardtype;
        if (keyboardtype == null)
        {
            keyboardtype1 = KeyboardType.NORMAL;
        }
        mKeyboardType = keyboardtype1;
        return this;
    }

    public mKeyboardType setPrefillString(String s)
    {
        if (s != null && getCharLimit() < s.length())
        {
            throw new IllegalStateException("prefillString is less than the character limit.");
        } else
        {
            mPrefillText = s;
            return this;
        }
    }

    protected void validateSelf(SrnRemoteInputAction srnremoteinputaction)
        throws SrnValidationException
    {
    }

    private KeyboardType(KeyboardType keyboardtype)
    {
        super(e.KEYBOARD);
        setKeyboardType(keyboardtype);
    }

    KeyboardType(KeyboardType keyboardtype, KeyboardType keyboardtype1)
    {
        this(keyboardtype);
    }

    private KeyboardType(KeyboardType keyboardtype)
    {
        super(keyboardtype);
        mKeyboardType = keyboardtype.mKeyboardType;
        mPrefillText = keyboardtype.mPrefillText;
    }
}
