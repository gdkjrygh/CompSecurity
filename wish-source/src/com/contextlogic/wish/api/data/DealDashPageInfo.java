// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class DealDashPageInfo
    implements Serializable
{
    public static final class PAGE extends Enum
    {

        private static final PAGE $VALUES[];
        public static final PAGE ACCESS_BLOCKED;
        public static final PAGE ACCESS_GRANTED;
        public static final PAGE COUNTDOWN;
        public static final PAGE PLAYING;
        public static final PAGE TIMES_UP;

        public static PAGE valueOf(String s)
        {
            return (PAGE)Enum.valueOf(com/contextlogic/wish/api/data/DealDashPageInfo$PAGE, s);
        }

        public static PAGE[] values()
        {
            return (PAGE[])$VALUES.clone();
        }

        static 
        {
            ACCESS_BLOCKED = new PAGE("ACCESS_BLOCKED", 0);
            ACCESS_GRANTED = new PAGE("ACCESS_GRANTED", 1);
            TIMES_UP = new PAGE("TIMES_UP", 2);
            PLAYING = new PAGE("PLAYING", 3);
            COUNTDOWN = new PAGE("COUNTDOWN", 4);
            $VALUES = (new PAGE[] {
                ACCESS_BLOCKED, ACCESS_GRANTED, TIMES_UP, PLAYING, COUNTDOWN
            });
        }

        private PAGE(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x68a040dce7b1f577L;
    private String bottomSubtitle;
    private String buttonText;
    private String title;
    private String topSubtitle;

    public DealDashPageInfo(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        try
        {
            if (jsonobject.has("title"))
            {
                title = jsonobject.getString("title");
            }
            if (jsonobject.has("top_subtitle"))
            {
                topSubtitle = jsonobject.getString("top_subtitle");
            }
            if (jsonobject.has("bottom_subtitle"))
            {
                bottomSubtitle = jsonobject.getString("bottom_subtitle");
            }
            if (jsonobject.has("button_text"))
            {
                buttonText = jsonobject.getString("button_text").toUpperCase(Locale.getDefault());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public String getBottomSubtitle()
    {
        return bottomSubtitle;
    }

    public String getButtonText()
    {
        return buttonText;
    }

    public String getTitle()
    {
        return title;
    }

    public String getTopSubtitle()
    {
        return topSubtitle;
    }
}
