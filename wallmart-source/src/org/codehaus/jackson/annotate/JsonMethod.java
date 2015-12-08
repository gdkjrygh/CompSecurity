// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.annotate;


public final class JsonMethod extends Enum
{

    private static final JsonMethod $VALUES[];
    public static final JsonMethod ALL;
    public static final JsonMethod CREATOR;
    public static final JsonMethod FIELD;
    public static final JsonMethod GETTER;
    public static final JsonMethod IS_GETTER;
    public static final JsonMethod NONE;
    public static final JsonMethod SETTER;

    private JsonMethod(String s, int i)
    {
        super(s, i);
    }

    public static JsonMethod valueOf(String s)
    {
        return (JsonMethod)Enum.valueOf(org/codehaus/jackson/annotate/JsonMethod, s);
    }

    public static JsonMethod[] values()
    {
        return (JsonMethod[])$VALUES.clone();
    }

    public boolean creatorEnabled()
    {
        return this == CREATOR || this == ALL;
    }

    public boolean fieldEnabled()
    {
        return this == FIELD || this == ALL;
    }

    public boolean getterEnabled()
    {
        return this == GETTER || this == ALL;
    }

    public boolean isGetterEnabled()
    {
        return this == IS_GETTER || this == ALL;
    }

    public boolean setterEnabled()
    {
        return this == SETTER || this == ALL;
    }

    static 
    {
        GETTER = new JsonMethod("GETTER", 0);
        SETTER = new JsonMethod("SETTER", 1);
        CREATOR = new JsonMethod("CREATOR", 2);
        FIELD = new JsonMethod("FIELD", 3);
        IS_GETTER = new JsonMethod("IS_GETTER", 4);
        NONE = new JsonMethod("NONE", 5);
        ALL = new JsonMethod("ALL", 6);
        $VALUES = (new JsonMethod[] {
            GETTER, SETTER, CREATOR, FIELD, IS_GETTER, NONE, ALL
        });
    }
}
