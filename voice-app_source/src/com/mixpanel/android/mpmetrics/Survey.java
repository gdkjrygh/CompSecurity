// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            BadDecideObjectException

public class Survey
    implements Parcelable
{
    public class Question
    {

        private final List mChoices;
        private final String mPrompt;
        private final int mQuestionId;
        private final String mQuestionType;
        final Survey this$0;

        public List getChoices()
        {
            return mChoices;
        }

        public int getId()
        {
            return mQuestionId;
        }

        public String getPrompt()
        {
            return mPrompt;
        }

        public QuestionType getType()
        {
            if (QuestionType.MULTIPLE_CHOICE.toString().equals(mQuestionType))
            {
                return QuestionType.MULTIPLE_CHOICE;
            }
            if (QuestionType.TEXT.toString().equals(mQuestionType))
            {
                return QuestionType.TEXT;
            } else
            {
                return QuestionType.UNKNOWN;
            }
        }

        private Question(JSONObject jsonobject)
            throws JSONException, BadDecideObjectException
        {
            Object obj;
            this$0 = Survey.this;
            super();
            mQuestionId = jsonobject.getInt("id");
            mQuestionType = jsonobject.getString("type");
            mPrompt = jsonobject.getString("prompt");
            obj = Collections.emptyList();
            survey = ((Survey) (obj));
            if (!jsonobject.has("extra_data")) goto _L2; else goto _L1
_L1:
            JSONObject jsonobject1;
            jsonobject1 = jsonobject.getJSONObject("extra_data");
            survey = ((Survey) (obj));
            if (!jsonobject1.has("$choices")) goto _L2; else goto _L3
_L3:
            int i;
            obj = jsonobject1.getJSONArray("$choices");
            survey = new ArrayList(((JSONArray) (obj)).length());
            i = 0;
_L6:
            if (i < ((JSONArray) (obj)).length()) goto _L4; else goto _L2
_L2:
            mChoices = Collections.unmodifiableList(Survey.this);
            if (getType() == QuestionType.MULTIPLE_CHOICE && mChoices.size() == 0)
            {
                throw new BadDecideObjectException((new StringBuilder("Question is multiple choice but has no answers:")).append(jsonobject.toString()).toString());
            } else
            {
                return;
            }
_L4:
            add(((JSONArray) (obj)).getString(i));
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }

        Question(JSONObject jsonobject, Question question)
            throws JSONException, BadDecideObjectException
        {
            this(jsonobject);
        }
    }

    public static class QuestionType extends Enum
    {

        private static final QuestionType ENUM$VALUES[];
        public static final QuestionType MULTIPLE_CHOICE;
        public static final QuestionType TEXT;
        public static final QuestionType UNKNOWN;

        public static QuestionType valueOf(String s)
        {
            return (QuestionType)Enum.valueOf(com/mixpanel/android/mpmetrics/Survey$QuestionType, s);
        }

        public static QuestionType[] values()
        {
            QuestionType aquestiontype[] = ENUM$VALUES;
            int i = aquestiontype.length;
            QuestionType aquestiontype1[] = new QuestionType[i];
            System.arraycopy(aquestiontype, 0, aquestiontype1, 0, i);
            return aquestiontype1;
        }

        static 
        {
            UNKNOWN = new QuestionType("UNKNOWN", 0) {

                public String toString()
                {
                    return "*unknown_type*";
                }

            };
            MULTIPLE_CHOICE = new QuestionType("MULTIPLE_CHOICE", 1) {

                public String toString()
                {
                    return "multiple_choice";
                }

            };
            TEXT = new QuestionType("TEXT", 2) {

                public String toString()
                {
                    return "text";
                }

            };
            ENUM$VALUES = (new QuestionType[] {
                UNKNOWN, MULTIPLE_CHOICE, TEXT
            });
        }

        private QuestionType(String s, int i)
        {
            super(s, i);
        }

        QuestionType(String s, int i, QuestionType questiontype)
        {
            this(s, i);
        }
    }


    public static android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Survey createFromParcel(Parcel parcel)
        {
            parcel = parcel.readString();
            try
            {
                parcel = new Survey(new JSONObject(parcel));
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Corrupted JSON object written to survey parcel.", parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException("Unexpected or incomplete object written to survey parcel.", parcel);
            }
            return parcel;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Survey[] newArray(int i)
        {
            return new Survey[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final int mCollectionId;
    private final JSONObject mDescription;
    private final int mId;
    private final List mQuestions;

    Survey(JSONObject jsonobject)
        throws BadDecideObjectException
    {
        try
        {
            mDescription = jsonobject;
            mId = jsonobject.getInt("id");
            mCollectionId = jsonobject.getJSONArray("collections").getJSONObject(0).getInt("id");
            jsonobject = jsonobject.getJSONArray("questions");
            if (jsonobject.length() == 0)
            {
                throw new BadDecideObjectException("Survey has no questions.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadDecideObjectException("Survey JSON was unexpected or bad", jsonobject);
        }
        ArrayList arraylist = new ArrayList(jsonobject.length());
        int i = 0;
_L2:
        if (i >= jsonobject.length())
        {
            mQuestions = Collections.unmodifiableList(arraylist);
            return;
        }
        arraylist.add(new Question(jsonobject.getJSONObject(i), null));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCollectionId()
    {
        return mCollectionId;
    }

    public int getId()
    {
        return mId;
    }

    public List getQuestions()
    {
        return mQuestions;
    }

    String toJSON()
    {
        return mDescription.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(toJSON());
    }

}
