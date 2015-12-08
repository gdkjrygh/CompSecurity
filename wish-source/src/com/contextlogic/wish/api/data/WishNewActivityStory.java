// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import com.contextlogic.wish.api.core.ApiMalformedDataException;
import com.contextlogic.wish.util.DateUtil;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishUser, WishProduct

public class WishNewActivityStory
    implements Serializable
{
    public static final class StoryAuthorType extends Enum
    {

        private static final StoryAuthorType $VALUES[];
        public static final StoryAuthorType Unknown;
        public static final StoryAuthorType User;

        public static StoryAuthorType valueOf(String s)
        {
            return (StoryAuthorType)Enum.valueOf(com/contextlogic/wish/api/data/WishNewActivityStory$StoryAuthorType, s);
        }

        public static StoryAuthorType[] values()
        {
            return (StoryAuthorType[])$VALUES.clone();
        }

        static 
        {
            Unknown = new StoryAuthorType("Unknown", 0);
            User = new StoryAuthorType("User", 1);
            $VALUES = (new StoryAuthorType[] {
                Unknown, User
            });
        }

        private StoryAuthorType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x5d9fbfb38d0ae432L;
    private StoryAuthorType authorType;
    private String message;
    private WishProduct product;
    private Date timestamp;
    private WishUser user;

    public WishNewActivityStory(JSONObject jsonobject)
        throws ApiMalformedDataException
    {
        timestamp = DateUtil.parseIsoDate(jsonobject.getString("isotime"));
        user = new WishUser(jsonobject.getJSONObject("user"));
        product = new WishProduct(jsonobject.getJSONObject("contest"));
        message = jsonobject.getString("activity_text");
        jsonobject.getInt("author_type");
        JVM INSTR tableswitch 1 1: default 126
    //                   1 92;
           goto _L1 _L2
_L1:
        authorType = StoryAuthorType.Unknown;
        return;
_L2:
        try
        {
            authorType = StoryAuthorType.User;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new ApiMalformedDataException(jsonobject.getMessage());
        }
    }

    public StoryAuthorType getAuthorType()
    {
        return authorType;
    }

    public String getMessage()
    {
        return message;
    }

    public WishProduct getProduct()
    {
        return product;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public WishUser getUser()
    {
        return user;
    }
}
