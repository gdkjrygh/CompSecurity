// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;

import android.content.Context;
import com.weather.util.enums.EnumConverter;
import com.weather.util.enums.ReverseEnumMap;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class DsxAccount
    implements Serializable
{
    public static final class AccountProvider extends Enum
        implements EnumConverter
    {

        private static final AccountProvider $VALUES[];
        public static final AccountProvider PROVIDER_AMAZON;
        public static final AccountProvider PROVIDER_ANONYMOUS;
        public static final AccountProvider PROVIDER_FACEBOOK;
        public static final AccountProvider PROVIDER_GOOGLE_PLUS;
        public static final AccountProvider PROVIDER_WEATHER_CHANNEL;
        public static final AccountProvider STATIC;
        private static final ReverseEnumMap map = new ReverseEnumMap(com/weather/commons/ups/facade/DsxAccount$AccountProvider);
        private final Integer nameResourceId;
        private final String provider;

        public static AccountProvider valueOf(String s)
        {
            return (AccountProvider)Enum.valueOf(com/weather/commons/ups/facade/DsxAccount$AccountProvider, s);
        }

        public static AccountProvider[] values()
        {
            return (AccountProvider[])$VALUES.clone();
        }

        public AccountProvider convert(String s)
        {
            return (AccountProvider)map.get(s);
        }

        public volatile Enum convert(String s)
        {
            return convert(s);
        }

        public String convert()
        {
            return provider;
        }

        public String getProviderName(Context context)
        {
            if (nameResourceId == null)
            {
                return "";
            } else
            {
                return context.getString(nameResourceId.intValue());
            }
        }

        public String toString()
        {
            return String.format("AccountProvider{provider='%s'}", new Object[] {
                provider
            });
        }

        static 
        {
            PROVIDER_FACEBOOK = new AccountProvider("PROVIDER_FACEBOOK", 0, "fb", Integer.valueOf(com.weather.commons.R.string.login_type_facebook));
            PROVIDER_ANONYMOUS = new AccountProvider("PROVIDER_ANONYMOUS", 1, "anon", null);
            PROVIDER_AMAZON = new AccountProvider("PROVIDER_AMAZON", 2, "aws", Integer.valueOf(com.weather.commons.R.string.login_type_amazon));
            PROVIDER_GOOGLE_PLUS = new AccountProvider("PROVIDER_GOOGLE_PLUS", 3, "gp", Integer.valueOf(com.weather.commons.R.string.login_type_google_plus));
            PROVIDER_WEATHER_CHANNEL = new AccountProvider("PROVIDER_WEATHER_CHANNEL", 4, "wx", Integer.valueOf(com.weather.commons.R.string.app_name));
            $VALUES = (new AccountProvider[] {
                PROVIDER_FACEBOOK, PROVIDER_ANONYMOUS, PROVIDER_AMAZON, PROVIDER_GOOGLE_PLUS, PROVIDER_WEATHER_CHANNEL
            });
            STATIC = PROVIDER_WEATHER_CHANNEL;
        }

        private AccountProvider(String s, int i, String s1, Integer integer)
        {
            super(s, i);
            provider = s1;
            nameResourceId = integer;
        }
    }


    public static final String ACCOUNT_ID = "id";
    public static final String ACCOUNT_PROVIDER = "provider";
    public static final String ACCOUNT_TOKEN = "token";
    public static final String LONG_SESSION = "longSession";
    private static final long serialVersionUID = 0x6de92bb44204f52bL;
    private final String id;
    private final AccountProvider provider;
    private final boolean sessionDuration = true;
    private final String token;

    public DsxAccount(String s, String s1, AccountProvider accountprovider)
    {
        id = s;
        token = s1;
        provider = accountprovider;
    }

    public String getId()
    {
        return id;
    }

    public AccountProvider getProvider()
    {
        return provider;
    }

    public String getToken()
    {
        return token;
    }

    public String toJsonString()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", id);
        jsonobject.put("token", token);
        jsonobject.put("provider", provider.convert());
        jsonobject.put("longSession", sessionDuration);
        return jsonobject.toString();
    }
}
