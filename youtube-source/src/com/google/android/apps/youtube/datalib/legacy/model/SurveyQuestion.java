// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.e.j;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            at, au

public class SurveyQuestion
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new at();
    public static final int DEFAULT_DURATION_SECONDS = 15;
    private List beaconUris;
    private final com.google.android.apps.youtube.a.a.a.c surveyQuestionProto;

    private SurveyQuestion(com.google.android.apps.youtube.a.a.a.c c1)
    {
        boolean flag1 = true;
        super();
        surveyQuestionProto = (com.google.android.apps.youtube.a.a.a.c)c.a(c1);
        c.a(c1.b);
        boolean flag;
        if (Type.fromName(c1.d) != Type.UNSUPPORTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        if (c1.c.length > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c.b(flag);
    }

    SurveyQuestion(com.google.android.apps.youtube.a.a.a.c c1, at at1)
    {
        this(c1);
    }

    public au buildUpon()
    {
        return new au(surveyQuestionProto);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (SurveyQuestion)obj;
            if (b.a(Integer.valueOf(getId()), Integer.valueOf(((SurveyQuestion) (obj)).getId())) && b.a(getType(), ((SurveyQuestion) (obj)).getType()) && b.a(getAnswerPresentationOrder(), ((SurveyQuestion) (obj)).getAnswerPresentationOrder()) && b.a(getQuestion(), ((SurveyQuestion) (obj)).getQuestion()) && b.a(getAnswers(), ((SurveyQuestion) (obj)).getAnswers()) && b.a(getBeaconUris(), ((SurveyQuestion) (obj)).getBeaconUris()) && b.a(getApiContext(), ((SurveyQuestion) (obj)).getApiContext()) && b.a(Integer.valueOf(getDurationSeconds()), Integer.valueOf(((SurveyQuestion) (obj)).getDurationSeconds())))
            {
                return true;
            }
        }
        return false;
    }

    public String getAnswerOrdering()
    {
        return TextUtils.join(".", com.google.android.apps.youtube.common.e.c.a(surveyQuestionProto.j));
    }

    public List getAnswerPresentationOrder()
    {
        return Collections.unmodifiableList(com.google.android.apps.youtube.common.e.c.a(surveyQuestionProto.j));
    }

    public List getAnswers()
    {
        return Collections.unmodifiableList(Arrays.asList(surveyQuestionProto.c));
    }

    public String getApiContext()
    {
        return surveyQuestionProto.g;
    }

    public List getBeaconUris()
    {
        beaconUris = new ArrayList();
        String as[] = surveyQuestionProto.f;
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            beaconUris.add(Uri.parse(s));
        }

        return Collections.unmodifiableList(beaconUris);
    }

    public int getDurationSeconds()
    {
        return surveyQuestionProto.h;
    }

    public int getId()
    {
        return surveyQuestionProto.i;
    }

    public String getQuestion()
    {
        return surveyQuestionProto.b;
    }

    public com.google.android.apps.youtube.a.a.a.c getSurveyQuestionProto()
    {
        return (com.google.android.apps.youtube.a.a.a.c)com.google.protobuf.nano.c.a(new com.google.android.apps.youtube.a.a.a.c(), com.google.protobuf.nano.c.a(surveyQuestionProto));
    }

    public Type getType()
    {
        return Type.fromName(surveyQuestionProto.d);
    }

    public boolean isMultiSelectQuestion()
    {
        return getType() == Type.MULTI_SELECT;
    }

    public String toString()
    {
        return (new StringBuilder("Question [type: ")).append(getType()).append("question:\"").append(getQuestion()).append("\" answers: ").append(getAnswers()).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        j.a(parcel, surveyQuestionProto);
    }


    private class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type MULTI_SELECT;
        public static final Type SINGLE_ANSWERS;
        public static final Type UNSUPPORTED;
        private final String name;

        public static Type fromName(String s)
        {
            Type atype[] = values();
            int k = atype.length;
            for (int i = 0; i < k; i++)
            {
                Type type = atype[i];
                if (type.name.equals(s))
                {
                    return type;
                }
            }

            return UNSUPPORTED;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/google/android/apps/youtube/datalib/legacy/model/SurveyQuestion$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        public final String getName()
        {
            return name;
        }

        static 
        {
            SINGLE_ANSWERS = new Type("SINGLE_ANSWERS", 0, "single-answer");
            MULTI_SELECT = new Type("MULTI_SELECT", 1, "multi-select");
            UNSUPPORTED = new Type("UNSUPPORTED", 2, "unsupported");
            $VALUES = (new Type[] {
                SINGLE_ANSWERS, MULTI_SELECT, UNSUPPORTED
            });
        }

        private Type(String s, int i, String s1)
        {
            super(s, i);
            name = (String)c.a(s1);
        }
    }

}
