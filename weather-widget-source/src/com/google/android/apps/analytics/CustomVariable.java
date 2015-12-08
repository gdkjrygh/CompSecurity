// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            AnalyticsParameterEncoder

class CustomVariable
{

    public static final String INDEX_ERROR_MSG = "Index must be between 1 and 5 inclusive.";
    public static final int MAX_CUSTOM_VARIABLES = 5;
    public static final int MAX_CUSTOM_VARIABLE_LENGTH = 64;
    public static final int PAGE_SCOPE = 3;
    public static final int SESSION_SCOPE = 2;
    public static final int VISITOR_SCOPE = 1;
    private final int index;
    private final String name;
    private final int scope;
    private final String value;

    public CustomVariable(int i, String s, String s1)
    {
        this(i, s, s1, 3);
    }

    public CustomVariable(int i, String s, String s1, int j)
    {
        if (j != 1 && j != 2 && j != 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Scope:").append(j).toString());
        }
        if (i < 1 || i > 5)
        {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        }
        if (s == null || s.length() == 0)
        {
            throw new IllegalArgumentException("Invalid argument for name:  Cannot be empty");
        }
        if (s1 == null || s1.length() == 0)
        {
            throw new IllegalArgumentException("Invalid argument for value:  Cannot be empty");
        }
        int k = AnalyticsParameterEncoder.encode((new StringBuilder()).append(s).append(s1).toString()).length();
        if (k > 64)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Encoded form of name and value must not exceed 64 characters combined.  Character length: ").append(k).toString());
        } else
        {
            index = i;
            scope = j;
            name = s;
            value = s1;
            return;
        }
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public int getScope()
    {
        return scope;
    }

    public String getValue()
    {
        return value;
    }
}
