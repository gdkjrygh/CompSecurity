// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, ShareModelBuilder

public final class AppGroupCreationContent
    implements ShareModel
{
    public static final class AppGroupPrivacy extends Enum
    {

        public static final AppGroupPrivacy Closed;
        private static final AppGroupPrivacy ENUM$VALUES[];
        public static final AppGroupPrivacy Open;

        public static AppGroupPrivacy valueOf(String s)
        {
            return (AppGroupPrivacy)Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
        }

        public static AppGroupPrivacy[] values()
        {
            AppGroupPrivacy aappgroupprivacy[] = ENUM$VALUES;
            int i = aappgroupprivacy.length;
            AppGroupPrivacy aappgroupprivacy1[] = new AppGroupPrivacy[i];
            System.arraycopy(aappgroupprivacy, 0, aappgroupprivacy1, 0, i);
            return aappgroupprivacy1;
        }

        static 
        {
            Open = new AppGroupPrivacy("Open", 0);
            Closed = new AppGroupPrivacy("Closed", 1);
            ENUM$VALUES = (new AppGroupPrivacy[] {
                Open, Closed
            });
        }

        private AppGroupPrivacy(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Builder
        implements ShareModelBuilder
    {

        private String description;
        private String name;
        private AppGroupPrivacy privacy;

        public AppGroupCreationContent build()
        {
            return new AppGroupCreationContent(this, null);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((AppGroupCreationContent)parcel.readParcelable(com/facebook/share/model/AppGroupCreationContent.getClassLoader()));
        }

        public Builder readFrom(AppGroupCreationContent appgroupcreationcontent)
        {
            if (appgroupcreationcontent == null)
            {
                return this;
            } else
            {
                return setName(appgroupcreationcontent.getName()).setDescription(appgroupcreationcontent.getDescription()).setAppGroupPrivacy(appgroupcreationcontent.getAppGroupPrivacy());
            }
        }

        public volatile ShareModelBuilder readFrom(Parcel parcel)
        {
            return readFrom(parcel);
        }

        public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
        {
            return readFrom((AppGroupCreationContent)sharemodel);
        }

        public Builder setAppGroupPrivacy(AppGroupPrivacy appgroupprivacy)
        {
            privacy = appgroupprivacy;
            return this;
        }

        public Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public Builder setName(String s)
        {
            name = s;
            return this;
        }




        public Builder()
        {
        }
    }


    private final String description;
    private final String name;
    private AppGroupPrivacy privacy;

    AppGroupCreationContent(Parcel parcel)
    {
        name = parcel.readString();
        description = parcel.readString();
        privacy = (AppGroupPrivacy)parcel.readSerializable();
    }

    private AppGroupCreationContent(Builder builder)
    {
        name = builder.name;
        description = builder.description;
        privacy = builder.privacy;
    }

    AppGroupCreationContent(Builder builder, AppGroupCreationContent appgroupcreationcontent)
    {
        this(builder);
    }

    public int describeContents()
    {
        return 0;
    }

    public AppGroupPrivacy getAppGroupPrivacy()
    {
        return privacy;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeSerializable(privacy);
    }
}
