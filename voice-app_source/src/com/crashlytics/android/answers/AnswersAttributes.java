// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventValidator

class AnswersAttributes
{

    final Map attributes = new HashMap();
    final AnswersEventValidator validator;

    public AnswersAttributes(AnswersEventValidator answerseventvalidator)
    {
        validator = answerseventvalidator;
    }

    void put(String s, Number number)
    {
        if (validator.isNull(s, "key") || validator.isNull(number, "value"))
        {
            return;
        } else
        {
            putAttribute(validator.limitStringLength(s), number);
            return;
        }
    }

    void put(String s, String s1)
    {
        if (validator.isNull(s, "key") || validator.isNull(s1, "value"))
        {
            return;
        } else
        {
            putAttribute(validator.limitStringLength(s), validator.limitStringLength(s1));
            return;
        }
    }

    void putAttribute(String s, Object obj)
    {
        if (!validator.isFullMap(attributes, s))
        {
            attributes.put(s, obj);
        }
    }

    public String toString()
    {
        return (new JSONObject(attributes)).toString();
    }
}
