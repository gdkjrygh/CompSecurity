// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.samsung.android.sdk.richnotification.SrnAction;
import com.samsung.android.sdk.richnotification.SrnImageAsset;
import com.samsung.android.sdk.richnotification.SrnValidationException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class SrnRemoteInputAction extends SrnAction
{
    private static class Choice
    {

        private final SrnImageAsset mChoiceIcon;
        private final String mChoiceId;
        private final String mChoiceLabel;
        private final Integer mSelected;

        public Choice(String s, String s1)
        {
            this(s, s1, null, null);
        }

        public Choice(String s, String s1, SrnImageAsset srnimageasset)
        {
            this(s, s1, srnimageasset, null);
        }

        public Choice(String s, String s1, SrnImageAsset srnimageasset, Integer integer)
        {
            if (s == null)
            {
                throw new NullPointerException("label is null.");
            }
            if (s1 == null)
            {
                throw new NullPointerException("choiceID is null.");
            } else
            {
                mChoiceLabel = s;
                mChoiceId = s1;
                mChoiceIcon = srnimageasset;
                mSelected = integer;
                return;
            }
        }
    }

    private static abstract class InputMode
    {

        private final InputType mInputType;

        protected abstract InputMode copySelf();

        protected abstract void validateSelf(SrnRemoteInputAction srnremoteinputaction)
            throws SrnValidationException;

        protected InputMode(InputType inputtype)
        {
            mInputType = inputtype;
        }

        protected InputMode(InputMode inputmode)
        {
            mInputType = inputmode.mInputType;
        }
    }

    static final class InputMode.InputType extends Enum
    {

        private static final InputMode.InputType ENUM$VALUES[];
        public static final InputMode.InputType KEYBOARD;
        public static final InputMode.InputType MULTI_SELECT;
        public static final InputMode.InputType SINGLE_SELECT;
        public static final InputMode.InputType VOICE;

        public static InputMode.InputType valueOf(String s)
        {
            return (InputMode.InputType)Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$InputMode$InputType, s);
        }

        public static InputMode.InputType[] values()
        {
            InputMode.InputType ainputtype[] = ENUM$VALUES;
            int i = ainputtype.length;
            InputMode.InputType ainputtype1[] = new InputMode.InputType[i];
            System.arraycopy(ainputtype, 0, ainputtype1, 0, i);
            return ainputtype1;
        }

        static 
        {
            SINGLE_SELECT = new InputMode.InputType("SINGLE_SELECT", 0);
            MULTI_SELECT = new InputMode.InputType("MULTI_SELECT", 1);
            VOICE = new InputMode.InputType("VOICE", 2);
            KEYBOARD = new InputMode.InputType("KEYBOARD", 3);
            ENUM$VALUES = (new InputMode.InputType[] {
                SINGLE_SELECT, MULTI_SELECT, VOICE, KEYBOARD
            });
        }

        private InputMode.InputType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class InputModeFactory
    {

        public static KeyboardInputMode createKeyboardInputMode()
        {
            return new KeyboardInputMode(KeyboardInputMode.KeyboardType.NORMAL, null);
        }

        public static KeyboardInputMode createKeyboardInputMode(KeyboardInputMode.KeyboardType keyboardtype)
        {
            if (keyboardtype == null)
            {
                throw new NullPointerException("keyboard type is null.");
            } else
            {
                return new KeyboardInputMode(keyboardtype, null);
            }
        }

        public static MultiSelectInputMode createMultiSelectInputMode()
        {
            return new MultiSelectInputMode(null, null);
        }

        public static SingleSelectInputMode createSingleSelectInputMode()
        {
            return new SingleSelectInputMode(null, null);
        }

        private InputModeFactory()
        {
        }
    }

    public static final class KeyboardInputMode extends StringInputMode
    {

        private KeyboardType mKeyboardType;
        private String mPrefillText;

        protected InputMode copySelf()
        {
            return new KeyboardInputMode(this);
        }

        public KeyboardInputMode setCharacterLimit(int i)
        {
            if (mPrefillText != null && i < mPrefillText.length())
            {
                throw new IllegalStateException("prefillString is less than the character limit.");
            } else
            {
                super.setCharacterLimit(i);
                return this;
            }
        }

        public volatile StringInputMode setCharacterLimit(int i)
        {
            return setCharacterLimit(i);
        }

        public KeyboardInputMode setKeyboardType(KeyboardType keyboardtype)
        {
            KeyboardType keyboardtype1 = keyboardtype;
            if (keyboardtype == null)
            {
                keyboardtype1 = KeyboardType.NORMAL;
            }
            mKeyboardType = keyboardtype1;
            return this;
        }

        public KeyboardInputMode setPrefillString(String s)
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

        private KeyboardInputMode(KeyboardType keyboardtype)
        {
            super(InputMode.InputType.KEYBOARD);
            setKeyboardType(keyboardtype);
        }

        KeyboardInputMode(KeyboardType keyboardtype, KeyboardInputMode keyboardinputmode)
        {
            this(keyboardtype);
        }

        private KeyboardInputMode(KeyboardInputMode keyboardinputmode)
        {
            super(keyboardinputmode);
            mKeyboardType = keyboardinputmode.mKeyboardType;
            mPrefillText = keyboardinputmode.mPrefillText;
        }
    }

    public static final class KeyboardInputMode.KeyboardType extends Enum
    {

        public static final KeyboardInputMode.KeyboardType EMOJI;
        private static final KeyboardInputMode.KeyboardType ENUM$VALUES[];
        public static final KeyboardInputMode.KeyboardType NORMAL;
        public static final KeyboardInputMode.KeyboardType NUMBER;

        public static KeyboardInputMode.KeyboardType valueOf(String s)
        {
            return (KeyboardInputMode.KeyboardType)Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteInputAction$KeyboardInputMode$KeyboardType, s);
        }

        public static KeyboardInputMode.KeyboardType[] values()
        {
            KeyboardInputMode.KeyboardType akeyboardtype[] = ENUM$VALUES;
            int i = akeyboardtype.length;
            KeyboardInputMode.KeyboardType akeyboardtype1[] = new KeyboardInputMode.KeyboardType[i];
            System.arraycopy(akeyboardtype, 0, akeyboardtype1, 0, i);
            return akeyboardtype1;
        }

        static 
        {
            NORMAL = new KeyboardInputMode.KeyboardType("NORMAL", 0);
            NUMBER = new KeyboardInputMode.KeyboardType("NUMBER", 1);
            EMOJI = new KeyboardInputMode.KeyboardType("EMOJI", 2);
            ENUM$VALUES = (new KeyboardInputMode.KeyboardType[] {
                NORMAL, NUMBER, EMOJI
            });
        }

        private KeyboardInputMode.KeyboardType(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class MultiSelectInputMode extends SelectInputMode
    {

        public MultiSelectInputMode addChoice(String s, String s1)
        {
            super.addChoice(s, s1);
            return this;
        }

        public MultiSelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset)
        {
            super.addChoice(s, s1, srnimageasset);
            return this;
        }

        public MultiSelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset, boolean flag)
        {
            super.addChoice(s, s1, srnimageasset, flag);
            return this;
        }

        public volatile SelectInputMode addChoice(String s, String s1)
        {
            return addChoice(s, s1);
        }

        public volatile SelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset)
        {
            return addChoice(s, s1, srnimageasset);
        }

        public volatile SelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset, boolean flag)
        {
            return addChoice(s, s1, srnimageasset, flag);
        }

        protected InputMode copySelf()
        {
            return new MultiSelectInputMode(this);
        }

        private MultiSelectInputMode()
        {
            super(InputMode.InputType.MULTI_SELECT);
        }

        private MultiSelectInputMode(MultiSelectInputMode multiselectinputmode)
        {
            super(multiselectinputmode);
        }

        MultiSelectInputMode(MultiSelectInputMode multiselectinputmode, MultiSelectInputMode multiselectinputmode1)
        {
            this();
        }
    }

    private static abstract class SelectInputMode extends InputMode
    {

        private final List mChoices;

        protected SelectInputMode addChoice(String s, String s1)
        {
            mChoices.add(new Choice(s, s1));
            return this;
        }

        protected SelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset)
        {
            mChoices.add(new Choice(s, s1, srnimageasset));
            return this;
        }

        protected SelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset, boolean flag)
        {
            List list = mChoices;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            list.add(new Choice(s, s1, srnimageasset, Integer.valueOf(i)));
            return this;
        }

        protected void validateSelf(SrnRemoteInputAction srnremoteinputaction)
            throws SrnValidationException
        {
            if (mChoices.isEmpty())
            {
                throw new SrnValidationException((new StringBuilder("Choices of SrnRempteInputAction(")).append(srnremoteinputaction.getLabel()).append(") are empty.").toString());
            } else
            {
                return;
            }
        }

        protected SelectInputMode(InputMode.InputType inputtype)
        {
            super(inputtype);
            mChoices = new ArrayList();
        }

        protected SelectInputMode(SelectInputMode selectinputmode)
        {
            super(selectinputmode);
            mChoices = new ArrayList(selectinputmode.mChoices);
        }
    }

    public static final class SingleSelectInputMode extends SelectInputMode
    {

        public volatile SelectInputMode addChoice(String s, String s1)
        {
            return addChoice(s, s1);
        }

        public volatile SelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset)
        {
            return addChoice(s, s1, srnimageasset);
        }

        public SingleSelectInputMode addChoice(String s, String s1)
        {
            super.addChoice(s, s1);
            return this;
        }

        public SingleSelectInputMode addChoice(String s, String s1, SrnImageAsset srnimageasset)
        {
            super.addChoice(s, s1, srnimageasset);
            return this;
        }

        protected InputMode copySelf()
        {
            return new SingleSelectInputMode(this);
        }

        private SingleSelectInputMode()
        {
            super(InputMode.InputType.SINGLE_SELECT);
        }

        private SingleSelectInputMode(SingleSelectInputMode singleselectinputmode)
        {
            super(singleselectinputmode);
        }

        SingleSelectInputMode(SingleSelectInputMode singleselectinputmode, SingleSelectInputMode singleselectinputmode1)
        {
            this();
        }
    }

    private static abstract class StringInputMode extends InputMode
    {

        private Integer mCharLimit;

        protected int getCharLimit()
        {
            if (mCharLimit == null)
            {
                return 0x7fffffff;
            } else
            {
                return mCharLimit.intValue();
            }
        }

        public StringInputMode setCharacterLimit(int i)
        {
            if (i < 0)
            {
                throw new IllegalArgumentException("character limit must be bigger than zero.");
            } else
            {
                mCharLimit = Integer.valueOf(i);
                return this;
            }
        }

        protected StringInputMode(InputMode.InputType inputtype)
        {
            super(inputtype);
        }

        protected StringInputMode(StringInputMode stringinputmode)
        {
            super(stringinputmode);
            mCharLimit = stringinputmode.mCharLimit;
        }
    }


    private static final String SERIALIZED_NAME_DESCRIPTION = "description";
    private static final String SERIALIZED_NAME_ICON = "icon";
    private static final JsonSerializer SERIALIZER = new JsonSerializer() {

        public JsonElement serialize(SrnRemoteInputAction srnremoteinputaction, Type type, JsonSerializationContext jsonserializationcontext)
        {
            type = jsonserializationcontext.serialize(srnremoteinputaction, com/samsung/android/sdk/richnotification/SrnAction).getAsJsonObject();
            type.add("description", jsonserializationcontext.serialize(srnremoteinputaction.mDescription));
            type.add("icon", jsonserializationcontext.serialize(srnremoteinputaction.mIcon));
            srnremoteinputaction = jsonserializationcontext.serialize(srnremoteinputaction.mInputMode).getAsJsonObject().entrySet().iterator();
            do
            {
                if (!srnremoteinputaction.hasNext())
                {
                    return type;
                }
                jsonserializationcontext = (java.util.Map.Entry)srnremoteinputaction.next();
                type.add((String)jsonserializationcontext.getKey(), (JsonElement)jsonserializationcontext.getValue());
            } while (true);
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((SrnRemoteInputAction)obj, type, jsonserializationcontext);
        }

    };
    private String mDescription;
    private SrnImageAsset mIcon;
    private InputMode mInputMode;

    private SrnRemoteInputAction(SrnRemoteInputAction srnremoteinputaction)
    {
        super(srnremoteinputaction);
        mDescription = srnremoteinputaction.mDescription;
        mIcon = srnremoteinputaction.mIcon;
        mInputMode = srnremoteinputaction.mInputMode.copySelf();
    }

    public SrnRemoteInputAction(String s)
    {
        this(s, ((InputMode) (InputModeFactory.createKeyboardInputMode())));
    }

    public SrnRemoteInputAction(String s, InputMode inputmode)
    {
        super(com.samsung.android.sdk.richnotification.SrnAction.ActionType.REMOTE_INPUT, s);
        if (inputmode == null)
        {
            throw new NullPointerException("inputMode is null.");
        } else
        {
            mInputMode = inputmode;
            return;
        }
    }

    protected SrnAction cloneSelf()
    {
        return new SrnRemoteInputAction(this);
    }

    public void setDescription(String s)
    {
        mDescription = s;
    }

    public void setIcon(SrnImageAsset srnimageasset)
    {
        mIcon = srnimageasset;
    }

    public void setRequestedInputMode(InputMode inputmode)
    {
        if (inputmode == null)
        {
            throw new NullPointerException("inputMode is null.");
        } else
        {
            mInputMode = inputmode;
            return;
        }
    }

    protected void validateSelf()
        throws SrnValidationException
    {
        mInputMode.validateSelf(this);
    }





}
