// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.uservoice.uservoicesdk.integration.IntegrationProvider;
import com.uservoice.uservoicesdk.model.ClientConfig;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk:
//            Session

public class Config
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Config createFromParcel(Parcel parcel)
        {
            boolean flag1 = true;
            Config config = new Config(parcel.readString(), parcel.readString(), parcel.readString());
            config.email = parcel.readString();
            config.name = parcel.readString();
            config.guid = parcel.readString();
            config.topicId = parcel.readInt();
            config.forumId = parcel.readInt();
            Bundle bundle;
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            config.showForum = flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            config.showPostIdea = flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            config.showContactUs = flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            config.showKnowledgeBase = flag;
            if (parcel.readInt() != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            config.allowAnonymousFeedback = flag;
            bundle = parcel.readBundle();
            config.customFields = (HashMap)bundle.getSerializable("customFields");
            config.userTraits = (HashMap)bundle.getSerializable("userTraits");
            parcel = parcel.readString();
            if (TextUtils.isEmpty(parcel))
            {
                break MISSING_BLOCK_LABEL_226;
            }
            try
            {
                parcel = Class.forName(parcel);
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return config;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return config;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                parcel.printStackTrace();
                return config;
            }
            if (parcel == null)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            parcel = (IntegrationProvider)parcel.newInstance();
            if (parcel == null)
            {
                break MISSING_BLOCK_LABEL_226;
            }
            config.provider = parcel;
            return config;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Config[] newArray(int i)
        {
            return new Config[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String CUSTOM_FIELDS = "customFields";
    private static final String USER_TRAITS = "userTraits";
    private boolean allowAnonymousFeedback;
    private Map customFields;
    private String email;
    private int forumId;
    private String guid;
    private String key;
    private String name;
    private IntegrationProvider provider;
    private String secret;
    private boolean showContactUs;
    private boolean showForum;
    private boolean showKnowledgeBase;
    private boolean showPostIdea;
    private String site;
    private int topicId;
    private Map userTraits;

    public Config(String s)
    {
        customFields = new HashMap();
        topicId = -1;
        forumId = -1;
        showForum = true;
        showPostIdea = true;
        showContactUs = true;
        showKnowledgeBase = true;
        userTraits = new HashMap();
        site = s;
    }

    public Config(String s, String s1, String s2)
    {
        customFields = new HashMap();
        topicId = -1;
        forumId = -1;
        showForum = true;
        showPostIdea = true;
        showContactUs = true;
        showKnowledgeBase = true;
        userTraits = new HashMap();
        site = s;
        key = s1;
        secret = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean getAllowAnonymousFeedback()
    {
        return allowAnonymousFeedback;
    }

    public Map getCustomFields()
    {
        return customFields;
    }

    public String getEmail()
    {
        return email;
    }

    public int getForumId()
    {
        if (forumId == -1 && Session.getInstance().getClientConfig() != null)
        {
            return Session.getInstance().getClientConfig().getDefaultForumId();
        } else
        {
            return forumId;
        }
    }

    public String getGuid()
    {
        return guid;
    }

    public String getKey()
    {
        return key;
    }

    public String getName()
    {
        return name;
    }

    public IntegrationProvider getProvider()
    {
        return provider;
    }

    public String getSecret()
    {
        return secret;
    }

    public String getSite()
    {
        return site;
    }

    public int getTopicId()
    {
        return topicId;
    }

    public Map getUserTraits()
    {
        return userTraits;
    }

    public void identifyUser(String s, String s1, String s2)
    {
        guid = s;
        name = s1;
        email = s2;
        putUserTrait("id", s);
        putUserTrait("name", s1);
        putUserTrait("email", s2);
    }

    public void putAccountTrait(String s, float f)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), f);
    }

    public void putAccountTrait(String s, int i)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), i);
    }

    public void putAccountTrait(String s, String s1)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), s1);
    }

    public void putAccountTrait(String s, Date date)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), date);
    }

    public void putAccountTrait(String s, boolean flag)
    {
        putUserTrait((new StringBuilder()).append("account_").append(s).toString(), flag);
    }

    public void putUserTrait(String s, float f)
    {
        userTraits.put(s, Float.valueOf(f));
    }

    public void putUserTrait(String s, int i)
    {
        userTraits.put(s, Integer.valueOf(i));
    }

    public void putUserTrait(String s, String s1)
    {
        userTraits.put(s, s1);
    }

    public void putUserTrait(String s, Date date)
    {
        userTraits.put(s, Long.valueOf(date.getTime() / 1000L));
    }

    public void putUserTrait(String s, boolean flag)
    {
        userTraits.put(s, Boolean.valueOf(flag));
    }

    public void setAllowAnonymousFeedback(boolean flag)
    {
        allowAnonymousFeedback = flag;
    }

    public void setCustomFields(Map map)
    {
        customFields = map;
    }

    public void setForumId(int i)
    {
        forumId = i;
    }

    public void setProvider(IntegrationProvider integrationprovider)
    {
        provider = integrationprovider;
    }

    public void setShowContactUs(boolean flag)
    {
        showContactUs = flag;
    }

    public void setShowForum(boolean flag)
    {
        showForum = flag;
    }

    public void setShowKnowledgeBase(boolean flag)
    {
        showKnowledgeBase = flag;
    }

    public void setShowPostIdea(boolean flag)
    {
        showPostIdea = flag;
    }

    public void setTopicId(int i)
    {
        topicId = i;
    }

    public boolean shouldShowContactUs()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isTicketSystemEnabled())
        {
            return false;
        } else
        {
            return showContactUs;
        }
    }

    public boolean shouldShowForum()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isFeedbackEnabled())
        {
            return false;
        } else
        {
            return showForum;
        }
    }

    public boolean shouldShowKnowledgeBase()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isTicketSystemEnabled())
        {
            return false;
        } else
        {
            return showKnowledgeBase;
        }
    }

    public boolean shouldShowPostIdea()
    {
        if (Session.getInstance().getClientConfig() != null && !Session.getInstance().getClientConfig().isFeedbackEnabled())
        {
            return false;
        } else
        {
            return showPostIdea;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeString(site);
        parcel.writeString(key);
        parcel.writeString(secret);
        parcel.writeString(email);
        parcel.writeString(name);
        parcel.writeString(guid);
        parcel.writeInt(topicId);
        parcel.writeInt(forumId);
        Object obj;
        if (showForum)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (showPostIdea)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (showContactUs)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (showKnowledgeBase)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (allowAnonymousFeedback)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        obj = new Bundle();
        ((Bundle) (obj)).putSerializable("customFields", (HashMap)customFields);
        ((Bundle) (obj)).putSerializable("userTraits", (HashMap)userTraits);
        parcel.writeBundle(((Bundle) (obj)));
        if (provider != null)
        {
            obj = provider.getClass().getName();
        } else
        {
            obj = "";
        }
        parcel.writeString(((String) (obj)));
    }



/*
    static String access$002(Config config, String s)
    {
        config.email = s;
        return s;
    }

*/


/*
    static Map access$1002(Config config, Map map)
    {
        config.customFields = map;
        return map;
    }

*/


/*
    static String access$102(Config config, String s)
    {
        config.name = s;
        return s;
    }

*/


/*
    static Map access$1102(Config config, Map map)
    {
        config.userTraits = map;
        return map;
    }

*/


/*
    static IntegrationProvider access$1202(Config config, IntegrationProvider integrationprovider)
    {
        config.provider = integrationprovider;
        return integrationprovider;
    }

*/


/*
    static String access$202(Config config, String s)
    {
        config.guid = s;
        return s;
    }

*/


/*
    static int access$302(Config config, int i)
    {
        config.topicId = i;
        return i;
    }

*/


/*
    static int access$402(Config config, int i)
    {
        config.forumId = i;
        return i;
    }

*/


/*
    static boolean access$502(Config config, boolean flag)
    {
        config.showForum = flag;
        return flag;
    }

*/


/*
    static boolean access$602(Config config, boolean flag)
    {
        config.showPostIdea = flag;
        return flag;
    }

*/


/*
    static boolean access$702(Config config, boolean flag)
    {
        config.showContactUs = flag;
        return flag;
    }

*/


/*
    static boolean access$802(Config config, boolean flag)
    {
        config.showKnowledgeBase = flag;
        return flag;
    }

*/


/*
    static boolean access$902(Config config, boolean flag)
    {
        config.allowAnonymousFeedback = flag;
        return flag;
    }

*/
}
