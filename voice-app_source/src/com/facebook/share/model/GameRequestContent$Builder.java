// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, GameRequestContent, ShareModel

public static class pe
    implements ShareModelBuilder
{

    private pe actionType;
    private String data;
    private pe filters;
    private String message;
    private String objectId;
    private ArrayList suggestions;
    private String title;
    private String to;

    public GameRequestContent build()
    {
        return new GameRequestContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public build readFrom(Parcel parcel)
    {
        return readFrom((GameRequestContent)parcel.readParcelable(com/facebook/share/model/GameRequestContent.getClassLoader()));
    }

    public readFrom readFrom(GameRequestContent gamerequestcontent)
    {
        if (gamerequestcontent == null)
        {
            return this;
        } else
        {
            return setMessage(gamerequestcontent.getMessage()).setTo(gamerequestcontent.getTo()).setTitle(gamerequestcontent.getTitle()).setData(gamerequestcontent.getData()).setActionType(gamerequestcontent.getActionType()).setObjectId(gamerequestcontent.getObjectId()).setFilters(gamerequestcontent.getFilters()).setSuggestions(gamerequestcontent.getSuggestions());
        }
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((GameRequestContent)sharemodel);
    }

    public pe setActionType(pe pe)
    {
        actionType = pe;
        return this;
    }

    public actionType setData(String s)
    {
        data = s;
        return this;
    }

    public data setFilters(data data1)
    {
        filters = data1;
        return this;
    }

    public filters setMessage(String s)
    {
        message = s;
        return this;
    }

    public message setObjectId(String s)
    {
        objectId = s;
        return this;
    }

    public objectId setSuggestions(ArrayList arraylist)
    {
        suggestions = arraylist;
        return this;
    }

    public suggestions setTitle(String s)
    {
        title = s;
        return this;
    }

    public title setTo(String s)
    {
        to = s;
        return this;
    }









    public pe()
    {
    }
}
