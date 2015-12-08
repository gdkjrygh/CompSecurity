// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            Survey, BadDecideObjectException

public class <init>
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

    public ype getType()
    {
        if (ype.MULTIPLE_CHOICE.toString().equals(mQuestionType))
        {
            return ype.MULTIPLE_CHOICE;
        }
        if (ype.TEXT.toString().equals(mQuestionType))
        {
            return ype.TEXT;
        } else
        {
            return ype.UNKNOWN;
        }
    }

    private ype(JSONObject jsonobject)
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
        if (getType() == ype.MULTIPLE_CHOICE && mChoices.size() == 0)
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

    xception(JSONObject jsonobject, xception xception)
        throws JSONException, BadDecideObjectException
    {
        this(jsonobject);
    }
}
